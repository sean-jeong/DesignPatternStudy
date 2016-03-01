package com.tare.designpattern.factory;

import com.tare.designpattern.factory.ingredient.BlackOlives;
import com.tare.designpattern.factory.ingredient.Cheese;
import com.tare.designpattern.factory.ingredient.Clams;
import com.tare.designpattern.factory.ingredient.Dough;
import com.tare.designpattern.factory.ingredient.EggPlant;
import com.tare.designpattern.factory.ingredient.FrozenClam;
import com.tare.designpattern.factory.ingredient.Mozzarella;
import com.tare.designpattern.factory.ingredient.Pepperoni;
import com.tare.designpattern.factory.ingredient.PlumTomatoSauce;
import com.tare.designpattern.factory.ingredient.Sauce;
import com.tare.designpattern.factory.ingredient.SlicedPepperoni;
import com.tare.designpattern.factory.ingredient.Spinach;
import com.tare.designpattern.factory.ingredient.ThickCrustDough;
import com.tare.designpattern.factory.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		//return null;
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		//return null;
		return new PlumTomatoSauce(); 
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		//return null;
		return new Mozzarella(); 
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		// return null;
		Veggies[] veggies = { new EggPlant(), new Spinach(), new BlackOlives() };
		return veggies; 
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		// return null;
		return new SlicedPepperoni(); 
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		//return null;
		return new FrozenClam(); 
	}

}
