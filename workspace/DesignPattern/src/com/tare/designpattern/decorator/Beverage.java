package com.tare.designpattern.decorator;

public abstract class Beverage {

	String description = "No name"; 
	
	public String getDescription() {
		return description; 
	}
	
	public abstract double cost(); 
	
}
