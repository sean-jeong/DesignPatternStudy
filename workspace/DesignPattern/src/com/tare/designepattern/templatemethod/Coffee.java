package com.tare.designepattern.templatemethod;

public class Coffee extends CaffeineBeverage {

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding some sugar and milk");
	}

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Brewing Coffee with filter");
	}

}
