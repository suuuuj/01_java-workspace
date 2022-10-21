package com.test;

import java.util.Scanner;

public class Test {

	public void ex18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0) {
			if(num1<=9 && num2<=9) {
				if(num1 * num2 >=10) {
					System.out.println("두 자리 수 입니다.");
				}else {
					System.out.println("한 자리 수 입니다.");
				}
			}else {
				System.out.println("잘못 입력되었습니다.");
			}
		}else {
			System.out.println("잘못 입력되었습니다.");
			
		}
	}
	
	public void ex19() {
		
		int sum = 0;
		int i =1;

		
		
		
			 System.out.println("3의 배수를 제외한 100까지의 합 : " + sum);
			System.out.println("3의 배수를 제외한 100까지의 합의 평균 : " + (double)(sum / (100 - 100/3) ));
		}
	
	
					
		
		
	 
	
}// 끝
