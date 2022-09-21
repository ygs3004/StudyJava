package tbrainExample01;

class GoodsStock{
	String goodsCode;
	int stockNum;
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;	
	}
	
	@Override
	public String toString() {
		return "상품코드 : "+goodsCode+" 재고수량 : "	+stockNum;
	}
}

public class ObjectEx06 {

	public static void main(String[] args) {
		GoodsStock obj=new GoodsStock("75293",100);
		
		System.out.println(obj);
		System.out.println(obj.toString());
		// 상품코드 : 57293 재고수량:100
		String str="재고정보 \n"+obj;
		System.out.println(str);
	}
}
