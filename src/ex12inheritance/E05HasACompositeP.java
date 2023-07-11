package ex12inheritance;

class GunP{
	int bullet;
	public GunP(int bNum) {
		bullet = bNum;
	}
	public void shutGun() {
		System.out.println("빵야~~~!");
		bullet--;
	}
}
class PoliceP{
	int handCuffs;
	GunP gun;
	
	public PoliceP(int bNum,int hCuff) {
		handCuffs = hCuff;
		if(bNum<=0) {
			gun = null;
		}
		else {
			gun = new GunP(bNum);
		}
	}
	
	public void putHandcuff() {
		System.out.println("수갑채움! 너 콩밥!!!");
		handCuffs--;
	}
	public void shut() {
		if(gun==null) {
			System.out.println("보유한 권총없음. 헛빵~~");
		}
		else {
			gun.shutGun();
		}
	}
}
public class E05HasACompositeP {

	public static void main(String[] args) {

		System.out.println("==경찰1==");
		PoliceP police1 = new PoliceP(5, 3);
		police1.shut();
		police1.putHandcuff();
		
		System.out.println("==경찰2==");
		PoliceP police2 = new PoliceP(0, 3);
		police2.shut();
		police2.putHandcuff();
	}

}
