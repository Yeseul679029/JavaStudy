package ex07string;

public class E02StringMethod4 {


	
	public static void main(String[] args) {
		
		System.out.println("=========시나리오1");
		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		String jumin1 = "190419-3000000";
		String jumin2 = "190419-4000000";
		String jumin = jumin2;
		
//		System.out.println(jumin.charAt(7));
		if(jumin.charAt(7)=='1'||jumin.charAt(7)=='3') {
			System.out.println(jumin+"=> 남자");
		}
		else if(jumin.charAt(7)=='2'||jumin.charAt(7)=='4') {
			System.out.println(jumin+"=> 여자");
		}
		else if(jumin.charAt(7)=='5'||jumin.charAt(7)=='6') {
			System.out.println(jumin+"=> 외국인");
		}
		else {
			System.out.println("주민번호가잘못입력되었습니다.");
		}
	
		System.out.println("=========시나리오2");
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/	
		//주민등록번호에서 - 을 찾아서 인덱스 값을 찿고 +1을 하면 charAt을 사용해 찾기
		int idx = jumin.indexOf("-")+1;
//		System.out.println(gender);
		if(jumin.charAt(idx)=='1'||jumin.charAt(idx)=='3') {
			System.out.println(jumin+"은 남성");
		}
		else if(jumin.charAt(idx)=='2'|| jumin.charAt(idx)=='4') {
			System.out.println(jumin+"은 여성");
		}
		else if(jumin.charAt(idx)=='5'||jumin.charAt(idx)=='6') {
			System.out.println(jumin+"은 외국인");
		}
		else {
			System.out.println("흠");
		}
		
		System.out.println("=========시나리오3");
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
		String email1 = "hong@daum.net";
		String email2 = "not@naver";
		String email =email2;
		//contains()사용
		if(email.contains("@")&& email.contains(".")) {
			System.out.println(email+"=>이메일");
		}
		else {
			System.out.println(email+"=>이메일아님");
		}
		
		System.out.println("=========시나리오4");	
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		//lastindexOf를 사용해 뒤에있는 점을 찾은 후 substring으로 자른다.
		
		String myfile = "my.file.images.jpg";
		String file = myfile;
		
//		System.out.println(file.lastIndexOf("."));
		int fileidx = file.lastIndexOf(".")+1;
//		System.out.println(file.substring(fileidx));
		String fileExt = file.substring(fileidx);
		System.out.println("확장자: "+fileExt);
		
		//split()
		String[] fileArr = file.split("[.]");
		
		System.out.println(fileArr.length);
		System.out.println(fileArr[fileArr.length-1]);
		
		
	}

	

}
