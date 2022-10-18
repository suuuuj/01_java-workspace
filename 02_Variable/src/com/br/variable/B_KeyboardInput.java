package com.br.variable;
import java.util.Scanner;
public class B_KeyboardInput {
	
	public void inputScanner1() {
		
		/*
		 * 자바에서 제공하고 있는 java.util.Scanner 클래스의 메소드를 호출해서
		 * 사용자가 키보드로 입력한 값을 읽어들일 수 있음
		 * 
		 * 다른 클래스에 있는 메소드 호출 시에는 
		 * 1) 해당 클래스 생성
		 * 2) 메소드 호출
		 * 
		 */
		Scanner sc = new Scanner(System.in);  //System.out(출력)이랑 반대  sc.xxx();로 호출(입력)
		
		System.out.print("당신의 이름은 무엇입니까? : "); // : 뒤에 이름이 적히는 것을 유도해야기 때문에 print 사용
		// 사용자가 입력한 값을 문자열로 읽어들이는 메소드 (next(), nextLine())
		//String name = sc.next();  //실행시키면 여기서 대기상태 (하단에 강제종료버튼 활성화롸 확인-사용자가 입력할때까지 기다리는 것)
								  //콘솔창에 이름 작성하고 엔터치면 코드실행 & 출력 -> 강제종료버튼 회색
		String name = sc.nextLine();
						// next - 공백 이전까지의 문자열만 인식 Kim sujeong - Kim  
		                //nextLine - 사용자가 입력한 한 줄 모두를 읽어드림  Kim sujeong - Kim sujeong
		
		System.out.print("당신의 나이는 몇 살 입니까? (숫자만) : ");
		
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수값으로 읽어들임
		
		System.out.print("당신의 키는 몇 입니까? (cm단위, 소수점 첫째짜리까지만) : ");
	
		double height = sc.nextDouble(); //사용자가 입력한 값을 실수값으로 읽어들임
		
		// xxx님은 xx살이며, 키는 xxx.xcm 입니다. -> 모두 한 줄로 출력
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm 입니다.");
		
		// 맞지 않는 값 입력시 오류뜨면서 프로그램 종료(회색네모)
		
	}
	
	public void inputScanner2() {  // 메소드 명도 중복되면 오류남  
		                           //아까 설정한sc 변수는 해당 메소드 inputScanner1에서만 사용가능
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("이름 : ");
		String name = sc.nextLine(); //사용자가 적은 이름 문자열로 인식 // 사용자가 이름+엔터 입력하면 이름대입&엔터삭제
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); //엔터 사라지지 않음 (nextLine만 엔터 삭제)
		
		//추가!
		sc.nextLine(); // 입력버퍼에 남아있는 엔터를 지워주기 위해 실행
		
		System.out.print("주소 : ");     //기존의 남아있던 엔터 때문에 주소에는 " " 가 입력 되고 바로 키로 넘어가게 됨.
		String address = sc.nextLine();  //주소코드가 실행되기 이전에 남아있는 엔터를 제거해줘야함
		
		System.out.print("키 : ");
		double height = sc.nextDouble();  //엔터가 남아있는 상태. 
		                                  // 만약 더블 뒤에 문자열이 들어가는 질문이 있다면 다시 " " 빈 문자열이 담기게 됨 
		
		// xxx님은 xx살이며, 사는 곳은 xxxxx이고, 키는 xxx.xcm입니다.
		
