package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 최대 10명의 학생 정보를 기록할 수 있게 객체 배열을 할당
		// 반복문을 사용하여 키보드로 학생정보를 입력받도록 구현
		// 3명의 학생 정보를 입력받아, 각 객체에 저장
		// 현재 기록된 학생들의 정보와 각 학생의 평균점수를 출력
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[10];
		int count = 0; //학생수를 나타내는 변수 
		
		while(true) {
			
			for(int i =0 ; i<s.length;i++) {
				
				System.out.print("학년 입력 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 입력 : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				System.out.print("이름 입력 : ");
				String name = sc.nextLine();
				
				System.out.print("국어점수 입력 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 입력 : ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 입력 : ");
				int math = sc.nextInt();
				sc.nextLine();
				
				s[i] = new Student (grade, classroom, name, kor, eng, math);
		
				count++;
				
				System.out.print("계속 추가하시겠습니까? (Y/N) : ");
				char ch = sc.nextLine().charAt(0);
				if (ch == 'Y' || ch == 'y') {
					continue;
				}else {
					return;
				}
			}
		
		}
		
		
		
		
	}

}
