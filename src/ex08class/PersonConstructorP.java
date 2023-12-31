package ex08class;

public class PersonConstructorP {

	String name;
	int age;
	String addr;
	
	//생성자 메소드
	//public PersonConstructor(){}
	
	public PersonConstructorP(){
		name = "이름없음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본생성자 입니다.");
	}

	public PersonConstructorP(String name) {
		this.name = name;
		age= 1;
		addr = "출처불명";
		System.out.println("나는 인자생성자[1] 입니다");
	}
	
	public PersonConstructorP(String name, int age) {
		this(name,age,"미상");
		System.out.println("나는 인자생성자[2] 입니다");
	}

	public PersonConstructorP(String _name, int age, String addr) {
		name = _name;
		this.age = age;
		this.addr = addr;
		System.out.println("나느 인자생성자[3] 입니다");
	}
	
	void initialize(String name, int age, String addr) {
//		this(name, age,"미상");
		
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	void showPersonInfo() {
		System.out.printf("%s 님의 정보\n",this.name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("주소 : %s\n",addr);
	}

}
