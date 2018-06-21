package SampleExamBooking.Utils;

import SampleExamBooking.Entities.Person;
import SampleExamBooking.Provided.IFormatter;

public class PersonFormatter implements IFormatter<Person>{

	//Constructor
	public PersonFormatter() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Methods
	/**
	 * Formats a person.

	The representation of a person is:
	<name> (<dateOfBirth>) -> <noOfBookings> booking(s)
	(text between < and > are placeholders).
	
	<name> is exactly 15 characters wide with leading blanks (if any).
	<dateOfBirth> is exactly 10 characters wide.
	<noOfBookings> is exactly 2 characters wide with a leading zero (if any).
		 */
	@Override
	public String format(Person t) {
		
		return String.format("%15.15s ", t.getName())+
				String.format("- ID: %s ", t.getId())+
				String.format("( %10.10s ) ->",t.getDateOfBirth())+
				String.format("%02d booking(s)", t.getNoOfBookings())+
				String.format("%s", t.getBookingsString());

	}

	
}
