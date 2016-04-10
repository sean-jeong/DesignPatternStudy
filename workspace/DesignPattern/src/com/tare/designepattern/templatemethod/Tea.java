package com.tare.designepattern.templatemethod;

public class Tea extends CaffeineBeverage {

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Lemon");
	}

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Brewing the tea");
	}

}
