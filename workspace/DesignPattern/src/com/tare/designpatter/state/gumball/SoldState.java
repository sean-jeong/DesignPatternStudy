package com.tare.designpatter.state.gumball;

public class SoldState implements State {

	GumballMachine gumballMachine;

	public SoldState(GumballMachine gm) {
		this.gumballMachine = gm;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("이미 알맹이를 뽑았습니다.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("이미 손잡이를 돌렸습니다.");
	}

	@Override
	public void dispene() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of qumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
