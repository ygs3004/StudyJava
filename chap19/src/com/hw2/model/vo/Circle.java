package com.hw2.model.vo;

public class Circle extends Point{

	private int radius;
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("(x, y) : ("+super.getX()+", "+super.getY()+")");
		System.out.println("면적 : " + Math.round(Math.PI*radius*radius*10)/10.0);
		System.out.println("둘레 : " + Math.round(Math.PI*2*radius*10)/10.0);
	}
	

}