package BellaPizza.Program;
import java.util.*;

import BellaPizza.Interfaces.IOrderable;
import BellaPizza.Models.*;


public class demoApplication {

	public static void main(String[] args) {

		Pizza margeritha = new RegularPizza(1, "Margeritha", null);
		Pizza tonno = new FamilyPizza(2, "Tonno", null);
		
		List<IOrderable> myOrders = new ArrayList<IOrderable>();
		myOrders.add(margeritha); 
		myOrders.add(tonno);
		
		

	}

}
