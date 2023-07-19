package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class FriendT{
	//멤버변수 : 이름, 전화번호, 주소 기본정보 3가지를 저장.
	String name;
	String phone;
	String addr;
	//생성자 : 멤버변수 초기화.
	public FriendT(String name, String phone, String addr) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	//멤버변수 전체를 출력하기 위한 멤버메서드
	public void showAllData() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phone);
		System.out.println("주소:"+addr);
	}
	public void showBasicInfo() {}
}
//고등학교 친구의 정보를 저장할 클래스 
class HighFriendT extends FriendT{
	//확장한 멤버변수 : 별명
	String nickname;
	//생성자 : 부모의 생성자를 먼저 호출한 후 멤버변수 초기화.
	public HighFriendT(String name, String phone, String addr, 
			String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명:"+nickname);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명:"+nickname);
		System.out.println("전번:"+phone);
	}
}
//대학교 친구 정보를 저장하기 위한 클래스
class UnivFriendT extends FriendT{
	//확장한 멤버변수로 전공과목을 표현
	String major;

	public UnivFriendT(String name, String phone, String addr, 
			String major) {
		super(name, phone, addr);
		this.major = major;
	}
	//오버라이딩1,2 역시 HighFriend클래스와 동일한 패턴으로 정의됨
	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공:"+major);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phone);
	}
}

//메인클래스 여기서부터 프로그램이 시작되게된다.
public class MyFriendInfoListT {
	public static void menuShow() {
		System.out.println("###### 메뉴를 입력하세요 ######");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력 ");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력 ");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료 ");
		System.out.print("메뉴선택>>> ");
	}
	public static void main(String[] args) {
		//사용자 입력을 위한 인스턴스 생성
		Scanner scan = new Scanner(System.in);
		//기능을 담당하는 핸들러 클래스의 인스턴스 생성
		FriendInfoHandlerT handler = new FriendInfoHandlerT();
		
		//무한루프 종료하기전까지는 계속 돌것이다.
		while(true) {
			//1. 메뉴를 출력한다.
			menuShow();
			
			//2.사용자는 수행할 기능의 메뉴를 선택한다.
			int choice = scan.nextInt();
			
			//3.선택한 번호에 따라 switch문으로 각 메서드를 호출한다.
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;//메인함수에서 리턴되면 프로그램이 종료된다.
			}////switch끝
		}////while 끝
	}////main 끝

}////class 끝

class FriendInfoHandlerT{
	
	//멤버변수 
//	private Friend[] myFriends;
//	private int numOfFriends;
	
	/* 기존에 인스턴스배열에 저장했던것을 컬렉션으로 변경한다. 컬렉션은 제네릭을
	기반으로 하므로 인스턴스 생성시 저장할 객체의 타입을 결정하게된다. 여기서는
	Friend클래스를 상속한 High, Univ를 저장할 것이므로 아래와 같이 선언하면된다.*/
	ArrayList<FriendT> myFriends;
	
	//생성자 : 컬렉션은 데이터 저장시 자동인덱싱이 되므로 크기는 필요없다.
	//크기가 필요없기때문에 매개변수도 지워버린다.
	public FriendInfoHandlerT() {
//		System.out.println("생성자 호출됨");
//		myFriends = new Friend[num];
//		numOfFriends = 0;
		//생성자에서 정보를 저장할 List계열의 컬렉션을 생성한다.
		myFriends = new ArrayList<FriendT>();
	}
	
