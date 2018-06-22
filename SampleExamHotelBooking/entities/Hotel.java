package SampleExamHotelBooking.entities;

import java.util.HashSet;

import SampleExamHotelBooking.provided.Location;

public class Hotel {
	
	//the location of this hotel
	private Location loc;
	
	//	the category of this hotel negative number means unknown.
	private int category;	
	
	//used to represent the category bed and breakfast
	static int 	BNB = 0;

	//used to represent the category eco hotel
	static int 	ECO = 1;
	
	//used to represent the category hostel
	static int 	HOSTEL = 2;	
	
	//	used to represent the category motel
	static int 	MOTEL = 3;

	//the number of rooms in this hotel
	private int nrRooms;
	
	//the set of available rooms of this hotel
	private java.util.Set<Room> rooms;


	// Constructor
	public Hotel() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * copies a hotel
	this hotel is created as a deep copy of h.
	 */
	public Hotel(Hotel h) {
		
		if(h != null) {
			this.category = h.category;
			this.loc = new Location(h.loc);
			this.nrRooms = h.nrRooms;
			this.rooms = new HashSet<Room>(h.rooms);
		}
	}
	
	/**
	 * 	constructs a hotel of a certain category
	the categories are coded according to the above constants (BNB, ECO,..).
	 * @param cat
	 */
	public Hotel(int cat){
		if(cat < 0 || cat > 3) return;
		this.category = cat;
	}

	/**
	 * 	constructs a hotel with specified location, number of rooms and category
	 * @param loc
	 * @param nrRooms
	 * @param category
	 */
	public Hotel(Location loc, int nrRooms, int category){
		
		this(category);
		this.loc = new Location(loc);
		this.nrRooms = nrRooms;
	}

	
	// Methods
	
	/**
	 * 	adds a room to this hotel
	returns true if the room was successfully added, false otherwise.

	Parameters:
	    r - the room to add
	Returns:
	    true if the room was successfully added, false otherwise. 

	 * @param r
	 * @return
	 */
	public boolean addRoom(Room r) {
		
		if(rooms == null) this.rooms = new HashSet<Room>();
		
		if(r != null) return this.rooms.add(r);
		return false;
	}
	
	
	/**
	 * 
	removes a room from this hotel
	removes r from the set of rooms of this hotel. returns true if removal was successful, false otherwise

	Parameters:
	    r - the room to remove
	Returns:
	    true, if successful, false otherwise 
	 * @param r
	 * @return
	 */
	public boolean remove(Room r) {
		
		if(rooms == null) this.rooms = new HashSet<Room>();
		
		if(r != null) return this.rooms.remove(r);
		return false;
	}



}
