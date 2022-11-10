package com.br.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.br.chap02_set.part01_hashSet.model.vo.Student;

public class HashSetRun {

	public static void main(String[] args) {
		
		//set 계열 특징 : 데이터만 저장가능 / 순서 유지 안함 / 중복객체 허용 안됨
		
		HashSet hs1 = new HashSet();
		
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요."));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1); 
		// [안녕하세요., 여러분, 반갑습니다.] ->순서 유지 안되고 중복된 데이터(동일객체)보관 불가능
		// 배열처럼 생겼지만 배열개념,인덱스 없음
		// 매번 새로운 데이터를 추가할 때마다 동일객체(hashCode값이 일치한지, equals 비교시 true인지)인지 판단함  
		
		HashSet<Student> hs2 = new HashSet<>();
	
		hs2.add(new Student("공유",43,100));
		hs2.add(new Student("김말똥", 26, 40));
		hs2.add(new Student("홍길동",24,20));
		hs2.add(new Student("공유",43,100));
		//hs2.add("안녕");
		//hs2.add(10);  //타입의 제한이 없음
		
		//주소값은 다 다르지만 1,4의 필드값이 같으므로 동일객체라고 봐야함
		
		System.out.println(hs2); //중복제거 되지 않음 => 동일객체로 판단이 안되고 있기 때문 
		// * 동일객체 : 각 객체마다 hashCode 결과가 일치, equals비교시 true여야함
		
		//Students 에 equals() 오버라이딩 => "실제 각 필드에 담긴 데이터"들이 다 일치하면 true/ 그게 아니면 false
		//Students에 hashCode() 오버라이딩 => "실제 각 필드에 담긴 데이터"들이 일치하면 동일한 10진수 반환
		
		System.out.println(new Student("공유",43,100)	.hashCode());
		System.out.println(new Student("공유",43,100)	.hashCode());//주소값이 달라 hashCode값도 다름 // 오버라이딩 후 hashCode값 일치해짐
		System.out.println(new Student("공유",43,100).equals(new Student("공유",43,100))); //false  (equals는 주소값을 비교) // 오버라이딩 후 true
		
		System.out.println(hs2); // 중복 사라지고 3개로 바뀜
		//System.out.println(hs2.get(1)' -> 인덱스의 개념도 없고 get메소드 자체도 없음(== 한 객체만 뽑을 수 없음)
		
		//단, HashSet에 담긴 모든 객체들에 순차적으로 접근하는건 가능
		// 방법1. for문 사용가능(단, 향상된 for문으로만 가능)
		for(Student s : hs2) {
			 System.out.println(s);
		}
		System.out.println("======================================");
		// 방법 2.ArrayList에 옮겨 담은 후 ArratList 반복문 돌려서 출력
		//  >>ArrayList에 옮겨 담기 1.addAll메소드 이용
		
		ArrayList<Student> list1 = new ArrayList<>();
		list1.addAll(hs2);
		
		// >>ArrayList에 옮겨 담기 2. ArrayList 생성시 통채로 추가하기
		ArrayList<Student> list2 = new ArrayList<>(hs2);
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("======================================");
		// 방법 3. Iterator 반복자를 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator(); // hs2에 담겨있는 객체들을 => Iterator에 담는 과정
		
		while(it.hasNext()){ //it 공간으로부터 뽑을 객체가 있을경우
			Student s = it.next();
			System.out.println(s);//Iterator안에서 완전 뽑아오는 것이라서 사라지게 됨
		}
		
		// StringTokenizer 와 비슷한 개념
		
		it.next(); //java.util.NoSuchElementException- 더이상의 요소가 없습니다. (텅비었다는 뜻)
		
		
		
		
		
		
		
		
		
		
	}

}
