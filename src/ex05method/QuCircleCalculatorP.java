package ex05method;

import java.util.Scanner;

public class QuCircleCalculatorP {

	//원의 둘레 : 2 * 3.14 * 반지름
	static double circleRound(double r) {
		return 2 * 3.14 * r;
	}
	//원의 넓이 : 3.14 * 반지름 * 반지름
	static void circleArea(double r) {
		System.out.println("원의 넓이 :"+3.14 * r * r);
	}
	
	public static void main(String[] args) {
		//원의 반지름을 스캐너로 받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 반지름을 적으세요 :");
		double radius = scanner.nextDouble();
		
		System.out.printf("원의 둘레 %.2f : %.2f %n",radius,circleRound(radius));
//		System.out.println("원의 넓이"+radius+circleArea(radius));
		
		circleArea(radius);
	}

}
