package firstProject.data.interfaces;

import java.util.Map;
import java.util.SortedSet;

public interface ProductInterface {
	public String getId();
	@SuppressWarnings("unused")
	private void setId(String id) {};
	public String getName();
	public void setName(String name);
	public float getPrice();
	public void setPrice(float newPrice);
	public short getQtyAvailable();
	public void setQtyAvailable(short newQty);
	public void incrQtyByAmount(short incrQty);
	public Map<String, String> decrQtyByAmount(short decrQty); // return Map<String, String> of format 'OK decreased by xx' or 'Not enough, only X'
	public SortedSet<String> getTags(); // get the SortedSet of String tags
	public boolean checkForTag(String tagToCheck); // get single element from the SortedSet of String tags
	public void addTag(String tagToAdd); // add single element from the SortedSet of String tags
	public void removeTag(String tagToRemove); // remove single element from the SortedSet of String tags
}
