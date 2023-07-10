package ex10accessmodifier;

class MemberRegistP {
	void doMemberRegist() {
		System.out.println("1.회원가입을 진행합니다.");
	}
}
class CongratulationPointP{
	void doCongratulationPoint() {
		System.out.println("3.가입축하 10포인트를 지급합니다.");
	}
}
class AutoLoginP {
	void doAutoLogin() {
		System.out.println("2.자동로그인");
	}
}
class FirstLoginEventP{
	void doFirstLoginEvent() {
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다.");
	}
}
class EncapsulLogicP{
	
	MemberRegistP memberRegist = new MemberRegistP();
	FirstLoginEventP firstLoginEvent = new FirstLoginEventP();
	AutoLoginP autoLogin = new AutoLoginP();
	CongratulationPointP congratulationPoint = new CongratulationPointP();
	
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		firstLoginEvent.doFirstLoginEvent();
	}
}
public class E05EncapsulationP {

	public static void main(String[] args) {

		System.out.println("캡슐화 전 코드");
		
		MemberRegistP memberRegist = new MemberRegistP();
		FirstLoginEventP firstLoginEvent = new FirstLoginEventP();
		AutoLoginP autoLogin = new AutoLoginP();
		CongratulationPointP congratulationPoint = new CongratulationPointP();
		
		memberRegist.doMemberRegist();
		firstLoginEvent.doFirstLoginEvent();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		
		System.out.println("==============================");
		
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogicP().doProcess();
	}

}
