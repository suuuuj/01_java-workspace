package com.br.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 *  선택적으로 실행하는 선택문  --> 조건문
	 *  반복적으로 실행하는 반복문  --> 반복문
	 *  그 외의 흐름을 제어      --> 분기문
	 *  
	 *  * 조건문 
	 *    "조건식"을 통해서 참인지 거짓인지를 판단하여 해당 조건이 만족하는 경우 실행문 실행
	 *    -> 조건식의 결과 true/false 로 표현 되야함
	 *    -> 보통 조건식에서는 비교연산자(대소, 동등), 논리연산자(&&, ||) 사용
	 *    
	 *  * 조건문은 크게 if문과 swich문으로 나뉨
	 *    if문은 3가지
	 *     1. 단독 if문
	 *     2. if-else문
	 *     3. if-else if문
	 *       
	 */
	
	/*
	 * * 단독 if문
	 * 
	 *   if(조건식) { 
	 *      실행시키고자 하는 코드;
	 *      ...   
	 *   }
	 *   
	 *   조건식이 true일 경우 => 중괄호 블럭 안의 코드 실행
	 *         false일 경우 => 중괄호 블럭 안의 코드 무시하고 넘어감
	 *                
	 */
	
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		}
		
		if(num <= 0) {
			System.out.println("양수가 아니다.");
		}
		
				
	}

	/*
	 *  * if-else문
	 *  
	 *    if(조건식) {
	 *    	실행 코드1;
	 *    } else {
	 *    	실행 코드2;
	 *    }
	 *    
	 *    조건식의 결과가 true일 경우 실행코드 1 실행 후 if-else문 빠져나감
	 *    단, 결과가 false일 경우 무조건 실행코드2 수행
	 *    
	 */
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
		
		//method1 보다 2(if-else문)를 더 권장
	
	}
	
	/*
	 *  * if-else if문
	 *    같은 비교 대상으로 여러개의 조건을 제시해야 될 경우
	 *    
	 *    if(조건식1){
	 *    	실행코드1;
	 *    } else if(조건식2) {           -> 조건2가 true가 나오면 실행코드2 실행후 (뒤에 조건들은 무시) 해당 메소드 빠져나옴
	 *    	실행코드2;
	 *        ...
	 *    } else if(조건식n) {
	 *    	실행코드n;
	 *    } [else {
	 *    	위에 조건들이 다 false일 경우 실행할 코드; (생략가능)
	 *    }]
	 *    
	 */
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		} else if (num == 0) {
			System.out.println("0이다.");
		} else {
			System.out.println("음수다.");
		}
			
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if( num == 0) {                              // 짝수인지 홀수인지 판별하기 이전에 0인지를 먼저 판별 (짝수를 먼저 판별하면 0인지 알수없기 떄문)
			System.out.println("입력한 숫자는 0입니다.");
		} else if ( num % 2 == 1) {
			System.out.println("입력한 숫자는 홀수입니다.");
		} else/* if ( num  % 2 == 0 )*/ {
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		// 나열되는 순서도 중요시 하기! 첫번째에 true나오면 뒷 조건은 실행되지 않기 때문
		
	}
	
	public void method5 () {
		// 13이하 - 어린이/ 13세 초과 19세 이하 - 청소년/ 19세 초과 - 성인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		/*		
		if ( age <=13 ) {                      // -> false : 이미 13초과
			System.out.println("어린이");
		} else if ( age <= 19 ) {  // 그렇다면 여기서는 age가 13초과인것이 이미 내제 되어있기 때문에 다시 연산할 필요 없음
			System.out.println("청소년"); 
		} else {
			System.out.println("성인");
		} */
		
		// 조건검사 실행전
		String result; //결과를 담아줄 변수 만들어두기
		
		// 조건검사
		if ( age <=13 ) {                    
			result = "어린이";
		} else if ( age <= 19 ) {  
			result = "청소년" ;
		} else {
			result = "성인";
		}
		
		System.out.println(result);
		
		// 값을 담을 변수를 미리 선언해두고 조건검사로 담긴 값만 출력 -> 이렇게 하면 매번 출력문을 쓸 필요가 없음
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		// xxx님은 남학생입니다.
		// xxx님은 여학생입니다.
		
		/*if (gender == 'm' || gender == 'M') {
			System.out.println(name + "님은 남학생입니다.");
		} else if (gender == 'f' || gender == 'F') {
			System.out.println(name + "님은 여학생입니다.");
		} 
		*/
		
		String result = ""; // 반드시 변수 세팅시 초기화 해두는 습관을 들이자!
		
		if (gender == 'm' || gender == 'M') {
			result = "남학생";
		} else if (gender == 'f' || gender == 'F') {  // 둘다 false일 경우 result 값이 지정되지 않음
			result = "여학생";
		} else {
			System.out.println("성별을 잘못 입력 하셨습니다.");
			return; // 현재 속해있는 메소드 자체를 빠져나감 고로 이 뒤에 있는 출력문은 실행되지않음
			//너무 남발은 금물!
		}
		
		//xxx님은 xxx입니다.
		System.out.println(name + "님은 " + result + "입니다.");
		
		
		// 초기화가 된 변수만 출력 가능!
		// 위쪽 조건들이 다 false일 경우 result에 아무런 값도 대입되지 않음
		//해결 -> result변수 미리 세팅 시 선언과 동시에 초기화 해두기 (공백이라도! 습관화 하기!)
		
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		
		String result = "F"; // else 문 쓰지 않고 애초에 f로 지정
		
		
		if( score >= 0 && score <= 100) {
			if ( score >= 90 ) {
				result = "A";
			} else if (score >= 80 ) {
				result = "B";
			} else if (score >= 70 ) {
				result = "C";
			} else if (score >= 60 ) {
				result = "D";
			}     //else 로 끝나지 않았으니 60이하는 result 초기화 값
			System.out.println(score + "점은 " + result +"등급입니다.");
		}else {System.out.println("잘못 입력하셨습니다.");
		
		}
		
		
			
			
			
		/*if ( score >= 90 ) {
			result = "A";
		} else if (score >= 80 ) {
			result = "B";
		} else if (score >= 70 ) {
			result = "C";
		} else if (score >= 60 ) {
			result = "D";
		}
		
		System.out.println(score + "점은 " + result +"등급입니다.");
		*/
	 }
	
	public void method8 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		/*if(name == "홍길동") {
			System.out.println("홍길동님 반갑습니다.");
		} else {
			System.out.println ("홍길동님이 아니신가보네요. 안녕히가세요.");
			
		}
		*/
		
		/*               1       1     2     4    8      4     8       2
		 *  기본자료형 : boolean, byte, short, int, long, float, double, char (8개)
		 *  참조자료형 : String, 
		 *  
		 *  기본자료형들끼리 동등 비교시 ==,!= 사용가능 (정상적으로 비교됨)
		 *  단, 참조자료형은 동등 비교시ㅣ ==, != 사용시 정상적으로 비교 안됨
		 *  
		 *  참조자료형간의 동등 비교시 => equals() 메소드를 이용해서 비교해야함
		 *                        문자열.equals(문자열) :일치하는지 비교
		 *                        !문자열.equals(문자열) :일치하지 않은지 비교
		 *  
		 */
		
		if (name.equals("홍길동")) {   // if("홍길동".equals(name)) 도 가능은 하나 대부분 변수를 앞에 씀
			System.out.println("홍길동님 반갑습니다.");
		} else {
			System.out.println("홍길동님이 아닌가보네요. 안녕히가세요.");
		}
	}
	
	// 조건문 중첩사용
	public void method9() {
		// 사용자에게 정수를 입력받아
		// 양수일 경우 -> 이때 3의 배수일 경우 -> "3의 배수입니다."
		                //3의 배수가 아닐 경우 -> "3의 배수가 아닙니다."
		// 양수가 아닐경우 -> "양수가 아닙니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(양수) 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {

			if (num % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}

		} else {
			System.out.println("양수가 아닙니다.");
		}

	}

}

