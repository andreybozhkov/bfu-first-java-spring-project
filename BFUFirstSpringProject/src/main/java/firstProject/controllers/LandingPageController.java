package firstProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import firstProject.BfuFirstSpringProjectApplication;
import firstProject.data.PersonClass;

@Controller
public class LandingPageController {
	@RequestMapping("/")
	public String landingPage() {
		PersonClass[] tempPersonsArr = this.generatePerson();
		System.out.println(tempPersonsArr[0].getId());
		System.out.println(tempPersonsArr[1].getId());
		return "landingPage";
	}
	
	private PersonClass[] generatePerson() {
		return BfuFirstSpringProjectApplication.getPersons();
	}
}
