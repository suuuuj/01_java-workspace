package com.br.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {
	
	private int inch;
	
	public Tv() {}
	
	public Tv (String brand, String pCode, String pName, int price, int inch) {
		super (brand, pCode, pName, price);//반드시 첫줄에 기술
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String information() {
		return super.information() + ", inch:" + inch;
	}

}
