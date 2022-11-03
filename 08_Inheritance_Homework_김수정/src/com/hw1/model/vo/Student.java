package com.hw1.model.vo;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;  // protected(상속관계 직접접근 가능) 이기 때문에 부모 필드 값에 직접 접근해서 초기화
			
		this.grade=grade;
		this.major=major;
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	
	
	public int getGrade() {
		return grade;
	}
	public String getMajot() {
		return major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", grade:" + grade + ", major:" + major; 
	}

}
