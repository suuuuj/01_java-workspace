package com.br.homework.controller;

import java.util.Scanner;

public class Function {
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자(+, -, *, /) : ");
		char ch = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(ch) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			result = num1 / num2;
		} 
		}
		System.out.printf("%d %c %d = %d\n",num1,ch,num2,result);		
	}//과제3
	
	public void totalCalculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			int sum = 0 ;
			for(int i=num2; i <= num1 ; i++) {
				sum+=i;
			}
			System.out.printf("%d부터 %d까지 정수들의 합 : %d\n",num2,num1,sum);
		
		}else {
			int sum = 0 ;
			for(int i=num1; i <= num2 ; i++) {
				sum+=i;
			}
			System.out.printf("%d부터 %d까지 정수들의 합 : %d\n",num1,num2,sum);
		}//else
	}//과제4
	
	public void printProfile() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		
		System.out.print("성격 : ");
		String personality = sc.nextLine();
		
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n성별 : " + gender + "\n성격 : " + personality);
		
	}//과제5-3
	
	public void printScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		
		System.out.print("번 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		char result = 'F';
		
		if(score>=90) {
			result = 'A';
		}else if (score>=80) {
			result = 'B';
		}else if (score>=70) {
			result = 'C';
		}else if (score>=60) {
			result = 'D';
		}
		
		String student = "";
		if(gender=='M' || gender=='m') {
			student = "남학생";
		}else {
			student = "여학생";
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %c학점입니다.\n",grade,classNum,num,student,name,score,result);
		
	}//과제6-4
	
	public void printStarNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i = 1 ; i <= 5 ; i++) {
				for(int j =1 ; j<=i ; j++) {
					if(i==j) {
					System.out.print(j+"\n");
					}else {
						System.out.print('*');
					}
				}
			}
		}else {
			System.out.print("양수가 아닙니다.\n");
		}
		
	}//과제7-5
	
	public void sumRandom() {
		int random = (int)(Math.random()*100 +1);
		int sum = 0;
		
		for (int i = 1 ; i <= random ; i++) {
			sum += i;
		}
		System.out.println("1부터 " + random + "까지의 합 : " +sum);
		
	}//과제8-6
	
	public void exceptGugu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int su = 1 ; su <= 9 ; su++) {
				if(su%num == 0) {
					continue;
				}
				System.out.printf("%d * %d = %d\n",num,su,num*su);
			}
			
		}//if
		
	}//과제9-7
	
	public void diceGame() {
		
		while(true) {
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("주사위 두 개의 합을 맞혀보세요(2~12입력) : ");
			int user = sc.nextInt();
			sc.nextLine();
			
			int answer = dice1 + dice2;
			if(answer != user) {
				System.out.println("틀렸습니다.");
				continue;	
			}else {
				System.out.print("맞았습니다.\n주사위의 합 : " + answer + "\n계속 하시겠습니까?(y/n) : ");
				char ch = sc.nextLine().charAt(0);
				if(ch=='y') {
					continue;
				}else {
					System.out.print("종료합니다."); break;
				}
				
			}
			
		}
		
	
		
	}//

}
