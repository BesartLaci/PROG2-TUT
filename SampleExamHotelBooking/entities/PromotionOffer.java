package SampleExamHotelBooking.entities;

public class PromotionOffer extends Offer {

	public PromotionOffer() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	the total price is 100EUR discount on the standard offer
	and adds 20% taxes

	Specified by:
	    totalPrice in class Offer
	Returns:
	    the price 

	 */
	public int totalPrice() {
		
		double tempPrice = ((getRoom().getPrice()/100)*(getDueDate().julianDayNumber() - getStartDate().julianDayNumber()))*1.2;
		return (int)(tempPrice-100);
		//return 500;
	}

}
