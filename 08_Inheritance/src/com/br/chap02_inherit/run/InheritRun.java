package com.br.chap02_inherit.run;

import com.br.chap02_inherit.model.vo.Airplane;
import com.br.chap02_inherit.model.vo.Car;
import com.br.chap02_inherit.model.vo.Ship;

public class InheritRun {

	public static void main(String[] args) {
		Car c = new Car("벤틀리",12.5,"세단",4);
		Airplane a = new Airplane("비행기", 0.1, "제트기",10,4);
		Ship s = new Ship ("낚시배",3,"어선",1);
		
		System.out.println(c.information());
		System.out.println(a.information());
		System.out.println(s.information());
		
		//값변경시
		s.setName("화물선");
		s.setKind("선박");
		
		System.out.println(s.information());
		System.out.println(c.hashCode());//(자식클래스 코드 영향받음)
		Car c1 = new Car(); 
	}

	
	/*
	 *  *상속의 특징
	 *  - 클래스간의 상속에 있어서는 다중상속이 불가(단일상속만 가능)
	 *  - 부모클래스에 정의되어있는 protected필드는 자식클래스에 직접 접근 가능
	 *  - 자식 객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출가능
	 *  	+부모클래스에 있는 메소드가 맘에 들지 않으면 자식클래스에서 재정의 가능(값 수정 가능)-> 오버라이딩
	 *  - 명시되어있진 않지만 모든 클래스(자바제공클래스, 직접 만든 클래스)는 Object클래스의 후손이다.
	 *  	=> 즉, Object클래스에 있는 메소드들 마음대로 호출 가능
	 *   	=>뿐만아니라 오버라이딩을 통해서 재정의 가능
	 *  
	 */
}
