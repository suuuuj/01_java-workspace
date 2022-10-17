package com.br.operator;
import java.util.Scanner;
public class E_Logical {

	/*
	 * * 논리연산자 (이항 연산자)
	 *   두개의 논리값을 연산해주는 연산자
	 *   결과값도 논리값
	 * 
	 *   논리값 && 논리값 : 왼쪽, 오른쪽 둘다 true일 경우 결과값은 true, 하나라도false면 결과는 false
	 *   논리값 || 논리값 : 왼쪽, 오른쪽 둘 중에 하나라도 true 일 경우 결과값은 true 
	 *   
	 *   -> 주로 여러개의 조건들을 연결시켜서 하나의 조건으로 만들고자 할 때 사용함
	 */

	
	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 아닌지
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100); 몇 이상 몇 이하 한번에 물어볼수 없다
		
		boolean result = (num >= 1) && (num <= 100);
		// num 값이 1 이상 "이고" "그리고" 100 이하일 경우
		// && 의미 : ~이고, 그리고, ~이면서, ~뿐만 아니라
		
		System.out.println("사용자가 입력한 값이 1 이상 100 이하 입니까? : " + result);

		// && : 두 개의 조건이 모두 true 여야 &&연산의 결과값이 최종적으로 true
		//      둘 중에 하나라도 false일 경우 && 연산의 결과값은 false
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A'~ 'Z' 65~90
		
		// 방법1
		//boolean result = (ch >= 65) && (ch <= 90);
		
		//방법2
		boolean result = (ch >= 'A') && (ch <= 'Z');
		
		System.out.println("사용자가 입력한 값이 대문자입니까? : " + result);
		
		
	}
	
	public void method3() {
		
		// 사용자에게 성별을 입력받은 후 여자인지 확인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별 (F/M) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender =='f');
		// ||ㅇㅣ거나, 또는
		
		System.out.println("사용자가 여자입니까? : " + result);
		System.out.println("사용자가 남자입니까? : " + !result);
		
		// || : 두 개의 조건 중 하나라도 true 일 경울 \\연산의 결과값은 true
		     // 두 개의 조건 모두 false 경우 || 연산의 결과값은 false
		        
		
	}
	
	public void method4 () {
		// 사용자의 종료의사 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("사용자가 입력한 값이 y 또는 입니까? : " + (ch == 'y' || ch == 'Y'));
					
	}
	
	
	/*
	 *  && (AND) : 두 개의 조건이 모두 true 여야 결과값이 true (~이고, 그리고, ~이면서, ~뿐만아니라)
	 *  
	 *        true && true  -> true
	 *        true && false -> false
	 *        false && true -> false
	 *        false && false -> false
	 *  
	 *  >> && 연산자를 기준으로 앞의 결과가 이미 false일 경우 뒤쪽의 조건검사는 굳이 실행되지 않음!
	 *         
	 *  || (OR) : 두 개의 조건중에 하나라도 true일 경우 결과값이 true (~이거나, 또는)
	 *   
	 *        true || true  -> true
	 *        true || false -> true
	 *        false || true -> true
	 *        false || false -> false
	 *  
	 *  >> || 연산자를 기준으로 앞의 결과가 true 일 경우 뒤쪽의 조검 검사 굳이 실행되지 않음
	 *  
	 */
	
	public void method5() {
		int num = 10;
		boolean result1 = (num < 5) && (++num > 0);
		
		System.out.println("result1 : " + result1); //false
		System.out.println("&& 연산 후의 num : " + num); 
		//10 -> 앞쪽 조건이 false이기 떄문에 뒤쪽 조건이 실행되지 않음 (실행되었다면 11이 되었어야함)
		
		boolean result2 = (num < 20) || (++num > 0);
		
		System.out.println("result2 : " + result2); //true
		System.out.println("|| 연산 후의 num : " + num);
		// 10 -> 앞 조건이 true 이기 때문에 뒤쪽 조건이 실행되지 않음 (false였다면 11이였어야함)
		
		boolean result3 = true || (++num > 0);  
		// 노란줄은 경고(불필요한 구문 등 - Dead code - 죽은코드 -> 실행되지 않을 코드)
		
		System.out.println("result3 : " + result3); //true
		System.out.println("|| 연산 후의 num : " + num);
		
		
	}
	
	
	
	
}
