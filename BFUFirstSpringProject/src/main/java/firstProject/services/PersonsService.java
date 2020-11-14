package firstProject.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import firstProject.data.dataClasses.PersonClass;

@Service
public class PersonsService {
	private static ArrayList<PersonClass> personsArrList = new ArrayList<PersonClass>();
	
	// methods for persons ArrayList
	public ArrayList<PersonClass> getPersons() {
		return personsArrList;
	}
	
	public PersonClass getPerson(int index) {
		return PersonsService.personsArrList.get(index);
	}
	
	public void addPerson(PersonClass newPerson) {
		personsArrList.add(newPerson);
	}
	
	public void updatePerson(PersonClass newPerson) {
		for (int i = 0; i < personsArrList.size(); i++) {
			if (personsArrList.get(i).getId().equals(newPerson.getId())) {
				personsArrList.set(i, newPerson);
			}
		}
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
