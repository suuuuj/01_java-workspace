package com.ex.model.vo;

public class Bread {
	
	//필드
	private String breadName;
	private String brand;
	private int price;
	private int stock;
	
	//기본생성자
	public Bread() {
		
	}
	
	//매개변수 생성자
	public Bread(String breadName, String brand, int price, int stock) {
		this.breadName = breadName;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}
	
	//setter메소드
	public void setbreadName(String breadName) {
		this.breadName = breadName;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//getter메소드
	public String getbreadName () {
		return breadName;
	}
	public String getBrand () {
		return brand;
	}
	public int getPrice () {
		return price;
	}
	public int getStock () {
		return stock;
	}
	
	//information
	public String information () {
		return "빵 이름: " + breadName + "\n브랜드명: " + brand + "\n가격: " + price + "원"
				+ "\n재고수량: " + stock + "개";
	}
	

}
