package com.hw3.controller;

public class Function {
	
	public void printLottoNumbers() {
		
		for (int i=1; i<=6 ; i++) {
			int random = (int)(Math.random()*45 + 1);
			System.out.print(random + " ");
		} 
		System.out.println();
	}
	
	public void outputChar(int num, char c) {
		for(int i = 1 ; i <= num ; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	public char alphabette() {
//		int a = 'a';
//		int z = 'z';
//		int la= 'A';
//		int lz= 'Z';
		
//		char ch = ' ';
//		
//		int random1 = (int)(Math.random()*(z-a+1)+a);
//		int random2 = (int)(Math.random()*(lz-la+1)+la);
//	
//		if(a<=random1 && z>=random1) {
//			ch = (char)random1;
//		}else if (la<=random2 && lz>=random2) {
//			ch = (char)random2;
//		}return ch;
		
		int num = 0;
		
		while(true) {
			
			num = (int)(Math.random()*(('z'-'A')+1) + 'A');
			
			if(num>='a' && num<='z' || num>='A' && num<='Z') {
				break;
			}
		}
		return (char) num;
	}

	
	
	
	public String mySubstring(String str, int index1, int index2) {
		if (str != null && !str.equals("")) {
			String result = "";
			
//			for(int i = index1 ; i<index2 ; i++) {
//				result +=str.charAt(i);
//			}
//			return result;
			
			result = str.substring(index1,index2);
			
			return result;
		
		}else {
			return null;
		}
	}
		 

}
