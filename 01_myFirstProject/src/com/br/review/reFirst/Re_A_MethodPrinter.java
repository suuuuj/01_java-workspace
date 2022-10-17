package com.br.review.reFirst;

public class Re_A_MethodPrinter {
	
	public void methodA() {
		System.out.println("메소드 A 추출문");
		methodB();
	
	}
	
	public void methodB() {
		System.out.println("메소드 B 추출문");
		methodC();
	
	}
	
	public void methodC() {
		System.out.println("메소드 C 추출문");
		
	}

}
