package com.tare.designepattern.templatemethod.hook;

public class BeverageTestDrive {
	public static void main(String[] args) {
		
		CoffeeWithHook coffeeHook = new CoffeeWithHook(); 
		
		System.out.println("Preparing with coffee");
		coffeeHook.prepareRecipe();
	}
}
