package com.br.exception.controller;

import java.util.Scanner;

public class UnCheckedExeption {
	
	/*
	 *  *RuntimeExeption
	 *  - 프로그램 실행시 주로 발생되는 예외들
	 *  
	 *  *RuntimeExeption의 후손들
	 *  - IndexOutOfBoundsExeption : 부적절한 인덱스를 제시했을 때 발생되는 예외
	 *  - NullPointerExeption : 레퍼런스가 null로 초기화 되어 있는 상태에 어딘가에 접근하였을때 발생되는 예외
	 *  - ClassCastException : 허용할 수 없는 형변환이 진행될때 발생되는 예외
	 *  - ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
	 *  - NegativeArraySizeException : 배열 할당시 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 *  ...
	 *  
	 *  => RuntimeException 관련된 예외들은 충분히 "예측 가능함"
	 *    => 애초에 예외 자체가 발생이 안되게끔 조건문으로 해결가능 (예외처리 아님)
	 */
	
	Scanner sc = new Scanner(System.in);
	public void method1() {
		//ArithmaticException
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		// int result = num1 / num2;  -> 두번째 정수가 0일 경우 예외발생 -> 비정상적으로 종료
		//문제 해결 방법 1. 애초에 예외자체가 발생 안되게끔 조건검사 -> 예외처리 아님
		
		/*int result= 0;
		if(num2 != 0 ) {
			result = num1 / num2; // 2번째 정수가 0일때 나눗셈이 실행되지 않음
		}
		
		
		
		System.out.println("안녕하세요 반갑습니다. 당신의 결과를 알려드리겠습니다.");
		System.out.println("result : " + result);
		
		*/
		
		// 문제 해결 방법 2. 예외처리 구문을 작성하는 방법
		// * 예외처리 : 예외가 "빌셍헸을 때 처리할 내용으로 미리 작성해놓는 것 
		
		/*
		 * try catch 방법
		 * 
		 * try {
		 * 	 	예외가 발생될 수 있는 구문;
		 *  } catch(발생될 예외 클래스 매개변수){
		 *  	해당 예외가 발생됐을 경우 실행할 구문 미리 작성;
		 *  }
		 */
		
		try {
			int result = num1 / num2;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		//	e.printStrackTrace();
		}
		System.out.print("프로그램을 종료됩니다.");
		  //현재 발생된 예외에 대한 이력을 강제로 보고자할때
		
	}
	
	public void method2() {
		//NegativeAttaySize Exception
		// ArrayIndexOutOfBoundsException
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		//int[]arr  = new int[size];
		//System.out.println("100번 인덱스 값 : " + arr[100]);
		
		// 문제해결방법1. 애초에 예외자체가 발생이 안되게끔 조건검사
		/*
		if(size>0) {
			int[]arr = new int[size];
			
			if(size > 100)
				System.out.println("100번째 인덱스 값");
			
		}
		System.out.println("프로그램을 종료합니다.");
		*/
		
		//문제해결방법2. 예외처리방법
//		try {
//			int[] arr= new int[size];
//			System.out.println("100번 인덱스 값 : " + arr[100]);
//		) catch(NegativeArraySizeException)("배열의 크기는 음수로 제시할 수 없습니다.");
//			System.out.println("프로그램을 종료합니다.");
//			
//					
//		}
		
	}
	public void method3() {
	/*	System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		System.out.println("100번 인덱스의 값 : " + arr[100]);
	}catch (NegativaArraySizeEcption e) {
		System.out.println("배열의 크기는 음수로 제시할 수 없습니다.");
	}catch (NegativaArraySizeEcption e) {
		System.out.println("배열의 크기는 음수로 제시할 수 없습니다.");
*/
		try {
		int size =sc.nextInt();
		int[]arr = new int[size];
		System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("음수가 아닌 얀수로 배열의 크기지정해야됩니다.");
		}catch(RuntimeException e) { // 다형성 적용해서 부모타입예외 클래스 작성 가능
									//모든 자식 예외 발생시 다 받아서 처리할 수 있음
			System.out.println("예외가 발생됐어.. 배열의 크기가 잘못됐거나, 부적절한 인덱스가 제시했더나,,,");
		}
		System.out.println("프로그램을 종료합니다.");
	} // 부모예외클래스와 자식 예외 클래스를 가지고 catch 블럭을 기술할 경우
	// 자식예외클래스 catch블럭이 부모보다 위에 있어야됨
	
	/*
	 * RuntimeException 관련 예외들은 UncheckedException (예외처리구문이 필수는 아님)
	 *  if문(조건문) : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링하는거 (예외처리 구문 아님)
	 *  try캐치문  : 예외가 발생됐을 경우 실행 할 구문을 미리 작성해 두는것  (예외처리 구문)
	 *  
	 *  예측가능한 상황은 if문과 같은 조건믄으로 해결하는게 권장사항임
	 *  
	 *  
	 *  
	 */
}
