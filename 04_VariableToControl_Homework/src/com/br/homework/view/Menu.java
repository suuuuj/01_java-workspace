package com.br.homework.view;

import java.util.Scanner;

public class Menu {
	
	public void displayMenu() {
		while(true) {
			
		System.out.println("1. 간단 계산기");
		System.out.println("2. 작은 수에서 큰 수까지 합계");
		System.out.println("3. 신상 정보 확인");
		System.out.println("4. 학생 정보 확인");
		System.out.println("5. 별과 숫자 출력");
		System.out.println("6. 난수까지의 합계");
		System.out.println("7. 구구단");
		System.out.println("8. 주사위 숫자 알아맞추기 게임");
		System.out.println("9. 프로그램 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		if(menu>0 && menu<=9) {
			
			//메뉴번호 function에서 호출, 9번 입력시 종료합니다 호출 후 종료
			
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		}
		
	}

}
