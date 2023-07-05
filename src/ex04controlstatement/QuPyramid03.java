package ex04controlstatement;

public class QuPyramid03 {
/*
실행결과]
         *
       * * *
     * * * * *
   * * * * * * *
  * * * * * * * * *


 */
	public static void main(String[] args) {
		
//		for(int x=1;x<=5;x++) {
//			for(int y=1;y<=9;y++) {
//				if(x<=5) {
//					x++;
//				}
//				else {
//					x--;
//				}
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		for(int x=1; x)
		
		int num = 5;
		
		//행을 반복하는 부분
		for(int i=0; i<=num; i++) {
			//공백을 출력하는 부분
			for(int j=1; j<=num-i;j++) {
				System.out.print(" ");
			}
			//*을 출력하는 부분
			for(int k=0; k<i*2+1;k++) {
				System.out.print("*");
			}
			//줄바꿈 처리
			System.out.println();
		}
		
		


		
	}

}
