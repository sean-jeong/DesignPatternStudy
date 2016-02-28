package com.tare.designpattern.factory;

public abstract class PizzaStore {
	 
	
	public Pizza orderPizza(String typePizza) {
		Pizza pizza;	
		pizza = createPizza(typePizza); 
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza; 
	}
	
	public abstract Pizza createPizza(String typePizza); 
	
}
