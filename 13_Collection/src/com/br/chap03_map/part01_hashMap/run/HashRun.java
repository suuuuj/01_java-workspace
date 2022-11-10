package com.br.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.br.chap03_map.part01_hashMap.model.vo.Snack;

public class HashRun {

	public static void main(String[] args) {

		
		HashMap<String,Snack> hm = new HashMap<>();
		// map의 특징 : 키값과 데이터(value) 세트로 저장, 순서 유지 안됨, key값은 중복안됨
		
		//1. put(K key, V value) : 키 밸류 세트로 추가시켜주는 메소드 //중요
		hm.put("다이제",  new Snack("초코맛",1500));
		hm.put("칸초", new Snack("단맛",600));
		hm.put("새우깡",new Snack("짠맛",500));
		hm.put("포테토칩",new Snack("짠맛",500));
		
		System.out.println(hm); //{키=밸류, 키=밸류 ...}
		// 저장 순서 유지 안됨 / 밸류값이 중복돼도 키값이 중복되지 않기 떄문에 저장이 잘 됨
		
		hm.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가하는 경우 value값이 덮어씌워짐 (중복된 키값은 공존할 수 없음)
		//키값은 식별자 같은 개념
		
		System.out.println(hm);
		
		// 2. get(Object key) : v (Object) => 컬렉션에서 해당 키값을 가지는 Value 값을 반환해주는 메소드 //중요
		Snack s = (Snack) hm.get("다이제");
		System.out.println(s);
		
		// 3. size() : 컬렉션에 담겨있는 객체들의 개수 반환
		System.out.println("몇 개 : " + hm.size());
		
		
		// 4. replace(K key, V value) -> 컬렉션에서 해당 키값을 찾아서 다시 전달한 Value값으로 수정해주는 메소드
		hm.replace("포테토칩", new Snack("겁나 짠맛",1000));
		System.out.println(hm);
		
		// 5. remove(Object key) : 컬렉션에서 해당 키값 찾아서 그 키밸류 세트를 삭제시켜주는 메소드
		hm.remove("포테토칩");
		System.out.println(hm);
		
		//-------------------------------------------------------------------------------------
		
		//map공간에 담긴 모든 키 밸류 세트 다 접근 가능
		// for( : hm ) { } 적용할 변수가 없기때문에 for each문(향상된 for문) 반복문 안됨.
		
		//ArrayList에 옮겨 담기 안됨
		//ArrayList list = new ArrayList(hm);
		
		//Iterator 반복자 이용하면 됨
		//Iterator it = hm.iterator(); // 곧바로 iterator 메소드 호출 못함
		
		//Map=> Set => Iterator
		
		// 1. keySet()이용
		// 1) hm.keyset() :set
		Set keySet = hm.keySet(); // 키값들만 들어있는 set계열
		
		//2)keySet.iterator() : Iterator
		Iterator<String> itKey = keySet.iterator();
		
		//3) 반복문 이용
		while(itKey.hasNext()) {
			String key = /*(String)*/itKey.next();
			Snack value = /*(Snack)*/hm.get(key);
			System.out.println(key + "=" + value);
		
		}
		
		System.out.println("===============================================================");
		// 2. entrySet() 이용 // 1 or2방법 사용
		// 1) 
		Set<Entry<String,Snack>> entrySet = hm.entrySet();
		
		//2)
		Iterator<Entry<String,Snack>> itEntry = entrySet.iterator();
		
		//3)
		while(itEntry.hasNext()) {
			Entry <String, Snack> entry = itEntry.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
	}

}
