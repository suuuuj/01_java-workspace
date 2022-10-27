package com.br.chap05_constructor.model.vo;

public class User {

	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	/*
	 * 생성자 (메소드와 비슷함,그렇지만 반환형 없음/반환형 쓰면 메소드가 됨)
	 * public 클래스명(똑같이)([매개변수, 매개변수, 매개변수...]) {
	 * 
	 * }
	 * 
	 * * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적 (new User();)
	 * 2. 객체 생성과 동시에 각 필드에 값을 대입할 목적
	 * 
	 * 
	 * * 생성자 작성시 주의사항
	 * 1. 반환형(void) 존재하지 않음
	 * 2. 반드시 생산자 명은 클래스 명과 동일 해야함 (대문자 주의@@)
	 * 3. 매개변수 생성자를 명시적으로 작성할 경우 기본생성자를 JBM이 자동으로 만들어주지 않음
	 *    -> 기본생성자는 항상 작성하는 습관을 들이자
	 *    
	 */
	
	public User() { 
		// 기본생성자 (매개변수가 없는 생성자)
		// 단지 객체 생성만을 목적으로 함
		//System.out.println("실행되나?");->ConstructorRun 클래스의 메인메소드 안 new User(); 부분에서 실행
		//기본생성자를 생략했을 경우>"JVM"이 자동으로 만들어 줬기 때문에 항상 객체 생성 가능
		
	}
	//매개변수 생성자
	//객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화할 목적
						//매개변수의 순서도 중요함@@@!!
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName=userName;
		//나머지 필드는 JVM의 초기값으로 되어있음
	}
	// 매개변수 생성자
	
	public User(String userId,String userPwd,String userName, int age, char gender) {
//		this.userId = userId;
//		this.userPwd=userPwd;
//		this.userName=userName;
		
		
		this(userId,userPwd,userName); 
		// 또다른 생성자를 호출할 때 this () 생성자 활용 가능
		// 유의사항 : 반드시 첫줄에 써야함
		this.age=age;
		this.gender=gender;
		
	}
	
	public void setUserId(String userId) {
		this.userId=userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd=userPwd;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return userId + ", " + userPwd + ", " + userName + ", " + age + ", " + gender;
	}
}
