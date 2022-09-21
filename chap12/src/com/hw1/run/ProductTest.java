package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		Product ssgnote9=new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product lgxnote5=new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product ktsnote3=new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		ssgnote9.information();
		lgxnote5.information();
		ktsnote3.information();
		System.out.println("======================================================");
	
		ssgnote9.setPrice(1200000);
		ssgnote9.setTax(0.05);
		
		lgxnote5.setPrice(1200000);
		lgxnote5.setTax(0.05);
		
		ktsnote3.setPrice(1200000);
		ktsnote3.setTax(0.05);
	
		ssgnote9.information();
		lgxnote5.information();
		ktsnote3.information();
		System.out.println("======================================================");

		
		ssgnote9.realPrice();
		lgxnote5.realPrice();
		ktsnote3.realPrice();
		
	}
		
}