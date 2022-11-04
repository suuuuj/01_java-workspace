package com.br.chap01_math.run;

public class MathRun {
	
	public static void main(String[]args) {
		
		// java.lang.Math->import필요없음
		
		// 상수필드
		System.out.println("파이 : "+ Math.PI);
		
		// 절대값을 알고자할 때: abs 메소드
		int num1 = -10;
		System.out.println("절대값 : "+ Math.abs(num1));
		
		// 올림 : ceil메소드
		double num2 = 4.349;
		System.out.println("올림 : " + /*(int)*/Math.ceil(num2)); 
		
		// 반올림 :round 메소드
		System.out.println("반올림 : "+ Math.round(num2));
		
		// 버림 : floor 메소드
		System.out.println("버림 : " + Math.floor(num2));
		
		// 가장 가까운 정수값 알아내기 : rint 메소드
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		// 제곱근(루트) : sqrt 메소드
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 제곱 : pow 메소드
		System.out.println("2의 10제곱 : " + Math.pow(2,10));
		
		/*
		 *  *Math 특징
		 *  - 모든 필드 상수필드, 모든 메소드 static메소드
		 *  즉, 프로그램 실행과 동시에 이미 static메모리 영역에 다 올라가있음
		 *  => 클래스명. 으로 접근 가능
		 *  **한번만 메모리 영역에 올려놓고 재사용하는 개념 => 싱글톤 패턴
		 */
		
		//Math m = new Math(); // 기본생성자가 private로 되어있어서 객체생성불가
		//애초에 static 으로 되어 있으니 프로그램 실행시 매번 생성할 필요 x 이미 올라가 있는것을 언제든지 사용가능
		
		
		
		
		
		
		
		
		
	}

}
