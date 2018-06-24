package SampleExamHotelBooking.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import SampleExamHotelBooking.entities.Booking;
import SampleExamHotelBooking.entities.Hotel;
import SampleExamHotelBooking.entities.Offer;
import SampleExamHotelBooking.entities.PromotionOffer;
import SampleExamHotelBooking.entities.Room;
import SampleExamHotelBooking.entities.StandardOffer;
import SampleExamHotelBooking.provided.Date;
import SampleExamHotelBooking.provided.Formatter;
import SampleExamHotelBooking.provided.Location;
import SampleExamHotelBooking.utils.RoomShortFormatter;

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
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		// number casting
		int tempInt = random.nextInt();
		double tempDouble = (double)tempInt;		
		tempInt = (int)tempDouble;
		
		
		//generate citys
		String[] cities = new String[] {"Rom", "Paris", "Bagdad"};
		
		//generate countrys
		String[] countries = new String[] {"Germany", "Brasilia", "Canada", "Irak"};
		
		//generate states
		List<String> states = new ArrayList<String>();
		states.add("California");
		states.add("Texas");
		states.add("New York");
		states.add("Pennsylvania");
		states.add("Georgia");		
			

		//generate locations
		List<Location> locations = new ArrayList<Location>();
		
		Location tempLocation = new Location(""+1120, "Wien", "Wien", "Österreich");
		
		locations.add(tempLocation);
		
		for(int i = 0; i < 10; i++ ) {
			
			tempLocation.setZip(""+(random.nextInt(10000)));
			tempLocation.setCity(cities[random.nextInt(cities.length)]);		
			tempLocation.setCountry(countries[random.nextInt(countries.length)]);
			tempLocation.setState(states.get(random.nextInt(states.size())));	
			
			locations.add(tempLocation);
		}

		
	
		//generate rooms		
		Room tempRoom = new Room();
		int roomArraySize = 30;
		Room[] rooms = new Room[roomArraySize];
		roomArraySize--;
		
		for (int i = 0; i < 10; i++) {
			
			tempRoom.price(random.nextInt(1000)).setSize((double)random.nextInt(1000));		
			rooms[roomArraySize--] = tempRoom;
			
			Room tempRoom2 = new Room(tempRoom);	
			rooms[roomArraySize--] = tempRoom2;
			
			rooms[roomArraySize--] = new Room(random.nextDouble(),random.nextInt(1000));
								
		};
		
		
		//generate hotels
		Hotel tempHotel = new Hotel();
		
		List<Hotel> hotels = new ArrayList();
		hotels.add(tempHotel);
		
		for(int i = 0; i < 5; i++) {
			
			tempHotel = new Hotel(locations.get(random.nextInt(locations.size())), rooms.length, random.nextInt(4));
			for (Room temp : rooms) {
				System.out.println(temp.getSize() + "    "  + temp.getPrice());
				if(temp != null) {
					tempHotel.addRoom(temp);
				}
			}
			
			hotels.add(tempHotel);
		}
		
		//prints all rooms of all hotels in htls grouped by hotel in a specified format
		RoomShortFormatter roomPrintFormatter = new RoomShortFormatter();
		print(new HashSet(hotels), roomPrintFormatter);
		
		
						
			
		//generate bookings
		//creates two different offers for the same room 
		
		// Offer = abstract
		Set<Offer> offerList = new HashSet<Offer>();
		
		StandardOffer standardOffer = new StandardOffer();
		
		Date tempStartDate = new Date();
						
		Date tempDueDate = new Date();
		tempDueDate.addDay(25);
		tempDueDate.addMonth(3);
		tempDueDate.addYear(2018);
		
		standardOffer.setStartDate(new Date(tempStartDate));
		standardOffer.setDueDate(new Date(tempDueDate));
		standardOffer.setHotel(hotels.get(random.nextInt(hotels.size())));
		standardOffer.setRoom(rooms[random.nextInt(rooms.length)]);
		
		
		PromotionOffer promotionOffer = new PromotionOffer();
		promotionOffer.setStartDate(new Date(tempStartDate));
		promotionOffer.setDueDate(new Date(tempDueDate));
		promotionOffer.setHotel(standardOffer.getHotel());
		promotionOffer.setRoom(standardOffer.getRoom());
		
		
		offerList.add(standardOffer);
		offerList.add(promotionOffer);
		
		
		//creates a booking for the less expensive offer 
		System.out.println("\n\t\t----------------- compare -----------------\n");
		Booking tempBooking = new Booking();
		int cheapestPrice = Integer.MAX_VALUE;
		
		for (Offer tempOffer : offerList) {
			
	
			int tempPrice = tempOffer.totalPrice();
			System.out.println("\n\tOffer " + tempOffer.toString());
			System.out.println("\n\tcompare offer Price -> (" + tempPrice + " ) to ( " + cheapestPrice + ") <- cheapestPrice");
			if(tempPrice < cheapestPrice) {
				tempBooking = new Booking(tempOffer);
				System.out.println("\n\tnew cheapest Offer -> ( " + tempBooking.toString()+")");
				cheapestPrice = tempPrice;
			} 
			System.out.println();
			
		}
		
		System.out.println("seleceted cheapest Offer -> ( " + tempBooking.toString()+")");
		
		String fileName = "HotelBookingExample.txt";
		
		save(tempBooking, fileName);		
		

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
		
		for (Hotel tempHotel : htls) {
			System.out.println("\n\t print Hotel --> " + tempHotel.toString());			
			for (Room tempRoom : tempHotel.getRooms()) {
				System.out.println(fmt.format(tempRoom));
			}			
		}
		
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
	static void save(Booking b, String targetFileName) {
		
		try {							
				FileWriter fw = new FileWriter(targetFileName, true);									
			
				BufferedWriter myBufferedWriter = new BufferedWriter(fw);
				myBufferedWriter.write(b.toString()+"\n");
				myBufferedWriter.close();								
				
				fw.close();								
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

}
