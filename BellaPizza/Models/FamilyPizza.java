package BellaPizza.Models;

import java.util.List;

public class FamilyPizza extends Pizza {

	public FamilyPizza() {
		setSize(55);
	}

	public FamilyPizza(Pizza pizza) {
		super(pizza);
		setSize(55);
	}

	public FamilyPizza(int id, String name, List<Ingredient> ingredients) {
		super(id, name, ingredients);
		setSize(55);
	}

}
