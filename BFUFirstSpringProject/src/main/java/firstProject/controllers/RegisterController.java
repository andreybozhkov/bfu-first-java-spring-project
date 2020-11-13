package firstProject.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import firstProject.data.dataClasses.PersonClass;
import firstProject.services.PersonsService;

@Controller
public class RegisterController {
	@Autowired
	PersonsService personsService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(HttpServletRequest request, HttpSession session) {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		PersonClass newPerson = new PersonClass(id, name, gender, age);
		personsService.addPerson(newPerson);
		session.setAttribute("user", newPerson);
		return "user";
	}
}
