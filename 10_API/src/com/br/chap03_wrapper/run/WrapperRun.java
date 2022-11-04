package com.br.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 *  * Wrapper 클래스
		 *    => 기본자료형을 객체화 시킬 수 있는 클래스들
		 *    
		 *      기본자료형 <----> Wrapper클래스
		 *      boolean         Boolean
		 *       byte            Byte
		 *      short           Short
		 *       int           Integer *
		 *       long            Long
		 *       float          Float
		 *      double         Double
		 *       char         Character*
		 *  
		 *  *기본자료형을 객체로 취급해야되는 경우
		 *  - 메소드 호출 해야될때
		 *  - 매개변수가 기본자료형이 아닌 객체타입만을 요구할때
		 *  - 다형성을 적용시키고 싶을때 
		 */
		
		// Boxing : 기본자료형 => Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		//num1.equals(num2); 기본자료형으로는 equals할 수 없음
		
		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1);  //num1 => i1  
		Integer i2 = new Integer(num2);  //num2 => i2  -> 주소값이 담겨있음  지금은 오버라이딩 되고있는중
		
		System.out.println(i1);
		System.out.println(i2);
		
		// 객체화 시키면 메소드 호출 가능
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞이 더크면 1, 뒤가 더크면 -1, 일치하면 0 반환
		
		// 2. 객체 생성할 필요 없이 (new 안해도됨) 곧바로 대입(AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3);
		System.out.println(num1);
		
		// UnBoxing : Wrapper클래스 자료형 => 기본자료형
		// 1. 해당 Wrapper클래스에서 제공하는 xxxValue() 메소드 이용
		
		int num3 = i1.intValue();  // i1=> num3
		System.out.println(num3);
		
		// 2. 메소드 사용하지 않고 바로 대입(AutoUnBoxing)
		int num4 = i2;
		System.out.println(num4);
		//엄연히 왼쪽은 int 오른쪽은 imteger이지만 허용.
		
		System.out.println("=====================================");
		
		// 기본자료형 <--------> String *자주 쓰일 것임 (
		String str1 = "10";   //---->int
		String str2 = "15.3"; //---->double
		
		System.out.println(str1 + str2); //--> 1015.3 문자열끼리 연이어져서 출력됨
		
		//산술연산을 하고 싶다면...
		// *String ----> 기본자료형  너무너무너무너무너무너무 중요 파씽한다!!!!! 문자열을 기본자료형으로 바꾼다!!!
		//  "10"           10  (int)
		//  "15.3"         15.3 (double)
		
		// 해당 Wrapper클래스.parseXXX()사용
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);  // 25.3
		
		
		// *기본자료형 --> String
		//   10         "10"
		//   15.3       "15.3"
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		System.out.println(strI + strD); //--->1015.3
		
		
		
	}

}
