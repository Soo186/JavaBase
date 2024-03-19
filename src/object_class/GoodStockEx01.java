package object_class;

public class GoodStockEx01 {
	public static void main(String[] args) {
		GoodsStock ballpen = new GoodsStock();
		ballpen.goodsCode = "MB02050";
		ballpen.stockNum = 0;
		ballpen.addStock(100);
		ballpen.addStock(200);
		ballpen.subtractStock(50);
		System.out.println("상품코드 : " + ballpen.goodsCode);
		System.out.println("재고수량 : " + ballpen.stockNum);
		GoodsStock note = new GoodsStock();
		note.goodsCode = "MN0234";
		note.stockNum = 0;
		note.addStock(500);
		int amount = note.subtractStock(200);
		if (amount == 0){
			System.out.println("재고가 부족합니다. (현재 재고수량:" + note.stockNum+")");
		}else {
			System.out.println("상품코드 :" + note.goodsCode);
			System.out.println("판매수량 :" + amount);
			System.out.println("재고수량 :" + note.stockNum);
		}



	}
}
