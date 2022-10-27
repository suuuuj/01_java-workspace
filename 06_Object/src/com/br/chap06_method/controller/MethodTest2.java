package com.br.chap06_method.controller;

public class MethodTest2 {
	
	//1. 매개변수x, 반환값x
	public static void method1() { //static이 붙으면 객체생성 안하고 바로 출력 가능
		System.out.println("매개변수와 반환값 둘 다 없는 static메소드 입니다.");
		
	}
	
	//2. 매개변수x, 반환값o
	public static int method2() {
		System.out.println("매개변수 없고 반환값은 있는 static메소드 입니다.");
		
		// 1부터 랜덤값(1~100)까지의 총 합계
		
		int random = (int)(Math.random()*100 +1);
		int sum = 0;
		
		for(int i = 1 ; i <=random ; i++) {
			sum+=i;
		}
		return sum;					
	}
	
	//3. 매개변수o , 반환값x
	public static void method3(String name) {
		System.out.println("매개변수 있고 반환값은 없는 static메소드 입니다.");
		System.out.println(name + "님의 방문을 환영합니다.");
	}
	
	// 4. 매개변수o, 반환값o
	public static boolean method4(String str1, String str2) {
		System.out.println("매개변수와 반환값 둘 다 있는 static 매소드 입니다.");
		
//		if(str1.equals(str2)) {
//			return true;
//		}else return false;
		
		return str1.equals(str2);
		
	}

}
