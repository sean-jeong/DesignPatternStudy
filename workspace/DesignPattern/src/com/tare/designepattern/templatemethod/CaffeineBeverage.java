package com.tare.designepattern.templatemethod;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater(); 
		brew(); 
		pourInCup(); 
		addCondiments(); 
	}

	abstract void addCondiments() ;

	void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("Drop stuff into a cup");
	}

	abstract void brew() ;

	void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("Boiling water");
	}
	
}
