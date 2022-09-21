package tbrainExample05;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0); // 보너스 점수는 제품가격의 10%
	}
}

class Tv extends Product{
	
	Tv(){
		super(100);
	}
	
	@Override
	public String toString (){
		return "TV";
	}
	
}

class Computer extends Product{
	
	Computer(){
		super(200);
	}
	
	@Override
	public String toString (){
		return "Computer";
	}
}

class Buyer{
	int money=1000;
	int bonusPoint;
	
	void buy(Product product) {
		if(money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
			this.money-=product.price;
			this.bonusPoint+=product.bonusPoint;
			System.out.println(product+"을/를 구입하셨습니다.");
	}
}

public class polymo06 {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		Tv tv=new Tv();
		Computer com=new Computer();

		b.buy(tv);
		b.buy(com);
		
		System.out.println("현재 남은 돈은 "+b.money+"만원입니다.");
		System.out.println("현내 보너스 점수는 "+b.bonusPoint+"점 입니다.");
	}
	
}