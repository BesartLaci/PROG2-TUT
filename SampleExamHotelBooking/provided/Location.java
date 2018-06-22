package SampleExamHotelBooking.provided;

/**
 * represents a location
 * 
 * @author TeM
 *
 */
public class Location {



	private String zip;
	
	/**
	 * the city
	 */
	private String city;
	
	/**
	 * the state
	 */
	private String state;

	/**
	 * the country
	 */
	private String country;

	/**
	 * Constructs a location
	 * 
	 * @param zip the zip code of this location
	 * @param city the city of this location
	 * @param state the state of this location 
	 * @param country the cuntry of this location
	 */
	public Location(String zip, String city, String state, String country) {
		super();
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	/**
	 * copies a location<br>
	 * 
	 * this location is created as a copy of loc
	 * 
	 * @param loc the ooriginal location
	 */
	public Location(Location loc) {
		
	}



	/**
	 * gets the zip code of this location
	 * 
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * 
	 * sets the zip code of this location
	 * 
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * gets the city
	 * 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * sets the city
	 * 
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * gets the state
	 * 
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * sets the state
	 * 
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * gets the country
	 * 
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * sets the country
	 * 
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	


}
