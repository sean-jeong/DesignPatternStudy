package com.tare.designpatter.state.gumball;

public class SoldOutState implements State {

	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gm) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gm;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다.");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다.");

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다.");

	}

	@Override
	public void dispene() {
		// TODO Auto-generated method stub
		System.out.println("매진되었습니다.");

	}

}
