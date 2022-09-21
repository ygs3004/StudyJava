package tbraindatastructure;

import java.util.LinkedList;

public class LinkedListExample02 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("포도");
		list.add("포도");
		list.add("포도");
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위");
		list.set(3, "오렌지");
		list.remove(1);

		int index1=list.indexOf("포도"); // 해당하는 내용의 인덱스 위치(첫번째)
		System.out.println("첫번째 포도 : "+index1);
		int index2=list.lastIndexOf("포도");; // 해당하는 내용의 마지막 인덱스 위치
		System.out.println("마지막 포도 : "+index2);
		

	}

}
