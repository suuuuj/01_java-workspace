package com.br.array;

import java.util.Arrays; 
//import java.lang.*;=> 알게모르게 포함되어있음 => java.lang패키지 클래스들은 직접 import할 필요 없음

public class B_ArrayCopy {
	
	public void method1() {
		
		int[] origin = {1,2,3,4,5};
		
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0 ; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		
		int[] copy = origin;  //얉은 복사
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("----- 복사본 배열 값 변경 후 -------");
	
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0 ; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		// origin과 copy가 같은 참조하하고 있음 (즉, 같은 주소값)
		System.out.println ("origin의 주소값 :" + origin.hashCode());
		System.out.println("copy의 주소값 :" + copy.hashCode());
		// 주소값만을 복사하는 것 = 얕은 복사
	}
	
	public void method2( ) {
		//깊은 복사방법 1.for문 활용한 방법 
		// 	새로운 배열을 생성한 후 반복문을 활용해서
		// 	원본배열의 각 인덱스 값을 새로운 배열에 대입
		
		int[]origin = {1,2,3,4,5};
		int[] copy = new int [5];  //-> 초기값00000
		
		// copy[0] = origin[0];
		// copy[1] = origin[1];
		// ...
		// copy[4] = origin[4];
		
		for (int i = 0 ; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		copy[2] = 99;
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i =0; i < origin.length; i++) {
			System.out.println(origin[i]+ " ");
		}	
		System.out.println("\n== 복사 배열 출력 ==");
		
		for(int i=0 ; i < copy.length; i++) {
			System.out.println(copy [i]+ " ");	
			
		}
		
		System.out.println("\norigin의 주소값 : "+ origin.hashCode());
		System.out.println ("copy의 주소값 : " + copy.hashCode());
		
	}
		
		public void method3() {
			
			//깊은 복사방법2. System 클래스에서의 arraycopy 메소드를 이용한 방법
			int[] origin = {1,2,3,4,5};
			int[] copy = new int[10]; //0~9번 인덱스까지 0이 담겨있을 것
			
			// System.arraycopy(원본배열명, 복사를 시작할 인덱스, 복사본 배열명, 복사본 배열의 복사될 시작 인덱스, 복사할 개수);
			
			//System.arraycopy (origin,0,copy,0,origin.length);
			System.arraycopy (origin,2,copy,5,3);
			for (int i =0; i < copy.length;i++) {
				System.out.print(copy[i] + " ");
			}
			
			System.out.println("\norigin의 주소값 : " + origin. hashCode());
			System.out.println ("copy의 주소값 : " + copy.hashCode()); 
			
			
		}
		
		public void method4() { 
			//깊은 복사 방법3. Arrays 클래스에서 제공하는 copyOf 메소드 이용방법
			int[] origin = {1,2,3,4,5};
			/// 복사본배열 = Arrays.copyOf(원본배열명, 복사할 길이)
			int[]copy  = Arrays .copyOf(origin, 5);  //인덱스를 지정할수 있냐없냐의 차이
			/*
			 * 내가 제시한 길이 만큼의 새로운 배열 생성
			 * -> 단, 내가 제시한 길이가 원본배열의 크기보다 클 경우 -> 기존의 배열에 담겨있는 값을 ㄷ다 복사한 후 나머지 자리는 0으로 유지된다.
			 * 			내가 제시한 길이가 원본배열의 크기보다 작을 경우 -> 기존의 배열에 담겨있는 내가 제시한 길이만큼 복사
			 */
			
			for(int i=0; i<copy.length ;  i++) {
				System.out.print(copy[i] + " ");
			}
			
			System.out.println("\norigin의 주소값 : " + origin.hashCode());
			System.out.println("copy의 주소값 ㅣ " + copy.hashCode());
		
		}
		
		public void method5() {
			//깊은 복사방법4. clone()메소드 이용한 방법
			int[] origin = {1,2,3,4,5};
			// 복사본배열 = 원본배열. clone();
			int[]copy = origin.clone();  //{1,2,3,4,5}
			
			System.out.println(Arrays.toString(copy)); // 단지 확인용이라면 반복문 돌리지 않고 이메소드를 사용
			
			System.out.println(origin == copy);
		}
		
		

}//끝
