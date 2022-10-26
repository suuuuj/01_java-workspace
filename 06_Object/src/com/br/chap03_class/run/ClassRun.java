package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

public class ClassRun {
	
	public static void main(String[] args) {
		
		Person kim = new Person(); //객체생성 -> heap에 필드만큼의 방이 만들어짐(7개)
		
		//값입력하지 않고 출력하면 String-null / int-0 / char-'(공백)'같은 기본값이 들어있음
		// -> 생성만 했을 때 각 필드에 기본값이 초기화 되어있음
		
			
		kim.setId("user1");
		kim.setPwd("pass01");
		kim.setName("김수정");
		kim.setAge(28);
		kim.setGender('F');
		kim.setPhone("010-8890-0730"); //굳이 담고 싶지 않으면 안담아도 됨 (적지 않아도 됨)
		kim.setEmail("sj25054@naver.com");
		
//		System.out.println(kim.getId());
//		System.out.println(kim.getPwd());
//		System.out.println(kim.getName());
//		System.out.println(kim.getAge());
//		System.out.println(kim.getGender());
//		System.out.println(kim.getPhone());
//		System.out.println(kim.getEmail());
		
		System.out.println(kim.information());
		
		System.out.println("========================================");
		
		Product p = new Product();
		
		p.setpName ("아이폰");
		p.setPrice (180000);
		p.setBrand ("애플");
		
		System.out.println(p.information());
	}
	

}
