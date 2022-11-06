package com.hw1.run;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Cat;
import com.hw1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] a = new Animal[5];
		
		a[0] = new Dog("메이","푸들",6);
		a[1] = new Cat("잘생김","페르시안", "서울", "흰색");
		a[2] = new Cat("이쁨", "러시안블루", "집", "회색");
		a[3] = new Dog("개", "시베리안", 30);
		a[4] = new Dog("큰개", "차우차우", 40);

 
		for(Animal arr : a) {
			arr.speak();
		}
		
		
	}

}
