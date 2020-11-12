package firstProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import firstProject.services.PersonsService;
import firstProject.services.ProductsService;

@Controller
public class LandingPageController {
	@Autowired
	PersonsService personsService;
	
	@Autowired
	ProductsService productsService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String landingPage(Model model) {
		model.addAttribute("persons", personsService.getPersons());
		model.addAttribute("products", productsService.getProducts());
		return "landingPage";
	}
}
