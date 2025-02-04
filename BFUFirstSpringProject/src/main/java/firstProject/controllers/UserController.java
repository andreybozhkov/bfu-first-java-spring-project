package firstProject.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import firstProject.data.dataClasses.PersonClass;
import firstProject.services.PersonsService;

@Controller
public class UserController {
	@Autowired
	PersonsService personsService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String userDetail() {
		return "user";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String userDetailPost(HttpServletRequest request, HttpSession session) {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String newInterest = request.getParameter("addInterest");
		Map<String, String[]> checkedInterestsToRemove = request.getParameterMap();
		
		PersonClass currentPerson = (PersonClass)session.getAttribute("user");
		
		checkedInterestsToRemove.forEach((key, values) -> {
			if(key.startsWith("removeInterest")) {
				currentPerson.removeInterest(values[0]);
			}
		});
		
		if (gender != null) {
			currentPerson.setGender(gender);
		}
		if (newInterest.length() > 0) {
			currentPerson.addInterest(newInterest);
		}
		currentPerson.setId(id);
		currentPerson.setName(name);
		currentPerson.setAge(age);
		
		personsService.updatePerson(currentPerson);
		session.setAttribute("user", currentPerson);
		
		return "user";
	}
}
