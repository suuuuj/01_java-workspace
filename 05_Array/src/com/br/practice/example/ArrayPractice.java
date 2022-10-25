package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10]; //->10개의 정수를 담을 수 있는 배열
		for(int i = 0; i<arr.length; i++) {
			//System.out.print(arr); -> 이렇게 하면 주소값 나옴
			arr [i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
	}//1
	
	public void practice2() {
		int[] arr = new int[10];
		for (int i = 0 ; i>arr.length; i--) {
			arr [i] = arr.length - i;
			
			System.out.print(arr[i] + " ");
		}
		
		
	}//2 -x
	
	public void practice3() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int [] arr = new int[num];
		
		for(int i = 0; i<num ; i++) {
			arr [i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
	} //3
	
	public void practice4() {
		String[] arr = new String[] {"사과", "귤","포도","복숭아","참외"};
		System.out.print(arr[1]);
	
	}//4
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		
		for (int i=0 ; i<=arr.length; i++) {	
			if (arr[i] == ch) {
				count++;
			}
		 
		} 
		
		System.out.println(ch + " 개수 : " + count);		
	} //5 x
	
	public void practice6() {
		char[] arr = {'월', '화', '수','목', '금', '토', '일'};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num>=0 && num<7) {
			System.out.println(arr[num] + "요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}//6
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int[]arr = new int[sc.nextInt()];
		
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		} 
		int sum = 0;
		
		for(int i =0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " \n");
			sum+=arr[i];
		}
		System.out.println("총 합 : " + sum);
		
	}//7
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//1. 사용자에게 3이상 홀수 입력
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			//2. 잘 입력했는지 아닌지 판별
			if(num>=3 && num %2 ==1) {
				//잘 입력했을 경우-> 배열에 값 담은 후 결과 출력 후 반복문 종료
				//배열 생성
				int[] arr = new int[num];
				
				//배열 값 대입
				//배열 값 출력
				
				break;
				 
			}else {
				// 잘못 입력했을 경우 => "다시 입력해주세요"
				System.out.println("다시 입력해주세요");
			}
		}
		
		
	}//8x
	
	public void practice9() {
		
		//1. 치킨 메뉴들이 들어있는 String 배열 선언, 할당 동시에 초기화
		String[] chickens = {"양념", "후라이드", "간장" , "파닭"};
		
		//2. 사용자에게 치킨명 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		//3. 사용자가 입력한 메뉴가 해당 배열에 존재하는지 판별
		
		boolean flag = false;
		
		for (int i=0; i<chickens.length; i++) {
			if(chickens[i].equals(name) ) {
				flag = true;
				
				break;
			}
		}
		
		if (flag) {
			System.out.println(name+"치킨 배달 가능");	
		}else {
			System.out.println(name + "치킨은 없는 메뉴입니다.");
		}
		
//		int count =0;
//		for(int i = 0; i<chickens.length;i++) {
//			if(chickens[i].equals(name)) {
//			count++;
//			}
//			
//		if(count ==0) {
//			System.out.println(name + "치킨은 없는 메뉴입니다.");
//		}else {
//			System.out.println(name + "치킨 배달 가능");
//		}
//		}
		
	}//9x
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i=0 ; i<arr.length ;  i++ ) {
			arr[i]=(int)(Math.random()*10 + 1);
		}
		
		for(int i=0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
	}//10
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0 ; i<arr.length;i++) {
			if(i<8) {
				arr[i] = str.charAt(i);
			}else {
				arr[i] = '*';
			}
		}
		for(int i = 0; i<arr.length;i++)
		System.out.print(arr[i]);
	}

	
	
	
}//끝
