package SampleExamHotelBooking.entities;

public class StandardOffer extends Offer{
	
	public StandardOffer() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * * the total price is the net price of the room multiplied by the number of days plus 20 per cent taxes
	
	Specified by:
	    totalPrice in class Offer
	Returns:
	    the price 
	 */
	public int totalPrice() {
		
		double tempPrice = ((getRoom().getPrice()/100)*(getDueDate().julianDayNumber() - getStartDate().julianDayNumber()))*1.2;
		return (int)tempPrice;
			
		}

}
