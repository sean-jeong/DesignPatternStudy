package com.tare.designpattern.decorator;

public class SteamMilk extends CondimentDecorator {

	Beverage beverage;

	public SteamMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Steam Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}

}
