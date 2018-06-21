package SampleExamBooking.Entities;

import java.util.HashSet;
import java.util.Set;

import SampleExamBooking.Provided.Date;

public abstract class Person
extends java.lang.Object
implements java.lang.Comparable<Person> {
	
	//Bookings associated with a person
	protected Set<Booking> bookings;
	
	
	//An unknown date of birth is represented by null.
	protected Date dateOfBirth;
	
	//An unknown id is represented by 0.
	protected int id;
	
	//An unknown name is represented by null.
	protected String 	name;
	
	
	//Constructor
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Calls the corresponding two setter methods.
	 * @param name
	 * @param dateOfBirth
	 */
	public Person(String name, Date dateOfBirth){
		setName(name);
		setDateOfBirth(dateOfBirth);
		
	}
	
	/**
	 * Calls the first, 2-argument constructor 
	 * and additionally sets the ID (by calling the corresponding method).
	 * @param name
	 * @param dateOfBirth
	 * @param id
	 */
	public Person(String name, Date dateOfBirth, int id) {
		this(name, dateOfBirth);
		setId(id);
	}
	
	
	//Getter - Setter
	
	/**
	 * Sets the date of birth of a person if parameter dateOfBirth is known.
	 * @return
	 */
	public Set<Booking> getBookings() {
		if(bookings != null) return this.bookings;
		return new HashSet<Booking>();
	}


	/**
	 * Sets the date of birth of a person if parameter dateOfBirth is known. 
	 * This method is defensive in the sense that this person keeps a copy of the original date.
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		if(dateOfBirth != null) {
			this.dateOfBirth = new Date(dateOfBirth);
		}
		
	}

	/**
	 * Gets the ID.
	 * @return
	 */
	public int getId() {
		return id;
	}
	

	/**
	 * Method to be implemented in subclasses 
	 * for setting the ID of a customer or a call center agent.
	 * @param id
	 */
	public abstract void setId(int id); 

	
	/**
	 * Gets the name.
	 * @return
	 */
	public String getName() {
		return name;
	}
	

	/**
	 * Sets the name of a person if parameter name is known.
	 * @return
	 */
	public void setName(String name) {
				
		if(name != null) {
			this.name=name;
		}
	}
	
	
	//Methods
	
	/**
	 * 
	Adds a new booking to the set of bookings.

	Parameters:
	    booking - object to be added to the set
	Returns:
	    true if this set did not already contain the booking object, false otherwise
	 * @param booking
	 * @return
	 */
	public boolean addBooking(Booking booking) {
		
		if(this.bookings == null) this.bookings = new HashSet<Booking>();
		
		return this.bookings.add(booking);
		
	}
	
		
	/**
	 * 
	Naturally, persons are lexicographically compared by name 
	(see java.lang.String methods). 
	It is assumed that this person is only compared to non-null persons.

	Specified by:
	    compareTo in interface java.lang.Comparable<Person>
	Parameters:
	    p - the person to compare this person with 
	 */
	public int compareTo(Person p) {
		
		return (p != null)?this.name.compareTo(p.name):1;
	}

 
	/**
	 * Gets the number of bookings associated with this person.
	 * @return
	 */
	public int getNoOfBookings() {
		
		return(this.bookings == null)?0:this.bookings.size();
		
	}

	
	/**
	 * Gets date of birth as a formatted string representing this date 
	 * (see class Date). Format: dd.mm.yyyy
	 * @return
	 */
	public String getDateOfBirth() {
		if(dateOfBirth != null) {
			return dateOfBirth.numericString();
		}
		return "No Date avaible";
	}
	
	public String getBookingsString() {
		
		if(bookings != null) {
			String tempString ="";
			
			for (Booking booking : bookings) {
				tempString += "- " + booking.getBookingNo() + " -";
			}
			return tempString;
		} return "no Bookings available";
	}
	
	
}
