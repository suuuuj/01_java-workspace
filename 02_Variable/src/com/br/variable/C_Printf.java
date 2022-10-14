package com.br.variable;

public class C_Printf {

	public void printfTest() {
		
		// System.out.print(출력하고자 하는 값); -> 값 출력만 (줄바꿈x)
		// System.out.println(출력하고자 하는 값); -> 값 출력 후 줄바꿈
		
		// System.out.printf("출력하고자 하는 형식"[, 출력하고자 하는 값, 값, 값, ...]);   f-포맷(형식)  [생략가능]
		// -> 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행 (줄바꿈x)
		//줄바꿈 하고자 한다면 형식 맨 뒤에 \n 입력
	
		/*
		 * 포맷안에서 쓰일 수 있는 키워드
		 * %d : 정수 자리
		 * %c : 문자 자리 
		 * %s : 문자열 자리 (문자도 가능)
		 * %f : 실수 자리
		 *  
		 */
		
		System.out.printf("지금은 printf 연습\n");
		
		int iNum1 = 10;
		int iNum2 = 20;
		// 10, 20 의 형식으로 출력
		
		System.out.println(iNum1 + ", " + iNum2);
		
		System.out.printf("%d, %d%%", iNum1, iNum2); // 문자 %를 쓰고 싶다면 %%를 쓰면 된다.
		
		System.out.printf("%d\n", iNum1, iNum2); // 첫번째 값만 출력	
		// System.out.printf("%d %d\n", iNum1);  ->에러발생 값을 남게 쓰는건 되지만 부족하게 쓰면 에러발생
		
		System.out.printf("%5d\n", iNum1); // 5칸의 공간을 확보한 후에 오른쪽 정렬 (음수면 왼쪽정렬)
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
	    double dNum1 = 1.23456789;
	    double dNum2 = 4.53;
	    
	    System.out.printf("%f %f\n", dNum1, dNum2); // %f : 기본적으로 소수점 아래 6째자리까지 보여줌
	    System.out.printf("%.3f %.1f\n", dNum1, dNum2); // %.nf : n번째 자리 수까지 보여짐
	    System.out.printf("%f %f\n", dNum1, dNum2);
	    
	    char ch = 'a';
	    String str = "Hello";
	    
	    System.out.printf("%c %s %C %S\n", ch, str, ch, str); 
	    
		
		
		
		
		
	}
}
