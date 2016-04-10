package com.tare.designpattern.command;

public class Light {

	public Light(String whereTo) {
		System.out.println(whereTo);
	}

	public void on() {
		System.out.println("Light On");
	}

	public void off() {
		System.out.println("Light off");
	}

}
