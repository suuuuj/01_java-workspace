package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();

	public FileDao() {}
	
	
	public void fileSave() {
		System.out.print("파일에 저장할 내용을 입력하시오(exit를 입력시 내용입력 끝) : ");
		while(true) {
			String str = sc.nextLine();
			if(!str.equals("exit")) {
				sb.append(str+"\n");
			}else {
				break;
			}
		}
		//System.out.println(sb);
		
		System.out.print("저장하시겠습니까?(y/n) : ");
		String str = sc.nextLine().toLowerCase();
		
		if(str.equals("y")) {
			System.out.print("저장할 파일명을 입력하시오 : ");
			String file = sc.nextLine();
			
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(file + ".txt"));
				bw.write(sb.toString()); //StringBuilder는 String 타입이 아니기때문에 to String으로 바꿔줘야함
				System.out.println(file + ".txt 파일에 성공적으로 저장였습니다. ");
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
	}
	
	public void fileOpen() {
		System.out.print("열기 할 파일명 : ");
		String file = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file + ".txt"))){
			
			String value = null;
			
			while((value = br.readLine())!= null) { //br.readLine() 가 null(파일의 끝)이 아닐경우 계속 출력
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileEdit() {
		System.out.print("수정 할 파일명 : ");
		String file = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file + ".txt"))){
			
			String value = null;
			
			while((value = br.readLine())!= null) { 
				System.out.println(value);
			}
			
			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			
			while(true) {
				String str = sc.nextLine();
				if(!str.equals("exit")) {
					sb = sb.append(str+"\n");
				}  else {
					break;
				}
			}
						
			System.out.print("변경된 내용을 파일에 추가하시겠습니까?(y/n) : ");
			String str = sc.nextLine().toLowerCase();
			if(str.equals("y")) {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(file + ".txt"))){
					bw.write(sb.toString());
				}
				System.out.println(file + ".txt 파일의 내용이 변경되었습니다. ");
			}else {
				System.out.println("다시 메뉴로 돌아갑니다.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
