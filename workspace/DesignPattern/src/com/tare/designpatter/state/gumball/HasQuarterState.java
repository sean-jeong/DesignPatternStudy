package com.tare.designpatter.state.gumball;

import java.util.Random;

public class HasQuarterState implements State {

	GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine gm) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gm;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전은 한개만 넣어주세요.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전이 반환됩니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("손잡이를 돌렸습니다.");

		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispene() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 나갈수 없습니다.");
	}

}
