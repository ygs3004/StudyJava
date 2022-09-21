package com.hw4.controller.src.com.ezenac.image.controller;

import com.hw4.controller.src.com.ezenac.main.Controller;
import com.hw4.controller.src.com.ezenac.util.io.In;

public class ImageController implements Controller {

	// 실행을 위해서 메서드를 만든다.
	@Override
	public void execute() {
		
		while(true) {
			// 제목 출력
			System.out.println("=========");
			System.out.println(" 이미지");
			System.out.println("=========");
			// 메뉴 출력
			System.out.println("-------------------------------");
			System.out.println(" 1. 리스트   2. 이미지보기  3. 이미지등록");
			System.out.println(" 4. 이미지수정  5. 이미지삭제  0. 이전메뉴");
			System.out.println("-------------------------------");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 -> ");
			String menu =In.getString();
			// 메뉴 처리
			switch (menu) {
			case "1":
				System.out.println("리스트 처리");
				break;

			case "2":
				System.out.println("이미지보기 처리");
				break;
				
			case "3":
				System.out.println("이미지등록 처리");
				break;
				
			case "4":
				System.out.println("이미지수정 처리");
				break;
				
			case "5":
				System.out.println("이미지삭제 처리");
				break;
				
			case "0":
				System.out.println();
				// main으로 되돌아 간다.
				return;
				
			default:
				System.out.println(">>>>>>  잘못된 메뉴를 선택하셨습니다.");
				break;
			}
			System.out.println();
		}
		
	}
	
}
