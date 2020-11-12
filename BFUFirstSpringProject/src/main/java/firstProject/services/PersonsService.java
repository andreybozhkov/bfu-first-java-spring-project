package firstProject.services;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;
import firstProject.data.dataClasses.PersonClass;

@Service
public class PersonsService {
	private static ArrayList<PersonClass> personsArrList = new ArrayList<PersonClass>(
			Arrays.asList(
					new PersonClass("Pesho", "male", 25),
					new PersonClass("Maria", "female", 23)
					)
			);
	
	// methods for persons ArrayList
	public ArrayList<PersonClass> getPersons() {
		return personsArrList;
	}
	
	public void addPerson(PersonClass newPerson) {
		personsArrList.add(newPerson);
	}
	
	public boolean removePerson(String personID) {
		for (int i = 0; i < personsArrList.size(); i++) {
			if (personsArrList.get(i).getId() == personID) {
				personsArrList.remove(i);
				return true;
			}
		}
		return false;
	}
}
