package ex08class;

public class E02HumanMainP {

	public static void main(String[] args) {
		HumanP human = new HumanP();
		
		human.name = "김지현";
		human.age = 28;
		human.energy = 4;
		human.kibun = 5;
		
		human.showState();
		human.eating();
		human.walking();
		human.thinking();
		human.showState();
		
		for(int i=1; i<=20;i++) {
			human.walking();
			System.out.println(i+"번 걷습니다");
		}
		human.showState();
		
		for(int i=1; i<=5; i++) {
			human.eating();
			System.out.println(i+"번 밥을 먹습니다");
		}
		human.showState();
		for(int i=1; i<=3; i++) {
			human.thinking();
			System.out.println(i+"번 생각해");
		}
		human.showState();
		System.out.println("생각을 너무많이했어 ;;");
	}

}
