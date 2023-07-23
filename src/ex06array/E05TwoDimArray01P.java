package ex06array;

public class E05TwoDimArray01P {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		int[] arr2 = new int [5];
		arr2[0] = 1;
		
		System.out.println("배열의 세로크기:"+arr.length);
		System.out.println("배열명이 가진값 출력(arr): "+ arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d행의 크기:%d\n",i,arr[i].length);
			System.out.printf("%d행 출력:%s\n",i,arr[i]);
		}
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1]="+arr[0][1]);
		
		try {
			System.out.println("arr[0][3]="+arr[0][3]);//예외발생
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
