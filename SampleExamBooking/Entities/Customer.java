package SampleExamBooking.Entities;

import SampleExamBooking.Provided.Date;

public class Customer
extends Person {

	//Constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Calls the corresponding superclass constructor.
	 * @param name
	 * @param dateOfBirth
	 * @param id
	 */
	public Customer(String name, Date dateOfBirth, int id) {
		super(name, dateOfBirth);
		setId(id);
	}

	
	//Getter - Setter
	/**
	 * Sets the ID of a customer if the ID is between 0 and 1000 (excluding 0 and 1000).
	 */
	@Override
	public void setId(int id) {
		
		if(id > 0 && id < 1000) this.id = id;
		
	}
	
	/**
	 * Sets the name of a customer if parameter name is not null and is not an empty string.
	 */
	public void setName(String name) {
		
		if(name != null && !name.isEmpty()) this.name = name;
		
	}
	
}
