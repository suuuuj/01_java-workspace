package com.br.chap02_abstractAndInterface.part01_abstract.run;

import com.br.chap02_abstractAndInterface.part01_abstract.model.vo.BasketBall;
import com.br.chap02_abstractAndInterface.part01_abstract.model.vo.FootBall;
import com.br.chap02_abstractAndInterface.part01_abstract.model.vo.Sports;

public class AbstractRun {

	public static void main(String[] args) {
		
		// Sports s = new Sports();  //instantiate - 객체화하다
		// 추상클래스로는 객체생성 불가(미완성클래스이기떄문에)
		//Sports s;  //객체생성이 안될뿐이지 레퍼런스로는 사용가능 (new 사용x)
		Sports s = new BasketBall();  //다형성은 적용가능
		
		Sports[] arr = new Sports[2];
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule(); //오버라이딩된 메소드가 찾아져서 (동적바인딩) 출력된것
			
		}
		
		//향상된 for문
		for( Sports a : arr ) { //Sports a => arr[0]; =>Sports a = arr[1];
			a.rule();
			
		}
		
		/*
		 *  * 추상메소드 
		 *  - 미완성 된 메소드 몸통부({})가 구현되어 있지 않은 메소드
		 *  - 자식클래스에서 해당 메소드를 오버라이딩하여 완성시켜야 됨
		 *  
		 *  * 추상 클래스
		 *  - 미완성된 클래스
		 *  - 객체 생성 불가(단, 레퍼런스로는 사용 가능)
		 *  - 일반멤버변수 + 일반메소드 [+ 추상메소드]
		 *    => 추상메소드 생략가능
		 *  
		 *  * 추상메소드가 굳이 없어도 추상클래스로 선언가능 ->abstract class
		 *    언제 사용?
		 *    >> 개념적 : 단지 이 클래스가 미완성된 클래스다 라는것을 부여할 목적
		 *    >> 프로그래밍적 : 객체 생성이 불가하게끔  하고자 할 때
		 *    
		 *  * 추상메소드가 존재하는 추상클래스를 쓰는 이유
		 *  	부모클래스에 추상메소드가 있을경우 
		 *  	자식클래스에서 강제로 오버라이딩 하여 동일한 패턴의 메소드를 가지게 됨!
		 *  
		 *  => 자식클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할때
		 *  	=> 메소드 통일성 확보
		 *  	=> 표준화 됨
		 */
		
		
		
	}

}
