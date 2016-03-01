package com.tare.designpattern.factory;

import com.tare.designpattern.factory.ingredient.Cheese;
import com.tare.designpattern.factory.ingredient.Clams;
import com.tare.designpattern.factory.ingredient.Dough;
import com.tare.designpattern.factory.ingredient.FreshClams;
import com.tare.designpattern.factory.ingredient.Garlic;
import com.tare.designpattern.factory.ingredient.MarinaraSauce;
import com.tare.designpattern.factory.ingredient.Mushroom;
import com.tare.designpattern.factory.ingredient.Onion;
import com.tare.designpattern.factory.ingredient.Pepperoni;
import com.tare.designpattern.factory.ingredient.RedPepper;
import com.tare.designpattern.factory.ingredient.ReggianoCheese;
import com.tare.designpattern.factory.ingredient.Sauce;
import com.tare.designpattern.factory.ingredient.SlicedPepperoni;
import com.tare.designpattern.factory.ingredient.ThinCrustDough;
import com.tare.designpattern.factory.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		//return null;
		return new ThinCrustDough(); 
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		//return null;
		return new MarinaraSauce(); 
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		//return null;
		return new ReggianoCheese(); 
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		//return null;
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() }; 
		return veggies; 
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		//return null;
		return new SlicedPepperoni(); 
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		//return null;
		return new FreshClams(); 
	}

}
