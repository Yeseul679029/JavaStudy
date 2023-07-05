package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhileP {

	public static void main(String[] args) throws IOException {

		/*
		시나리오] E03 예제의 1~10까지 더하는 수열문제를 do~while문으로
		변경하여 구현하시오.
		 */
		int sum = 0;
		int i = 1;
		do {
			System.out.print("i="+i);
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println("\n1~10까지 누적합:"+sum);
		
		/*
		시나리오] 1부터 1000까지의 정수중 4의배수이거나 7의배수인
		수의 합을 구하여 출력하는 프로그램을 작성하시오..
		단, do~while문을 사용해야 한다.
		 */
		int total = 0;
		int j = 1;
		do {
			if(j%4==0 || j%7==0) {
				total+=j;
			}
			j++;
		}while(j<=1000);
		System.out.println("4의배수,7의배수합: "+total);
		
		/*
		연습문제) 다음과 같은 피라미드를 출력하는 프로그램을 do~while문으로 작성하시오.
		*
		**
		***
		****
		*****
		
		*/
		
//		int x=1;
//		do {
//			int y=1;
//			do {
//				System.out.print("*");
//				y++;
//			}while(y<=x);
//			
//			System.out.println();
//			x++;
//		}while(x<=5);
		
		int a=1;
		do {
			int b=1;
			do {
				if(a>=b)
					System.out.print("*");
				b++;
			}while(b<=5);
			System.out.println();
			a++;
		}while(a<=5);
		
		
		
		
		/*
		시나리오]국어, 영어, 수학 점수를 사용자로부터 입력받은 후
		평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오.
		단, 사용자가 X,x(대소문자 구분없음)를 입력하면 프로그램이
		종료되어야 하며 do~while문으로 구현해야 한다.
		 */
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do {
			System.out.print("국어점수:");
			kor = scanner.nextInt();
			System.out.print("영어점수:");
			eng = scanner.nextInt();
			System.out.print("수학점수:");
			math = scanner.nextInt();
			
			avg = (kor+eng+math) /(3*10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7:
				System.out.println("C학점");break;
			case 6:
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");
			}
			
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
			
		}while(!(exitCode=='x'|| exitCode=='X'));
		/*
		시나리오]
		X를 입력한 경우
			!(false||true) => !(true)논리OR => false변환
			false가 되어 반복문 탈출!
		a를 입력한 경우
			!(false||false) => !(false) => true변환
			true가 되어 while문의 처음으로 다시시작.
		 */
		
		
		
	}

}
