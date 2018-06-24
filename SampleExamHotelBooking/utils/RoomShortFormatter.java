package SampleExamHotelBooking.utils;

import SampleExamHotelBooking.entities.Room;
import SampleExamHotelBooking.provided.Formatter;

public class RoomShortFormatter implements Formatter<Room> {

	public RoomShortFormatter () {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	creates a formatted String representation of a room
	the sString contains room size and standard price

	Specified by:
	    format in interface Formatter<Room> 
	 */
	public String format(Room t){
		
		if(t == null) return String.format("\t-this Room == NULL");
		
		return String.format("\n\tRoom -> " + t.toString())
				+String.format("\n\tSize ->" + t.getSize()+"\tPrice -> " + t.getPrice());
		
	}


}
