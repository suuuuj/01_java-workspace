package com.br.chap02_string.controller;

public class B_BuilderBufferTest { // 웹개발보단 코딩테스트, 메모리 효율적으로 써야할때 사용
	
	/*
	 *  * StringBuilder, StringBuffer == 가변클래스(그 자리에서 값이 변경되는 개념)
	 *   - 두 개의 클래스 모두 생성자나 메소드가 동일함
	 *   - 유일한 차이점 : 동기화가 되는지 안되는지의 차이-> 속도차이로 나타남
	 *   
	 *  * 동기화 : 한 자원에 대해 여러 스레드가 접근하려 할때 한 시점에서 오로지 하나의 스레드만 사용될 수 있게 하는 것
	 *     동시접근x ,a먼저처리 후 b처리 -> 일의 순서를 정해주는것이 동기화
	 *     
	 *   > StringBuilder : 동기화 제공 x => 속도가 빠름
	 *   > StringBuffer : 동기화 제공 o => a먼저 처리 후 b처리 => 속도 느림
	 *   
	 */
	
	public void method1() {
		
		// StringBuilder sb1="hello"; //리터럴값으로 대입하는건 안됨
		
		// 객체 생성시 처음에 16개의 문자들을 저장하 수 있는 버퍼가 내부적으로 생성
		
		//1. 기본생성자로 생성
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1의 수용량 : " + sb1.capacity()); //아무것도 지정 안했을때의 수용량 : 16
		System.out.println("sb1의 문자열의 길이 : " + sb1.length());
		
		// 2. 정수값 하나 전달가능한 매개변수 생성자로 생성
		StringBuilder sb2 = new StringBuilder(30); //=> 전달된 정수값 크기만큼의 수용량이 지정
		System.out.println("\nsb2의 수용량 : " + sb2.capacity());
		System.out.println("sb2의 문자열의 길이 : " + sb2.length());
		
		// 3. 문자열 하나 전달가능한 매개변수 생성자로 생성
		StringBuilder sb3 = new StringBuilder("반가워!!");
		System.out.println("\nsb3의 수용량 : " + sb3.capacity()); //21 -> 기존의 16 + 입력된 5글자 
		System.out.println("sb3의 문자열의 길이 : " + sb3.length()); 
	
	}
	
	public void method2() {
		//가변클래스가 맞는지(즉, 그자리에서 수정되는지)=> 주소값 변경되지 않음
		
		StringBuilder sb = new StringBuilder("반가워!"); //4글자 문자
	
		System.out.println("sb : "+ sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("===============");
		
		// 1. append(String str) : StringBuilder
		//  기존의 문자열에 새로운 문자열 추가하고 싶을때
		
		sb.append(" 안녕!");
		
		System.out.println("sb : "+ sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb)); 
		// 주소값이 변경되지 않음 == 처음 세팅한 그 자리에서 값이 변경됨	
		System.out.println("===============");
		
		sb.append(" 다들 조금만 힘내세요!!!"); //15글자  -> 수용량을 초과한 문자 추가
		
		System.out.println("sb : "+ sb);
		System.out.println("수용량 : " + sb.capacity()); // 수용량을 넘어서도 오류나지않고 알아서 늘어남 (기존의 수용량 * 2 + 2)
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb)); 
		System.out.println("===============");
		
		// 2. delete(int start, int end) : StringBuilder
			//Start<= and  <end 범위의 문자열 삭제하기
		sb.delete(2,6); //워,녕 
		
		System.out.println("sb : "+ sb); //sb : 반가녕! 다들 조금만 힘내세요!!!
		System.out.println("수용량 : " + sb.capacity()); // 한번 늘어났으면 다시 줄지 않음
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb)); 
		System.out.println("===============");
		
		// 3. insert(int offset, String str) : StringBuilder
		// offset위치에 str을 추가시켜주는
		
		sb.insert(1, "ㅎㅎㅎ");
		
		System.out.println("sb : "+ sb); //sb : 반가녕! 다들 조금만 힘내세요!!!
		System.out.println("수용량 : " + sb.capacity()); // 한번 늘어났으면 다시 줄지 않음
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb)); 
		System.out.println("===============");
		
		// 4. reverse() : StringBuilder
		// 기존의 문자열을 역으로 바꿀때
		sb.reverse();
		
		System.out.println("sb : "+ sb); //sb : 반가녕! 다들 조금만 힘내세요!!!
		System.out.println("수용량 : " + sb.capacity()); // 한번 늘어났으면 다시 줄지 않음
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb)); 
		System.out.println("===============");
		
		
		sb.append("ㅋㅋㅋㅋ").delete(0,4).reverse().insert(2, "ㄱㄱㄱ");
		
		/*
		 * OR
		 * sb
		 * .append("ㅋㅋㅋㅋ")
		 * .delete(0,4)
		 * .reverse()
		 * .insert(2, "ㄱㄱㄱ"); -> 가독성을 위해 이렇게 표기하기도 함
		 */
		
		
		System.out.println("sb : "+ sb); //sb : 반가녕! 다들 조금만 힘내세요!!!
		System.out.println("수용량 : " + sb.capacity()); // 한번 늘어났으면 다시 줄지 않음
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " + System.identityHashCode(sb)); 
		System.out.println("===============");
		
		
		
		
	}

}
