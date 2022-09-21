package com.hw3.model.vo;

import com.hw3.controller.ProductController;

public class Product {
	
	private int pId;
	private String pName;
	private int price;
	private double tax;
	
	public Product() {ProductController.count++;}

	public Product(int pId, String pName, int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		ProductController.count++;
	}

	public String information() {
		return "제품번호 : "+pId+", 제품명 : "+pName+", 제품가격 : "+price+", 제품세금 : "+tax;
	}
	
	public int getpId() {return pId;}
	public void setpId(int pId) {this.pId = pId;}

	public String getpName() {return pName;}
	public void setpName(String pName) {this.pName = pName;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public double getTax() {return tax;}
	public void setTax(double tax) {this.tax = tax;}
	
}
