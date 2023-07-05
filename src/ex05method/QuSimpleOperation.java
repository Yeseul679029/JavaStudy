package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	
	static void arithmetic(int n1,int n2) {
		if(n1>0 && n2>0) {
			System.out.println("덧셈결과-> "+(n1+n2));
			System.out.println("뺄셈결과-> "+(n1-n2));
			System.out.println("곱셈결과-> "+(n1*n2));
			System.out.println("나눗셈 몫-> "+(n1/n2));
			System.out.println("나눗셈 나머지-> "+(n1%n2));
			//printf문에서는 %기호를 출력하기위해서 %%와 같이 사용해야 한다.
			System.out.printf("%d%%%d = %d",n1,n2,(n1%n2));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자:");
		int num1 = scanner.nextInt();
		System.out.print("두번째 숫자:");
		int num2 = scanner.nextInt();
		
		arithmetic(num1,num2);
	}

}
