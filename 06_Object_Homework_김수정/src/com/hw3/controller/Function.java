package com.hw3.controller;

public class Function {
	
	public void printLottoNumbers() {
		
		for (int i=1; i<=6 ; i++) {
			int random = (int)(Math.random()*45 + 1);
			System.out.print("랜덤 값 : " + random + " ");
		} 
	}
	
	public void outputChar(int num, char c) {
		System.out.println("a문자 5개 출력 : ");
		for(int i = 1 ; i <= num ; i++) {
			System.out.println(c);
		}
	}
	
	public char alphabette() {
		System.out.println("랜덤 영문자 출력 : ");
		int a = 'a';
		int z = 'z';
		int la= 'A';
		int lz= 'Z';
		
		char ch = ' ';
		
		int random1 = (int)(Math.random()*(z-a+1)+a);
		int random2 = (int)(Math.random()*(lz-la+1)+la);
	
		if(a<=random1 && z>=random1) {
			ch = (char)random1;
		}else if (la<=random2 && lz>=random2) {
			ch = (char)random2;
		}return ch;
	}

	public String mySubstring(String str, int index1, int index2) {
		System.out.println("apple의 2번 4번 인덱스 사이의 값 출력 : ");
		char ch = ' ';
		String result = "";
		
		if(1<=str.length()) {
			for(int i = index1+1; i<index2;i++) {
				ch = str.charAt(i);
			}
			
		}else {
			return "";
		}

	} 

}
