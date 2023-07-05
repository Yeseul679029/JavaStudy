package ex05method;

import java.util.Scanner;
/*
문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 
함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.

공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8

 */
public class QuTemperature {

	//화씨->섭씨
	static double celsius(double f) {
		double conversion= (f-32)/1.8;
		return conversion;
	}
	//섭시->화씨
	static double fahrenheit(double c) {
		double conversion= 1.8*c+32;
		return conversion;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨를 입력하세요");
		double celsius = scanner.nextInt();
		System.out.print("화씨를 입력하세요");
		double fahrenheit = scanner.nextInt();
		
		System.out.println("섭씨:"+celsius+"도=> 화씨:"+
				fahrenheit(celsius));
		System.out.println("화씨:"+fahrenheit+"도=> 섭씨:"+
				celsius(fahrenheit));
		System.out.printf("화씨%.2f도=>섭씨:%.2f",fahrenheit,celsius(fahrenheit));
	}

}
