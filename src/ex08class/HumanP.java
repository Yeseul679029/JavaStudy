package ex08class;
/*
시나리오]
다음에 주어진 조건으로 '사람'을 추상화 하시오
-속성 : 이름, 나이, 에너지
-행동 : 걷는다, 생각한다, 먹는다, 현재상태표현
-행동의조건
	먹으면 에너지가 2증가
	걸으면 에너지가 1감소
	생각하면 에너지가 2감소
	단, 에너지의 최대/최소 범위는 0~10으로 한다.
	무한히 먹을수 없고, 에너지는 마이너스가 될수없기 때문.
 */
public class HumanP {

	String name;
	int age;
	int energy;
	int kibun;
	
	void walking() {
		energy--;
		kibun--;
		if(energy<0) {
			energy=0;
			System.out.println("[walk]에너지는 0이 최소입니다.");
			System.out.println("[walk]기분은 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[walk]에너지가 1감소하였습니다.");
			System.out.println("[walk]기분이 1감소하였습니다.");
		}
	}
	
	void thinking() {
		energy -=2;
		kibun -=2;
		if(energy<0) {
			energy=0;
			System.out.println("[thinking]에너지는 0이 최소입니다.");
			System.out.println("[thinking]기분은 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[thinking]에너지가 2감소하였습니다.");
			System.out.println("[thinking]기분이 2감소하였습니다.");
		}
	}
	
	void eating() {
		energy+=2;
		kibun++;
		if(energy>10) {
			energy=10;
			System.out.println("[eat]에너지는 10이 최대입니다.");
			System.out.println("[eat]기분은 10이 최대입니다.");
		}
		else {
			System.out.println("[eat]에너지가 2증가하였습니다.");
			System.out.println("[eat]기분이 1증가하였습니다.");
		}
	}
	void showState() {
		System.out.println("===님의 현재상태는===");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("에너지:"+energy);
		System.out.println("기분:"+kibun);
		System.out.println("====================");
	}
	
}
