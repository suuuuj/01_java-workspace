package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b = new Book();
		Book b1 = new Book("자바의 정석",20000,0.2,"윤상섭");
		System.out.println(b.information());
		System.out.println(b1.information());

		b.setTitle("C언어");
		b.setPrice(30000);
		b.setDiscountRate(0.1);
		b.setAuthor("홍길동");
		
		System.out.println("=============================");
		System.out.println("수정된 결과 확인");
		System.out.println(b.information());
		System.out.println("=============================");
		
		System.out.printf("도서명 = %s \n할인된 가격 = %.0f원 \n도서명 = %s \n할인된 가격 = %.0f원",
						b.getTitle(),(b.getPrice()-(b.getPrice()*b.getDiscountRate())),
						b1.getTitle(),(b1.getPrice()-(b1.getPrice()*b1.getDiscountRate())));
		
	}

}
