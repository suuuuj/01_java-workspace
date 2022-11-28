package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		Product pro1 = new Product("ssgnote9","갤럭시노트9","경기도 수원", 960000,10.0);
		Product pro2 = new Product("lgxnote5","LG스마트폰5","경기도 평택", 780000,0.7);
		Product pro3 = new Product("ktsote3","KT스마트폰3","서울시 강남",250000,0.3);
		
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println(pro3.information());
		
		
		System.out.println("---------------------------------------------");
		
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);
		pro3.setPrice(1200000);
		
		pro1.setTax(0.05);
		pro2.setTax(0.05);
		pro3.setTax(0.05);
		
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println(pro3.information());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("상품명 = " + pro1.getProductName()
						   +"\n부가세 포함 가격 = " + (int)(pro1.getPrice()+(pro1.getPrice()*pro1.getTax())) + "원");
		System.out.println("상품명 = " + pro1.getProductName()
						   + "\n부가세 포함 가격 = " + (int)(pro2.getPrice()+(pro2.getPrice()*pro2.getTax()))+ "원");
		System.out.println("상품명 = " + pro3.getProductName()
		   + "\n부가세 포함 가격 = " + (int)(pro3.getPrice()+(pro3.getPrice()*pro3.getTax()))+ "원");
	}

}
