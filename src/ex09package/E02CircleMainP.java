package ex09package;

import ex09package.study.perimeter.CircleP;

public class E02CircleMainP {

	public static void main(String[] args) {

		ex09package.study.area.CircleP circle1 = 
				new ex09package.study.area.CircleP(6.5);
		System.out.println("반지름이 6.5인 원의넓이:"+ circle1.getArea());
		
		CircleP circle2 = new CircleP(4.5);
		System.out.println("반지름이 4.5인 원의둘레:"+circle2.getPerimeter());
	}

}
