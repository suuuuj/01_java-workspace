package com.br.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 *  *switch문도 조건문
	 *  
	 *  if문과의 '차이점'이라면?
	 *  >if문 안의 조건식은 자유롭게 기술 가능 (범위에 대한 조건, 동등 비교 등등)
	 *  단, switch문은 동등비교만 가능 (동등비교할 값들만 작성)
	 *  > 실행할 구문만 실행하고 자동으로 빠져나오질 못함! (직접 break; 문 작성해야함)
	 *  
	 *  switch(동등비교할 대상자) {
	 *  case 값1 : 실행코드1; break;
	 *  case 값2 : 실행코드2; break;
	 *  ....
	 *  
	 *  [default : 위의 값들과 모두 일치하지 않을 경우 실행코드;] - if문의 else와 비슷
	 *  }
	 */
	
	public void method1 () {
		/*
		 *  정수를 입력받아
		 *  1일 경우 "빨간색 입니다."
		 *  2일 경우 "파란색 입니다."
		 *  3일 경우 "초록색 입니다."
		 *  그 외의 값을 입력했을 경우 "잘못 입력 하셨습니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 정수 : ");
		int num = sc.nextInt();
		
		/*if(num == 1) {
			System.out.println("빨간색입니다.");
		}else if (num == 2){
			System.out.println("파란색입니다.");
		}else if (num == 3){                     
			System.out.println("초록색입니다.");
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		} */
		
		switch(num) {
		case 1: System.out.println("빨간색입니다."); break;
		case 2: System.out.println("파란색입니다."); break;
		case 3: System.out.println("초록색입니다."); break;
		default : System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0; //과일의 가격을 보관할 변수   String -"" /  int -0
		
		switch(fruit) {
		case "사과": price = 1000; break;
		case "바나나": price = 2000; break;
		case "복숭아": price = 3000; break;
		default : System.out.println(fruit + "은(는) 판매하는 과일이 아닙니다."); return;
		} 
		
		//xx의 가격은 xxxx원 입니다.
		System.out.printf("%s의 가격은 %d원 입니다.",fruit,price);
	}
	
	// break 없는 switch문을 사용하는 예시
	public void method3() {
	    /*
	     * 등급별 권한
	     * 1: 읽기 권한 + 글쓰기 권한 + 관리 권한
	     * 2: 읽기 권한 + 글쓰기 권한
	     * 3: 읽기 권한
	     */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		switch (level) {
		case 1: System.out.println("관리권한");
		case 2: System.out.println("글쓰기권한");
		case 3: System.out.println("읽기권한");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		switch(gender) {   // if -> gender == 'm' || gender == 'M'
		case 'm' : case 'M' : System.out.println("남학생"); break;
		case 'f' : case 'F' : System.out.println("여학생"); break;
		default : System.out.println("성별을 잘못 입력하셨습니다.");
		}
			
	}
	
	public void method5 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월~12월까지 중 하나를 입력(정수로) : ");
		int month = sc.nextInt();
		
		// 1.3.5.7.8.10.12 -> 31일
		// 4.6.9.11 -> 30일
		// 2 -> 28일 또는 29일
		
		// 입력하신 월은 xx일 까지 입니다.
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("입력하신 월은 31일까지 입니다."); break;
		case 4: case 6: case 9: case 11 : System.out.println("입력하신 월은 30일까지 입니다."); break;
		case 2:  System.out.println("입력하신 월은 28일 또는 29일까지 입니다."); break;
		default : System.out.println("반드시 1~12월까지를 입력해야합니다.");
		}
		
		
	}

}
