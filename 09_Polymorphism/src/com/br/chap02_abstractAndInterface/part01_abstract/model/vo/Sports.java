package com.br.chap02_abstractAndInterface.part01_abstract.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
	
	public Sports(int people) {
		this.people=people;
	}
	
	public void setPeople (int people) {
		this.people=people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public String toString() {
		return "people : " + people;
	}
	
	//추상메소드(미완성된 메소드 - 자식클래스에서 오버라이딩으로 완성시켜 호출)
	public abstract void rule();

	
	// 추상메소드를 추가하는 순간 => 추상클래스로 적용하기 
	
}
