package com.hw4.model.vo;

public class Employee {
	private String empName;		//사원명
	private String dept;		//부서명	
	private String job;			//직급
	private int age;			
	private char gender;
	private int salary;         //급여
	private double bonusPoint;	//보너스포인트
	private String phone;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public void setempName (String empName) {
		this.empName=empName;
	}
	public void setDept (String dept) {
		this.dept = dept;
	}
	public void setJob (String job) {
		this.job = job;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public void setGender (char gender) {
		this.gender = gender;
	}
	public void setSalary (int salary) {
		this.salary = salary;
	}
	public void setbpnusPoint (double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress (String address) {
		this.address = address;
	}
	
	
	public String getempName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getbonusPoint() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String information () {
		return "";
	}

}
