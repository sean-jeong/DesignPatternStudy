package com.tare.designpattern.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String typePizza) {
		if(typePizza.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}
		return null;
	}

}
