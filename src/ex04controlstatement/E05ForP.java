package ex04controlstatement;

public class E05ForP {

	public static void main(String[] args) {

		//i 증가나열
		for(int i=1; i<=5; i++) {
			System.out.print("i="+i);
		}
		System.out.println();
		
		/*
		시나리오] 1~100까지의 합을 구하는 프로그램을 for문을
			이용하여 작성하시오.
		 */
		int sum =0;
		for(int j=1; j<=100; j++) {
			sum+=j;
		}
		System.out.println("1~100까지 합="+sum);
		
		/*
		시나리오] for문을 이용하여 1~10까지의 정수중 2의배수의 합을 
			구하는 프로그램을 작성하시오.
		 */
		int total =0;
		for(int i=1; i<=10;i++) {
			if(i%2==0) {
				total+=i;
//				System.out.println("i="+i);
			}
		}
		System.out.println("10까지 2배수합(방법1):"+total);
		
		total=0;
		for(int i=0; i<=10; i+=2) {
			total+=i;
		}
		System.out.println("10까지 2배수합(방법2):"+total);
		
		//초기변수를 밖으로 빼내고 증감식을 내부로 넣은 무한루프형식
		int a = 1;
		for(;;) {
			System.out.println("나는 for문으로 만든 무한루프입니다."+a);
			a++;
			if(a==3)break;
		}
		
		//for문 뒤에 세미콜론이 붙으면 조건식이 적용되지않음
		for(int j=0; j<=5; j++); {
			System.out.println("어랏.. 나는 누구여긴어디");
		}
		//j 호출불가
//		System.out.println("위 for문에서 선언한 변수 j="+j);
		System.out.println("위 main함수 지역에서 선언한 변수 total="+total);
		
		//중요 지역변수의 중요성?
		int i=0;
		for(; i<=5; i++) {
			System.out.println("for문 안에서의 i값="+i);
		}
		System.out.println("for문 밖에서의 i값="+i);
		
		
		/*
		연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		//단 2~9증가
		for(int dan=2;dan<=9;dan++) {
			//수 1~9증가
			for(int su=1; su<=9; su++) {
				//단,수 곱하기 프린트
				System.out.printf("%d*%d=%2d ",dan,su,(dan*su));
			}
			//단이 오를때마다 줄바꿈
			System.out.println();
		}
		
		/*
		연습문제2] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0001
			0010
			0100
			1000
		해법 : x와 y를 더해서 5가 될때 1을 출력한다.
		 */
		//x 4까지 증가
		for(int x=1;x<=4;x++) {
			//y 4까지 증가
			for(int y=1;y<=4; y++) {
				//x와 y를 더해서 5가 될때 1을 출력
				if((x+y)==5)
					System.out.print("1");
				//나머지 0프린트
				else 
					System.out.print("0");
			}
			//x증가할때 줄바꿈
			System.out.println();
		}
		
		
		
	}

}
