package com.br.chap04_field.model.vo;

/*
 *  >> 변수 구분
 *   - 전역 변수 : 클래스 안에 곧바로 선언한 변수 (필드 같은것) => 클래스 내라면 어디든 전역으로 쓸 수 있음
 *   - 지역 변수 : 클래스 영역 내에 어떤 특정한 구역({})에 선언한 변수=> 선언된 해당 그 지역 내에서만 사용 가능
 *   			* 특정한 구역 : 메소드{}, 제어문(if, for){} 등등
 *   
 *   1. 전역 변수
 *   	- 멤버변수 == 인스턴스 변수
 *   생성시점 : new 연자를 통해서 객체 생성시
 *   소멸시점 : 생성된 객체 소멸시 같이 소멸
 *
 *   
 *   2. 클래스변수== stactic 변수
 *   생성시점 : 프로그램이 실행과 동시에 무조건 메모리영역에 할당
 *   소멸시점 : 프로그럄이 종료될 때 실행 
 *   
 *   
 *   2. 지역 변수
 *   - 생성시점 : 지역변수가 속해있는 특정한 구역({}) 실행(호출) 시 메모리영역에 할당
 *   - 소멸시점 : 특정한 구역({}) 종료시 소멸
 *   
 *  
 */
public class FieldTest1 { //클래스 영역 시작
	private int global;  
	public void test(int num) { // 메소드 영역 시작
		//매개변수 == 지역변수 	
		
		int local = 100; //초기값을 넣는 습관을 드ㄹ이자
				; 
		//멤버변수 => 이 객체 생성시 jvm이 기본값으로라도 초기화
		System.out.println(global);
		//매개변수=> 어차피 이 메소드 호출시 값이 전달되어 올꺼기 때문에 초기화 되어있음
		System.out.println(num);
		//지역변수 => 내가 초기화를 직접하지않으면 텅 빈 상태
		System.out.print(local);
		 
		FieldTest2 ft2 = new FieldTest2();
		
		System.out.println(ft2.pub);
		System.out.println(ft2.pro); 
		System.out.println(ft2.def);   //-> 같은 패키지에서는 접근가능
		//System.out.println(ft2.pri); //-> 역시나 불가능
	} // 메소드 영역 끝
	
	
} // 클래스 영역 끝
