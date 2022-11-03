package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;


public class Run {

	public static void main(String[] args) {
		//3명의 사원 정보를 배열을 통해 생성한 후 출력
		//객체들 중 값이 없는 필드에는 setter를 통해 값을 각각 수정한 후 다시 출력
		//직원 각각의 보너스가 적용된 연봉을 계산하여 출력하고 총 직원 연봉의 평균구해 출력
		Scanner sc = new Scanner(System.in);
		
		Employee[] emp = new Employee[3];
		/*
		emp[0] = new Employee();
		emp[0].setempNo(0);
		emp[0].setempName(null);
		emp[0].setDept(null);
		emp[0].setJob(null);
		emp[0].setAge(0);
		emp[0].setGender(' ');
		emp[0].setSalary(0);
		emp[0].setBonusPoint(0.0);
		emp[0].setPhone(null);
		emp[0].setAddress(null);
		* 이걸 한줄로 정리하면
		*/
			
		emp[0] = new Employee () ; 
		emp[1] = new Employee (1, "홍길동", 19, 'M',"01022223333", "서울 잠실");
		
		emp[2] = new Employee (2, "강말순", "교육부","강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0; i <3 ; i++) {
			System.out.println("emp["+i+"] : " + emp[i].information());
		}

		System.out.println("========================================");
		
		// 2. 3개의 객체 중 값이 없는 필드에 각각 값을 넣고 출력
		
		/*
		 *  이건 값이 없는 객체에 값을 넣어다기보단 객체를 새로 생성한것. 
		emp[0] = new Employee (0, "김말똥", "영업부","팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
		emp[1] = new Employee (1, "홍길동","기획부","부장", 19, 'M',4000000, 0.3 ,"01022223333", "서울 잠실");
		*/
		
		emp[0].setempNo(0);
		emp[0].setempName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		
		for(int i = 0; i <2 ; i++) {
			System.out.println("emp["+i+"] : " + emp[i].information());
		}
		
		System.out.println("========================================");
		int result = 0;
		int sum = 0;
		
		for(int i = 0 ; i<emp.length ; i++) {
			
			result = (int)((emp[i].getSalary() + emp[i].getSalary()*emp[i].getBonusPoint())*12);
			
			System.out.println(emp[i].getempName()+"의 연봉 : " + result + "원");
			
			sum+=result;
		}
		System.out.println("========================================");
		System.out.println("직원들의 연봉의 평균 : " +sum/emp.length + "원");
		
		

	}

}
