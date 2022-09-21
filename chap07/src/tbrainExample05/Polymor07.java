package tbrainExample05;

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}

class Tv2 extends Product2{
	
	Tv2(){
		super(100);
	}
	
	@Override
	public String toString (){
		return "Tv2";
	}
	
}

class Audio extends Product2{
	Audio(){
		super(50);
	}
	
	@Override
	public String toString (){
		return "Audio";
	}
}

class Computer2 extends Product2{
	
	Computer2(){
		super(200);
	}
	
	@Override
	public String toString (){
		return "Computer2";
	}
}

class Buyer2{
	int money=1000;
	int bonusPoint;
	int itemCount=0;
	Product2[] item=new Product2[10];
	//
	void buy(Product2 product) {
		if(money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		this.money-=product.price;
		this.bonusPoint+=product.bonusPoint;
		item[itemCount]=product;
		itemCount++;
		
		System.out.println(product+"을/를 구입하셨습니다.");
			
	}
	
	// 구매한 물품에 대한 정보
	void summary() {
		// 구입한 물품의 가격 합계
		int sum=0; 
		// 구입한 물품 목록
		String itemList="";
		
		for(int i=0; i<itemCount; i++) {
			itemList += item[i]+", ";
			sum+=item[i].price;
		}
		
		/*
		for(int i=0; i<item.length; i++){
			if(item[i]==null)
			break;
			
			itemlist+= item[i]+", "
			sum+=item[i].price;
		}
		 */
		
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
	
}

public class Polymor07 {

	public static void main(String[] args) {
		Buyer2 b=new Buyer2();
		Tv2 tv=new Tv2();
		Computer2 com=new Computer2();
		Audio audio=new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
	}
}