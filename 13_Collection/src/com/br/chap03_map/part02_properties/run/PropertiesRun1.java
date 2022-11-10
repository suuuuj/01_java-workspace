package com.br.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {

	public static void main(String[] args) {

		//Properties : Map 계열의 컬렉션 =>키+밸류 세트 저장
		
		/*Properties prop = new Properties();
		
		prop.put("다이제", new Snack("초코맛",1500));
		prop.put("새우깡", new Snack("짠맛",700));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		// 단, Properties를 주로 사용하는 경우는  Properties 에 담겨있는 것들을 파일로 출력 또는 입력받아 올 때 사용함
		// 파일로 출력 또는 입력받아 올 떄 사용ㅇ함
		// store() : 파일로 저장(출력)
		// load() : 파일로부터 불러오기 (입력)
		
		try {
			prop.store(new FileOutputStream("test.properties"),"properturstesTest");
			
			// 내뷰적으로 properties에 담겨있는 키, 밸류 들을 String형변환해서 출력함
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		Properties prop = new Properties();
		
		//1. setPrpperty(Sting key, String value)
		prop.setProperty("List", "ArrayList");

		prop.setProperty("Set", "HashSet");
	
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("list")); //-> 존재하지 않는 키값 반환하면 null 나옴 null뜨면 키값에 오타가있는지 확인해보기
		
		try {
			// 3. store(OutputStream os, String comments)=> Properties안에 담겨있는
			prop.store(new FileOutputStream ("test.properties"), "propertiesTest");
			
			// 4. storeToXML(OutputStream os, String comments)
			prop.storeToXML(new FileOutputStream("test.xml"),"propertiesTest");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
