package ex15usefulclass;

class IntNumberP{
	int num;
	public IntNumberP(int num) {
		this.num = num;
	}
	
	public boolean myEqualsP(IntNumberP numObj) {
		if(this.num==numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class E04Object2MyEqualsP {

	public static void main(String[] args) {

		String str1 = new String("Java개발자");
		String str2 = "Java개발자";
		if(str1.equals(str2)) {
			System.out.println("같은 문자열 입니다.");
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
		
		IntNumberP num1 = new IntNumberP(10);
		IntNumberP num2 = new IntNumberP(20);
		IntNumberP num3 = new IntNumberP(10);
		
		if(num1.myEqualsP(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}
		else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if(num1.myEqualsP(num3)) {
			System.out.println("num1과 num3은 동일한 정수");
		}
		else {
			System.out.println("num1과 num3은 다른 정수");
		}
	}

}
