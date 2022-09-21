package tbraindatastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample05 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10); // auto Boxixng, 10이 자동으로 객체로 저장
		list.add(20);
		list.add(30);
		
		Iterator<Integer> itr=list.iterator();
				
		while(itr.hasNext()) {
			int num=itr.next(); // auto unBoxing, 객체를 자동으로 정수로 변환
			System.out.println(num);
		}

	}

}