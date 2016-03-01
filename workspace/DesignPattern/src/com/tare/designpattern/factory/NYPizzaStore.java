package com.tare.designpattern.factory;

public class NYPizzaStore extends PizzaStore {

	//@Override
	public Pizza createPizza(String typePizza) {
		
		
		/*		
		if(typePizza.equals("cheese")) {
			return new NYStyleCheesePizza(); 
		} else {
			return null; 
		}
		*/
		
		Pizza pizza = null; 
		PizzaIngredientFactory ingredientFactory = 
				new NYPizzaIngredientFactory(); 
		
		
		if(typePizza.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory); 
			pizza.setName("New York Style Cheese Pizza");
		} else if (typePizza.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory); 
			pizza.setName("New York Style Clam Pizza");
		} else {
			return null; 
		}
		
		return pizza; 
		
		
	}

}
