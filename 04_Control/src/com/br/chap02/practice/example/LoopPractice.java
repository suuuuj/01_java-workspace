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
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1 이상의 숫자를 입력하세요. : ");
			int num = sc.nextInt();
			
			if(num>0) {
				for(int i=1; i<=num;i++) {
				
					System.out.print(i + " ");
					
				} break;
				
			}else {
					System.out.println ("잘못 입력했습니다.");
				}
		}
	
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
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요. : ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i = num ; i>=1 ; i--) {
					System.out.print(i + " ");
				} break;					
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
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
	
	// 실습문제7
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1>0 && num2>0) {
				if(num1>num2) {
					for(int i = num2 ; i<=num1; i++) {
						System.out.print(i + " ");
					} break;
					
				}else {
					for(int j = num1 ; j<=num2 ; j++) {
						System.out.print(j + " ");
					}break;
				}
				
			}else {
				System.out.print("1 이상의 숫자를 입력해주세요.\n");
			}
		}
	}
	
	// 실습문제8
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("==== " + dan + "단 ====");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
		}
			
	}
	
	// 실습문제9
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan<=9) {
			for(int i = dan; i<=9 ; i++) {
				System.out.println("==== " + i + "단 ====");
				for (int j=1; j<=9;j++) {
					System.out.printf("%d * %d = %d\n",i, j, i*j );
				
				}
				
			}
		
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
		
	}
	
	// 실습문제10
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if(dan>=2 && dan<=9) {
			
				for(int i = dan ; i <=9 ; i++) {
				
					System.out.println("==== " + i + "단 ====");
					
					for(int su = 1 ; su <=9 ; su++) {
						System.out.printf("%d x %d = %d\n",i ,su, i*su);
					}
				
				}
			}else {
				System.out.print("2~9사이의 숫자만 입력해주세요\n");
			}
			
		}
		
		
	}
	
	
	// 실습문제11
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int s = sc.nextInt();
		
		System.out.print("공차 : ");
		int gap = sc.nextInt();
		
		int sum = 0;
		for (int i = 1 ; i <=10 ; i++ ) {
			sum = s + gap * (i-1);
			System.out.print(sum + " ");
		} 
		
//		for(int i = s ; i <=(s + 9*gap) ; i+=gap) {
//			System.out.print(i + " ");
		
	}
	
	// 실습문제12
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
//			System.out.print("연산자(+, -, *, /, %) : ");
//			String str = sc.nextLine();
//			
//			System.out.print("정수1 : ");
//			int num1 = sc.nextInt();
//			
//			System.out.print("정수2 : ");
//			int num2 = sc.nextInt();
//			
//			if(!str.equals("exit")) {
//				if (str.equals("+")) {
//					System.out.println("num1 + num2 = " + (num1+num2));
//				}else if (str.equals("-")) {
//					System.out.println("num1 - num2 = " + (num1-num2));
//				}else if (str.equals("*")) {
//					System.out.println("num1 * num2 = " + (num1*num2));
//				}else if (str.equals("/")&& num2 == 0 ) {
//					System.out.println("num1 + num2 = " + (num1+num2));
//				}else 
//							
//			}else {
//				System.out.println("프로그램을 종료합니다.");
//			}
			
			
			
			
			
			
			
			
//			if(str.equals("exit")) {
//				 System.out.println("프로그램을 종료합니다.");
//			}else {
//				if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")||str.equals("%")) {
//					
//					if((str.equals("/")||str.equals("%")) && num2 == 0) {
//						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");						
//					}
//				}else {
//					System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
//				}
//								
//			}//exit 아닐때
			
		}
		
		
		
		
		
		
		
		
	}

} //끝
