package ex12inheritance;
/*
문제4) QuRingMake.java
다음 Point클래스를 이용하여 다음 문제를 해결하시오. 
해당 문제는 상속(Inheritance)을 통해 구현하는것이 아니라 구성(Composition)관계를 
이용하여 해결한다. Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자. 
그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.

실행결과]
안쪽원의 정보 :
반지름 : 3	
[x좌표:1, y좌표1]
바깥쪽원의 정보 :
반지름 : 9
[x좌표:2, y좌표2]

 */
class PointT {
	//멤버변수 : 중심점 표현을 위해 x,y좌표값을 설정
   	int xDot, yDot;
   	//생성자
   	public PointT(int x, int y) {
 		xDot=x;
 		yDot=y;
   	}
   	//멤버변수인 좌표값을 출력
   	public void showPointInfo() {
 		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class CircleT{	
	//멤버변수
	int radian;//반지름
	PointT center;
	//생성자
	public CircleT(int radian,int x, int y) {
		//멤버변수 반지름을 초기화
		this.radian = radian;
		//Point인스턴스를 생성 및 초기화
		center = new PointT(x,y);
	}
	//원의 정보를 출력하는 멤버메서드
	public void showCircleInfo() {
		//반지름을 출력한다.
		System.out.println("반지름:"+this.radian);
		//포인트 정보를 먼저 출력한다.
		center.showPointInfo();
	}
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class RingT{
	//멤버변수
	CircleT innerCircle;//안쪽의 원
	CircleT outerCircle;//바깥쪽의 원
	//생성자
	public RingT(int inX,int inY,int inRad,
				int outX,int outY,int outRad) {
		//안쪽 원 인스턴스 생성
		innerCircle = new CircleT(inRad,inX,inY);
		//바깥쪽 원 인스턴스 생성
		outerCircle = new CircleT(outRad,outX,outY);
	}
	//링의 정보를 출력하는 멤버메서드
	public void showRingInfo() {
		//링은 원 2개의 정보를 동시에 출력하면된다.
		System.out.println("안쪽원의 정보:");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의 정보:");
		outerCircle.showCircleInfo();
	}
}

public class QuRingMakeT {

	/*
	실행결과]
	안쪽원의 정보 :
	반지름 : 3	
	[x좌표:1, y좌표1]
	바깥쪽원의 정보 :
	반지름 : 9
	[x좌표:2, y좌표2]
	 */
	public static void main(String[] args) {
		RingT c = new RingT(1,1,3,2,2,9);
		c.showRingInfo();

	}

}
