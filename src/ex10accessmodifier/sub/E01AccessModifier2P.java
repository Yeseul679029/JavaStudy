package ex10accessmodifier.sub;

class DefaultClass2P {
	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");
	}
}
public class E01AccessModifier2P {

	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 400;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultVarMethod() {
		privateVar = 500;
		System.out.println("defaultMethod() 메소드 호출");
	}
	public void publicVarMethod() {
		privateVar = 600;
		System.out.println("publicVarMethod() 메소드 호출");
		privateMethod();
	}
}