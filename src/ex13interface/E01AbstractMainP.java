package ex13interface;

abstract class AbsClass1P {
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	void instanceMethod() {	}
	static void staticMethod() {}
}
class AbsClassChild1P extends AbsClass1P{
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	}
}
abstract class AbsClass2P{
	abstract void absMethod(int number);
}
class AbsClassChild2P extends AbsClass2P{
	@Override
	void absMethod(int number) {
		System.out.println("필수 오버라이딩");
	}
	void newMethod(){
		System.out.println("학장한 메소드");
	}
}

public class E01AbstractMainP {

	public static void main(String[] args) {
//		AbsClass1P absClass1 = new AbsClass1P();
		AbsClassChild1P absClassChild1P = new AbsClassChild1P();
		
		AbsClass2P absClass2P = new AbsClassChild2P();
		absClass2P.absMethod(100);
		((AbsClassChild2P)absClass2P).newMethod();
		
		AbsClass1.staticMethod();
		AbsClassChild1P.staticMethod();
		System.out.println("int형의최대값"+AbsClass1P.MAX_INT);
	}

}
