package com.hw1.run;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Cat;
import com.hw1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] a = new Animal[5];
		
		a[(int)(Math.random()*5)] = new Dog("메이", "푸들",8);
		a[(int)(Math.random()*5)] = new Cat("나비","먼치킨","서울","하얀색");
		
		for(int i = 0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
