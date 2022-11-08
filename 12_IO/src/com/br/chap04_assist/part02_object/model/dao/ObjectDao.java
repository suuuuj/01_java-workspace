package com.br.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.br.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// 프로그램 --> 파일(출력)
	public void fileSave() {
		// 출력시킬 데이터 (Phone객체)
		Phone ph = new Phone("아이폰",1300000);
		
		// FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조 스트림 (ObjectWriter없음)
		
		try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("d_phone.txt"))){
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 프로그램<-- 파일(입력)
	public void fileRead() {
		// FileInputStream
		// ObjectInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			System.out.println(ois.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		
	}
	
	

}
