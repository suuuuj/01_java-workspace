package com.br.chap01_beforeVSafter.before.run;

import com.br.chap01_beforeVSafter.before.model.vo.Desktop;
import com.br.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.br.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		//Desktop 객체생성
		// brand,pCode,pName,Price,allInOne(순서중요!!)
		Desktop d = new Desktop ("삼성", "d-01", "짱짱데스크탑", 2000000, true); // ctrl+shift+o ->import단축키
		
		
		//Tv객체생성
		// brand,pCode,pName,Price,inch
		Tv t = new Tv("엘지", "t-01", "겁나 얇은티비", 3500000,65);
		
		//SmartPhone객체생성
		// brand,pCode,pName,Price,mobileAgency
		SmartPhone s = new SmartPhone("애플","s-01","아이폰",1300000,"KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * 세 클래스에 공통적인 필드와 공통적인 메소드들 존재
		 *  중복된 코드들을 따로 "부모" 클래스로 한번만 정의해두면 중복된 코드를 줄일 수 있음
		 *  
		 *  => brand, pCode, pName, price 필드들, setter/getter메소드, information메소드
		 *  => Product 클래스로 정의
		 */
	}

}
