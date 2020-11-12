package firstProject.data;

import java.util.ArrayList;
import java.util.Arrays;
import firstProject.data.dataClasses.PersonClass;
import firstProject.data.dataClasses.ProductClass;

public class DataStorage {
	private static ArrayList<PersonClass> personsArrList = new ArrayList<PersonClass>(
			Arrays.asList(
					new PersonClass("Pesho", "male", 25),
					new PersonClass("Maria", "female", 23)
					)
			);
	
	private static ArrayList<ProductClass> productsArrList = new ArrayList<ProductClass>(
			Arrays.asList(
					new ProductClass("Product 1", 50.63f, (short) 25),
					new ProductClass("Product 2", 100.50f, (short) 23)
					)
			);
	
	public static ArrayList<PersonClass> getPersons() {
		return personsArrList;
	}
	
	public static ArrayList<ProductClass> getProducts() {
		return productsArrList;
	}
}
