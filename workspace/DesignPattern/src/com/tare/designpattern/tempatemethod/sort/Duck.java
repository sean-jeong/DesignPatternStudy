package com.tare.designpattern.tempatemethod.sort;

public class Duck implements Comparable {

	String name;
	int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		return name + ", weight: " + weight;
	}

	@Override
	public int compareTo(Object object) {
		// TODO Auto-generated method stub
		Duck otherDuck = (Duck) object;

		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else {
			return 1;
		}
	}

	
	
}
