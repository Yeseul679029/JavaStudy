package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 인수(파라메타)로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.

메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름


실행결과]
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985
 */
	//원의 둘레
	static double circleArea(double cr) {
		 
		double Round = 2* 3.14 * cr;
		return Round;
	}
	//원의 넓이
	static double circleRound(double cr) {
		
		double area = 3.14 * cr * cr;
		return area;
	}
	
	
	public static void main(String[] args) {
		//원의 반지름
//		double radius = 5.5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원의 반지름 입력:");
		double radius = scanner.nextDouble();
		
		
		System.out.println("원의 둘레("+radius+"):"+circleArea(radius));
		System.out.println("원의 넓이("+radius+"):"+circleRound(radius));
		System.out.printf("원의 넓이(%.2f):%.2f",radius,circleRound(radius));
		
		
	}

}
