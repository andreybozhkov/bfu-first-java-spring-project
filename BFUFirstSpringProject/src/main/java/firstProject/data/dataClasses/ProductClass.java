package firstProject.data.dataClasses;

import java.util.Map;
import java.util.SortedSet;
import java.util.UUID;
import firstProject.data.interfaces.ProductInterface;

public class ProductClass implements ProductInterface {
	private String id;
	private String name;
	private float price;
	private short qtyAvailable;
	private SortedSet<String> tags;

	public String getId() {
		return this.id;
	}
	
	private void setId(String id) {
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

	public void incrQtyByAmount(short incrQty) {
		this.qtyAvailable += incrQty;
	}

	public Map<String, String> decrQtyByAmount(short decrQty) {
		if(this.qtyAvailable - decrQty < 0 ) {
			Map<String, String> resultMap = Map.of(
					"Error", "Available quantity is less than the amount you tried to decrease.",
					"QtyDecreased", String.valueOf(decrQty - qtyAvailable)
					);
			return resultMap;
		}
		Map<String, String> resultMap = Map.of(
				"OK", "All is OK. Decreased by the amount you specified successfully.",
				"QtyDecreased", String.valueOf(decrQty)
				);
		return resultMap;
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
	
	public ProductClass(String name, float initialPrice, short initialQty) {
		this.setId(UUID.randomUUID().toString());
		this.setName(name);
		this.setPrice(initialPrice);
		this.setQtyAvailable(initialQty);
	}
}
