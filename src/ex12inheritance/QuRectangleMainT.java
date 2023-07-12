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


//직사각형을 표현한 클래스
class RectangleT{
	//멤버변수 : 가로, 세로길이
	private int width;
	private int height;
	
	//private멤버변수를 외부에서 반환받기 위한 getter 선언
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	//생성자
	public RectangleT(int width, int height) {
		this.width= width;	
		this.height= height;	
	}
	public void showAreaInfo() {
		System.out.println("직사각형 면적:"+ (width*height));
	}
	
		
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class SquareT extends RectangleT{
    /* 정사각형은 밑변과 높이의 길이가 같으므로 하나의 값으로
    두개의 길이를 대체할 수 있다.*/ 
	
	//멤버변수 : 여기서는 확장이 필요 없다.
	
	//생성자 : 하나의 값으로 2개를 초기화한다.
	public SquareT(int w) {
		//매개변수 하나를 받아서 두개를 쓴다.
		super(w, w);
	}
	/* 부모 클래스에서 private으로 선언된 멤버변수 이므로 직접적인
	접근은 불가능하다. 따라서 getter를 통해 값을 얻어온 후 연산해야한다.*/
	@Override
	public void showAreaInfo() {
		System.out.println("정사각형면적:"+
				(getWidth() * super.getHeight()));
	}
}

public class QuRectangleMainT {

	public static void main(String[] args) {
		RectangleT rec = new RectangleT(4, 3);
       	rec.showAreaInfo();

   		SquareT sqr = new SquareT(7);
       	sqr.showAreaInfo();
	}

}
