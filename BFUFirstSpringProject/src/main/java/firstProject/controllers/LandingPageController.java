package firstProject.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import firstProject.data.dataClasses.ProductClass;
import firstProject.services.ProductsService;

@Controller
public class LandingPageController {
	@Autowired
	ProductsService productsService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String landingPage(Model model) {
		ArrayList<ProductClass> currentProducts = productsService.getProducts();
		model.addAttribute("products", currentProducts);
		return "landingPage";
	}
}
