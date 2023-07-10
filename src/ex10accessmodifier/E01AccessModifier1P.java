package ex10accessmodifier;

class DefaultClass1P {
	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");
	}
}
public class E01AccessModifier1P {

	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultVarMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메소드 호출");
	}
	public void publicVarMethod() {
		privateVar = 300;
		System.out.println("publicVarMethod() 메소드 호출");
		privateMethod();
	}
}
