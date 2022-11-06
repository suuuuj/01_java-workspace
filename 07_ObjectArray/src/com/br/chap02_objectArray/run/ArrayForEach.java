package com.br.chap02_objectArray.run;

import java.util.Scanner;

import com.br.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		//초기식, 조건식, 증감식으로 이루어져 있는 for문 -> for loop문
		
		// 배열 또는 컬렉션과 함께 사용되는 for문
		// 0번 부터 마지막까지 순차적으로 접근할 목적 -> 향상된 for문(for each문)
		// 단, 자바 5버전 이상부터 사용 가능 (5버전 미만은 오류나니 for loop문 사용)
		
		/*
		 * for( 순차적으로 접근한 값을 담을 변수 선언 : 순차적으로 접근하고자 할 배열/컬렉션 ) { // 반복횟수 == 배열또는 컬렉션의 크기
		 * 		반복적으로 실행할 내용
		 * }
		 */
		
		int[] arr = {10, 20, 30};
		for(int i=0; i<arr.length; i++) {  //지금까지 해온 for loop문
			System.out.println(arr[i]);
		}
		
		//      int     :  int[]    
		for(int value/*변수선언*/:arr) {//변수 = 10(arr[0]); => 변수 = 20; => 변수 = 30;
			
			System.out.println(value);
		}
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("아이폰","애플",1400000,"14pro");
		phones[1] = new Phone("갤럭시", "삼성", 1200000, "note20");
		phones[2] = new Phone("벨벳폰", "엘지", 900000,"1");
		
		phones[2].setSeries("없음");
		
		int total = 0;   // 향상된 for문안에서는 인덱스 수를 가지고서 활용을 할 수 없음
		//   Phone   : Phone[]
		for ( Phone p : phones) { //p = phones[0] => p = phones[1] => p = phones[2]
			System.out.println(p.information()); // -> 이미 p안에 인덱스에 접근된것이 담겨있어서 phones[i].information 안써도 됨
			total += p.getPrice();
		}
		
		System.out.println("총가격 : " + total + "원");
		System.out.println("평균가 : " + phones.length/3);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		int count = 0;
		
		for (Phone p : phones) {
			if(p.getName().equals(buy))
				System.out.println ("당신이 구매하고자 하는 " + buy + " 핸드폰의 가격은 " + p.getPrice() + "원 입니다." );
				count++;
		}
		if(count==0) {
			System.out.println("저희 가게에서 파는 핸드폰이 아닙니다. ");
		}
	 }
	
}
