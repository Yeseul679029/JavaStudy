package ex08class;

class FruitSeller2P{
	
	int numOfApple;
	int myMoney;
	int apple_price;
	
	public void initMembers(int money, int appleNum, int price	) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	public int saleApple(int money) {
		int num = money/apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+numOfApple);
		System.out.println("[판매자]판매수익:"+myMoney);
	}
	
}

class Fruitbuyer2P{
	int numOfApple;
	int myMoney;
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller2P seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -=money;
	}
	public void shBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
	
}
public class E06FruitSalesMain2P {

	public static void main(String[] args) {

		FruitSeller2P seller1 = new FruitSeller2P();
		seller1.initMembers(0, 100, 1000);
		
		FruitSeller2P seller2 = new FruitSeller2P();
		seller2.initMembers(0, 80, 500);
		
		Fruitbuyer2P buyer = new Fruitbuyer2P();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.shBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.shBuyResult();
	}

}
