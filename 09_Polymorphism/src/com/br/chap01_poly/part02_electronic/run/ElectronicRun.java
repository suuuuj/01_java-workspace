package com.br.chap01_poly.part02_electronic.run;

import com.br.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.br.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.br.chap01_poly.part02_electronic.model.vo.Desktop;
import com.br.chap01_poly.part02_electronic.model.vo.Electronic;
import com.br.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.br.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {
	
	// 실행용 클래스는 납품업체라고 생각
	public static void main(String[] args) {
		
		// 1. 다형성 적용 안했을 경우 (ElectronicShop1)
		//ElectronicShop1 es = new ElectronicShop1();
		
		// 추가
		// es.desk -> private 이기 때문에 직접적 접근 불가
		//es.insert(new Desktop ("Samsung","데탑",1200000,"Geforce1070"));
		//es.insert(new NoteBook ("LG","그램",2000000, 4));
		//es.insert(new Tablet ("Apple","아이패드",800000, false));
		
		// 제품 조회
		/*
		Desktop d = es.selectDesktop();
		 
		System.out.println(d);
		
		NoteBook n = es.selectNoteBook();
		System.out.println(n);
		
		System.out.println(es.selectTablet());
		*/

//--------------------------------------------------------------------------------		
		
		//2. 다형성 적용했을 경우 (ElectronicShop2)
		ElectronicShop2 es = new ElectronicShop2();
		
		es.insert(new Desktop ("Samsung","데탑",1200000,"Geforce1070"));
		es.insert(new NoteBook ("LG","그램",2000000, 4));
		es.insert(new Tablet ("Apple","아이패드",800000, false));
		
		// 제품 조회
		Desktop d = (Desktop)es.select(0); //->Electronic 타입 (형변환 필요)
		NoteBook n = (NoteBook)es.select(1); // 부모타입-> 자식타입 (강제 형변환)
		Tablet t = (Tablet)es.select(2);  //DownCasting  
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		/*
		 *  * 다형성을 사용하는 이유
		 *  1. 부모타입의 배열로 다양한 자식객체들을 받을 수 있음
		 *  2. 메소드 정의시 다형성 개념을 적용시키면 메소드 개수가 확 줄어듦
		 *	   => Object클래스의 equals 메소드의 매개변수가 Object로 되어있음
		 *  	  학생객체.equals(학생객체)
		 *        도서객체.equals(도서객체)
		 *        제품객체.equals(제품객체)
		 *  3. 
		 */
		Object o1 = new Tablet();  // Object- 최고 부모 어떠한 자식이든 받을 수 있음
		Object o2 = new Electronic();
		
	}

}
