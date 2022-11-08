package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class NoteMenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FileDao dao = new FileDao();
		
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("번호를 입력하세요. : ");
			int note = sc.nextInt();
			
			switch(note) {
			case 1: dao.fileSave(); break;
			case 2: dao.fileOpen(); break;
			case 3: dao.fileEdit(); break;
			case 4: return;
			default :System.out.println("잘못입력하셨습니다.");
			
			}
			
		}

	}

}
