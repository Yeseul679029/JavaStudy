package ex08class;
/*
메인메소드 샘플코드]
public static void main(String[] args)
{
	CalculatorEx cal = new CalculatorEx();
	cal.init();
	System.out.println("1 + 2 = " + cal.add(1 , 2));
	System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
	System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
	System.out.println("100 / 25 = " + cal.div(100 , 25));
	System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
	cal.showOpCount();
}	
문제1) 파일명 : QuSimpleCalculator.java (난이도:하)
기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.

 */

class CalculatorEx{
	//멤버변수
	int addcnt;
	int mincnt;
	int mulcnt;
	int divcnt;
	
	//멤버메소드
	void init() {
		addcnt=0;
		mincnt=0;
		mulcnt=0;
		divcnt=0;
	}
	double add(double n1,double n2) {
		double result = n1+n2; 
		addcnt++;
		return result;
	}
	double min(double n1,double n2) {
		double result = n1-n2; 
		mincnt++;
		return result;
	}
	double mul(double n1,double n2) {
		double result = n1*n2; 
		mulcnt++;
		return result;
	}
	double div(double n1,double n2) {
		double result = n1/n2; 
		divcnt++;
		return result;
	}
	void showOpCount() {
		StringBuffer str = new StringBuffer();
		str.append("\n덧셈횟수: "+addcnt);
		str.append("\n뺄셈횟수: "+mincnt);
		str.append("\n곱셈횟수: "+mulcnt);
		str.append("\n나눗셈횟수: "+divcnt);
		System.out.println(str);
	}
	
}


public class QuSimpleCalculator {
	
	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	


}