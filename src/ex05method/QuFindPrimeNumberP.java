package ex05method;

public class QuFindPrimeNumberP {
/*
문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.

메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.

 */
	static boolean isPrimeNumber(int n) {
		//1은 소수가 아님
		if(n==1) {
			return false;
		}
		//전달받은 i값이 7이라면 1,7을 뺀 6까지 나눠지는지 확인
		for(int j=2;j<n;j++) {
			//나눠지면 소수아님
			if(n%j==0) {
				return false;
			}
		}
		//위 반복문을 벗어났다면 소수 
		return true;
	}
	public static void main(String[] args) {
		//1~100까지 소수출력
		for(int i=1; i<=100;i++) {

			//소수판단
			boolean result = isPrimeNumber(i);
			
			if(result==true) {
				//소수출력
				System.out.println("소수="+i);
			}
			
		}
	}

}
