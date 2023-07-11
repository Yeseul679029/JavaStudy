package ex12inheritance;

class AT {
	public AT() {} //A클래스의 디폴트 생성자(생략)
}

class BT extends AT {
	public BT() {//B클래스의 디폴트 생성자(생략)
		super();//부모클래스인 A의 생성자를 호출하는 문장(생략)
	}
}


public class Test {

	public static void main(String[] args) {
		/*자식 클래스인 B를 통해서 인스턴스를 생성한다.
		하지만 메모리상에는 부모의 인스턴스가 먼저 생성된 후 
		이를 토대로 자식의 인스턴스가 생성된다.
		만약 자식쪽에서 부모생성자를 호출하지 못하게되면 에러가 
		발생한다.
		디폴트가 아니라 인자를 가지고있는 상태가되면 super(9999)
		이렇게 될수가있다.
		*/
		BT b = new BT();

	}

}
