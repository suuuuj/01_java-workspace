package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice2 {

	public void practice1() {
		//길이가 10인 배열 선언 1~10까지의 값을 반복문을 이용하여 
		//순서대로 배열 인덱스에 넣은후 그값을 출력
		int[] arr = new int [10];
		
		for (int i = 0; i<arr.length;i++) {
			System.out.print((arr[i]=i+1)+ " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int [10];
		
		for(int i = arr.length-1 ; i>=0 ; i--) {
			System.out.print((arr[i] = i+1) + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for (int i = 0 ; i < size ; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		//길이가 5인 String 배열 선언
		//사과 귤 포도 복숭아 참외로 초기화
		//배열 인덱스를 활용하여 귤출력
		
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.print(fruit[1]);
	}
	
	public void practice5() {
		//문자열 입력받아 문자 하ㄴㅏ하나를 배열에 넣고
		//검색할 문자가 문자열에 몇개나 있는지 개수출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine(); // str 사용자가 입력한 문자열
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); // ch 사용자가 입력한 문자
		
		// 사용자가 입력한 문자열str을 문자 하나하나 char 배열에 넣기
		char[] arr = new char[str.length()];
		// apple arr[0]=a arr[1]=p...
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]=str.charAt(i); //i번째 인덱스의 문자
		}
		int count = 0;
	
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == ch ) {
				count++;
			}
			
		}System.out.println(ch+"개수 : " + count);
		
	}
	public void practice6() {
		char[] day = {'월','화','수','목','금','토','일'};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num>=0 && num<7) {
			
			System.out.println(day[num]+"요일");
	
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0 ;
		
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();			
		}
		for (int i = 0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n총합 : " +sum);	
		
	}
	
	
	
}//끝
