package com.hw4.controller;

import java.util.Arrays;
import java.util.Comparator;

import com.hw4.model.vo.Member;

public class MemberController {
	public static final int mSize = 10;
	private static int memberCount=5;
	private Member[] mem = new Member[mSize];
	
	public MemberController(){
		mem[0]=new Member("user01","pass01","김유신",20,'M',"kim123@naver.com");
		mem[1]=new Member("user02","pass02","이순신",60,'M',"lee2@naver.com");
		mem[2]=new Member("user03","pass03","유관순",17,'F',"yoo@hanmail.net");
		mem[3]=new Member("user04","pass04","연개소문",57,'M',"yeon01@gmail.com");
		mem[4]=new Member("user05","pass05","신사임당",45,'F',"shin89@naver.com");
		}
	
	public Member[] getMem() {return mem;}
	public static int getMemberCount() {return memberCount;}
	
	public Member checkId(String userId) {
		for(int i=0; i<memberCount; i++) {
			if(userId.equals(mem[i].getUserId())) {
				return mem[i];
			}
		}
		return null;
	}
	
	public void insertMember(Member m) {
		System.out.println("성공적으로 회원 등록이 되었습니다.");
		System.out.println();
		mem[memberCount] = m;
		memberCount++;
	}
	
	public Member searchMember(int menu, String search) {
		switch(menu) {
			case 1: // 아이디로 검색
				for(int i=0; i<memberCount; i++) {
					if(search.equals(mem[i].getUserId())) {
						return mem[i];
					}
				}
				break;

			case 2: //이름으로 검색
				for(int i=0; i<memberCount; i++) {
					if(search.equals(mem[i].getName())) {
						return mem[i];
					}
				}
				break;
			
			case 3: //이메일로 검색
				for(int i=0; i<memberCount; i++) {
					if(search.equals(mem[i].getEmail())) {
						return mem[i];
					}
				}
				break;

			default:
				System.out.println("번호를 잘못 입력 하셨습니다");
				return null;
		}
		return null;
	}
	
	public void updateMember(Member m, int menu, String update) {
		switch(menu) {
			case 1://비밀번호 수정
				m.setUserPwd(update);
				break;
				
			case 2://이름 수정
				m.setName(update);
				break;
				
			case 3://이메일 수정
				m.setEmail(update);
				break;
				
			default:
				System.out.println("번호를 잘못 입력하셨습니다");
				break;
		}
	}
	
	public void deleteMember(String userId) {
		@SuppressWarnings("unused")
		Member m=checkId(userId);
		m=null;
		memberCount--;
		System.gc();
	}
	
	public Member[] sortIdAsc() { 
		Arrays.sort(mem, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
                if (m1 == null && m2 == null) {
                	return 0;
                }else if (m1  == null) {
                	return 1;
                }else if (m2 == null) {
                	return -1;
                }else if(m1.getUserId().compareTo(m2.getUserId())>0) {
                	return 1;
                }else if(m1.getUserId().compareTo(m2.getUserId())==0) {
            		return 0;
            	}else if(m1.getUserId().compareTo(m2.getUserId())<0) {
                	return -1;
                }
				return 0;
			}
		});
		return mem;
	}
	
	public Member[] sortIdDesc() { 
		Arrays.sort(mem, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
                if (m1 == null && m2 == null) {
                	return 0;
                }else if (m1  == null) {
                	return 1;
                }else if (m2 == null) {
                	return -1;
                }else if(m1.getUserId().compareTo(m2.getUserId())>0) {
                	return -1;
                }else if(m1.getUserId().compareTo(m2.getUserId())==0) {
            		return 0;
            	}else if(m1.getUserId().compareTo(m2.getUserId())<0) {
                	return 1;
                }
				return 0;
			}
		});
		return mem;
	}	
	
	public Member[] sortAgeAsc() { 
		Arrays.sort(mem, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
                if (m1 == null && m2 == null) {
                	return 0;
                }else if (m1  == null) {
                	return 1;
                }else if (m2 == null) {
                	return -1;
                }else if(m2.getAge()>m1.getAge()) {
                	return -1;
                }else if(m2.getAge()==m1.getAge()) {
                	return 0;
            	}else if(m2.getAge()<m1.getAge()) {
                	return 1;
                }
				return 0;
			}
		});
		return mem;
	}
	
	public Member[] sortAgeDesc() { 
		Arrays.sort(mem, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
                if (m1 == null && m2 == null) {
                	return 0;
                }else if (m1  == null) {
                	return 1;
                }else if (m2 == null) {
                	return -1;
                }else if(m2.getAge()>m1.getAge()) {
                	return 1;
                }else if(m2.getAge()==m1.getAge()) {
                	return 0;
            	}else if(m2.getAge()<m1.getAge()) {
                	return -1;
                }
				return 0;
			}
		});
		return mem;
	}
	
	public Member[] sortGenderDesc() { 
		Arrays.sort(mem, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
                if (m1 == null && m2 == null) {
                	return 0;
                }else if (m1  == null) {
                	return 1;
                }else if (m2 == null) {
                	return -1;
                }else if(m2.getGender()>m1.getGender()) {
                	return 1;
                }else if(m2.getGender()==m1.getGender()) {
                	return 0;
            	}else if(m2.getGender()<m1.getGender()) {
                	return -1;
                }
				return 0;
			}
		});
		return mem;
	}
	
	/*
	public Member[] sortIdAsc(){
		Member[] copy = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount); //System.arraycopy(mem, mSize, mem, memberCount, mSize);
		
		for(int i=0; i<copy.length; i++){
			for(int j=0; j<1; j++){
				if(copy[i].getUserId().compareTo(copy[j].getUserId()>0){
					Member temp = copy[j] 
					copy[j]= copy[i]
					copy[j] = temp;
				}
			}
		}
		return copy;
	}
	 */

}