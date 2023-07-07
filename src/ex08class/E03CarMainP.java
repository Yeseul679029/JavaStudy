package ex08class;

class CarP	{
	String carModel;
	HumanP owner;
	
	void initialize() {
		carModel = "람보르기니";
		owner = new HumanP();
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	void initialize(String model, String name, int age, int energy) {
		carModel = model;
		owner = new HumanP();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	void drive() {
		System.out.println(owner.name+"이(가) "+ carModel+"을 운전한다.");
	}
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명: %s\n",carModel);
		owner.showState();
	}
}////end of Car Class
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
		car2.owner.name ="토니스타크";
		car2.owner.age = 52;
		car2.showCarInfo();
		
		//자동차3 객체 생성
		CarP car3 = new CarP();
		car3.initialize("스포츠카","성유겸",8,10);
		car3.showCarInfo();
		
		//자동차4 객체 생성
		Car car4 = new Car();
		car4.showCarInfo();
		
		
	}

}
