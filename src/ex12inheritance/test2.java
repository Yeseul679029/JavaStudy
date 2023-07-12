package ex12inheritance;

class MyClass {
	/*
	내가 멤버변수만 잘 만들어두면 자동완성으로 만들수가 있다.
	 */
	/*멤버변수 : 이제 private으로 생성할것이기 때문에 생성자와 
	getter,setter가 필요하다*/
	private int a;
	private String b;
	private double c;
	private boolean d;
	
	//생성자 Source > generate using fields 
	public MyClass(int a, String b, double c, boolean d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	//게터/세터
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}
	
}

public class test2 {

	public static void main(String[] args) {

		MyClass myClass = 
				new MyClass(1, "하이", 3.14, true);
		System.out.println("a="+myClass.getA());
		System.out.println("b="+myClass.getB());
		//세터는 초기화
		myClass.setA(99);
		System.out.println("a="+myClass.getA());
	}

}
