package SampleExamBooking.Utils;

import java.util.Comparator;

import SampleExamBooking.Entities.Person;

public class PersonComparator implements Comparator<Person> {
	
	//Constructor
	public PersonComparator() {
		// TODO Auto-generated constructor stub
	}
	
	//Methods
	/**
	 * Compares two persons lexicographically by name.
	 */
	public int compare(Person p1, Person p2) {
		
		if(p1 == null && p2 == null) return 0;
		if(p1 == null) return -1;
		if(p2 == null) return 1;		
		
		return p1.getName().compareTo(p2.getName());
		
	}

}
