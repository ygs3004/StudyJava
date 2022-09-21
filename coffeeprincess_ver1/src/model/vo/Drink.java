package model.vo;

public class Drink {
	
	private int orderNo;
	private String drinkName;
	private int price;
	private int cups;
	
	public Drink() {}
	
	public Drink(int orderNo, String drinkName, int price, int cups) {
		super();
		this.orderNo = orderNo;
		this.drinkName = drinkName;
		this.price = price;
		this.cups = cups;
	}

	public int getOrderNo() {return orderNo;}
	public void setOrderNo(int orderNo) {this.orderNo = orderNo;}

	public String getDrinkName() {return drinkName;}
	public void setDrinkName(String drinkName) {this.drinkName = drinkName;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public int getCups() {return cups;}
	public void setCups(int cups) {this.cups = cups;}

	@Override
	public String toString() {
		return "Drink[orderNo=" + orderNo + ", drinkName=" + drinkName
				+ ", price=" + price + ", cups=" + cups + "]";
				
	}
}
