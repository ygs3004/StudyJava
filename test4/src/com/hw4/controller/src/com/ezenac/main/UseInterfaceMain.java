package com.hw4.controller.src.com.ezenac.main;

import com.hw4.controller.src.com.ezenac.image.controller.ImageController;
import com.hw4.controller.src.com.ezenac.notice.controller.NoticeController;
import com.hw4.controller.src.com.ezenac.util.io.In;

public class UseInterfaceMain {

	
	public static void main(String[] args) {
				
		// 환영 인사
		System.out.println("******************************");
		System.out.println(" 컴텍 닷컴에 오신 것을 환영합니다.");
		System.out.println("******************************");
		System.out.println();
		
		while(true) {
			// 메인 타이틀
			System.out.println("*******************");
			System.out.println(" << Main Menu >>");
			System.out.println("*******************");
			
			// 메인 메뉴
			System.out.println("===================================");
			System.out.println("1. 공지사항  2. 이미지   3. 게시판");
			System.out.println("4. 질문답변  5. 회원관리  0. 종료");
			System.out.println("===================================");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 -> ");
			String menu = In.getString();
			
			// 메뉴 처리
			switch (menu) {
			
			case "1":
				// System.out.println("공지사항 처리");
				// 클래스 생성하고 메서드 호출한다.
				Execute.controller(new NoticeController());
				break;

			case "2":
				// System.out.println("이미지 처리");
				// 클래스 생성하고 메서드 호출한다.
				Execute.controller(new ImageController());
				break;
				
			case "3":
				System.out.println("게시판 처리");
				break;
				
			case "4":
				System.out.println("질문답변 처리");
				break;
				
			case "5":
				System.out.println("회원관리 처리");
				break;
				
			case "0":
				System.out.println(">>>> 프로그램 종료 >>>>>");
				System.exit(0);
				
			default:
				System.out.println(">>>>>  잘못된 메뉴를 선택하셨습니다.");
				break;
			}
			System.out.println();
		}
	}

}


