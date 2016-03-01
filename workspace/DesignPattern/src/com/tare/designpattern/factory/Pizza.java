package com.tare.designpattern.factory;

import java.util.ArrayList;

import com.tare.designpattern.factory.ingredient.Cheese;
import com.tare.designpattern.factory.ingredient.Clams;
import com.tare.designpattern.factory.ingredient.Dough;
import com.tare.designpattern.factory.ingredient.Pepperoni;
import com.tare.designpattern.factory.ingredient.Sauce;
import com.tare.designpattern.factory.ingredient.Veggies;

public abstract class Pizza {

	String name; 
	Dough dough; 
	Sauce sauce; 
	Veggies veggies[]; 
	Cheese cheese; 
	Pepperoni pepperoni; 
	Clams clam; 
	
	ArrayList toppings = new ArrayList(); 
	
	abstract void prepare(); 
	
	/*
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i=0; i<toppings.size(); i++) {
			System.out.println("    " + toppings.get(i));
		}
	}
	*/
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
		
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
		
	}
	
	void setName(String name) {
		this.name = name; 
	}
	
	String getName() {
		return name; 
	}
	
	public String toString() {
		// print pizza name 
		
		return name; 
	}
	
}
