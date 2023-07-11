package ex12inheritance;

/*
문제1) 파일명 :  QuConstructorAndSuper.java
상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 
다음 클래스의 적절한 생성자를 삽입해보자. 
그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.

실행결과]
남은가솔린:10
남은전기량:20
남은워터량:30

 */
//자동차를 표현하는 자동차클래스
/* 상속관계가 있는 클래스에서 자식 클래스를 통해 인스턴스를 생성할때에는
반드시 부모클래스의 인스턴스를 먼저 생성해야 한다. 이때 super()를
사용해서 부모의 생성자를 호출한다.*/
class CarT{
   	int gasoline;
   	//생성자생성
   	public CarT(int gas) {
   		gasoline = gas;
   	}
}

class HybridCarT extends CarT{
   	int electric;
   	//인수 1개를 부모로 전달하고 멤버변수를 초기화한다.
   	public HybridCarT(int ga, int hy) {
   		super(ga);
   		electric= hy;
   	}
}

class HybridWaterCarT extends HybridCarT{
	int water;
 
	//생성자 생성
	//부모클래스로 2개의 인수를 전달하고, 1개는 멤버변수를 초기화한다.
	public HybridWaterCarT(int g,int e,int w) {
		super(g,e);
		water = w;
	}
	
   	public void showNowGauge(){
     	System.out.println("남은가솔린:"+gasoline);
     	System.out.println("남은전기량:"+electric);
     	System.out.println("남은워터량:"+water);
   	}
}


public class QuConstructorAndSuperT {

	public static void main(String[] args) {
		
		
		HybridWaterCarT hcar = new HybridWaterCarT(10,20,30);
		hcar.showNowGauge();

	}

}
