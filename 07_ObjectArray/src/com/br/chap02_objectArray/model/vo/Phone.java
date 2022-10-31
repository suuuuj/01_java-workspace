package com.br.chap02_objectArray.model.vo;

public class Phone {

	private String name;    //이름
	private String brand;   //브랜드명
	private int price;      //가격
	private String series;  //시리즈
	
	//기본생성자
	public Phone() {
		
	}
	//매개변수 생성자
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	
	//setter
	public void setName (String name) {
		this.name=name;
	}
	public void setBrand (String brand) {
		this.brand=brand;
	}
	public void setPrice (int price) {
		this.price=price;
	}
	public void setSeries (String series) {
		this.series=series;
	}
	
	//getter
	public String getName () {
		return name;
	}
	public String getbrand () {
		return brand;
	}
	public int getPrice () {
		return price;
	}
	public String getSeries () {
		return series;
	}
	
	//information
	public String information() {
		return name + ", " + brand + ", " + price + ", " + series;
	}
}
