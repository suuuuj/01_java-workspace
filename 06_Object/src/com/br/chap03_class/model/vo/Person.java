package com.br.chap03_class.model.vo;

public class Person {
	
	private String id;  //필드명
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	// setter메소드( 대입만 시켜주고 결과값 나오지 않음)
	public void setId(String id) {
		this.id=id;  //매개변수 
	}
	
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge (int age) {
		this.age=age;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}

	// getter메소드 (무조건 있어야함 왜냐면 하나씩 물어볼 수도 있기 때문에
	public String getId() {
		return id;  // this.을 굳이 쓰지 않아도 됨 알게모르게 숨어져 있음
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	// 메소드 더 추가 가능
	public String information() {
		// 현재 객체의 모든 필드값을 하너번에 반환하는 기능
		// return id, pwd, name, age; -> 이렇게 써선 안됨.
		return id +", " + pwd +", " + name +", " + age +", " 
				+ gender +", " + phone +", " + email;
		
	}
}
