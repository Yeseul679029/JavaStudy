package ex12inheritance;
/*
문제3) QuRectangleMain.java
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 
아래의 소스를 참조하여 구현하시오.

실행결과]
직사각형 면적: 12
정사각형 면적: 49
 */
/*
//직사각형을 표현한 클래스
class Rectangle{
	//멤버변수
	private int width;
	private int height;
	//생성자함수
	public Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
	}
	//멤버메소드
	public void showAreaInfo() {
		System.out.printf("직사각형 면적: %d\n",area());
	}
	public int area() {
		return width*height;
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{
     //멤버변수
//	int side;
	//생성자함수..?
	public Square(int side){
		super(side, side);
//		this.side = side;
	}
	//멤버메소드
	public void showAreaInfo() {
		System.out.printf("정사각형 면적: %d\n",area());
	}
} 

public class QuRectangleMain {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4, 3);
       	rec.showAreaInfo();

   		Square sqr = new Square(7);
       	sqr.showAreaInfo();

	}

}*/

//직사각형을 표현한 클래스
class Rectangle{
	//멤버변수
	private int width;
	private int height;
     //생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void showAreaInfo() {
		System.out.println("직사각형 면적: "+ (this.width*this.height));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{
     //생성자
	public Square(int num1) {
		super(num1, num1);
	}
	//멤버메소드
	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 면적 : "+ (getWidth()*getHeight()));
	}
} 
class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.showAreaInfo();

     		Square sqr = new Square(7);
	       	sqr.showAreaInfo();
 	}
}

