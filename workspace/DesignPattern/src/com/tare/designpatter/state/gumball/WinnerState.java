package com.tare.designpatter.state.gumball;

public class WinnerState implements State {

	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gm) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gm;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 배출되고 있는 중입니다.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 배출되고 있는 중입니다.");

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 배출되고 있는 중입니다.");

	}

	@Override
	public void dispene() {
		// TODO Auto-generated method stub
		System.out.println("축하드립니다.! 알맹이를 하나 더 받으실 수 있습니다..");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("No any Gumball");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
