package firstProject.data.interfaces;

import java.util.SortedSet;

public interface PersonInterface {
	public String getId();
	@SuppressWarnings("unused")
	private void setId(String id) {};
	public String getName();
	public void setName(String name);
	public int getAge();
	public void setAge(int age);
	public String getGender();
	public void setGender(String gender);
	public SortedSet<String> getInterests(); // get the SortedSet of String interests
	public boolean checkForInterest(String interest); // get single element from the SortedSet of String interests
	public void addInterest(String interest); // add single element from the SortedSet of String interests
	public void removeInterest(String interest); // remove single element from the SortedSet of String interests
}
