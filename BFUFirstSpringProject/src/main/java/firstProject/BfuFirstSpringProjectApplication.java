package firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import firstProject.data.PersonClass;

@SpringBootApplication
public class BfuFirstSpringProjectApplication {
	private static PersonClass[] personsArr = {
			new PersonClass("Pesho", "male", 25),
			new PersonClass("Maria", "female", 23)
	};
	
	public static PersonClass[] getPersons() {
		return personsArr;
	}

	public static void main(String[] args) {
		SpringApplication.run(BfuFirstSpringProjectApplication.class, args);
	}
}
