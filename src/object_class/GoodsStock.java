package object_class;
//상품 재고 클래스
public class GoodsStock {
	//필드
	String goodsCode;
	int stockNum;



	//메서드

	void addStock(int amount){
		stockNum += amount;
	}

	int subtractStock(int amount){
		stockNum -= amount;
		if(stockNum <amount){
			return 0;
		}
		return amount;
	}
}
