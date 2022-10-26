package com.br.chap01_abstraction.model.vo;

/*
 * public class 클래스명{
 *   
 *   // 필드부
 *   
 *   // 생성자부
 *   
 *   // 메소드부
 *     public void method1() {
 *     
 *     }
 * }
 */

public class Student {

	// 필드부
	// 접근제한자 자료형 필듬명; 
	// * 접근제한자 : 여기에 접근할 수 있는 범위를 제한하는 것
	//  (개방적 어디서든 접근 가능) public > protected > default > private (공유범위가 좁아짐)
	public String name;
	public int age;
	public double height;  //클래스다이어그램(StatUML) - 설계단계에서 자주 쓰이며 보고 클래스를 만들 수 있어야함
	
	
}
