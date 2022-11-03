package com.br.chap02_abstractAndInterface.part02_interface.model.vo;

public class Baby extends Person implements Basic{

	public Baby() {}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return "Baby["+super.toString() + "]";
	}
	
	
	@Override
	public void eat() {
		//몸무게 3증가 / 건강도 1증가
		super.setWeight(getWeight() + 3);
		setHealth(getHealth() + 1); // super 안써도됨 해당 변수가 하나밖에 없기때문에 자동적으로 가져옴 동적바인딩
	}

	@Override
	public void sleep() {
		//건강도 3증가
		setHealth(getHealth() + 3);
		
	}

}
