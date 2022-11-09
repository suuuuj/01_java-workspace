package com.br.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.br.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		
		//<Music> 으로 설정 , 제네릭 설정하는 것을 권장(노란줄 안뜸@)
		ArrayList<Music>list = new ArrayList<Music>();
		
		list.add(new Music("Good bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		// list.add("끝"); 오로지 뮤직객체만 담길수 있음 (String이라서 오류)
		
		System.out.println(list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		System.out.println(list);
		
		list.set(0, new Music("술이 달다", "에픽하이"));
		System.out.println(list);
				
	
		List<Music>sub = list.subList(0, 2);
		list.addAll(sub);
		
		System.out.println(list);
	
		Music m = list.get(0);
		System.out.println(m);
		
		System.out.println(list.get(1).getTitle());  //따로 형변환 할 필요가 없음
		
		list.get(0).setTitle("밥이 달다");
		System.out.println(list);
		
		for(int i=0; i <list.size() ;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========================================");
		
		for( Music o : list) { // 변수 = lsit.get(0); => 변수 = list.get(1);
			System.out.println(o);
		}
		
		/*
		 *  * 제네릭<> 을 사용하는 이유
		 *  1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 *  2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환 하는 절차를 없앨수 있음
		 *  객체배열 문제 --> ArrayList로 바꿔보는 연습 해보기
		 */
			

	}

}
