package com.br.chap01_poly.part02_electronic.controller;
//다형성 적용 o

import com.br.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicShop2 {
	
	private Electronic [] elec = new Electronic[3]; //각각의 인덱스의 자료형은 Electronic
	private int count =0;
	
	public void insert(Electronic any) {  //부모타입 객체 하나 설정하니 자식타입객체 모두 허용가능
		elec[count++] = any; 
		//count++;
		//처음 count=0 -> insert에 입력 -> count +1 -> 그다음 insert 입력 -> count +1 반복
	}
	
	//제품조회
	public Electronic select(int index) {
		return elec[index];
	}

}
