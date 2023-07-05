package ex04controlstatement;

public class QuPyramid02 {
/*
실행결과]
* * * * *
* * * *
* * *
* *
*

 */
	public static void main(String[] args) {

//		int x=1;
//		do {
//			int y=1;
//			do {
//				if((x+y)<=6)
//					System.out.print("*");
//				y++;
//			}while(y<=5);
//			
//			System.out.println();
//			x++;
//		}while(x<=5);
		
		int x=5;
		do {
			int y=1;
			do {
				
				System.out.print("*");
				y++;
			}while(y<=x);
			
			System.out.println();
			x--;
		}while(x<=5);
		
	}

}
