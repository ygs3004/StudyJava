package tbrainExample01;

public class ClassExample04 {

	public static void main(String[] args) {

		GoodsStock03 obj = new GoodsStock03("52135", 200);
		
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고 수량 :"+obj.stockNum);
		
		obj.addStock(1000);
		
		System.out.println("상품코드 : "+obj.goodsCode);
		System.out.println("재고 수량 : "+obj.stockNum);
	}
}