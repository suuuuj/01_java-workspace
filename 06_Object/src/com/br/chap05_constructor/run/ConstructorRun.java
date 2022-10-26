package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Cosmetic;
import com.br.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		User u = new User();
		
		u.setUserId("sj25054");
		u.setUserPwd("ksj1234");
		u.setUserName("김수정");
		u.setAge(28);
		u.setGender('F');
		
		System.out.println(u.information());
		
		System.out.println("=================================================");
		
		Cosmetic c = new Cosmetic();//객체 생성 구문
		
		c.setcName("SunCream");
		c.setPrice(30000);
		c.setBrand("Dr.Jart+");
		c.setCategory("SkinCare");
		c.setIngredient( );
		
		
		System.out.println(c.information());
		

	}

}
