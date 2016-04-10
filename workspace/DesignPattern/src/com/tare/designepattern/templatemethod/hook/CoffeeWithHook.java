package com.tare.designepattern.templatemethod.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Brewing with filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding some sugar and milk");
	}

	public boolean customerWantsCondiments() {
		String answer = getUserInput(); 
		if (answer.toLowerCase().startsWith("y")) {
			return true; 
		} else {
			return false; 
		}
	}

	private String getUserInput() {
		// TODO Auto-generated method stub
		String answer = null; 
		
		System.out.println("Would you like milk and sugar? (y/n) : ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		try {
			answer = in.readLine(); 
		} catch (IOException ioe) {
			System.err.println("IO error");
		}
		
		if (answer == null) {
			return "no";
		}
		
		return answer;
	}
	
}
