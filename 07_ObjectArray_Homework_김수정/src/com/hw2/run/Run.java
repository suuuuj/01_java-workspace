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
			//어차피 while로 반복하기 때문에 입력받을 때 for문 안써도됨
			
			//사용자가 입력한 값들을 가지고 학생객체 생성후 객체배열에 담기
			
			s[count++] = new Student (grade, classroom, name, kor, eng, math);
			
			//count 처음엔 0 -> 담고나서 1 증가 -> 추가로 더 담을것인지 물어보기			
			System.out.print("계속 추가하시겠습니까? (Y/N) : ");
			String str = sc.nextLine().toUpperCase(); //문자열.toUpperCase() : 무조건 대문자로 바꿔주는 메소드
			
			if(str.equals("N")) {
				break;
			} //N일경우 while 반복문 빠져나옴
		}
		
		for(int i = 0; i<count ; i++) { //i<stu.length하면 10번 반족-> 널포인트 오류 뜰 수 있음
										// 따라서 학생 수만큼만 반복하도록 함
			int sum = s[i].getKor()+s[i].getMath()+s[i].getEng();
			System.out.println(s[i].information() + ", 평균: " + sum/3);
		}
		
	}

}
