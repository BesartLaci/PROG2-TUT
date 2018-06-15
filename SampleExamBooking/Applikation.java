package SampleExamBooking;

import java.util.Random;

import SampleExamBooking.Entities.Booking;
import SampleExamBooking.Entities.CallCenterAgent;
import SampleExamBooking.Entities.Customer;
import SampleExamBooking.Entities.Person;
import SampleExamBooking.Utils.MyFileWriter;
import SampleExamBooking.Utils.PersonComparator;
import SampleExamBooking.Utils.PersonFormatter;

public class Applikation {

	//5 bookings.
	private static Booking 	b1;	
	private static Booking 	b2;
	private static Booking 	b3;	
	private static Booking 	b4;
	private static Booking 	b5;
	
	//3 customers.
	private static Customer c1;
	private static Customer c2;
	private static Customer c3;
	
	//2 call center agents.
	private static CallCenterAgent cca1;	
	private static CallCenterAgent cca2;
	
	//File writer for Person types.
	private static java.io.FileWriter 	fw;
	
	//The underlying stream for writing character files.
	private static MyFileWriter<Person> 	mfw;
	
	//File writer for Person types.
	private static PersonComparator 	pc;
	
	//Person comparator.
	private static java.util.List<Person> 	persons;
	
	//List of person objects.
	private static PersonFormatter 	pf;
	
	
	//Constructor
	public Applikation() {
		// TODO Auto-generated constructor stub
		
	}

	
	
	/**
	 * The main method implementing the logic of your application. 
	 * In this method, please implement the following:

	1) Create 3 new customers (c1-c3) 
	and 2 call center agents (cca1, cca2) 
	having different names (all other values you can choose on your own).
	
	2) Add all customers and call center agents to the persons list.
	
	3) Create 5 different bookings (b1-b5) 
	and associate these bookings to all customers and call center agents 
	so that every person is associated 
	with at least one booking.
	
	4) Sort the persons list according to the order induced by your specified person comparator (pc).
	
	5) Save the sorted list of persons 
	using your specified file writer (mfw) and formatter (pf) 
	in a file named "SortedListOfPersons.txt" (fw).
	
	6) Duck all exceptions.
	
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random random = new Random(); //generates random numbers
		
		b1 = new Booking(random.nextInt(1000));// between 0 && 1000
		b2 = new Booking(random.nextInt(1000));
		b3 = new Booking(random.nextInt(1000));
		b4 = new Booking(random.nextInt(1000));
		b5 = new Booking(random.nextInt(1000));
		
		
		
		
	}
	
	
//END of Class
}


