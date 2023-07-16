package ex14innerclass;

class UnitP{
	private String name;
	private int healthPoint;
	
	MarineP marine;
	MedicP medic;
	public UnitP(String name, int healthPoint) {
		super();
		this.name = name;
		this.healthPoint = healthPoint;
		marine = new MarineP();
//		medicP = new MedicP();
	}
	public String infoStr() {
		return "유닛정보[이름:"+name+", 체력:"+healthPoint+"]";
	}
	class MarineP{
		int attackPower;
		public void attack() {
			System.out.println(infoStr()+"\n마린이 공격한다.");
		}
	}
	class MedicP{
		int healPower;
		public void heal() {
			System.out.println(infoStr()+"\n메딕이 치료한다.");
		}
	}
}
public class E01InnerClassMainP {

	public static void main(String[] args) {
		UnitP unitP = new UnitP("커맨드센터", 1000);
		System.out.println(unitP.infoStr());
		
		UnitP.MarineP marine = new UnitP("마린", 50).marine;
		marine.attack();
		
		UnitP.MedicP medic = new UnitP("메딕", 30).new MedicP();
		medic.heal();
	}

}
