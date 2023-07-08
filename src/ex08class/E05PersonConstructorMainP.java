package ex08class;

public class E05PersonConstructorMainP {

	public static void main(String[] args) {

		PersonConstructorP person1 = new PersonConstructorP();
		System.out.println("[멤버변수 초기화용 메소드 호출전]");
		person1.showPersonInfo();
		
		System.out.println("[멤버변수 초기화용 메소드 호출후]");
		person1.initialize("홍길동", 20, "논현동");
		person1.showPersonInfo();
		
		System.out.println("[이름만 전달한 값으로 초기화하기]");
		PersonConstructorP person2 = new PersonConstructorP("박길동");
		person2.showPersonInfo();
		
		System.out.println("[이름과 나이만 전달한 값으로 초기화하기]");
		PersonConstructorP person3 = new PersonConstructorP("최길동", 40);
		person3.showPersonInfo();
		
		System.out.println("[모든 매개변수를 전달한 값으로 초기화하기]");
		PersonConstructorP person4 = new PersonConstructorP("박길동", 50, "가산동");
		person4.showPersonInfo();
	}

}
