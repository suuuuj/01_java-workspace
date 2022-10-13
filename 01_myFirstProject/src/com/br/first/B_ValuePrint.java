package com.br.first;

/*
 *  원칙!
 *  1. 클래스명 -> 대문자로 시작 
 *  2. 패키지명 -> 소문자로 시작
 *  ->풀클래스명에서 클래스와 패키지를 구분하기 위해서
 *  3. 메소드명 -> 소문자로 시작
 *  4. 클래스를 대변할 이름(변수명) -> 소문자로 시작
 *  
 *  단, 여러개의 단어가 조합될 경우 단어 앞자리마다 대문자 -> 낙타표기법
 *  ex) 클래스명: HelloWorld, MethodPrint, ValuePrint 가독성을 위해서
 *  	메소드명일 경우 valueprint -> valuePrint 앞자리는 소문자!
 */
public class B_ValuePrint { // com.br.first.B_ValuePrint -> 풀클래스명

	// 다양한 형식의 값을 출력하는 메소드
	public void printValue() {
		
		// 1. 숫자 출력
		System.out.println(123); // 정수값 숫자는 "" 사용x
		System.out.println(1.23); // 실수값
		
		// 2. 한글자(문자) 출력 (홑따옴표)
		System.out.println('a'); // 한글자(문자)일 경우 ''사용
		System.out.println('가'); //'가나' ''두글자 또는 공백 쓸경우 오류 무조건 한글자만!
		
		// 3. 여러글자(문자열) 출력 (쌍따옴표)
		System.out.println("안녕하세요"); 
		
		// 4. 연산한 결과 값도 출력
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12);  //실수값은 불안정해서 오차생길 수 있음
		
		// 5. 문자(한글자)와 숫자간의 연산 가능
		System.out.println('a' + 1); // 문자에는 컴퓨터가 인식하는 각각의 고유한 숫자가 존재
		System.out.println('a' + 'b'); // a = 97 b = 98 ... (+1)
		
		// 6. 문자열과 그 외의 값들의 덧셈연산이 가능 -> 하나의 문자열로 연이어짐
		System.out.println("하이" + 'a'); // "하이a" 문자열+문자
		System.out.println(123 + "안녕하세요"); // "123안녕하세요" 숫자+문자열
		
		
	}

	// 문자열과 숫자의 덧셈 연산 (뺄셈은 안됨)
	public void sumStringNumber() {
		
		System.out.println(7 + 7); 		// 14 
		System.out.println(7 + "7"); 	// "77" 
		System.out.println("7" + 7); 	// "77"
	
		System.out.println(7 + 7 + "7"); // 14+"7" -> "147"
		System.out.println("7" + 7 + 7); // "77"+7 -> "777"
		System.out.println("7" + (7 + 7)); // "7"+14 -> "714"
							// 리터럴값
		
	}
	
}
