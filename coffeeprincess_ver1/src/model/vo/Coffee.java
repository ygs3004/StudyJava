package model.vo;

public class Coffee {
//filed
	private int orderNo;
	private String coffeeName;
	private int price;
	private int cups;
	
	public Coffee() {
		
	}
	
	public Coffee(int type, int cups) {
		setCoffeeName(type);
		setCups(cups);
	}
	
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(int type) {
		
		switch(type) {
			case 1:
				coffeeName = "아메리카노";
				price=3000;
				break;
			case 2:
				coffeeName = "카페라떼";
				price=3500;
				break;
			case 3:
				coffeeName = "카푸치노";
				price=4000;
				break;
		}
		
	}
	
	public int getCups() {
		return cups;
	}
	
	public void setCups(int cups) {
		this.cups=cups;
		setPrice(price*cups);
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return "주문번호 : "+orderNo + ", 커피 명 : "+coffeeName+", 잔 수 : "+cups+", 가격 : "+price;
	}
}
