package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorExceptionP extends Exception{
	public AgeErrorExceptionP() {
		super("나이 입력이 개잘못 되었어요");
	}
}
public class Ex06DeveloperDefineP {

	public static void main(String[] args) {
		
		System.out.print("나이를 입력하세요 :");
		try {
			int age = readAge();
			System.out.println("당신의 나이는 "+age+" 입니다.");
		}
		catch (AgeErrorExceptionP e) {
			System.out.println("[예외발생]"+e.getMessage());
		}
	}
	
	public static int readAge() throws AgeErrorExceptionP{
		Scanner sc = new Scanner(System.in);
		int inputAge=0;
		try {
			inputAge = sc.nextInt();
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		if(inputAge<0) {
			AgeErrorExceptionP ex = new AgeErrorExceptionP();
			throw ex;
		}
		return inputAge;
	}
}
