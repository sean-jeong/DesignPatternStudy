package com.tare.designpattern.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decafein coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
