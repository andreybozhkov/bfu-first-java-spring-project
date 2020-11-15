package firstProject.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import firstProject.data.dataClasses.PersonClass;
import firstProject.services.PersonsService;

@Controller
public class LoginController {
	@Autowired
	PersonsService personsService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request, HttpSession session, Model model) {
		String id = request.getParameter("id");
		ArrayList<PersonClass> allPersons = personsService.getPersons();
		for (int i = 0; i < allPersons.size(); i++) {
			if (allPersons.get(i).getId().equals(id)) {
				PersonClass loginPerson = allPersons.get(i);
				session.setAttribute("user", loginPerson);
				return "user";
			}
		}
		model.addAttribute("error", "Error: There is no user with this ID!");
		return "login";
	}
}
