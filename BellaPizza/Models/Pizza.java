package BellaPizza.Models;

import java.util.List;

import BellaPizza.Interfaces.IOrderable;

public abstract class Pizza implements IOrderable
{
	//FILDS
	private int id;
	private String name;
	private List<Ingredient> ingredients;
	private int size;
	
	//CONSTRUCTOR
	public Pizza() {
		
	}
	
	public Pizza(Pizza pizza) {
		this(pizza.id, pizza.name, pizza.ingredients);
	}
	
	public Pizza(int id, String name, List<Ingredient> ingredients) {
		setId(id);
		setName(name);
		setIngredients(ingredients);
	}
	
	//GETTER SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public int getSize() {
		return size;
	}

	protected void setSize(int size) {
		this.size = size;
	}

	
	//METHODS
	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
