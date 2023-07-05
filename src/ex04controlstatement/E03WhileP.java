package ex04controlstatement;

public class E03WhileP {

	public static void main(String[] args) {

		/*
		시나리오] 1~10까지의 합을 구하는 프로그램을 while문으로
			작성하시오.
		 */
		//작성1
		int i= 1;
		while(i<=10) {
			System.out.print("변수i="+i+" ");
			i++;
		}
		System.out.println();
		
		//작성2
		int sum = 0;
		int j = 1;
		while(j<=10) {
			sum +=j;
			j++;
		}
		System.out.println("1~10까지의합 sum="+sum);
		
		
		/*
		시나리오] 1~100까지의 정수중 3의배수이거나 4의배수인
		정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
		 */
		int total = 0;
		int k = 1;
		while(k<=100) {
			if(k%3==0 || k%4==0) {
				total+=k;
				System.out.print("k="+k);
			}
			k++;
		}
		System.out.println("\n3또는 4의배수합: "+total);
		
		/*
		시나리오] 구구단을 출력하는 프로그램을
		while문으로 작성하시오.
		 */
		int dan=2;
		while(dan<=9) {
			int su=1;
			while(su<=9	) {
				System.out.printf("%-2d*%-2d=%2d",dan,su,(dan*su));
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
		
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
			1000
			0100
			0010
			0001
		 */
		int x=1;
		while(x<=4) {
			int y=1;
			while(y<=4) {
				if(x==y) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		
	}

}
