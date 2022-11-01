package com.ex.controller;

import java.util.Scanner;

import com.ex.model.vo.Bread;

public class ExController {
	
	// 1번
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		}else {
			System.out.println("양수가 아니다.");
		}
	} //1
	
	//2번
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 양수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 양수 입력 : ");
		int num2 = sc.nextInt();
		
		//두 개의 양수 중 작은수에서부터 큰 수까지 1씩 증가되는 값을 출력, 양수가 아닐시 "잘못 입력하였습니다." 출력
		if(num1>0 && num2>0) {
			if(num1>num2) {
				for(int i = num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				}
			}else if(num1<=num2) {
				for(int i = num1 ; i<=num2 ; i++) {	
					System.out.print(i + " ");
				}
			  }
		}else {
			System.out.println("잘못 입력하였습니다.");
	     }
	}//2
	
	//3번
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("연산자(+, -, x or X, /, %) 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
			if(ch=='/' || ch == '%') {
				if(num2==0) {
					System.out.println("0으로 나눌수 없습니다. 프로그램을 종료합니다.");
				} else if(ch=='/'){
					System.out.printf("%d %c %d = %d",num1,ch,num2,num1/num2); 
				} else {
					System.out.printf("%d %c %d = %d",num1,ch,num2,num1%num2);
				}
				
			}else{
				switch(ch) {
				case '+': System.out.printf("%d %c %d = %d",num1,ch,num2,(num1+num2)); break;
				case '-': System.out.printf("%d %c %d = %d",num1,ch,num2,(num1-num2)); break;
				case 'x': case'X': System.out.printf("%d %c %d = %d",num1,ch,num2,(num1*num2)); break;
				default : System.out.println("연산자를 잘못 입력하였습니다. 프로그램을 종료합니다.");
				}
			}
	}//3
	
	//4번
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총합계 : "+ sum);
		
	}//4
	
	//5번,6번 - Bread 클래스작성
	public void ex5() {
		Bread b = new Bread();
		b.setbreadName("포켓몬빵");
		b.setBrand("삼립");
		b.setPrice(1500);
		b.setStock(0);
		System.out.println("=============");
		System.out.println(b.information());
		
		b.setStock(20);
		System.out.println(b.information());

//		Bread b = new Bread("포켓몬빵", "삼립", 1500, 0);
//		System.out.println(b.information());
//		b.setStock(20);
//		System.out.println("=============");
//		System.out.println(b.information());
		
	}//6
	
	//7번
	public void ex6 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빵 이름 : ");
		String breadName = sc.nextLine();
		
		System.out.print("브랜드 : ");
		String brand = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("재고수량 : ");
		int stock = sc.nextInt();
		
		Bread user = new Bread(breadName, brand, price, stock);
		
		System.out.println(user.information());
		
	}//7

}//끝
