package firstProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LandingPageController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String landingPage(Model model) {
		return "landingPage";
	}
}
