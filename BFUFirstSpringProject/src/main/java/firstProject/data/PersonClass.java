package firstProject.data;

import java.util.SortedSet;
import java.util.UUID;

import firstProject.data.interfaces.PersonInterface;

public class PersonClass implements PersonInterface {
	private String id;
	private String name;
	private String gender;
	private int age;
	private SortedSet<String> interests;
	
	public String getId() {
		return id;
	}
	private void setId(String id) {
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
	public SortedSet<String> getInterests() { // get the array of String interests
		return this.interests;
	}
	public boolean checkForInterest(String interest) { // get single element from the array of String interests
		return this.interests.contains(interest);
	};
	public void addInterest(String interest) { // add single element from the array of String interests
		this.interests.add(interest);
	}
	public void removeInterest(String interest) { // remove single element from the array of String interests
		this.interests.remove(interest);
	}
	
	public PersonClass(String name, String gender, int age) {
		this.setId(UUID.randomUUID().toString());
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
	}
}
