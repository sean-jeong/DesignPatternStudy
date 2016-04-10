package com.tare.designepattern.templatemethod.hook;

public abstract class CaffeineBeverageWithHook {

	void prepareRecipe() {
		boilWater(); 
		brew(); 
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments(); 
		}
	}
	
	abstract void brew(); 
	
	abstract void addCondiments(); 
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pour in cup");
	}
	
	boolean customerWantsCondiments() {
		return true; 
	}
	
}
