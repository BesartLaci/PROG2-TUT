package SampleExamHotelBooking.entities;

import SampleExamHotelBooking.provided.Date;

public abstract class Offer {
	
	//	the due date of this offer - the checkout day
	private Date 	dueDate;

	//the hotel of this offer
	private Hotel 	hotel;
	
	//	the room of this offer
	private Room 	room;

	//the startdate of this offer - the check-in day
	private Date 	startDate;
	

	//Constructor
	public Offer() {
		// TODO Auto-generated constructor stub
	}
	
	//Methods
	
	/**
	 * 	creates a booking for this offer
	this offer calculates the total price and creates a booking accordingly

	Returns:
	    a booking for this offer 
	 * @return
	 * @throws Exception 
	 */
	public Booking createBooking() throws Exception {
		
		return new Booking(this);		
		
	}

	/**
	 * 
	get the due date

	Returns:
	    the dueDate 
	 * @return
	 */
	public Date getDueDate() {
		return this.dueDate;
	}
	
	
	/**
	 * 
	Returns:
	    the hotel 
	 */
	public Hotel getHotel() {
		return this.hotel;
	}
	
	/**
	 * 
	gets the room

	Returns:
	    the room 
	 * @return
	 */
	public Room getRoom() {
		return this.room;
		
	}
	
	/**
	 * 
	get the start date

	Returns:
	    the startDate 
	 * @return
	 */
	public Date getStartDate() {
		return this.startDate;
	}

	/**
	 * 
	set the due date - cannot be unknown or null

	Parameters:
	    dueDate - the dueDate to set 
	 * @param dueDate
	 */
	public void setDueDate(Date dueDate) {
		
		
		
		if(dueDate == null || dueDate.dateString().isEmpty() ) {
			this.dueDate = new Date();
		}
		else {
			this.dueDate = new Date(dueDate);
		}
		
		//(dueDate == null)?this.dueDate = new Date:(dueDate.dateString().isEmpty())?this.dueDate = new Date: this.dueDate = dueDate;
		
	}


	/**
	 * 
	sets the hotel of this offer
	this method is implemented defensively, 
	such that this offer creates and holds a private offer of the hotel

	Parameters:
	    hotel - the hotel to set 
	 * @param hotel
	 */
	public void setHotel(Hotel hotel) {
		
		if(hotel == null) return;
		this.hotel = new Hotel(hotel);
		
	}

	
	/**
	 * 
	sets the room this method is implemented defensively, such that this offer creates and holds a private offer of the room

	Parameters:
	    room - the room to set
	 * @param room
	 * @throws Exception 
	 */
	public void setRoom(Room room) throws Exception {
				
		if(room == null) return;
		this.room = new Room(room);
	}
	
	/**
	 * 
	set the start date . cannot be unknown or null

	Parameters:
	    startDate - the startDate to set 
	 */
	public void setStartDate(Date startDate) {
		
		if(startDate == null || startDate.dateString().isEmpty() ) {
			this.startDate = new Date();
		}
		else {
			this.startDate = new Date(startDate);
		}
	}

 
	/**
	 * 
	calculates the total price for this offer
	to be implemented by concrete offers

	Returns:
	    the price 
	 * @return
	 */
	public abstract int totalPrice(); 



}
