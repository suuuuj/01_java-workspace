package com.br.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break; : 반복문 안에 사용되는 분기문
	 * 			break;이 실행되는 순간 현재 속해있는 반복문을 빠져나감
	 * 
	 *  * 유의사항 : switch문 안에서의 break;는 오로지 switch문만을 빠져나감
	 *  		즉, 
	 *              반복문() {
	 *                 switch() {
	 *                    break;  // 해당 switch문만을 빠져나감 -> 반복문이 다시 실행
     *                 }
     *              }    
	 * 
	 * 
	 */
	
	public void method1() {
		// 사용자에게 문자열 입력받아 해당 그 문자열의 길이 출력(매번 반복)
		// 단, 사용자가 입력한 문자열이 "exit"과 일치할 경우 반복문을 빠져나가도록
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.print("문자열 입력(종료하고자 한다면 exit 입력) : ");
			String str = sc.nextLine();
			/// 비교위치
			if (str.equals("exit")) {
				break;
			}
			System.out.println(str + "의 글자수는 " + str.length() + "글자 입니다.");
			/// 비교위치
			
		}
	}
	
	public void method2() {
		//랜덤값(1~100) 발생 시키고 그 랜덤값 출력 (매번 반복 수행)
		//단, 발생된 랜덤 값이 3의 배수일 경우 반복문 빠져나옴
		
		
		while(true) {
			int random = (int) (Math.random()*100+1);
			
			System.out.println("랜덤 값 : " + random);
		
			if(random % 3  == 0) {
				break;
			}
			
		}
		
	}
	
	public void method3() {
		// 사용자에게 양수 입력받기
		// => 양수로 잘 입력했을경우 => 1에서부터 사용자가 입력한 수까지 1씩 증가되는 값 출력
		// => 양수가 아닌 숫자를 입력했을 경우 => 다시 입력
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("양수 입력 : ");
			int num = sc.nextInt();
			
			if(num > 0 ) { // 잘 입력했을 경우 -> 정상적인 결과 출력 후 반복문 종료
				
				for(int i=1; i<num; i++) {
					System.out.print(i + " ");
				}
				break; // 반복문 빠져나가기
				
				
			}else { //잘못 입력했을 경우-> "잘못입력"출력 후 반복문 다시 수행
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
		
	}

}//끝
