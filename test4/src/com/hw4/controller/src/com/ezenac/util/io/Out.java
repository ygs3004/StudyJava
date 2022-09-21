package com.hw4.controller.src.com.ezenac.util.io;

// 출력에 관련된 클래스 - 처리에 관련된 처리
public class Out {

	// 전달받은 문자열 여러개를 한줄로 출력하고 줄바꿈시키는 메서드
	public static void printLine(String str, int cnt) {
		for(int i = 1; i <= cnt; i++) 
			System.out.print(str);
		System.out.println();
	}
	
	// 헤더 출력
	public static void header(String head) {
		System.out.println();
		System.out.println("<<< " + head + " >>>");
	}
	
	// 메뉴 출력 - 불특정 다수개(줄 수) 파라메터로 받기위해서 ...을 사용한다.
	// 넘겨 주는 문자열의 배열 또는 문자열, 문자열, ... -> 파라메터와 함께 사용하는 ... 은 맨 뒤에만 가능
	public static void menu(String ... menus) {
		printLine("=", 35);
		for(String menu : menus)
			System.out.println(menu);
		printLine("=", 35);
	}
	
	// 경고나 오류 출력
	public static void warning(String str) {
		printLine("$", 30);
		System.out.println(str);
		printLine("$", 30);
	}
	
}