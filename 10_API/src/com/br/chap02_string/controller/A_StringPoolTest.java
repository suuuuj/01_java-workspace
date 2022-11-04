package com.br.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method(){
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String ("hello!");
		String str2 = new String ("hello!");
		
		System.out.println(str1);
		System.out.println(str2.toString()); 
		// String클래스에서 toString메소드 이미 오버라이딩 되었음 (실제 담긴 문자열 반환하도록)
		
		System.out.println(str1 == str2); //-> false(주소값 비교라서)
		System.out.println(str1.equals(str2)); //true 
		// String 클래스에 equals메소드 이미 오버라이딩 되어있음(주소값이 아닌 실제 담긴 문자열 비교)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 클래스에 hashCode이미 오버라이딩 되어 있음 (주소값이 아닌 실제 담신 문자열갖고 단듦)
		
		// 찐 주소값을 알고자 할 경우 System. identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 주소값 다른거 확인가능
	}
	
	public void method2() {
		String str = new String("hello!"); //heap영역에 생성
		
		// 2. 문자열을 리터럴값으로 생성
		String str1 = "hello";    //StringPool 상수풀 영역에 생성
		String str2 = "hello";     
		// 리터럴 제시시 상수풀(StringPool)영역에 올라감(엄연히 다른 주소값)
		// StringPool 특징 : 동일한 문자열을 가질 수 없음 
		// 그래서 str1.2 주소값이 똑같음
		
		System.out.println(str1);
		System.out.println(str2);
	
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	
		System.out.println(str1==str2); //true (주소값 일치함)
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));//둘은 같음
		System.out.println(System.identityHashCode(str));// 1,2 랑은 다른 주소값
	}
	
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "hi"; //값 변경 (새로운 값 대입)
		//불변 클래스 - 값 변경이 안되는 것이 아니라 동일 주소값 자리에서 값 변경이 되는 것이 아니라 새로운 주소값이 생기는 것
		// 기존에 있던 불필요한 자료값(일정한 시간동안 참조x)은 가비지컬렉터가 알아서 삭제해줌
		System.out.println(System.identityHashCode(str)); //>> 주소값 변경 됨
		
		str += "!"; //값 변경(기존의 값에 연이어지게끔)  
		//str = str+!; -> "hi" + "!" -> "hi!" 이상태로 heap영역에 새로운 주소값을 갖고 생성
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		/*
		 *  *String 클래스 == 불변클래스
		 *  변경이 가능하긴 하나 그 자리에서 수정되는 개념 아님
		 *  변경하는 순간 새로운 곳을 참조하도록 주소값 바뀜
		 *  
		 *  빈번하게 값을 변경해야할 경우 GC가 계속 값들을 지워줘야하는 단점
		 *  변경이 적고 한번 값을 담은 후에 단지 조회만 할 경우에 String 클래스가 용이하다.
		 *  
		 */
		
	}

}
