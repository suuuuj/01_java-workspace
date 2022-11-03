package com.br.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{
	
	public static final String CPU = "intel";
	private String graphic;
	
	public Desktop() {}
	
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic=graphic;
	}
	
	public String getGraphic() {
		return graphic;
	}
	public void srtGraphic(String graphic) {
		this.graphic=graphic;
	}
	
	public String toString() {
		return super.toString()+", CPU : " + CPU + ", graphic : " + graphic;
	}

}
