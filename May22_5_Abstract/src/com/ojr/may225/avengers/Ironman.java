package com.ojr.may225.avengers;

import com.ojr.may225.attack.Attack;
import com.ojr.may225.driver.Driver;
import com.ojr.may225.smoker.Smoker;

public abstract class Ironman extends Avengers implements Attack, Smoker, Driver {
	private int wealth;

	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, int wealth) {
		super(name, age);
		this.wealth = wealth;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}

	@Override
	public void print_info() {
		// TODO Auto-generated method stub
		super.print_info();
		System.out.printf("재산 : %d\n", wealth);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("레이저 발사");
	}

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("담배 피우는중~");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("운전중~");

	}

}
