package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	// 실습문제 1
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num>0) {
			
			for(int i = 1; i <=num ; i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 실습문제2
	public void practice2() {
		
	}
	
	// 실습문제3
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			
			for(int i = num; i>=1 ; i--) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 실습문제4
	public void practice4() {
			
	}
	
	// 실습문제5 - 겁내 오래걸림...
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요. : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i < num ; i++) {
			
			sum += i; 
			
			System.out.print(i + " + ");
			
		} System.out.println(num + " = " + (sum + num));
		
	}
	
	// 실습문제6
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 양수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 양수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0) { // 입력숫자 1,2가 둘다 양수일때
			
			if(num1>num2) {
				
				for(int i = num2 ; i <= num1 ; i++ ) {
					System.out.print(i + " ");
				}
										
			}else { // num1<=num2
				for(int i = num1; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
				
			}
			
		} else {
			System.out.println("1 이상의 숫자만 입력해주세요.");
		}
		
	}
	
	// 실습문제8
	public void practice8() {
		
	}
	
	

} //끝
