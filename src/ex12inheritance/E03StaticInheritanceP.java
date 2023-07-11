package ex12inheritance;

class AdderP {
	public static int val = 0;
	
	public void add(int num) {
		val += num;
		AdderP.val += num;
	}
}
class AdderFriendP extends AdderP{
	
	public void friendAdd(int num) {
		val+=num;
		AdderP.val += num;
	}
	public void showVal() {
		System.out.println("val="+val);
		System.out.println("val="+AdderP.val);
	}
}
public class E03StaticInheritanceP {

	public static void main(String[] args) {
		
		AdderP ad = new AdderP();
		AdderFriendP adFriend = new AdderFriendP();
		
		ad.add(1);
		adFriend.friendAdd(3);
		AdderP.val +=5;
		AdderFriendP.val +=7;
		
		adFriend.showVal();
	}

}
