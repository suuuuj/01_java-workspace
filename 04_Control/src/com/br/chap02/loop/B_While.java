package com.br.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 *  for(초기식; 조건식; 증감식) {    조건식- ; true ;  ->무한반복문    ( ; ; )-> 생략: 이것도 무한 반복문
	 *       반복적으로 실행할 코드;  
	 *  }    
	 *  
	 *   *while문
	 *  [초기식;]
	 *   while(조건식) {    //반복을 수행시킬 조건만 작성
	 *        반복적으로 실행할 코드;
	 *        [증감식;]
	 *   }
	 *   
	 */
	
	public void method1() {
		// 안녕하세요 5번 반복 출력
		
		/* for문
		for (int i =1 ; i <=5 ; i++) {
			System.out.println("안녕하세요");
		}*/
		
		// * while문
		
		int i = 1;
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
		System.out.print(i);
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		while(i<6) {
			//System.out.print( i + " ");
			//i++;
			System.out.print(i++ + " ");
		}
		
		//System.out.print(i);
				
	}
	
	public void method3() {
		// 1부터 10 사이의 홀수만 출력
		// 13579
		
		int i = 1;
		while (i<=10) {
			if(i % 2 == 1) {
			System.out.print(i + " " );
			}
			i++;	
			
		/*while (i<=10) {
			System.out.print(i + " " );
			}
			i+=2;*/
		}
	}
	
	public void method4() {
		// 1부터 랜덤값 (1~100)까지의 총 합계
		
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		
		int i = 1;
		
		while(i<=random) {
			sum += i;
			i++;
		}
		
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " +  sum);

	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print ("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0 ;
		while (i<str.length()) {
			System.out.println(str.charAt(i++));
			
		}
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		//무한 반복문
		while (true) {
			
			//메뉴 출력
			System.out.println("\n======= 메뉴 =======");
			System.out.println("1. 안녕하세요 5번 출력");
			System.out.println("2. 1부터 5까지 출력");
			System.out.println("3. 1부터 10까지 홀수 출력");
			System.out.println("4. 1부터 랜덤값까지 총 합계 출력");
			System.out.println("5. 문자열의 각 문자 출력");
		    System.out.println("0. 프로그램 종료");
		    
		    System.out.print("\n메뉴번호를 입력하세요 > ");
		    int menu = sc.nextInt();
		    
		    switch(menu) {
		    case 1: method1(); break;
		    case 2: method2(); break;
		    case 3: method3(); break;
		    case 4: method4(); break;
		    case 5: method5(); break;
		    case 0: System.out.println("\n<<프로그램을 종료합니다. 이용해주셔서 감사합니다>>."); return;
		    default: System.out.println("\n잘못 입력하셨습니다. 메뉴를 다시 입력해주세요.");
		    }
		    	
		}
	}
	
	/*
	 *  *do-while 문
	 *  
	 *  do {
	 *      반복적으로 실행시킬 코드;
	 *  } while (조건식);
	 *  
	 *  *** 처음에 조건검사 없이 무조건 한번은 실행! ***
	 *  -> 조건 검사 -> true 일 경우 실행
	 *  ----------반복-------------
	 *  -> 조건검사->false일 경우 실행xㅌ -> 반복문 종료
	 *  
	 *  
	 */
	public void method7() {
		
		int num=1;
		do {
			System.out.println(num);
		} while(num <0); //조건이 무조건 false 이지만 1출력
		
	}
	
	public void method8() {
		//1부터 사용자가 입력한 수까지의 총 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int i = 1;
		do {
			sum += i++;
		}while(i<=num); 
		
		System.out.println("총 합계 : " + sum);
		
	}
	
	public void method9() {
		// 매번 반복적으로 사용자에게 문자열을 입력받고 해당 문자열의 길이 출력
		//단, 사용자가 입력한 문자열이 "exit"일 경우 반복문 종료
		
		Scanner sc = new Scanner(System.in);
		String str = ""; // 영역 밖에서도 이 변수를 쓰고자 할때
		do {
			System.out.print("문자열 입력(종료하고자 한다면 exit 입력) : ");
			 str = sc.nextLine();
			// xxx의 글자수는 xx글자입니다.
			System.out.println(str + "의 글자수는 " + str.length() + "글자입니다.\n");
			
		} while (!str.equals("exit"));
	}
	
	
} //끝
