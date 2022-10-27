package com.hw2.model.vo;

public class Book {
	//필드부
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	//기본생성자
	public Book() {
		
	}
	
	//매개변수생성자
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	//set메소드
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void setAuthor (String author) {
		this.author=author;
	}
	
	//get메소드
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public String information() {
		return (title + "    " + price + "     " + discountRate + "     " + author); 
	}


}
