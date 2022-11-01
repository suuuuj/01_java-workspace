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
		
		while (true) {
			int sum = 0;
			int  count = 0;
			
			//1~100까지의 3의 배수를 제외한 모든 정수들의 합 
			
			for(int i = 1 ; i <=100 ; i++) {
				if(i%3==0 ) {
					continue;
				}else {
					sum += i;
					count++;
				}
			} System.out.println("3의 배수를 제외한 1~100까지의 합 : " + sum);
			System.out.println("평균 : " + sum /count);
			break;
		} 
		
	}
	
public void ex19_2() {
		
			int sum = 0;
			int count = 0;
			
			//1~100까지의 3의 배수를 제외한 모든 정수들의 합 
			
			int i = 1; //초기식
			while(i<=100) {
				if(i % 3 != 0) {
					sum+=i;
					count++;
				}
				i++;
			}
			System.out.println("총합계 : " +sum);	
			System.out.println("평균 : " + sum/count);
}

public void ex20 () {
	//2단~5단까지의 구구단 중 홀수단, 홀수수 인것만 출력 (for문 사용)
	/*
	 * 3*1=3
	 * 3*3=9
	 * 3*5=15
	 * ...
	 * 5*1=5
	 * ...
	 * 5*9=45
	 */
	
	for(int dan = 3 ; dan <=5 ; dan+=2) {
		System.out.println("=== " + dan + "단 ===");
		for(int su = 1 ; su <=9 ; su+=2) {
			System.out.printf("%d * %d = %d\n", dan,su,dan*su);
		}
	}
	
	
}



}// 끝
