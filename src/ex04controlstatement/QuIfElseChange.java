package ex04controlstatement;

public class QuIfElseChange {

	public static void main(String[] args) {
		/*
		int num1=50, num2=100;
		int big, diff;
	
		big = (num1>num2)? num1:num2; //조건?참:거짓;
		System.out.println(big);
	
		diff = (num1>num2)? num1-num2: num2-num1;
		System.out.println(diff); 

		 */
		int num1=50, num2=100;
		int big, diff;
		
		if(num1>num2) {
			big = num1;
		}
		else {
			big = num2;
		}
		System.out.println(big);
		
		if(num1<num2) 
			diff = num1;
		else 
			diff = num2;
		System.out.println(diff);
		
		
	}

}
