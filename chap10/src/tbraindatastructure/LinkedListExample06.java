package tbraindatastructure;

import java.util.Iterator;
import java.util.LinkedList;

class CartItem{
	String code;
	int num;
	int price;
	
	CartItem(String code, int num, int price){
		this.code=code;
		this.num=num;
		this.price=price;
	}
}

public class LinkedListExample06 {

	public static void main(String[] args) {
		LinkedList<CartItem> list=new LinkedList<CartItem>();
				
		list.add(new CartItem("50001",2,2000)); 
		list.add(new CartItem("73505",1,7000));
		list.add(new CartItem("88102",3,25000));
		
		System.out.println("code number price");
		System.out.println("------------------");
		
		//향상된 for문으로 출력
		for(CartItem cart:list) {
			//System.out.println(cart.code+" "+cart.num+" "+cart.price);
			System.out.printf("%5s %3d %8d %n", cart.code, cart.num, cart.price); // 숫자 => 자릿수, 오른쪽 정렬함, s:문자,d:정수,n:줄바꿈
		/*
		Iterator<CartItem> itr=list.iterator();
		
		while(itr.hasNext()) {
			CartItem cart=itr.next();
			System.out.println(cart.code+" "+cart.num+" "+cart.price);
		*/

		}
	}

}