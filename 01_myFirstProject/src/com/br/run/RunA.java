package com.br.run;

import com.br.first.A_MethodPrinter;  // 이 패키지 안에 있는 클래스 가져다 쓸것임을 선언 (22번줄 오류 사라짐)

public class RunA {
	
	public static void main(String[] args) {
		
		// 프로그램 실행시 바로 실행되는 메소드
		// 여기서 실행시키고자 하는 메소드를 호출
		// 메소드 호출: 메소드명(); -> 같은 클래스의 메소드를 호출
		
		/* 다른 클래스에 있는 메소드를 실행하고자 할 때
		 * 1) 실행할 메소드가 속해있는 클래스를 생성(new)이라는 것을 먼저 해야함
		 * [표현법] 클래스명 대신사용할이름 = new 클래스명(); ->같은 패키지 안에 있어야 찾을 수 있음
		 */
		//A_MethodPrinter a = new A_MethodPrinter(); 
		// 위와 같이 작성시 오류나는 이유: 다른 패키지 안에 있기 때문에 오류
		
		/* 해결방법1. 해당 클래스가 어떤 패키지에 속해있는지 풀클래스명을 작성하는 방법 
		 * com.br.first.A_MethodPrinter a = new com.br.first.A_MethodPrinter();
		 */
		
		// 해결방법2. 그냥 클래스명만을 가지고 생성을 하되, 이 클래스가 어떤 패키지껀지 상단에 선언해두는 방법
		A_MethodPrinter a = new A_MethodPrinter(); // 클래스 명 a로 변경됨
		
		/*  2) 생성 후 이제 메소드 실행(호출)
		 *  [표현법] 사용할 이름.실행할 메소드명();
		 */
		/*
		a.methodA();
		a.methodB();
		a.methodC();
		*/
		
		a.methodA();
	}

}
