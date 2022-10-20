package com.br.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * 
	 *  * 반복문
	 *    특정 코드를 반복적으로 수행시켜줌
	 *    
	 *    크게 두 종류로 나뉨(for문 / while문 (do-while문))
	 *    
	 *  * for문
	 *  
	 *    [표현법]
	 *    for(초기식; 조건식; 증감식) {  //반복 횟수를 지정하기 위해 제시하는 것들
	 *    	반복적으로 실행시키고자 하는 코드;
	 *    }
	 *    
	 *    - 초기식 : 반복문이 수행될 때 "처음에 단 한 번만 실행되는 구문"
	 *    			(보통 반복문 안에서 사용될 변수를 선언과 동시에 초기화하는 구문)
	 *    
	 *    - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 *    			조건식이 true 일 경우 해당 구문을 실행
	 *    			조건식이 false일 경우 반복을 멈추고 빠져나감
	 *    			(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 *    
	 *    - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 *    			(보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)와 함께 작성) 
	 *  
	 *  * for문을 만나는 순간
	 *  초기식 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 *  	 -->  조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 *		 -->  조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 *						   ...
	 *		--> 조건식 검사 --> false일 경우 실행x  => 반복문 빠져나옴
     */
	
	public void method1() {
		
		// "안녕하세요"를 5번 반복해서 출력
		
		/*System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요"); */
		
		for(int i=1 ; i<=5 ; i++) {  // i값이 1에서부터 5까지 매번 1씩 증가되는 동안 반복을 수행 (1, 2, 3, 4, 5)
			System.out.println("안녕하세요");
		}
		
		for (int i=11; i<16 ; i++) {  // 11에서부터 15까지 매번 1씩 증가되는 동안 반복 수행 (11, 12, 13, 14, 15)
			System.out.println("반갑습니다.");
		}
		
		for (int i=0; i<5; i++) { // 0에서 4까지 매번 1씩 증가되는 동안 반복(0, 1, 2, 3, 4)
			System.out.println("저리가세요");
		}
		
		/*
		 *  Tip. 내가 원하는 횟수만큼 반복문 돌리고자 할때
		 *  for(int i=0; i<횟수; i++) {} 	
		 */
		
		for(int i=1; i<=9; i+=2 ) { // i에서부터 9까지 매번 2씩 증가되는 동안 반복수행 (1,3,5,7,9)
			System.out.println("Hello");
		}
		
			
	}	
	
	public void method2() {
		// 1부터 5까지 출력
		for(int i=1; i<=5 ; i++) {
			System.out.print(i+" "); //1 2 3 4 5
		}
		// System.out.print(i); i변수는 영역 안에서만 사용 가능하다
		
		System.out.println(); //줄바꿈
		
		for(int i=5; i>=1; i--) {  // 조건식 i<=1은 애초에 조건이 충족되지 않음 (i=5이기 때문에 false)
			System.out.print(i+" ");
		}
	}
	
	public void method3() {
		// 1 2 3 ... 9 10
		for (int i=0; i<10; i++) {
			System.out.print(i +1 +" ");
		}
	}
	
	public void method4() {
	//1부터 10사이의 홀수만을 출력 (1 3 5 7 9)

	//방법1. 딱 5회만 반복문 돌려서 출력	
		/* for(int i=1 ; i<=10; i+=2) { // 1에서부터 10일때까지 매번 2씩 증가하는 동안 반복 수행(13579)
			 	System.out.print(i + " ");
		   } */
		
	//방법2. 반복문 자체를 10회 돌리고 출력을 홀수만!
	// 1에서부터 10까지 매번 1씩 등가되는 동안 반복수행(1 2 3 4 ... 8 9 10 => 10회)
		
		for(int i = 1 ; i<=10 ; i++) {
			if (i % 2 == 1) {
			System.out.print(i + " ");
			}
		}
		
		
	}	
		
	public void method5() {
		// 1에서부터 10까지의 총 합계
		// 방법1. int sum = 1+2+3+4...+9+10;
		
		// 방법2. 
		/*
		 * int sum= 0 ;
		 * 
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * ...
		 * sum += 9;
		 * sum += 10;
		 *
		 * 규칙을 찾아보면 sum 변수에 누적해서 더해지는 행위를 반복수행
		 * 단, 누적해서 더해지는 값이 1에서부터 10까지 1씩 증가되고 있음
		 */
		int sum=0; //반복하기 전 선언과 동시에 초기화
		
		for(int i=1 ; i<=10 ; i++ ) {
			sum += i ;
		}
		System.out.println("총 합계 : " + sum);
		
		//System.out.println("10에서부터 100까지의 총 합계 : " + sum);
	}
	
	public void method6() {
		//1에서부터 사용자가 입력한 수(양수)까지의 총 합계
		// 양수가 아닌경우 잘못 입력했다고 알려줄것
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {//양수일 경우 -> 총 합계 구해서 알려주기
			int sum = 0;
			for(int i = 1; i<=num; i++) {
				sum += i;
			}
			System.out.println("1에서부터 "+ num + "까지의 총 합계 : " +sum);
		}else {//양수가 아닌 경우 -> 잘못 입력 한것 ->"잘못입력했습니다" 출력
			System.out.println("잘못입력하였습니다.");
		}
		
		
	}
	
	public void method7() {
		// 1에서부터 랜덤값 까지의 총 합계 (1~10사이의 랜덤값) 까지의 총 합계
		
		/*
		 *  java.lang.Math 클래스에서 제공하는 random()메소드 호출해서
		 *  프로그램 실행할 때마다 매번 다른 랜덤값을 얻어낼 수 있음
		 *  
		 *  Math.random() 호출시 -> 0.0 ~ 0.999999999 사이의 랜덤값 발생
		 *  						(0.0 <= <1.0)
		 *  
		 */
		
		//int random = Math.random();  //double 형이라서 안됨
			//    0.0<=  <1.0  --> 0.0 ~ 0.99999999999
		
		//int random = Math.random() * 10;
		 //       0.0<=  <10.0  0.0~9.999999
		
		// int random =  Math.random() * 10 + 1;
		//     1.0<= <11.0  -> 1.0 ~ 10.9999
	  
		int random = (int)(Math.random() * 10 + 1);
	   //       1 <=  <11    -> 1  ~  10
	
		System.out.println("1~10 사이의 랜덤값 : " + random);
	
		/*
		 *  Tip. 랜덤값 발생 범위 지정
		 *  (int)(Math.random() * 발생시킬랜덤값개수 + 시작수);
		 *  			     	(마지막수 - 시작수 + 1)
		 *  ex) 11~20 랜덤값   
		 *  (int)(Math.random) * 10 + 11
		 */
		
		int sum = 0;
		
		for(int i=1 ; i <=random; i++) {
			sum += i; 
		}
		
		System.out.println("1에서부터 " + random + "까지의 총 합 : " + sum);
		
	}
	
	public void method8() {
		// 특정 문자열의 각 인덱스별 문자 뽑아서 출력
		String str = "Hello";
		//            01234
		
		/*
		 * H -> str.charAt(0) 출력
		 * e -> str.charAt(1)
		 * l -> str.charAt(2)
		 * l -> str.charAt(3)
		 * o -> str.charAt(4)
		 * 
		 * 
		 * 0번 인덱스에서 부터 4번 인덱스(마지막 인덱스)까지
		 * 매번 1씩 증가되는 인덱스의 문자를 뽑아서 출력
		 * 
		 */
		
		for(int x = 0; x<=4 ; x++ ) { //0에서부터 4까지 매번 1씩 증가되는 동안 반복수행(0 1 2 3 4)
			System.out.println(str.charAt(x));
		}
			
	}
	
	public void method9() {
		// 사용자에게 입력받은 문자열의 각 인덱스별 문자 뽑아서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		/*
		 *  apple->5글자 마지막인덱스 4
		 *  01234
		 *  
		 *  pineapple->9글자 마지막인덱스8
		 *  012345678
		 *  
		 *  kiwi ->4글자 -> 마지막 인덱스3
		 *  0123
		 *  
		 *  마지막인덱스 == 문자열의 길이 -1
		 *  
		 */
		
		System.out.println("문자열의 길이 : " + str.length()); // -> 문자열의 길이를 정수값으로 알려준다.
		System.out.println("문자열의 마지막인덱스 수 : " + (str.length() - 1));
		
		//0번 인덱스 ~ 마지막 인덱스 (문자열길이-1) 까지 매번 1씩 증가하는 동안 반복
		
		//for(int i=0 ; i<=str.length()-1; i++ ) {
		
		for(int i=0; i< str.length(); i++) {   //i<=str.length() 라고 쓰지 않도록 조심!
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method10() {
		//2단 출력하기
		/*
		 * 2 x 1=  2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 
		 * 2 x (1부터 1씩 증가) = 2()
		 */
		
		for (int su=1; su<=9; su++) {
		//2단  System.out.println("2 x " + su + " = " + 2*su);
		/*3단*/System.out.printf("3 x %d = %d\n", su, 3*su);
		}
				
	}
	
	public void method11() {
		// 사용자가 입력한 단을 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수 (2~9)를 입력 : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan<=9) {
			for(int su=1 ;su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan*su );
			}
		}else {
			System.out.println("2~9사이의 숫자를 입력해 주세요.");
		}
	}
	
	public void method12() {
		//2~9 사이의 랜덤값 발생 시켜 해당 단을 출력
		
		//int random = Math.random();
		            //0 ~9.9999
		//int random =(int)(Math.random()*10);   -> 0~9까지의 수가 됨
		int random =(int)(Math.random()*8+2);  // -> 2~9까지의 수
		
		System.out.println("2~9사이의 랜덤 수 : "+random);
		for(int su=1; su<=9;su++) {
			System.out.printf("%d x %d = %d\n",random, su, random*su);
		}
		
	}
	
	// 중첩 for문
	public void method13() {
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
		for(int j = 1; j<=3 ; j++) {  //->행
		
			for(int i = 1 ; i<=5 ; i++) { //->열
				
				System.out.print(i+ " ");
			} 
			
			System.out.println();
			
		}
	}
	
	public void method14() {
		// ****
		// ****
		// ****
		// **** (4행 4열) 매행 반복되는 열

		// 행은 1~4행 까지 반복후 줄바꿈 -> 바깥쪽 for문
		// 매행마다 열은 매번 1~4까지 반복 -> 안쪽 for문
		
		for(int i = 1; i<=4;i++) {
			for(int j = 1; j<=4 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method15() {
		// 1*** -> 1행 1열일때 1출력
		// *2** -> 2행 2열일때 2출력
		// **3* -> 3행 3열일때 3출력
		// ***4 -> 4행 4열일때 4출력
		
		// ==> 행수와 열수가 일치할 경우 => 숫자(그때 당시의 행수 또는 열수를 출력
		// ==> 그게 아닐경우 => *출력 
		
		
		
		for(int i = 1; i<=4;i++) {
			for(int j = 1; j<=4 ; j++) {
				if(i==j) { //행==열
					System.out.print(i);
					
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	public void method16() {
		//2단 ~ 9단까지 모두 출력
		
		/*
		 * === 2단 ===      
		 * 2 x 1 = 2    
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 
		 * === 3단 ===
		 * 3 x 1 = 3
		 * ...
		 * 
		 * 
		 * 9 x 9 = 81
		 * 
		 * 2~9단 까지 매번 1씩 증가  -> 바깥쪽 for 문
		 * 한 단이 고정일 때 매번 곱해지는 수는 1~9까지 1씩 증가 -> 안쪽 for문 
		 */
		
		for (int dan=2; dan<=9; dan++) {
			
			System.out.println("=== " + dan + "단 ===");
			
			for(int su=1; su<=9; su++) {
				
				System.out.printf("%d X %d = %d\n", dan, su, dan*su);
			}
			
			System.out.println();
		}
		
	}
	
	//===============================================================================
	public void method17() {
		//문제 1. 사용자에게  한 개의 정수를 입력받고 1에서부터 사용자가 입력한 수까지 매번 1씩 증가되는 숫자가 홀수인지, 짝수인지 판별해서
		//       홀수면 "박", 짝수면 "수" 출력 
		//단, 사용자가 입력한 숫자가 양수가 아닐경우 "양수가 아닙니다." 출력
		// ex) 4 입력시 --> 박수박수  / 3  -> 박수박     123
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력하세요 : ");
		int num = sc.nextInt();
	
			if(num>0) {
				
				for(int i = 1; i<=num; i++) {
					if(i % 2 == 0) {
						System.out.print("수");
					}else {
						System.out.print("박");
				     }
				}
			}else {
				System.out.println("양수가 아닙니다.");
			 } 	
		
	}			
	
	public void method18() {
		//문제 2. 사용자에게 문자열 하나 입력 받고 (string)
		// 문자열로부터 검색하고 싶은 문자도 입력 받기 (char)
		// 문자열에 그 문자가 몇 개 있는지 개수 출력
		
		// ex) "banana", 'a' 입력시 --> 3  /'n'--> 2    //hint : 임의의 변수가 하나더 필요,,,
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");  
		String str = sc.nextLine();  //banana
		                           
		//System.out.print("입력한 문자열의 문자 개수 : " + str.length()); // 6 (인덱스 수: 5) ->반복돌릴 수
		
		
		
		for(int i = 0 ; i < (str.length()) ;i++ ) {
			System.out.println(i + "=" + str.charAt(i));
		}
		
		
		
	}
	
	
}
