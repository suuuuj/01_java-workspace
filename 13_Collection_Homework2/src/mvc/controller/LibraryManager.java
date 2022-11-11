package mvc.controller;

import java.util.ArrayList;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {
	
	private Member mem = null;
	
	private ArrayList<Book> bookList = new ArrayList<>();
	
	{
		bookList.add(new CookBook("백종원의 집밥", "백종원", "tvN", true));
		bookList.add(new AniBook("한번 더 해요", "미티", "원모어", 19));
		bookList.add(new AniBook("루피의 원피스", "루피", "japan", 12));
		bookList.add(new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false));
		bookList.add(new CookBook("최현석 날 따라해봐", "최현석", "소금책", true));
	}

	public void insertMember(String name, int age, char gender) {
		Member newMem = new Member (name, age, gender);
		mem = newMem;
	}

	public Member myPage() {
		
		return mem;
	}
	
	public ArrayList<Book> selectAll() {

		return bookList;
	}

	public ArrayList<Book> searchBook() {
		ArrayList<Book> search = new ArrayList<>();
		
		
//		for(int i=0 ; bookList.size();i++)
//		
		return ;
	}
	
	

}
