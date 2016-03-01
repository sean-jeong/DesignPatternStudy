package com.tare.designpattern.factory;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NY Style sauce and cheese Pizza";
		//dough = "Thin Crust Dough";
		//sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese"); 
		
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}
	
	
}
