package com.br.chap02_string.controller;

import java.util.StringTokenizer;

public class D_StringToknizerTest {
	
	public void method() {
		String str = "Java, Oracle, JDBC, HTML, CSS, Spring";
		
		//구분자를 기준으로 해서 문자열을 분리 시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할때 String 클래스에서 제공하는 split메소드
		
		String[] arr = str.split(", "); //","문자를 기준으로 문자열을 쪼개주길,,,
		/*
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}*/
		
		//향상된 for문
		
		for (String s : arr) {
			System.out.println(s);
		}
		
		// 방법2. 분리된 문자열들을 각각 토큰 객체로 관리하고자 할때 
		//  	java.util.StringTokenizer 클래스 이용
		//		StringTokenizer stn = new StringTokenizer (분리시키고자하는 문자열, 구분자);
		
		
		StringTokenizer stn = new StringTokenizer(str, ", ");
		
		/*
		System.out.println("분리된 문자열의 개수 : "+ stn.countTokens());
		
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());												 // "더 이상의 요소가 없어"
		//System.out.println(stn.nextToken()); -> 분리된 문자열 개수보다 많이 추출하면 오류남( java.util.NoSuchElementException)
		
	
		System.out.println("남은 문자열의 개수 : " + stn.countTokens());
		*/
		
		System.out.println("============================");
		
		/*
		for (int i = 0 ; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken()); //->Java , Oracl , JDBC 3개만 출력됨
		}  // i는 1씩 계속 증가하지만 stn.countTokens()는 하나씩 출력되면서 1씩 줄어듦
		   // 그러면서 0-6/1-5/2-4/3-3(여기서 false)뜨면서 반복문 종료됨
		*/
		
		/* for문으로 해결하기
		int count = stn.countTokens(); //먼저 선언을 하고 for문 작성시 숫자 고정
		
		for (int i = 0 ; i<count ; i++) {
			System.out.println(stn.nextToken()); 
		}
		*/
		
		//메소드를 가지고 조건식을 반복으로 활용할때 while문 사용
		while (stn.hasMoreTokens()) { 
			/*-boolean형식으로 출력 ->반복이 수행될 조건 == stn공간으로부터 뽑을만한 토큰이 남아있을 경우*/
			System.out.println(stn.nextToken());
		}
			
	}

}
