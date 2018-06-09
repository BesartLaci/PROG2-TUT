package BellaPizza.Models;

import java.util.List;

public class RegularPizza extends Pizza {

	public RegularPizza() {
		super.setSize(33);
	}
	
	
	
	public RegularPizza(int id, String name, List<Ingredient> ing) {
		super(id, name, ing);
		setSize(33);
	}



	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return super.myToString();
	}
	
}
