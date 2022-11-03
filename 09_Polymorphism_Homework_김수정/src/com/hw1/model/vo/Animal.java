package com.hw1.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {}
	
	protected Animal(String name, String kinds) {
		this.name=name;
		this.kinds=kinds;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setKinds(String kinds) {
		this.kinds=kinds;
	}
	
	public String getName() {
		return name;
	}
	
	public String getKinds() {
		return kinds;
	}
	
	
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak();

}
