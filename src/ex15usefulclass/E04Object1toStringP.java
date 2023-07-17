package ex15usefulclass;

class myFriendsP extends Object{
	String myName;

	public myFriendsP(String myName) {
		this.myName = myName;
	}
	@Override
	public String toString() {
		return "이름:"+ myName;
	}
}
class yourFriendsP extends Object{
	String myName;

	public yourFriendsP(String myName) {
		this.myName = myName;
	}
	
}
public class E04Object1toStringP {

	public static void main(String[] args) {
		myFriendsP fnd1 = new myFriendsP("성유겸");
		yourFriendsP fnd2 = new yourFriendsP("헬로비너스");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
	}

}
