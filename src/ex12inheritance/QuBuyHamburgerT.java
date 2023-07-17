package ex12inheritance;

class BurgerT {
	//멤버변수
	/* 버거명, 가격, 패티, 소스, 야채을 표현 */
	private String burgerName;
	private int price;
	private String sauce;
	private String patty;
	private String vegetable;
	//인자생성자
	public BurgerT(String burgerName, int price, String sauce, String patty, String vegetable) {
		this.burgerName = burgerName;
		this.price = price;
		this.sauce = sauce;
		this.patty = patty;
		this.vegetable = vegetable;
	}
	
	//getter : price만 필요
	public int getPrice() {
		return price;
	}
	
	//햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력*/
	public void showBurger() {
		System.out.println(burgerName);
		System.out.println("가격:"+price);
		System.out.printf("식재료:%s,%s,%s\n",patty,sauce,vegetable);
	}
	
}
//햄버거의 기본가격 추상화 
class HamburgerPriceT {
	//멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	BurgerT burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	/*인자생성자 : 멤버상수는 이미 초기화되어 있으므로 햄버거 인스턴스만
			초기화한다.*/
	public HamburgerPriceT(BurgerT burger) {
		this.burger = burger;
	}
	
	//기본가격계산
	public int price() {
		/* 햄버거 +콜라 +프렌치프라이 가격의 합계를 반환한다.
		햄버거의 price는 private이므로 getter를 통해 얻어와야한다. */
		int total = burger.getPrice() + COKE +POTATO;
		return total;
	}
	
	//햄버거와 결제금액 출력
	public void showPrice() {
		burger.showBurger();
		System.out.println("결제금액:"+price());
		System.out.println("==================");
	}
	
}
//세트가격을 추상화(기본가격을 상속)
class SetPriceT extends HamburgerPriceT {	
	//인자생성자
	public SetPriceT(BurgerT burger) {
		//부모클래스에 정의된 인자생성자 호출
		super(burger);
	}
	
	//부모랑 이름은 같지만 기능은 전혀 다르다.
	//세트가격계산(오버라이딩) : 500원 할인된 가격으로 계산
	@Override
	public int price() {
		return super.price() - 500;
	}
	
	//햄버거와 세트결제금액 출력(오버라이딩)	
	@Override
	public void showPrice() {
		burger.showBurger();
		System.out.println("세트결제금액:"+price());
		System.out.println("===================");
	}
	
}

public class QuBuyHamburgerT {

	public static void main(String[] args) {


		//치즈버거 객체 생성
		BurgerT burger1 = new BurgerT("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		BurgerT burger2 = new BurgerT("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPriceT price1 = new HamburgerPriceT(burger1); 
		price1.showPrice();	// 4500원	
		
		//치킨버거를 세트가격으로 구매
		HamburgerPriceT price2 = new SetPriceT(burger2); 
		price2.showPrice();	// 5000원

	}

}
