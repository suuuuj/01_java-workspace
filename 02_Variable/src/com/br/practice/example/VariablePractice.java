package com.br.practice.example;
import java.util.Scanner;
public class VariablePractice {

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
		
		System.out.printf("\n키 %.1f인 %d살 %s자 %s님 반갑습니다^^", height, age, gender, name);
		
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2)); //괄호를 안하게 되면 문자열로 연이어짐
		System.out.println("빼기 결과 : " + (num1 - num2)); //마찬가지로 괄호를 안하게 되면 문자열 인식
		System.out.println("곱하기 결과 : " + num1 * num2); // 덧셈보다 곱셈이 우선순위 임으로 괄호를 하지 않아도 됨
		System.out.println("나누기 결과 : " + num1 / num2); // '/'대신 '%'를 쓰면 몫 말고 나머지 값을 알려줌
		
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double length1 = sc.nextDouble();  //width
		
		System.out.print("세로 : ");
		double length2 = sc.nextDouble(); //height
		
		System.out.println("\n면적 : " + (length1 * length2));
		System.out.println("둘레 : " + (length1 + length2)*2);
		
				
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");  //한번 입력 받음
		String str = sc.nextLine();
		
		char ch1 = str.charAt(0);   //sc.nextLine().charAt(0); 를 입력했다면 사용자가 입력하길 또 기다리고 있음
		char ch2 = str.charAt(1);   // 구할 값은 3개지만 사용자가 한번만 입력했기 때문에 변수(str)에 넣어서 출력
		char ch3 = str.charAt(2);
	}
	
}
