package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		Circle[] c = new Circle[2];
		Rectangle[] r = new Rectangle[2];
		
		c[0] = new Circle (1,2,3);  
		c[1] = new Circle(3,3,4);
		
		r[0] = new Rectangle(-1,-2,5,2);
		r[1] = new Rectangle(-2,-5,2,8);
		
		System.out.print("==== circle ====\n");
		
//		for (int i = 0; i<c.length;i++) {
//			c[i].draw();
//		}
		
		//향상된 for문
		for(Circle cir: c) {
			cir.draw();
		}
		
		System.out.print("==== rectangle ====\n");
		for(Rectangle rec : r) {
			rec.draw();
		}
		
	}

}
