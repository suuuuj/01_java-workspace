package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Cat;
import com.hw1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		/*
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("메이","푸들",6);
		a[1] = new Cat("잘생김","페르시안", "서울", "흰색");
		a[2] = new Cat("이쁨", "러시안블루", "집", "회색");
		a[3] = new Dog("보미", "푸들", 6);
		a[4] = new Dog("반야", "mix", 4);

 
		for(Animal arr : a) {
			arr.speak();
		}
		*/
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(new Dog("메이","푸들",6));
		list.add(new Cat("잘생김","페르시안", "서울", "흰색"));
		list.add(new Cat("이쁨", "러시안블루", "집", "회색"));
		list.add(new Dog("보미", "푸들", 6));
		list.add(new Dog("반야", "mix", 4));
		/*
		for(int i = 0 ; i<list.size();i++) {
			list.get(i).speak();
		}*/
		
		for(Animal a : list) { //변수= list.get(0); = 변수 = list.get(1);
			a.speak();
		}
	}

}
