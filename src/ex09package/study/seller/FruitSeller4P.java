package ex09package.study.seller;

 public class FruitSeller4P{
	//멤버변수 
	//보유한 사과의 재고수량
	int numOfApple;
	//판매 수익금
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller4P(int money,int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	//멤버메서드
	public int saleApple(int money) {
		
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney+= money;
		return num;
	}
	//판매자의 현재상태를 출력한다.
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+numOfApple);
		System.out.println("[판매자]판매수익:"+myMoney);
	}
}