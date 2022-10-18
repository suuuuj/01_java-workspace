package com.br.practice.example;

import java.util.Scanner;

public class Practice2 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("\n키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
    	//System.out.printf("\n키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
				
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.printf("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("\n더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		
	}
	
	public void method3 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("\n면적 : " + width * height);
		System.out.println("둘레 : " + (width + height)*2);
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("\n첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
	
	

}