		System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " 
		                   + address + "이고, 키는 " + height + "cm입니다.");
		// 딱히 오류는 안뜨지만 실질적으로 주소를 입출력할 수 없음 (address에 빈 문자열이 담겨있음.) 
		
		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm입니다.", name, age, address, height);
		
		
		/*
		 * sc.nextLine() : 값을 가져온 후 '엔터'를 비워주는 역할
		 * 그 외의 메소드(next, nextInt, ...) : 값을 가져온 후 '엔터'를 비워주지 않음
		 * 
		 * 그 외의 메소드 뒤에 nextLine()이 오게 될 경우 
		 * 버퍼에 남아있는 '엔터'를 nextLine()이 인식해서 사용자가 값을 입력했다고 인지
		 * -> 곧바로 읽어들임 " " & 다음 질문 나타남
		 * 
		 * 해결방법 : 그 외의 메소드 뒤에 sc.nextLine()이 오게 될 경우 버퍼에 남아있는 '엔터'를 비워주어야 함
		 * -> sc.nextLine()메소드 한 번 더 써주기
		 */
		
	}
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력 받을 때 -> sc.nextLine()
		// 정수값을 입력 받을 때 -> sc.nextInt() (Byte, Short, Long)
		// 실수값을 입력 받을 때 -> sc.naxtDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		// char gender = sc.nextChar();  //nextChar()라는 메소드는 존재하지 않음
		// 문자값을 읽어들이고자 할 경우 -> 그나마 연관있는 것은 문자열
		// 먼저 문자열로 읽어들인 후 특정 인덱스의 문자 하나만 추출    apple -> 각각을 인덱스라고 불림
		                                             //01234 -> 각각의 자리
		
		// char gender = sc.nextLine(); -> 오류 자료형이 잘못되었기때문
		char gender = sc.nextLine().charAt(0); // ex) f->f  여자->여
		// 문자열.charAt(뽑고자하는 인덱스);-> 해당 문자열로부터 해당 인덱스의 문자 하나를 추출   
				
		// 나이, 키
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age + "살");
		System.out.println("키 : " + height + "cm");
		
	}
	
	public void charAtTest() {
		String fruit = "apple"; // 5글자 (0-a 1-p 2-p 3-l 4-e)
		char ch = fruit.charAt(0);  //ch변수에 첫번째 글자 담기 'a' (자주 쓰게 된다면 변수에 담는게 좋음)
		System.out.println(ch); 
		System.out.println(fruit.charAt(1));  // 꼭 변수에 담아서 추출하지 않아도 바로 추출할 수 있음
		// 내가 추출할 수 있는 인덱스를 올바르게 적어야함
		// 존재하지 않는 5번째 인덱스를 추출하려고 하면 오류남
		
		//문자열에 부적절한 인덱스 접근시 -> StringIndexOutOfBoundsException 이라는 오류 발생
		
	}


	public void practice() {
		
		// 사용자에게 등록하고자 하는 상품명 (String), 브랜드명(String), 가격(Int), 
		// 제조국가 (String), 할인율(double), 등급(A~D)(char)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====상품등록화면=====");
		System.out.println("등록하고자 하는 상품의 정보를 입력하시오.");
		
		System.out.print("상품명 : ");
		String name = sc.nextLine();  //prouductName
		
		System.out.print("브랜드명 : ");
		String brand = sc.nextLine();
	
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine(); //버퍼에 남았는 엔터 비우기
		
		System.out.print("제조국가 : ");
		String made = sc.nextLine();  //national
		
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();  //discountRate
		
		//함정!
		sc.nextLine(); // 이 코드가 없다면 할인율 입력하고 남아있는 엔터가 등급까지 인식하여 오류가남
		
		System.out.print("등급(A~D) : ");
		char grade = sc.nextLine().charAt(0); //빈문자열을 읽어들였기 때문에 0번 인덱스 조차 없어 오류
		
		System.out.println("\n상품명 : " + name);
		System.out.println("브랜드명: " + brand);
		System.out.println("가격 : " + price + "원");
		System.out.println("제조국 : made in " + made);
		System.out.println("할인율 : " + discount * 100 + "%");
		// 20.0이 아닌 20%로 보여지길 원한다면 (int)(discount * 100) 해야함
		System.out.println("등급 : " + grade + "급");	
			
	}
	
	
	// 위에 문제 다시 해보기!
	public void practice2 ( ) { 
		// 사용자에게 등록하고자 하는 상품명 (String), 브랜드명(String), 가격(Int), 
		// 제조국가 (String), 할인율(double), 등급(A~D)(char)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		
		System.out.print("브랜드명 : ");
		String brand = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		System.out.print("제조국가 : ");
		String national = sc.nextLine();
		
		System.out.print("할인율 : ");
		double discountRate = sc.nextDouble();
		
		
		sc.nextLine();
		System.out.print("등급 : ");
		char grade = sc.nextLine().charAt(0);
		
		System.out.println("\n상품명 : " + name);
		System.out.println("브랜드명 : " + brand);
		System.out.println("가격 : " + price + "원");
		System.out.println("제조국가 : made in " + national);
		System.out.println("할인율 : " + (int)(discountRate * 100)  + "%" );
		System.out.println("등급 : " + grade + "급");
		
	}

	
	
}
