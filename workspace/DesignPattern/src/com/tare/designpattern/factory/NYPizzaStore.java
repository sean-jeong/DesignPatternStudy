package com.tare.designpattern.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String typePizza) {
		if(typePizza.equals("cheese")) {
			return new NYStyleCheesePizza(); 
		} else {
			return null; 
		}
	}

}
