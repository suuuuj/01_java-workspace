package com.br.chap04_field.model.vo;

// 클래스 변수(static변수), 상수필드
public class FieldTest3 {

	
	
	// 접근제한 [예약어] 자료형 변수명;
	// static은 공유의 개념
	// static이 붙은 것들은 프로그램 실행과 동시에 메모리의 static영역에 올라감
	// 프로그램 실행시 딱 한번 메모리상에 올려두고 여기저기서 가져다 쓰자
	
	public static String sta = "static_FieldTest3";
	
	// static : 공유의 개념
	// final : 상수의 개념 (한번 지정된 값, 변경 불가능)
	
	// 상수필드 (static final / final static) : 프로그램 시작시 값이 저장되면 더이상 변경되지 않고
	// 										  서로서로 공유하면서 사용할 목적
	
	public static final String STAFIN = "static final"; 
	//상수필드는 선언만 하는것 안됨 무조건 초기값과 함께
	
}
