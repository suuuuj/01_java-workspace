package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductArrayTest {

	public static void main(String[] args) {
		
		Product[] p = new Product[3];
		p[0]= new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		p[1]= new Product("lgxnote5","LG스마트폰5","경기도 평택",780000, 0.7 );
		p[2]= new Product("KTsnote3","KT스마트폰3","서울시 강남",250000, 0.3 );
		
		for(int i = 0 ; i<p.length; i++) {
			System.out.println(p[i].information());
		}
		
		System.out.println("====================================");
		
		for(int i = 0; i<p.length; i++) {
			p[i].setPrice(1200000);
			p[i].setTax(0.05);
			System.out.println(p[i].information());
		}
		
		System.out.println("====================================");
		for (int i = 0 ; i<p.length;i++) {
			System.out.println("상품명 = "+p[i].getProductName());
			System.out.println("부가세 포함 가격 = " +(int)(p[i].getPrice()+(p[i].getPrice()*p[i].getTax()))+"원");
			
		}
	}

}
