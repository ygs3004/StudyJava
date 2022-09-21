package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		boolean program = true;
		while(program) {
			System.out.println("========회원 관리 메뉴========");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.print("번호 입력 : ");
			int menu = sc.nextInt();
			System.out.println();
			sc.nextLine();
			switch(menu) {
				case 1:
					insertMember();
					break;
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAllMember();
					break;
				case 6:
					sortMember();
					break;
				case 9:
					program=false;
					break;
			}
		}

		
	}
	
	public void insertMember() {
		if(MemberController.getMemberCount()>=MemberController.mSize) {
			System.out.println("회원목록이 가득차서 더 이상 가입할 수 없습니다.");
			return;
		}
		System.out.print("생성하고자 하는 ID를 입력해주세요.");
		String userId=sc.nextLine();
		Member alreadyMember = mc.checkId(userId);

		if(!(alreadyMember == null)) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			System.out.println();
		}else {
			System.out.print("비밀번호 : ");
			String userPwd=sc.nextLine();
			System.out.print("이름 : ");
			String name=sc.nextLine();
			System.out.print("나이 : ");
			int age=sc.nextInt();
			sc.nextLine();
			boolean checkGender=true;
			char gender = 'M';
			while(checkGender) {
				System.out.print("성별(M/F) : ");
				gender=sc.nextLine().toUpperCase().charAt(0);
				if(gender=='M' || gender=='F') {
					checkGender=false;
					break;
				}
				System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
			}
			System.out.print("이메일 : ");
			String email=sc.nextLine();
			
			Member m = new Member(userId, userPwd, name, age, gender, email);
			mc.insertMember(m);
		}
		
	}
	
	public void searchMember() {
		while(true) {
			System.out.println("========회원 정보 검색========");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.println();
			sc.nextLine();
			if(menu==9) return;
			
			System.out.print("검색 내용 : ");
			String search =sc.nextLine();
			
			Member searchMember = mc.searchMember(menu, search);
			if(searchMember == null) {
				System.out.println("검색된 결과가 없습니다.");
				System.out.println();
			}else {
				System.out.println(searchMember.information());
			}
		}
	}
	
	public void updateMember() {
		while(true) {
			System.out.println("========회원 정보 수정========");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.println();
			sc.nextLine();
			if(menu==9) return;
			
			System.out.print("변경할 회원 아이디 : ");
			String userID = sc.nextLine();
			Member checkId = mc.checkId(userID);
			if(checkId==null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			}else {
				System.out.println("기존 정보");
				System.out.println(checkId.information());
				System.out.print("변경 내용 : ");
				String update = sc.nextLine();
				mc.updateMember(checkId, menu, update);
				System.out.println("회원의 정보가 변경되었습니다.");
				System.out.println();
			}
		}

	}
	
	public void deleteMember() {
		System.out.print("삭제할 회원의 아이디 : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		if(m==null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}else {
			System.out.println(m.information());
			System.out.print("정말 삭제하시겠습니까?(y/n) : ");
			char delete = sc.nextLine().toUpperCase().charAt(0);
			if(delete=='Y') {
				mc.deleteMember(userId);
				System.out.println("회원의 정보가 삭제되었습니다.");
			}else {
				System.out.println("삭제되지 않았습니다.");
			}
		}
	}
	
	public void printAllMember() {
		for(int i=0; i<MemberController.getMemberCount(); i++) {
			System.out.println(mc.getMem()[i].information());
		}
	}
	
	public void sortMember() {
		@SuppressWarnings("unused")
		Member[] sortMem = null;	
		
		while(true) {
			System.out.println("========회원 정보 정렬========");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			System.out.println();
			int menu = sc.nextInt();
			sc.nextLine();
			if(menu == 9) return;
			
			switch(menu) {
				case 1:
					sortMem = mc.sortIdAsc();
					break;
					
				case 2:
					sortMem = mc.sortIdDesc();
					break;
					
				case 3:
					sortMem=mc.sortAgeAsc();
					break;
					
				case 4:
					sortMem=mc.sortAgeDesc();
					break;
					
				case 5:
					sortMem=mc.sortGenderDesc();
					break;
					
				default:
					System.out.println("번호를 잘못 입력하셨습니다.");
					break;
			}
		}
	}
}