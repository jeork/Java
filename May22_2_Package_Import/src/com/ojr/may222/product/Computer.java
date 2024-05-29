package com.ojr.may222.product;

public class Computer extends Product{
	String cpu;
	int ram;
	int hdd;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String name, int price, String cpu, int ram, int hdd) {
		super(name, price);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	@Override
	public void print_info() {
		// TODO Auto-generated method stub
		super.print_info();
		System.out.printf("CPU : %s\n",cpu);
		System.out.printf("RAM : %dGB\n",ram);
		System.out.printf("HDD : %dGB\n",hdd);
	}

}
