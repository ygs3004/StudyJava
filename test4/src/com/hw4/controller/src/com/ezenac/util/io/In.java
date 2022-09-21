package com.hw4.controller.src.com.ezenac.util.io;

import java.util.Scanner;

// 접근제한자 - 보통 public. class - 클래스. 클래스이름(대문자로 시작)
// 클래스 - 초기화블록, 생성자, 변수, 메서드
// In(input) - 키보드로 입력을 담당하는 클래스 -> Scanner 관련된 변수. 메서드
public class In {
	
	// 변수 선언 = 초기값 : 명시적 초기화 - 접근제한자와 그외 제한자
	// 외부에서 접근 안됨.
	private static Scanner scanner = new Scanner(System.in);
	
	// 문자열을 키보드로 입력받는 메서드
	// In.getString(); - 키보드로 입력받는 메서드를 호출해서 입력한다.
	public static String getString() {/////
		return scanner.nextLine();
	}/////
	
	// 입력 받는 메시지를 출력하고 문자열을 입력받는 메서드 - 메시지가 입력되는 경우
	// In.getString("메뉴입력")
	public static String getString(String msg) {
		System.out.print(msg + " -> ");
		return getString();
	}
	
	// int 숫자를 입력 처리하는 메서드
	public static int getInt(String msg) {
		while(true) {
			try {
				// 문자열을 입력 받는다.
				String str = getString(msg);
				return Integer.parseInt(str);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자를 입력하셔야 합니다.");
			}
		}
	}

	// Long 타입 데이터를 받는 메서드 - 메시지 출력하고 데이터 받기
	public static long getLong(String msg) {
		// 정확한 데이터가 들어 오기 전까지 무한 반복
		while(true) {
			// 입력이 숫자가 아닌 것이 들어오면 예외 발생.
			try {
				// 문자열을 입력 받는다.
				String str = getString(msg);
				return Long.parseLong(str);
			} catch (Exception e) {
				System.out.println("숫자를 입력하셔야 합니다.");
			}
		}
	}
	
}
