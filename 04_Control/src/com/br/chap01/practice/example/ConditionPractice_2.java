package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice_2 {

	//실습 문제 1 - 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");   // 1. 메뉴 출력
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");  // 2. 사용자가 메뉴번호 선택 
		int num = sc.nextInt();
		
		String menu = "";  // 3.메뉴 번호에 대한 값 담을 변수 생성
		
		switch (num) {
		case 1: menu = "입력"; break;
		case 2: menu = "수정"; break;
		case 3: menu = "조회"; break;
		case 4: menu = "삭제"; break;
		case 9: System.out.println("프로그램이 종료됩니다."); return;
		default : System.out.println("번호를 잘못 입력하셨습니다."); return;
	    
		}  // 4. 사용자가 선택한 번호에 맞는 값을 추출할 조건 생성 
		
		System.out.println ( menu + " 메뉴입니다."); // 5. 값 출력
		
	}
	
	//실습 문제 2 - 입력받은 정수가 양수이면서 짝수일때만 "짝수다"를 출력, 짝수가 아니면 "홀수다" 출력, 양수가 아니면 "양수만 입력해주세요"를 출력
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : "); 
		int num = sc.nextInt();
		
		if (num>0) {
			if( num % 2 == 0 ) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	// 실습 문제 3 - 국, 영, 수 의 점수를 입력받고, 합계와 평균 계산 합격/불합격 처리
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng ;
		double avg = sum / 3.0;        // int / double => double
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	// 실습 문제 4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();	
		
//		switch(month) {
//		case 12: case 1: case 2: System.out.println(month + "월은 겨울입니다."); break; 
//		case 3: case 4: case 5: System.out.println(month + "월은 봄입니다."); break;
//		case 6: case 7: case 8: System.out.println(month + "월은 여름입니다."); break;
//		case 9: case 10: case 11: System.out.println(month + "월은 가을입니다."); break;
//		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
//		}
		
		String season = "";
		
		switch(month) {
		case 12: case 1: case 2: season = "겨울"; break; 
		case 3: case 4: case 5: season = "봄"; break;
		case 6: case 7: case 8: season = "여름"; break;
		case 9: case 10: case 11: season = "가을"; break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다."); return;
		}
		
		System.out.println(month + "월은 " + season + "입니다.");		
	}
	
	// 실습 문제 5 중첩 if문
	public void practice5() {
		String userId = "sj25054";
		String userPw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else if (userId.equals(id) || userPw.equals(pw)) {
			if(userId.equals(id)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else {
				System.out.println("아이디가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디와 비밀번호 모두 틀렸습니다.");
		}
		
	}
	
	// 실습 문제 5-2  if-else-if
		public void practice5_2() {
			String userId = "sj25054";
			String userPw = "1234";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			
			if(userId.equals(id) && userPw.equals(pw)) {
				System.out.println("로그인 성공");
			}else if (userId.equals(id)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else if (userPw.equals(pw)) {
				System.out.println("아이디가 틀렸습니다.");
			}else {					
				System.out.println("아이디와 비밀번호 모두 틀렸습니다.");
			}
			
		}
	
	
	
	// 실습 문제 6 	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자" : System.out.println("회원관리, 게시글 관리");
		case "회원" : System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : System.out.println("게시글 조회"); break;
	    default : System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 실습 문제 7
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요: ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요: ");
		int weight = sc.nextInt();
		
		double bmi = weight / (height * height);
		String result = "";
		
		if(bmi>=30) {
			result = "고도비만";
		} else if (bmi >= 25) {
			result = "비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상체중";
		} else {
			result = "저체중";
		}  
		
		System.out.println("BMI 지수 : " + bmi +"\n" + result);		
	}
	
	// 실습 문제 8


	
	
}
