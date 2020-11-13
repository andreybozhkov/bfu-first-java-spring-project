package firstProject.services;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;
import firstProject.data.dataClasses.ProductClass;

@Service
public class ProductsService {
	private static ArrayList<ProductClass> productsArrList;
	
	// methods for products ArrayList
	public ArrayList<ProductClass> getProducts() {
		return productsArrList;
	}
	
	public void addProduct(ProductClass newProduct) {
		productsArrList.add(newProduct);
	}
	
	public boolean removeProduct(String productID) {
		for (int i = 0; i < productsArrList.size(); i++) {
			if (productsArrList.get(i).getId() == productID) {
				productsArrList.remove(i);
				return true;
			}
		}
		return false;
	}
}
