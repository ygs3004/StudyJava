package com.hw4.controller.src.com.ezenac.main;

public class Execute {

	public static void controller(Controller cont) {
		System.out.println("--- Controller 실행 전 처리");
		System.out.println("권한 처리...");
		
		// 메서드 호출해서 실행
		cont.execute();
		
		System.out.println("--- Controller 실행 후 처리");
		System.out.println("메인으로 돌아갑니다.\n");
	}
	
}
