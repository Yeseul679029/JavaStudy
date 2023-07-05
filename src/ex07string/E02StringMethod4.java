package ex07string;

public class E02StringMethod4 {


	
	public static void main(String[] args) {
		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		String jumin1 = "190419-3000000";
		String jumin2 = "190419-4000000";
		String jumin = jumin1;
		
		System.out.println(jumin.charAt(7));
		if(jumin.charAt(7)=='3'||jumin.charAt(7)=='1') {
			System.out.println(jumin+"=> 남자");
		}
		else if(jumin.charAt(7)=='2'||jumin.charAt(7)=='4') {
			System.out.println(jumin+"=> 여자");
		}
		else if(jumin.charAt(7)=='5'||jumin.charAt(7)=='6') {
			System.out.println(jumin+"=> 외국인");
		}
		else {
			System.out.println("모름");
		}
	
		
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/	
		//주민등록번호에서 - 을 찾아서 인덱스 값을 찿고 +1을 하면 charAt을 사용해 찾기
//		if((jumin1.indexOf("-")+1)=='3'||(jumin1.indexOf("-")+1)=='1') {
//			System.out.println(jumin1+"은 남성");
//		}
//		else {
//			System.out.println(jumin1+"은 여성");
//		}
//		if((jumin2.indexOf("-")+1)=='2'||(jumin1.indexOf("-")+1)=='4') {
//			System.out.println(jumin2+"은 여성");
//		}
//		else {
//			System.out.println(jumin2+"은 남성");
//		}
		
		
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		String email1 = "hong@daum.net";
		String email2 = "not@naver";
		String result ="";
//		result = email1.contains("@") ? "이메일임" : "이메일아님";
//		System.out.println(email1+"=>"+result);
		result = email1.contains("@") ? "이메일임" : "이메일아님";
		System.out.println(email1+"=>"+result);
		if(email1.contains("@")&& email1.contains(".")) {
			System.out.println("=>이메일");
		}
		else {
			System.out.println("=>이메일아님");
		}
		
		if(email2.contains("@")&& email2.contains(".")) {
			System.out.println("=>이메일");
		}
		else {
			System.out.println("=>이메일아님");
		}
		
		
	
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		//lastindexOf를 사용해 뒤에있는 점을 찾은 후 substring으로 자른다.
		
		
		
	}

	

}
