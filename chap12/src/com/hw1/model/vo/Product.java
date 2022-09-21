package com.hw1.model.vo;

public class Product {
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	public Product(){};
	
	public Product(String productId, String productName,String productArea, int price, double tax){
		this.productName=productName;
		this.productId=productId;
		this.productArea=productArea;
		this.price=price;
		this.tax=tax;
	}
	
	public void information() {
		System.out.println(productId+productName+"\t"+productArea+"\t"+price+"\t"+tax);
	}

	public void realPrice() {
		System.out.println("상품명 = "+productName);
		System.out.println("부가세 포함 가격 = "+(int) (price+(price*tax))+"원");
	}
	
	public String getProductId() {return productId;}
	public void setProductId(String productId) {this.productId = productId;}

	public String getProductName() {return productName;}
	public void setProductName(String productName) {this.productName = productName;}

	public String getProductArea() {return productArea;}
	public void setProductArea(String productArea) {this.productArea = productArea;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public double getTax() {return tax;}
	public void setTax(double tax) {this.tax = tax;}
	
}
