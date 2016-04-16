package com.tare.serialization.socket;

import java.io.Serializable;

public class MyObject implements Serializable {
	
	String name; 
	int count; 
	
	MyObject() {
		setName(); 
	}
	
	public void setName() {
		count++; 
		name = "MyObject" + count; 
		
	}

	@Override
	public String toString() {
		return name; 
	}
	
	

}
