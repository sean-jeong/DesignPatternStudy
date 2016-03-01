package com.tare.designpattern.factory;

import com.tare.designpattern.factory.ingredient.Cheese;
import com.tare.designpattern.factory.ingredient.Clams;
import com.tare.designpattern.factory.ingredient.Dough;
import com.tare.designpattern.factory.ingredient.Pepperoni;
import com.tare.designpattern.factory.ingredient.Sauce;
import com.tare.designpattern.factory.ingredient.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough(); 
	public Sauce createSauce(); 
	public Cheese createCheese(); 
	public Veggies[] createVeggies(); 
	public Pepperoni createPepperoni();
	public Clams createClam();  
}
