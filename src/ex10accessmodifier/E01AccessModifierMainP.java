package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2P;

public class E01AccessModifierMainP {

	public static void main(String[] args) {

		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		E01AccessModifier1P one = new E01AccessModifier1P();
		
//		System.out.println("one.privateVar=" + one.privateVar);
		System.out.println("one.defaultVar=" + one.defaultVar);
		System.out.println("one.publicVar=" + one.publicVar);
		
//		one.privateMethod();
		one.defaultVarMethod();
		one.publicVarMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1P().myFunc();
		
		//////////////////////////////////////////////////////
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		E01AccessModifier2P two = new E01AccessModifier2P();
		
//		System.out.println("two.privateVar="+two.privateVar);
//		System.out.println("two.defaultVar="+two.defaultVar);
		System.out.println("two.publicVar="+two.publicVar);
		
//		two.privateMethod();
//		two.defaultVarMethod();
		two.publicVarMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
//		new DefaultClass2P().myFunc();
	}

}
