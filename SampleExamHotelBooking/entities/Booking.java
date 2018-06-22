package SampleExamHotelBooking.entities;

import SampleExamHotelBooking.provided.Date;

public class Booking {
	
	//the due date of this booking - the checkout day
	private Date dueDate;
	
	//	the hotel of this booking
	private Hotel hotel;

	//	the room of this booking
	private Room room;

	//the startdate of this booking - the check-in day
	private Date startDate;
	
	//the total price of this booking
	private int totalPrice;
	

	public Booking() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * constructs a booking
	this booking is constructed as a deep copy of b
	 * @param b
	 * @throws Exception 
	 */
	public Booking(Booking b) throws Exception {
		
		if(b != null) {
			this.dueDate = new Date(b.dueDate);
			this.hotel = new Hotel(b.hotel);
			this.room = new Room(b.room);
			this.startDate = new Date(b.startDate);
			this.totalPrice = b.totalPrice;
		}
	}
	
	
	/**
	 * 	creates a booking from an offer
	all relevant booking data is deep copied from offer.

	 * @param offer
	 * @throws Exception 
	 */
	public Booking(Offer offer) throws Exception {
				
		if(offer != null) {			
			this.dueDate = new Date(offer.getDueDate());
			this.hotel = new Hotel(offer.getHotel());
			this.room = new Room(offer.getRoom());
			this.startDate = new Date(offer.getStartDate());			 
		};	 
		
	}
	
	
	/**
	 * 
	creates a String representation of this booking, that contains all relevant information.

	Overrides:
	    toString in class java.lang.Object 
	 */
	@Override
	public String toString() {
		
		return String.format("Hotel -> " + ((this.hotel != null)?this.hotel.toString():"no Hotel"))
				+ String.format("\nRoom ->" + ((this.room != null)?this.room.toString():"no Rooms"))
				+ String.format("\nStartDate -> "+((this.startDate != null)?this.startDate.dateString():"no startDate"))
				+ String.format("\nDueDate -> " + ((this.dueDate != null)?this.dueDate.dateString():"no dueDate"));
	}


}
