package SampleExamBooking.Entities;

public class Booking {

	private int bookingNo;
	
	
	//Constructor
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Sets the booking number if a non-negative booking number is passed as an argument.
	 * @param bookingNo
	 */
	public Booking(int bookingNo) {
		if(bookingNo >0) {
			this.bookingNo = bookingNo;
		}
	}
	
	
	//Getter - Setter
	/**
	 * 	Gets the booking number.

	Returns:
	    bookingNo of the booking 
	 * @return
	 */
	public int getBookingNo() {
		return this.bookingNo;
	}



}
