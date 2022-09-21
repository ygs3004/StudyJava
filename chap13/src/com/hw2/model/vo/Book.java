package com.hw2.model.vo;

public class Book {

	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book(){}
	
	public Book(String title, int price, double discountRate, String author){
		this.title=title;
		this.price=price;
		this.discountRate=discountRate;
		this.author=author;
	}
	
	public void information() {
		System.out.println(title +"\t"+ price +"\t"+ discountRate +"\t"+ author);
	}
	
	public void realPrice() {
		System.out.println("도서명 = "+title);
		System.out.println("할인된 가격 = "+(int)(price-(price*discountRate))+"원");
	}
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	public double getDiscountRate() {return discountRate;}
	public void setDiscountRate(double discountRate) {this.discountRate = discountRate;}
	
	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}
	
	
}
