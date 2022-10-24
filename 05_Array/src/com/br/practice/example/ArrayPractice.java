package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10]; //->10개의 정수를 담을 수 있는 배열
		for(int i = 0; i<10; i++) {
			//System.out.print(arr); -> 이렇게 하면 주소값 나옴
			arr [i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
	}//1
	
	public void practice2() {
		int[] arr = new int[10];
		for (int i = 10; i>0; i--) {
			arr [i] = i;
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
		
		int count = 0;
		
		for (int i=0 ; i<=arr.length; i++) {
			arr[i] = str.charAt(i);
			if (ch==arr[i]) {
				count++;
			}
			 
		} 
		System.out.println(ch + " 개수 : " + count);
		
		
		
	} //5

}//끝
