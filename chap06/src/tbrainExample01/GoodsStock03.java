package tbrainExample01;

public class GoodsStock03 {
	String goodsCode;
	int stockNum;

	public void addStock(int amount) {
		stockNum += amount;
	}

	public int substractStock(int amount) {

		if (stockNum < amount)
			return 0; // return:호출한 곳으로 값을 돌려준다 + 메서드 종료

		stockNum -= amount;

		return amount;

	}
	
	public GoodsStock03(String goodsCode, int stockNum) {
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
}