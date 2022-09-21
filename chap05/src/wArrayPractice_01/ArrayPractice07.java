package wArrayPractice_01;

import java.util.Scanner;

//사용자가 입력한 값이 배열에 있는지 검색하여
//있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를 출력하세요.
//단. 치킨 메뉴가 들어가 있는 배열은 본인 스스로 정하세요.

public class ArrayPractice07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String[] chicken= {"황금올리브","뿌링클","슈프림","양념","후라이드","매콤","치즈","간장"};
		System.out.println("치킨 이름을 입력하세요.");
		String order=sc.nextLine();
		boolean check=false;
		
		for(int i=0; i<chicken.length; i++) {
			if(chicken[i].equals(order)) {
				check=true;
				break;
			}
		}
		
		if(check) {
			System.out.println(order+"치킨 배달 가능");
		}else
			System.out.println("치킨은 없는 메뉴입니다.");
		
		sc.close();
		
	}
}