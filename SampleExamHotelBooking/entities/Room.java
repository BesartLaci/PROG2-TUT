package SampleExamHotelBooking.entities;

public class Room {
	
	//	the standard price of this room in cents
	private int price;

	//the size of this room in m^2
	double 	size;
	
	//Constructor
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * constructs a room with a specified size and price
	 * @throws Exception 
	 */
	public Room(double size, int price) throws Exception {
		setSize(size);
		setPrice(price);
	}
	
	
	/**
	 * 	constructs a room
	this room is constructed as a copy of r
	 * @param r
	 * @throws Exception 
	 */
	public Room(Room r) throws Exception{
		this(r.size, r.price);
	}
	
	
	//Methods
	
	/**
	 * 	gets the standard price of this room

	Returns:
	    the price 
	 * @return
	 */
	public int getPrice() {
		return this.price;
	}
	
	/**
	gets the standard size of this room

	Returns:
	    the size 
	 * 
	 */
	public double getSize() {
		return this.size;
	}
	
	/**
	 * 
	sets the price of this room this method allows method chaining
	
	Parameters:
	    price - the price to set
	Returns:
	    this room 
	 * @throws Exception 
	 */
	public Room price(int price) throws Exception {
		
		setPrice(price);
		return this;
	}

	
	/**
	 * 
	sets the standard price of this room
	the standard price must be > 0
	throw an exception if called with invalid arguments

	Parameters:
	    price - the price to set 
	 * @param price
	 * @throws Exception 
	 */
	public void setPrice (int price) throws Exception {
		
		if(price > 0) {
			this.price = price;
		}else throw new IllegalArgumentException("the standard price must be > 0... your Input" + price);
		
	}
	
	/**
	 * 	
	sets the standard size of this hotel
	the size must be > 0
	0 stands for unknown throw an exception if called with invalid arguments
	
	Parameters:
	    size - the size to set 
	 * @throws Exception 
	 */
	public void setSize(double size) throws Exception {
		
		if(size > 0) {
			this.size = size;
		}else throw new IllegalArgumentException("the size must be > 0... your Input" + size);
	}



}
