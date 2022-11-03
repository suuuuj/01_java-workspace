package com.br.chap02_abstractAndInterface.part02_interface.model.vo;

public abstract class Person {
	
	private String name;
	private double weight;
	private int health;
	
	public Person() {}
	
	public Person(String name, double weight, int health) {
		this.name=name;
		this.weight=weight;
		this.health=health;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public void setHealth (int health) {
		this.health=health;
	}
	
	
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public int getHealth () {
		return health;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", weight: " + weight + ", health: " + health;
	}
	
	//public abstract void eat();  //지우면 자식클래스 오버라이딩 한것에 오류뜸
	//public abstract void sleep();

}
