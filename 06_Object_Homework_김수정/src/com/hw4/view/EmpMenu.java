package com.hw4.view;

import java.util.Scanner;

import com.hw4.model.vo.Employee;
	
public class EmpMenu {

	private Scanner sc = new Scanner(System.in);
	
	
	//기본 생성자
	public EmpMenu() {
		
	}
	
	//사원 정보관리 프로그램에 해당하는 메인 메뉴출력 -> 반복 출력되게 함
	public void mainMenu () {
		
		Employee emp = null; //-> 초기 사원 객체 초기화
		
		while(true) {
			System.out.println("==== 사원 정보 관리 프로그램 ====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if((menu==2 || menu==4)&& emp==null) {
				System.out.println("사원 정보를 먼저 입력해야됩니다.");
				continue;
			}
			
			switch (menu) {
			case 1: emp=inputEmployee(); break; //반환값으로 emp초기화
			case 2: modifyEmployee(emp); break;
			case 3: emp=null; break;
			case 4: System.out.println(emp.information());break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	//메인 메뉴의 1번을 눌렀을 때 호출되는 메소드로 사원정보를 키보드로 입력 받아
	//매개변수 생성자를 이용하여 객체 생성 후 그 주소값을 반환
	
	public Employee inputEmployee() {
		System.out.println("==== 사원 정보 입력 ====");
		
		System.out.print("사원명 : ");
		String empName = sc.nextLine();
		
		System.out.print("부서명 : ");
		String dept = sc.nextLine();
		
		System.out.print("직급 : ");
		String job = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		System.out.print("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		
		System.out.print("휴대폰 번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		Employee newEmp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		return newEmp;
	}
	
	//메인 메뉴의 2번을 눌렀을 때 호출되는 서브메뉴
	//각 서브 메뉴에 해당하는 변경값을 입력받고 setter메소드를 이용하여 사원정보 수정->반복출력
	
	public void modifyEmployee(Employee emp) {
		while(true) {
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			
			
			
		}
	}
	

}//끝
