package firstProject.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import firstProject.data.dataClasses.ProductClass;
import firstProject.services.ProductsService;

@Controller
public class ProductController {
	@Autowired
	ProductsService productsService;
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String addProductPage() {
		return "addProduct";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String registerPost(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		float price = Float.parseFloat(request.getParameter("price"));
		short quantity = Short.parseShort(request.getParameter("quantity"));
		ProductClass newProduct = new ProductClass(id, name, price, quantity);
		productsService.addProduct(newProduct);
		ArrayList<ProductClass> currentProducts = productsService.getProducts();
		model.addAttribute("products", currentProducts);
		return "redirect:/";
	}
}
