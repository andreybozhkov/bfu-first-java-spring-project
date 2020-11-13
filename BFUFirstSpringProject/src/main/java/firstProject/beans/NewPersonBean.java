package firstProject.beans;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.UUID;

public class NewPersonBean implements Serializable {
	private String id;
	private String name;
	private String gender;
	private int age;
	private SortedSet<String> interests;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public SortedSet<String> getInterests() { // get the SortedSet of String interests
		return this.interests;
	}
	public boolean checkForInterest(String interest) { // get single element from the SortedSet of String interests
		return this.interests.contains(interest);
	};
	public void setInterests(SortedSet<String> interests) { // add single element from the SortedSet of String interests
		this.interests = interests;
	}
	public void addInterest(String interest) { // add single element from the SortedSet of String interests
		this.interests.add(interest);
	}
	public void removeInterest(String interest) { // remove single element from the SortedSet of String interests
		this.interests.remove(interest);
	}
	
	public NewPersonBean() {
		this.setId(UUID.randomUUID().toString());
		this.setName("Type your name here please.");
		this.setAge(18);
	}
}
