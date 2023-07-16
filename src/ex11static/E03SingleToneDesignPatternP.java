package ex11static;

class NoSingleToneP{
	int instVar;
	public NoSingleToneP() {}
}

class SingleToneP{
	int shareVar;
	private static SingleToneP single= new SingleToneP();
	
	private SingleToneP() {
		
	}
	public static SingleToneP getInstance() {
		return single;
	}
	void print() {
		System.out.println(String.format("shareVar=%d", shareVar));
	}
}
public class E03SingleToneDesignPatternP {
	
	public static void main(String[] args) {
		
		NoSingleToneP nst1 = new NoSingleToneP();
		nst1.instVar = 100;
		System.out.println("nst1="+nst1);
		
		NoSingleToneP nst2 = new NoSingleToneP();
		nst2.instVar =200;
		System.out.println("nst2="+nst2);
		
//		SingleToneP st1 = new SingleToneP();
		
		SingleToneP st2 = SingleToneP.getInstance();
		st2.shareVar = 100;
		st2.print();
		
		SingleToneP st3 = SingleToneP.getInstance();
		st3.shareVar = 200;
		st3.print();
		
		System.out.println(String.format("st2의주소:%s", st2));
		System.out.println(String.format("st3의주소:%s", st3));
		
		System.out.println(String.format("st2의 sharsVar:%d", st2.shareVar));
		System.out.println(String.format("st3의 sharsVar:%d", st3.shareVar));
	}

}
