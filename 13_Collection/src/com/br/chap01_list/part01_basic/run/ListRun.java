package com.br.chap01_list.part01_basic.run;

import java.util.ArrayList;

import com.br.chap01_list.part01_basic.model.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		
		//ArrayList 이용
		
		ArrayList list = new ArrayList(3); //크기 지정할수도 있고 안할수도 있음 (안한다면 기본적으로 크기 10짜리 배열 생성됨
		System.out.println(list/*.toString*/); // 출력하면 [] -> 안에 아무것도 없음! (비어있는 상태) 확인하고 싶다면 .toString 붙여 확인
		
		// E--> Element : 리스트에 담길 데이터들(요소)
		
		//1. add(E e) : 리스트의 끝에 전달된 데이터를 추가시켜주는 메소드
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		
		list.add("끝"); //내가 지정한 크기보다 더 많이 , 다른 타입의 값을 입력을 한다면,,,?
		// 장점1. 크기의 제약 없음
		// 장점3. 여러타입 보관 가능
		
		System.out.println(list);  // list의 특징: 순서유지하면서 담김(0번 인덱스부터 차곡차곡)
		//[Music [title=Good Bye, artist=박효신], Music [title=이 밤, artist=양다일], Music [title=잊혀지다, artist=정키], 끝]
		
		// 2. add(int index, E e) : 해당 인덱스 위치에 데이터를 추가시켜주는 메소드 
		list.add(1, new Music("진심이 담긴 노래","케이시"));
		// 장점2. 중간 위치에 데이터 추가시 복잡한 알고리즘 직접 구현 안함
		
		System.out.println(list); // 기존의 데이터가 뒤로 밀려나면서 인덱스 개수도 3->4가 됨
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터 삭제시켜주는 메소드
		list.remove(1);
		System.out.println(list);
		
		// 4. set(int index, E e): 해당 인덱스위치에 데이터를 새로이 전달된 e로 변경시켜주는 메소드
		list.set(0,  new Music("술이 달다","에픽하이"));
		
		System.out.println(list);
		
		// 5. size() : 리스트의 사이즈 반환시켜주는 메소드
		System.out.println("리스트의 사이즈 : " + list.size());
		System.out.println("리스트의 마지막 인덱스 수 : " + (list.size()-1));
		
		// 6. get(int index) : E  => 해당 인덱스 위치의 객체를 반환시켜주는 메소드
		Music m = (Music)list.get(0); //-> 부모->자식 형변환 : 강제 형변환 Object->Music
		String s = (String) list.get(3); 
		
		System.out.println(m);
		System.out.println(s);
		
		System.out.println(list.get(1)); //뮤직객체.  대입되는게 아니니 강제형변환 필요없이 바로 출력
		System.out.println(((Music)list.get(1)).getTitle()); //기본 반환형이 Object 이기때문에 downCasting해줘여함, 강제형변환 먼저, 그다음 뮤직클래스의 getTitle필드 값 호출 
		
		
	}
	
	

}
