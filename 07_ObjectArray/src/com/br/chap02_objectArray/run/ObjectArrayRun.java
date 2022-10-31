package com.br.chap02_objectArray.run;

import java.util.Scanner;

import com.br.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] phones = new Phone[3];  //객체 생성은 phone(); [3]는 크기가 3인 배열생성만 한것임
		
		//phones[0].setName("아이폰"); -> NullPointException -> phone[0]이 null 이기때문에 뜨는 오류
		//System.out.println(phones[0]); //null출력됨
		//System.out.println(phones); //-> 주소명 나옴
		
		phones[0] = new Phone();
		phones[0].setName("아이폰");
		phones[0].setBrand("사과");
		phones[0].setPrice(1400000);
		phones[0].setSeries("14pro");
		
		phones[1] = new Phone("은하수","샘송",1200000,"s20"); //매개변수 생성자를 사용하여 객체생성
		
		phones[2] = new Phone("벨벳폰","헬지",900000,"없음");
		
	//모든 정보 출력할때 반복문 사용 가능
		int sum=0;
		
		for (int i = 0; i<phones.length; i++) {
			//System.out.println(phones[i]);  // 각각의 인덱스 마다 담겨있는 주소값이 출력
			System.out.println(phones[i].information()); //-> information에 담겨있는 형식대로 값 출력되어 나옴 
			
			sum += phones[i].getPrice();
		}  // 총 가격과 평균
		System.out.println("총 가격 : " + sum + "원");
		System.out.println("평균가 : " + sum/phones.length/*(==3)*/ + "원");
		
		// 사용자에게 구매하고자하는 핸드폰 명을 입력받고 해당 핸드폰을 검색한 후 그 가격을 알려주기
		// 일치하지 않는 핸드폰이 없을 경우 ->"저희 가게에서 판매하는 핸드폰이 아닙니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 핸드폰명 : ");
		String buy = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i<phones.length/*3*/ ; i++) {
	
			if (buy.equals(phones[i].getName())) {
				System.out.println("당신이 구매하고자 하는 " + buy + " 핸드폰의 가격은 " + phones[i].getPrice() + "원 입니다." );
				count++;	
			}
		}
		if(count == 0) {
			System.out.println("저희 가게에서 판매하는 핸드폰이 아닙니다."); 
	
		}
	
	}

}
