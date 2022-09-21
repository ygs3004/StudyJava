package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {
	public static void main(String[] args) {
	Book book1 = new Book();
	Book book2 = new Book("자바의 정석", 20000, 0.2, "윤상섭");
	
	book1.information();
	book2.information();
	System.out.println("==================================");

	System.out.println("수정된 결과 확인");
	book1.setTitle("C언어");
	book1.setPrice(30000);
	book1.setDiscountRate(0.1);
	book1.setAuthor("홍길동");
	book1.information();
	System.out.println("==================================");
	
	book1.realPrice();
	book2.realPrice();
	
	}
	
}