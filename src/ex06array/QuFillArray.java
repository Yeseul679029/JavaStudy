package ex06array;
/*
문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 
배열의 끝에서부터 채워나간다.(두번째배열)

 */
import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		int[] array = new int[10];
		int[] array = new int[] {1,3,4,5,2,6,7,8,9,0};
		int arrayNum;
		
		//array의 크기만큼 반복해서 수 채워넣기
		for(int i=0;i<array.length;i++) {
//			System.out.print((i+1)+"번째 정수를 입력하세요: ");
//			arrayNum = scanner.nextInt();
//			array[i]= arrayNum;
		}
		//순서대로 입력
		System.out.println("순서대로 입력된결과");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		//홀수/짝수 구분입력
		System.out.println("\n홀수/짝수 구분입력결과");
		
	}

}
