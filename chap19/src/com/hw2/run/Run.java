package com.hw2.run;

import com.hw2.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Circle[] cir = new Circle[2]; 	
		Rectangle[] rec = new Rectangle[2];
		
		cir[0] = new Circle(1, 2, 3);
		cir[1] = new Circle(3, 3, 4);
		rec[0] = new Rectangle(-1, -2, 5, 2);
		rec[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("=====circle=====");
		for(Circle circle : cir) {
			circle.draw();
		}
		
		System.out.println("=====rectangle=====");
		for(Rectangle rectangle : rec) {
			rectangle.draw();
		}
	}

}
