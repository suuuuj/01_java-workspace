package com.br.chap06_method.controller;

public class OverloadingTest {
	
	// 오버로딩 : 한 클래스 내에 동일한 이름의 메소드명으로 정의할 수 있는 것
	public void test() {
		
	}
	/*
	public void test() {
		
	} -오버로딩에 적용x */
	
	public void test (int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a ) {
		
	}
	
	public void test(int a, int b) {
		
	}
	//"매개변수명과는 상관없이 "매개변수의 자료형의 개수가 순서와 다르게 작성되어야 합
	//public void test(int c, int d) {
	
	/*public void test(String str) {
	
	
	}*/
	protected int test(String str) {
		return 0;
	}
	/*
	 * 결론
	 * *오버로딩 : 한 클래스 내에 동일한 이름의 메소드들
	 * 단, 매개변수명/접근제한자/ 반환형을 다 떠나서 "매개변수"의 자료형과 개수 , 순서가 다르게 작성되어 있어야함	
	 */
		
	//}


}
