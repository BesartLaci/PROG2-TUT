package SampleExamBooking.Entities;

import SampleExamBooking.Provided.Date;

public class CallCenterAgent
extends Person {

	//Constructor
	public CallCenterAgent() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calls the corresponding superclass constructor.
	 * @param name
	 * @param dateOfBirth
	 * @param id
	 */
	public CallCenterAgent(String name, Date dateOfBirth, int id) {
		super(name, dateOfBirth);
		setId(id);
	}
	
	
	/**
	 * Sets the ID of a call center agent if the ID is equal or larger than 1000.
	 */
	@Override
	public void setId(int id) {
		
		if(id >= 1000) this.id = id;
	}

}
