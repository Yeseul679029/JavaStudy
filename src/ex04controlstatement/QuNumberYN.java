package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class QuNumberYN {

	public static void main(String[] args) throws IOException {
//		Scanner scanner = new Scanner(System.in);
//		
//		String str="";
//		System.out.println("하나의 문자를 입력하세요:");
//		str = scanner.nextLine();
		
		//타입은 정수타입으로 받고 if문으로 먼저 찍어본다
		int str ;
		String strNum;
		System.out.println("하나의 문자를 입력하세요:");
		str = System.in.read();
		
		strNum = (str>='0' && str<='9') ? "숫자입니다":"숫자가아닙니다";
		System.out.println(str +"은 "+strNum);
		
	}

}
