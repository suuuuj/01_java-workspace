package com.br.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다";
		
		System.out.println("\n" + result);
	
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "양수다" :(num == 0 ? "0이다" : "음수다"));
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n" + "정수 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.print("\n" + result);
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("\n1인당 사탕 개수 : " + candy / people);
		System.out.println("남는 사탕 개수 : " + candy % people);
				
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		//String result = gender == 'M' || gender == 'm' ? "남학생" : "여학생";
		char result = (gender == 'M' || gender == 'm' ? '남' : '여');
		
		System.out.printf("\n%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", grade, classNum, num, name, result, score);
		                            // String 사용했을 경우 %s의
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년");
			
		System.out.println("\n" + result);
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math ;
		double average = total / 3.0; // int / int(3.0이 아닌 3) 를 하게 되면 그 결과 값이 int로 받게 되어 몫만 출력되고 소수점 표현이 어려워짐
		
		System.out.println("\n합계 : " + total);
		System.out.println("평균 : " + average);
		
		String pass = korean >=40 && english >= 40 && math >= 40 && average >= 60 ? "합격" : "불합격";
		System.out.println(pass);
	
		// pass 변수 만들지 않고 바로 출력한다면?
		//System.out.println(korean >=40 && english >= 40 && math >= 40 && average >= 60 ? "합격" : "불합격");
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char ch = sc.nextLine().charAt(7); // '1' '2' '3' '4' 숫자의 모양을 하고 있어도 엄연한 문자임
		
		//String gender = ch % 2 == 0 ? "여자" : "남자";  -> ch는 문자이기때문에 문자와 숫자의 연산이 된것. 운좋게 맞은거지 부적절한 표현임.
		
		String gender = (ch == '1' || ch == '3' ? "남자" : "여자");
		// 또는 해당 문자에 대한 숫자를 입력 String gender = (ch == 49 || ch == 51 ? "남자" : "여자");
		
		System.out.println("\n" + gender);
			
	}

}
