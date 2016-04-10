package com.tare.designpatter.state.gumball;

public class NoQuarterState implements State {

	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gm) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gm;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");

	}

	@Override
	public void dispene() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");
	}

}
