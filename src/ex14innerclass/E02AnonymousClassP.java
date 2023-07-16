package ex14innerclass;

class SingerP{
	String name;
	public SingerP(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "이름:"+name;
	}
}
class GirlGroupP extends SingerP{
	String team;

	public GirlGroupP(String name, String team) {
		super(name);
		this.team = team;
	}
	@Override
	public String toString() {
		return super.toString()+", 팀명:"+team;
	}
}
interface ISingerP{
	public void dancing();
}
public class E02AnonymousClassP {

	public static void main(String[] args) {
		SingerP s1 = new SingerP("조용필");
		System.out.println(s1);
		
		SingerP s2 = new GirlGroupP("아이린", "레벨");
		System.out.println(s2);
		
		SingerP s3 = new GirlGroupP("츄", "이달소") {
			@Override
			public String toString() {
				return super.toString()+", 소속사:몰러";
			}
		};
		System.out.println(s3);
		
		ISingerP s4 = new ISingerP() {
			
			@Override
			public void dancing() {
				System.out.println("춤추는게 좋아요~");
			}
		};
		s4.dancing();
	}

}
