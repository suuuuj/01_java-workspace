package com.br.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Basic {
	
	// 추상클래스 : 일반멤버변수 + 일반메소드 + 추상메소드
	// 인터페이스 : only 상수필드 + only 추상메소드
	
	
	//private int a;  
	
	// 인터페이스 에서는 상수필드만 쓸 수 있음
	// 완성형 메소드도 쓰지 못함 추상메소드만 쓸 수 있음
	
	/*  
	public void test() {
		
	}
	*/
	
	/*public static final*/ int NUM = 10;
	//어차피 상수필드만 기입 가능하기 때문에 이렇게만 써도 상수필드로 인식됨
		
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	//어차피 추상메소드만 쓸 수 있기때문에 내가 명시하지 않아도 가능
}
