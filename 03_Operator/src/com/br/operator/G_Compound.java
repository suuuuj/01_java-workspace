package com.br.operator;

public class G_Compound {
	/*
	 *  * 복합대입연산자
	 *    산술연산자와 대입연산자가 결합되어있는 형태
	 *    
	 *    += -= *= /= %=
	 *    
	 *    변수 a에 담긴 수에 3을 (더하고/ 빼고/ 곱하고/ 나누고/ 나눈 나머지값을) 다시 대입
	 *    a = a + 3;  => a += 3; (기존의 a 값에 3을 더해서 다시 대입하겠다!)
	 *    a = a - 3;  => a -= 3;
	 *    a = a * 3;  => a /= 3;
	 *    a = a % 3;  => a %= 3;
	 */
	
	public void method1() {
		int num = 12;
		System.out.println("최초 num : " + num);
		
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num += 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num -= 5;
		System.out.println("5 감소시킨 num : " + num);
		
		num *= 6;
		System.out.println("6배 증가시킨 num : " + num);
		
		num /= 2;
		System.out.println("1/2 감소시킨 num : " + num);
		
		num %= 4;
		System.out.println("4로 나눴을때 나머지 (최종 num) : " + num);
		
		//------특이케이스--------
		String str = "Hello";
		// str = str + "World";
		str += "World";
		System.out.println(str);
		
		// 문자열은 덧셈연산만 가능 		
		
	}

}
