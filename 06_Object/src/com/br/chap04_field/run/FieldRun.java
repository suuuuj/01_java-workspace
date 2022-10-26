package com.br.chap04_field.run;

import com.br.chap04_field.model.vo.FieldTest2;
import com.br.chap04_field.model.vo.FieldTest3;
import com.br.chap04_field.model.vo.FieldTest1;

public class FieldRun {

	public static void main(String[] args) {
		
//		FieldTest1 fr1 = new FieldTest1();
//		fr1.test(10);
		
		FieldTest2 ft2 = new FieldTest2();
		
		System.out.println(ft2.pub);
		//System.out.println(ft2.pro); 
		//System.out.println(ft2.def);
		//System.out.println(ft2.pri);
		
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		
		FieldTest3.sta = "수정수정";
		
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest3.STAFIN);
		
		//FieldTest3.STAFIN = "새로운값"; //상수필드는 값 변경 할 수 없어서 오류뜸
		System.out.println(Math.PI);
		//Math.PI = 4.56; 수정 불가능
		
		
		
		
		
	}

}