	/*
	연습문제] List컬렉션을 기반으로 친구(고딩/대딩) 정보를
	추가하는 프로그램을 작성하시오. 1차는 추가/출력1/출력2
	까지 진행합니다.
	출력1은 확장 for문을 통해 구현하세요.
	출력2는 이터레이터를 통해 구현하세요.
	 */
	//친구정보 추가
	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		String iName,iPhone,iAddr,iNickname,iMajor;
		//공통정보를 입력받는다.
		System.out.println("이름:");
		iName = scan.nextLine();
		System.out.println("전화번호:");
		iPhone = scan.nextLine();
		System.out.println("주소:");
		iAddr = scan.nextLine();
		if(choice==1) {
			//고딩친구 정보 추가
			//입력받기
			System.out.print("별명:");
			iNickname = scan.nextLine();
			//고등학교인스턴스생성 
			/*High인스턴스를 생성한다. 해당 인스턴스는 자신의 타입이나
			부모타입인 Friend에 저장할 수 있다.*/
			FriendT f = 
					new HighFriendT(iName, iPhone, iAddr, iNickname);
			myFriends.add(f);
		}
		else if(choice==2) {
			//대딩친구 정보 추가
			System.out.print("전공:");
			iMajor = scan.next();
			//Univ인스턴스 생성
			myFriends.add( 
					new UnivFriendT(iName, iPhone, iAddr, iMajor));
		}
		/* 기존 객체배열은 정보를 추가할때마다 인덱싱을 위해
		변수를 ++하는 부분이 필요했지만, List의 경우 자동인덱싱을
		지원하므로 단지 추가함 해주면 된다. 추가시에는 add()를 
		사용한다.*/
		
	}/////end of addFriend
	
	
	//저장된 연락처 전체정보 출력(확장for문 사용)
	public void showAllData() {
		/*
		확장for문의 형식
			=> for(저장된 타입 참조변수 : 반복할 배열 혹은 컬렉션)
			
		1.반복할 배열 혹은 컬렉션을 적는다
		2. : 
		3. 저장된 타입
		4. 참조변수 (변수명 내맘대로)
		 */
		for(FriendT fr : myFriends) {
//			System.out.println(a +" ");
			fr.showAllData();//객체가있겠지 함수가있겠지?
		}
	}
	//저장된 연락처 간략정보 출력(이터레이터 사용)
	public void showSimpleData() {
		Iterator<FriendT> itr = myFriends.iterator();
		//원소가있는지 확인하는 함수 hasNext()
		while(itr.hasNext()) {
			//확인하고 꺼낸다 next()
			/*위에서의 fr.showAllData의 fr.까지 만든것
			System.out.print(itr.next()); */
			itr.next().showBasicInfo();
		}
		System.out.println("\n===================\n");
	
	}
	
	/***************************************/
	
	/*
	연습문제] 이름을 입력받아 연락처를 검색하는 메서드를 작성하시오.
	 */
	
	//저장된 연락처 검색
	public void searchInfo() {
//		System.out.println("searchInfo 호출됨");
		//검색결과가 있는지 확인하기 위한 변수
		boolean isFind = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();
		
		//저장된 갯수만큼 반복해서 검색
		for(FriendT fr : myFriends) {
			//입력한 이름과 일치하는 항목을 찾는다.
			if(searchName.equals(fr.name)) {
				fr.showAllData();
				isFind = true;
			}
		}
		if(isFind==true) {
			System.out.println("일치하는 정보를 찾았습니다.");
		}
		else {
			System.out.println("일치하는 정보가 없습니다.");
		}
	}////end of searchInfo
	
	/*오늘의 숙제] 삭제할 이름을 입력받은 후 삭제하는 메서드를
	 	구현하시오. */
	//저장된 연락처 삭제
	public void deleteInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();
	
		Iterator<FriendT> itr = myFriends.iterator();
		while(itr.hasNext()) {
			//해당 루프의 객체 참조값을 변수에 저장한다.
			//itr.next()는 next()가 나올때마다 다음정보로 넘어가기때문에
			//변수에 담아준다. 그렇게되면 한번만 나올수있기때문
			FriendT fr = itr.next();
			//이름이 일치하는지 확인한다.
			//현재위치의 이름하고 이퀄스(비교 딜리트네임)
			if(fr.name.equals(deleteName)) {
				//참조값을 통해 객체를 삭제한다.
				//참조변수사용
				myFriends.remove(fr);
				isFind = true;
				//삭제 후 루프를 탈출한다.
				break;
			}
		}
		
		if(isFind==true) {
			System.out.println("삭제되었습니다.");
		}
		else {
			System.out.println("검색된 이름이 없습니다.");
		}
	}///end of deleteInfo
}


