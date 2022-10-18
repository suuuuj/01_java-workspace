package com.br.operator;

import java.util.Scanner;

public class Review {
	
	public void method1() {
		Scanner sc = new Scanner (System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (num>=1) && (num<=100);
		System.out.print("사용자가 입력한 값은 1이상 100이하이다 : " + result );
				
	}
	
	public void method2() {
		Scanner sc = new Scanner (System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num >0 ? "양수다" : "양수가 아니다";
		
		System.out.print(result);
	}
	
	public void method3() {
		Scanner sc = new Scanner (System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num>0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		System.out.print(result);
		
	}

}
