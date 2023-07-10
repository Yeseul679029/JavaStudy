package ex09package;

import ex09package.study.buyer.FruitBuyer4P;
import ex09package.study.seller.FruitSeller4P;

public class E06FruitSalesMain4P {

	public static void main(String[] args) {
		
	
		//판매자1 : 사과100개, 단가1000원으로 정의
		FruitSeller4P seller1 = new FruitSeller4P(0, 100, 1000);
		//판매자2 : 사과80개, 단가500원으로 정의
		FruitSeller4P seller2 = new FruitSeller4P(0, 80, 500);
		//구매자 : 보유금액10000원
		FruitBuyer4P buyer = new FruitBuyer4P(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//각각의 판매자에게 5000원씩 지불하고 사과를 구매한다.
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();//5개를 판매한다
		seller2.showSaleResult();//10개를 판매한다
		//10000원을 내고 15개를 구매한다.
		buyer.showBuyResult();
	
	
	}

}
