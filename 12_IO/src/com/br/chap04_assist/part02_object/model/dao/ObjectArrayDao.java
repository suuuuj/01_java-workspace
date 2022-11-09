package com.br.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.br.chap04_assist.part02_object.model.vo.Phone;

public class ObjectArrayDao {
	
	public void fileSave() {
		/*
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("갤럭시", 1200000);
		arr[1] = new Phone("아이폰", 1300000);
		arr[2] = new Phone("플립", 1500000);
		*/
		
		ArrayList<Phone>list = new ArrayList</*Phone*/>();
		
		list.add(new Phone("갤럭시", 1200000));
		list.add(new Phone("아이폰", 1300000));
		list.add(new Phone("플립",1500000));
		
		
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream ("e_phones.txt"))){
			/*for(int i = 0 ; i< arr.length ; i++)
			oos.writeObject(arr[i]);
			}*/
			
			/*for(int i =0 ; i<list.size();i++) {
				oos.wirteObject(list.get(i));
			}*/
			
			//향상된 for문
			for(Phone p : list) {
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_phones.txt"))) {
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); //java.io.EOFException (EndOfFile) 파일의 끝을 봤을때 나는 예외
			*/
			
			while(true) {
				System.out.println(ois.readObject());
				//파일의 끝을 만나는 순간 예외가 뜨며 프로그램 종료됨
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일을 다 읽었습니다."); // 밑에다 두면 오류뜸(자식타입예외클래스 이기떄문에) 부모클래스 위에 두어야함
		} catch (IOException e) {
			e.printStackTrace(); // 주석하면 빨간줄 안뜸 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		System.out.println("프로그램을 종료합니다.");
	}
	
	
}
