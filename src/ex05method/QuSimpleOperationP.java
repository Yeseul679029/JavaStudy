package ex05method;

import java.util.Scanner;

public class QuSimpleOperationP {
	
	static void arithmetic(int n1, int n2) {
		if(n1>0 && n2>0) {
			System.out.printf("덧셈결과-> %d %n",n1+n2);
			System.out.printf("뺄셈결과-> %d %n",n1-n2);
			System.out.printf("곱셈결과-> %d %n",n1*n2);
			System.out.printf("나눗셈 몫-> %d %n",n1/n2);
			System.out.printf("나눗셈 나머지-> %d %n",n1%n2);
			System.out.printf("나눗셈:%d %% %d= %d %n",n1,n2,n1%n2);
		}
		else {
			System.out.println("양의 정수를 입력하세요");
			return;
		}
	}

	public static void main(String[] args) {
		//스캐너로 두개의 정수를 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요:");
		int num1 = scanner.nextInt();
		System.out.print("두번째 정수를 입력하세요:");
		int num2 = scanner.nextInt();
		
		arithmetic(num1,num2);
		
	}

}
