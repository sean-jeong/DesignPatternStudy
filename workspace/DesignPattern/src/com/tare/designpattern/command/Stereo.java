package com.tare.designpattern.command;

public class Stereo {

	public Stereo(String whereTo) {
		System.out.println(whereTo);
	}

	public void on() {
		System.out.println("Stereo On");

	}

	public void off() {
		System.out.println("Stereo Off");
	}

	public void setCd() {
		System.out.println("Stereo Set CD");

	}

	public void setDvd() {
		System.out.println("Stereo Set Dvd");
	}

	public void setRadio() {
		System.out.println("Stereo Set Radio");

	}

	public void setVolume(int volume) {
		System.out.println("Stereo Set Volume : " + volume);
	}

}
