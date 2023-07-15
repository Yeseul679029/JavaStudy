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
		//순서대로 넣을 배열
		int [] arr1 = new int[10];
		//홀짝대로 넣을 배열
		int [] arr2 = new int[10];
		//처음과 끝자리 수
		int starNum = 0;
		int endNum = arr2.length-1;
		
		for(int i=0; i<arr1.length;i++) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print((i+1)+"정수를 입력하세요:");
			int input = scan.nextInt();
			
			//순서대로 배열에 담기
			arr1[i]= input;
			
			if(input%2==0) {
				//짝수일때 앞에서 입력
				arr2[starNum++] = input;
			}
			else {
				//홀수일때 뒤부터 입력
				arr2[endNum] = input;
				endNum--;
			}
		}
		System.out.println("순서대로입력된결과");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n홀수/짝수 구분입력결과");
		for(int a : arr2) {
			System.out.print(a+" ");
		}
		
		
	}
}
