package com.ex.controller;

import java.util.Scanner;

public class ExController {
	
	// 문제1
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하시오 : ");
		int num2 = sc.nextInt();
		
		System.out.println("\n두 정수의 합 : " + (num1 + num2));
		System.out.println("두 정수의 차 : " + (num1 - num2));
		System.out.println("두 정수의 곱 : " + (num1 * num2));
		System.out.println("두 정수를 나누기한 몫 : " + (num1 / num2));
		
	}
	
	// 문제2
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서명 : ");
		String name = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String company = sc.nextLine();
		
		System.out.println("\n도서명 : " + name);
		System.out.println("가격 : " + price + "원");
		System.out.println("출판사 : " + company + "출판사");
		
	}
	
	// 문제3
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		System.out.print("실수를 입력하세요 : ");
		double dNum = sc.nextDouble();
		
		int result = iNum + (int)dNum;
		
		System.out.println(result);
		
	}
	
	// 문제4
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double average = sum / 3.0 ;    // 전반적으로 문제없이 잘 실행되긴 하나 평균구하는 구문에서
	  //double average = sum / 3;   <-- // int형 / int형을 하는 순간 결과 또한 int형으로 그 순간에 데이터 손실이 발생한다.
		
		System.out.println("\n합계 : " + sum + "점");
		System.out.println("평균 : " + average + "점");
				
	}

	// 문제5
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력해주세요. : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ch == 'y' || ch == 'Y' ? "프로그램을 종료합니다." : "프로그램을 계속 진행합니다.";
		
		System.out.println(result);
		
	}
	
	// 문제6
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학원명 : ");
		String academe = sc.nextLine();
		
		System.out.print("강의실(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.printf("%s 학원 %d 강의실에서 수강중인 %d살 %c자 %s님 환영합니다~", academe, num, age, gender, name);
				
	}

	// 문제7
	
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력하세요( +, -, * 중 하나) : ");
		char ch = sc.nextLine().charAt(0);
		
		
		if (ch == '+') {
			System.out.println("두 정수의 합 : " + (num1 + num2));
		} else if (ch == '-') {
			System.out.println("두 정수의 차 : " + (num1 - num2));
		} else if (ch == '*') {
			System.out.println("두 정수의 곱 : " + (num1 * num2));
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
	}
	
	// 문제8 
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력하세요( +, -, * 중 하나) : ");
		char ch = sc.nextLine().charAt(0);
		
		switch (ch) { 
		case '+': System.out.println("두 정수의 합 : " + (num1 + num2)); break;
		case '-': System.out.println("두 정수의 차 : " + (num1 - num2)); break;
		case '*': System.out.println("두 정수의 곱 : " + (num1 * num2)); break;
		default : System.out.println("연산자를 잘못 입력하셨습니다.");
		
		}
		
	}



}
