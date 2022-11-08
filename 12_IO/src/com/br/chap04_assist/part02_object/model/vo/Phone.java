package com.br.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { //직렬화 (인터페이스)
	
	// 객체 자체를 입출력하고자 한다면 반드시 직렬화 과정이 필수
	

	private String name;
	private int price;
	
	public Phone() {}

	//alt+Shift+s => o => 엔터 (매개변수 자동완성)
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//alt+Shift+s => r => alt+a(모든항목 체크) => alt+r(generate) (getter/setter 자동완성)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	//alt+Shift+s => s =>엔터(toString 자동완성)
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}

	
	
	
}
