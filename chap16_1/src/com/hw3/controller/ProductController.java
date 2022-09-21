package com.hw3.controller;

import java.util.Scanner;
import com.hw3.model.vo.Product;

public class ProductController {
	Product[] pro=null;
	{pro = new Product[10];}
	public static int count;
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		boolean program = true;
		do {
			System.out.println("========제품 관리 메뉴========");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("번호 입력 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
				case 1:
					productInput();
					break;
				case 2:
					productPrint();
					break;
				case 9:
					program = false;
					break;
				default:
					System.out.println("없는 번호입니다. 다시 입력해주세요");
					System.out.println();
			}
		}while(program);
		
	}
	
	
	public void productInput() {
			
		System.out.print("제품번호 : ");
		int pId=sc.nextInt();
		sc.nextLine();
		System.out.print("제품명 : ");
		String pName=sc.nextLine();
		System.out.print("제품가격 : ");
		int price=sc.nextInt();
		System.out.print("제품세금 : ");
		double tax=sc.nextDouble();
		pro[count]=new Product(pId, pName, price, tax);
		System.out.println();
	}
	
	public void productPrint() {
		for(int i=0; i<count; i++) 
			System.out.println(pro[i].information());
		System.out.println();
	}
	
	
}