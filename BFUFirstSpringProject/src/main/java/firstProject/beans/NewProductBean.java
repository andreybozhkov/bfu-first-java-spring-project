package firstProject.beans;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.UUID;

public class NewProductBean implements Serializable {
	private String id;
	private String name;
	private float price;
	private short qtyAvailable;
	private SortedSet<String> tags;
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	};

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	public short getQtyAvailable() {
		return this.qtyAvailable;
	}

	public void setQtyAvailable(short newQty) {
		this.qtyAvailable = newQty;
	}
	
	public SortedSet<String> getTags() {
		return this.tags;
	}

	public boolean checkForTag(String tagToCheck) {
		return this.tags.contains(tagToCheck);
	}

	public void addTag(String tagToAdd) {
		this.tags.add(tagToAdd);

	}

	public void removeTag(String tagToRemove) {
		this.tags.remove(tagToRemove);
	}
	
	public NewProductBean() {
		this.setId(UUID.randomUUID().toString());
		this.setName("Please enter product name...");
		this.setPrice(0.00f);
		this.setQtyAvailable((short)1);
	}
}
