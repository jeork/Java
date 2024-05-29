package com.oj.may233.planet;

import com.oj.may233.human.Human;

public class Planet {
	private String planet_name;
	private int size;
	private boolean visible;

	public Planet() {
		// TODO Auto-generated constructor stub
	}

	public Planet(String planet_name) {
		super();
		this.planet_name = planet_name;
	}

	public String getPlanet_name() {
		return planet_name;
	}

	public void setPlanet_name(String planet_name) {
		this.planet_name = planet_name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public void add(Human h) {
		System.out.printf("%s에 %s 입주 !\n",planet_name,h.getName());
		
	}
	

}
