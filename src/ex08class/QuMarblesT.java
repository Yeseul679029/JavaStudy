package ex08class;

//1. 가장먼저 필요한 클래스를 생성.
class ChildPropertyT{
	//멤버변수 선언 : 어린이가 보유한 구슬의 갯수
	int bead;
	
	//생성자메서드 정의 (인수가 없다면 없어도 괜찮지만 인수가있으니 생성)
	public ChildPropertyT(int bead) {
		this.bead = bead;
		/*
		this의 두가지 활용법
		1. 생성자에서 또다른 생성자 호출(생성자 오버로딩)
			=> this(인수1, 인수2..)
		2. 멤버변수와 매개변수를 구분할때 사용
			=> this.멤버변수명
		*/
	}
	
	//멤버메서드
	//어린이가 보유한 구슬의 갯수를 출력한다.
	void showProperty() {
		System.out.println("보유한 구슬의 갯수: "+bead);
	}
	//구슬치기 게임을 진행한다.
	//ChildPropertyT타입과 int타입이 필요
	void obtainBead(ChildPropertyT child, int beadCnt) {
		/*
		해당 멤버메서드를 호출하는 어린이 객체는 게임에서 승리하여
		구슬을 획득해야하고, 매개변수로 전달되는 어린이 객체는
		패배하여 구슬을 상실해야한다. 
		 */
		//패배한 어린이 인스턴스는 구슬을 차감한다.
		child.bead -= beadCnt;
		//승리한 어린이(객체 자신)은 구슬을 증가시킨다.
		this.bead += beadCnt;
	}
	
}

public class QuMarblesT {

	public static void main(String[] args) {

		ChildPropertyT child1 = new ChildPropertyT(20);
		ChildPropertyT child2 = new ChildPropertyT(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();

	}

}
