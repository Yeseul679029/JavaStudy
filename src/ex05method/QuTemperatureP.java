package ex05method;

import java.util.Scanner;

public class QuTemperatureP {
/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 
함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
 */
	//섭씨를 화씨로 변경 = 1.8 * 섭씨 + 32
	static double celsius(double c) {
		double cN = 1.8 * c + 32;
		return cN;
	}
	//화씨를 섭씨로 변경  = (화씨 - 32) / 1.8
	static double fahrenheit(double f) {
		return (f - 32) / 1.8;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨 입력해~ :");
		double celsiusNum = scanner.nextDouble();
		System.out.print("화씨 입력해~ :");
		double fahrenheitNum = scanner.nextDouble();
		
		double cNum = celsius(celsiusNum);
		double fNum = fahrenheit(fahrenheitNum);
		System.out.printf("섭씨 %.2f 도 => 화씨 %.2f도%n",celsiusNum,cNum);
		System.out.printf("화씨 %.2f 도 => 섭씨 %.2f도%n",fahrenheitNum,fNum);
		
	}

}
