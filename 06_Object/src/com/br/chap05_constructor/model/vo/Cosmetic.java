package com.br.chap05_constructor.model.vo;

public class Cosmetic {

	private String cName;
	private int price;
	private String brand;
	private String category;
	private String[] ingredient;
	//-------------------------------------------------------------
	
	public Cosmetic() {//기본생성자
		
		
		
		
	}
	
	public Cosmetic(String cName, int price, String brand, String category, String[] ingredient) {
		
		this.cName = cName;
		this.price = price;
		this.brand= brand;
		this.category=category;
		this.ingredient=ingredient;
	}
	
	
	
	
	
	//----------------------------------------------------------
	public void setcName(String cName) {
		this.cName=cName;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void setBrand (String brand) {
		this.brand=brand;
	}
	
	public void setCategory (String category) {
		this.category=category;
	}
	
	public void setIngredient (String[] ingredient) {		
		this.ingredient= ingredient ;	
	}
	
	//---------------------------------------------------------------
	
	public String getcNum() {
		return cName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public String getCategory() {
		return category;
	}
	public String[] getIngredient() {
		return ingredient;
	}
	
	
	public String information() {
//		return "이름 : "+ cName + "\n가격 : " + price + "원" + "\n브랜드 : " + brand + 
//				"\n카테고리 : " + category + "\n성분 : " + ingredient[0] + ", " + ingredient[1];
		
		String str = "이름 : "+ cName + "\n가격 : " + price + "원" + "\n브랜드 : " + brand + 
				"\n카테고리 : " + category + "\n성분 : " ;
		
		for(int i = 0; i<ingredient.length; i++) {
			str += ingredient[i] + " ";
		}
		
		return str;
	}
	
	
	
}
