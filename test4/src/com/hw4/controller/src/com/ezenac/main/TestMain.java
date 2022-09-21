package com.hw4.controller.src.com.ezenac.main;

import com.hw4.controller.src.com.ezenac.util.io.In;

public class TestMain {

	public static void main(String[] args) {

		int age = In.getInt("나이 입력");
		
		System.out.println("나이는 " + age + "입니다.");
		
		long no = In.getLong("글번호 입력");
		
		System.out.println("보여줄 글번호 : " + no);
		
	}

}
