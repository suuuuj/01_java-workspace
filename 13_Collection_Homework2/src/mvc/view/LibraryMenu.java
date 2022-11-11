package mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;

public class LibraryMenu {
	
	LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별: ");
		char gender = sc.nextLine().charAt(0);
		
		lm.insertMember(name, age, gender);
		
		while(true) {
			System.out.println("\n=== 메뉴 ===");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print(">> 번호 입력 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: lm.myPage(); System.out.println( lm.myPage() ); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("\n>>프로그램이 종료됩니다. 이용해주셔서 감사합니다<<"); return;
			default: System.out.println("\n잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
		
	public void selectAll() {
		ArrayList<Book> bList = lm.selectAll();
		if(bList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(int i=0 ; i<bList.size();i++) {
				System.out.println(i+"번도서 : "+ bList.get(i));
			}
		}
		
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		lm.searchBook();
		
	}
	
	public void rentBook() {
		
	}
	

	

}
