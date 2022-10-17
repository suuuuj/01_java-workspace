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
		System.out.println("\n" + result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
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
		int level = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int room = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double grade = sc.nextDouble();
		
		String result = gender == 'M' || gender == 'm' ? "남학생" : "여학생";
		
		System.out.printf("\n%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", level, room, num, name, result, grade);
		
		
	}
	
	

}
