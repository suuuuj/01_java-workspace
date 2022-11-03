package com.br.chap02_abstractAndInterface.part02_interface.model.vo;

public class Mother extends Person implements Basic  { 
	// implements --> 인터페이스를 상속x 구현한다.(추상메소드밖에 없기 때문에)
	// 추상메소드를 갖는다면 오버라이딩 하지 않아도됨 / 일반클래스로 한다면 강제로 오버라이딩 해야함
	private String babyBirth;  //출산/입양/없음
	
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth=babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth=babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother[" + super.toString() + ", babtBirth: " + babyBirth + "]";
	}
	

	@Override
	public void eat() {
		// 몸무게 10 증가 / 건강도 10감소
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		//건강도 20 증가
		super.setHealth(getHealth() + 20);
		
	}
	
	
		
	

}
