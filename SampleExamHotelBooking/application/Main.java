package SampleExamHotelBooking.application;

import SampleExamHotelBooking.entities.Booking;
import SampleExamHotelBooking.entities.Hotel;
import SampleExamHotelBooking.entities.Room;
import SampleExamHotelBooking.provided.Formatter;

public class Main {
	
	

	public Main() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * a simple demo
	 this functions creates two hotels 
	 with at least two rooms 
	 of different category 
	 each displays a all rooms of the two hotels 
	 sorted by price 
	 
	 creates two different offers for the same room 
	 creates a booking for the less expensive offer 
	 and saves the booking details to file booking.txt 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		

	}
	
	
	/**
	 prints all rooms of all hotels in htls grouped by hotel in a specified format

	Parameters:
    htls - the hotels to print
    fmt - the format in which to print the rooms of the hotels 
	 * @param htls
	 * @param fmt
	 */
	static void print(java.util.Set<Hotel> htls, Formatter<Room> fmt) {
		
		
	}
	
	
	/**
	saves a booking to file
	this method handles all exceptions that might occur.
	
	Parameters:
    b - the booking to save
    targetFileName - the name of the target file 
	 * @param b
	 * @param targetFileName
	 */
	static void save(Booking b, java.lang.String targetFileName) {
		
		
	}
	
	
	
	

}
