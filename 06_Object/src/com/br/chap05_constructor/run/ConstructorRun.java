package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Cosmetic;
import com.br.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 1. 기본생성자로 객체 생성 직후 해당 객체 정보 출력
		User u1 = new User(); //heap영역에 기본값으로 생성됨
//		System.out.println(u1.information()); //-> null, null, null, 0, ' ' 
		System.out.println(u1.information());
		
		
		// 기본생성자로 생성 후 일일이 setter매소드를 이용하여 값 초기화
		/*User u2 = new User();
		u2.setUserId("user01");
		u2.setUserPwd("pass01");
		u2.setUserName("홍길동");
		*/
		
		//2.매개변수 3개짜리 생성자로 객체 생성과 동시에 초기화
		User u2 = new User("User01","pass01","홍길동");
	
		System.out.println(u2.information());
		
		//3. 매개변수 5개짜리 생성자로 객체생성과 동시에 초기화
		User u3 = new User("user02","pass02","김수정",28,'여');
		System.out.println(u3.information());	
		
		u3.setUserName("김수저");
		System.out.println(u3.information());
	
		u3.setAge(29);
		System.out.println(u3.information());
		
//===========================================================================================
		System.out.println("=================================================");
	
		//String[]arr = {"색소","알코올"};
		String[]arr = new String[]{"색소","알코올"};
	
		Cosmetic c = new Cosmetic("펜라이너",15000 , "클리오","아이메이크업", new String[] {"색소", "알코올"} );//객체 생성 구문
		
		
		
		
		System.out.println(c.information());
		

	}

}
