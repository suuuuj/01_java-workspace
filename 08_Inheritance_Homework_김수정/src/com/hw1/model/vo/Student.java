package com.hw1.model.vo;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		
		Person p = new Person();
		p.name="";
		
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
	
	
	public String toString() {
		return "name:" + name  + ", age:" + super.getAge() + ", height:" + super.getHeight() + ", weight:" + super.getWeight() + ", grade:" + grade + ", major:" + major; 
	}

}
