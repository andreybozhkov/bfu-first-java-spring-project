package firstProject.data;

import java.util.UUID;

public class PersonClass {
	private String id;
	private String name;
	private String gender;
	private int age;
	private String[] productInterests;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getProductInterests() {
		return productInterests;
	}
	public void setProductInterests(String[] productInterests) {
		this.productInterests = productInterests;
	}
	
	public PersonClass(String name, String gender, int age) {
		this.setId(UUID.randomUUID().toString());
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
	}
}
