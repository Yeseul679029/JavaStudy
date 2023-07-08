package ex08class;

class CarP {
	String carModel;
	String carColor;
	String carNumber;
	
	HumanP owner;
	
	void initialize() {
		carModel = "람보르기니";
		owner = new HumanP();
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	void initialize(String model,String color,String carnumber,
			String name, int age, int energy,int kibun) {
		carModel = model;
		carColor = color;
		carNumber = carnumber;
		owner = new HumanP();
		owner.name= name;
		owner.age = age;
		owner.energy = energy;
		owner.kibun = kibun;
	}
	void drive() {
		owner.kibun+=2;
		System.out.println(owner.name+"이(가) "+ carModel +"을 운전한다.");
		System.out.println("[drive]기분이 2 증가했습니다.");
	}
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
		System.out.printf("차량색상:%s\n", carColor);
		System.out.printf("차량번호:%s\n", carNumber);
		owner.showState();
	}
}///end of Car Class

public class E03CarMainP {
	
	public static void main(String[] args) {
		
		//자동차1 객체 생성
		CarP car1 = new CarP();
		car1.initialize();
		car1.showCarInfo();
		
		//자동차2 객체 생성
		CarP car2 = new CarP();
		car2.carModel = "밴틀리";
		car2.owner = new HumanP();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		car2.showCarInfo();
		
		//자동차3 객체 생성
//		CarP car3 = new CarP();
//		car3.initialize("스포츠카", "성유겸", 8, 10);
//		car3.showCarInfo();
		
		//자동차4 객체 생성
//		CarP car4 = new CarP();
//		car4.showCarInfo();
		
		//김렘렘차 객체 생성
		CarP car5 = new CarP();
		car5.initialize("SUV 이너스 주빌리", "무광회색", "0209", "김지현", 
				28, 2,5);
		car5.showCarInfo();
		car5.owner.eating();
		car5.owner.showState();
		car5.owner.thinking();
		car5.owner.walking();
		car5.owner.showState();
		car5.drive();
		car5.owner.showState();
		car5.owner.eating();
		car5.owner.eating();
		car5.owner.eating();
		car5.owner.eating();
		car5.owner.showState();
		car5.owner.walking();
		car5.owner.showState();
		
	}
	
	
	
}






