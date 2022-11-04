package com.br.chap02_string.controller;

import java.util.Scanner;

public class C_StringMethodTest {
	
	public void method() {
		String str1 = "Hello World";
				
		// 1. answkduf.charAt(int index) : char
		//		 문자열에서 전달받은 index위치의 문자만을 추출해서 리턴
				
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열 .concat(String str) : String
		//    문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		
		String str2 = str1.concat("!!!"); //리터럴 값x heap영역에 존재
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!"; // 리터럴 값으로 상수풀에 저장되어있음
		System.out.println("str2와 str3가 일치합니까?(==) : " + (str2==str3)); // false 주소값이 달라서
		
		// 3. 문자열.equals(Object job) : boolean
		// 실제 문자열값을 가지고 동등 비교 해줌
		System.out.println ("(str2와 str3가 일치합니까?(equals) : " + str2.equals(str3));
		// 첨부터 끝까지 다 일치하는지 보기때문에 풀로 다 입력해야됨
		
		// 4. 문자열.contains(CharSequence s) : boolean
		//	문자열에 전달된 문자열이 포함되어있으면 true, 아니면 false 반환-> 키워드 검색할때 자주사용
		//	* CharSequence 는 String 부모 인터페이스 (다형성적용됨)
		System.out.println("str1에 Hell문자열이 포함되어 있습니까? : " + str1.contains("Hell"));
		
		
		// 5. 문자열.length() : int
		//	해당 문자열의 길이(글자수) 반환
		System.out.println("str의 길이 : " + str1.length());
		
		// 6. 문자열.substring (int beginIndex) : String => 문자열의 beginIndex위치에서부터 끝까지 다 추출해서 반환
		//    문자열.substring (int beginIndex, int endIndex) : String => 문자열의 beginIndex위치에서부터 endIndex이전까지 문자열을 추출해서 반환
												//endIndex는 포함되지 않음
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,4));// begin 이상 end 미만 0,1,2,3번째 인덱스 추출
		
		// 7. 문자열.replace(char oldChar, char newChar) : String
		//  문자열에서 oldChar를 newChar로 변환한 새 문자열 리턴
		
		String str4 = str1.replace ('l','c'); // 원본은 그대로 존재함
		
		System.out.println("str4 : " + str4); // Hecco World l이 다 c로 변경됨
		System.out.println("str1 변겨됐는지 확인 : " + str1); // 변경 안됨
		
		// 8. 문자열.toUpperCase() : String  => 문자열을 다 대문자로 변경한 새문자열 리턴
		// 	  문자열.toLowerCase() : String  => 문자열을 다 소문자로 변경한 새문자열 리턴
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("lower : " + str1.toLowerCase());
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("계속 하시겠습니가?(y/n) : ");
		char flag = sc.nextLine().toUpperCase().charAt(0);
		if(flag=='N') {
			//프로그램 종료
		}*/
		
		// 9. 문자열.trim () : String 
		// 문자열의 앞 뒤 공백을 제거시킨 새 문자열 리턴
		
		String str6 = "     JA   V  A   ";
		System.out.println("trim : " + str6.trim());  //문자 사이의 공백은 제거되지 않는다.
		
		
				
				
		
		
		
		
		
		
	}

}
