package com.br.chap01_poly.part02_electronic.controller;

import com.br.chap01_poly.part02_electronic.model.vo.Desktop;
import com.br.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.br.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용 x

public class ElectronicShop1 {
	
	// 전자상가에 있는 가게라고 생각
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	//오버로딩 적용 - 한클래스에 같은 메소드 이름 있는것 (매개변수 타입이 다르기때문에 가능)
	public void insert(Desktop d) { //Desktop d = new Desktop(~~~~);
		desk = d;
	}
	public void insert(NoteBook n) { //NoteBook n = new NotrBook(~~~);
		note = n;
	}
	public void insert(Tablet t) {
		tab = t;
	}
	
	
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	
}
