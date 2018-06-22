package SampleExamHotelBooking.utils;

import SampleExamHotelBooking.entities.Room;

public class RoomByPriceComparator
implements java.util.Comparator<Room>{

	public RoomByPriceComparator() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	compares two rooms by standard price	
	Specified by:
	compare in interface java.util.Comparator<Room> 
	 */
	public int compare(Room arg0, Room arg1) {
		
		if(arg0 == null && arg1 == null) return 0;
		if(arg0 == null) return 1;
		if(arg1 == null) return -1;
		
		return arg0.getPrice() - arg1.getPrice();
				
	}


}
