package com.hw2.model.vo;

public class Rectangle extends Point {
	
	private int width;
	private int height;
	
	public Rectangle() {}

	public Rectangle(int x, int y, int width, int height) {
		super();
		super.setX(x);
		super.setY(y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : "+(width*height));
		System.out.println("둘레 : "+(2*(width+height)));
	}
	
}
