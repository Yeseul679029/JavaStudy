package ex09package.study.perimeter;

public class CircleP {
	double rad;
	final double PI;
	
	public CircleP(double rad) {
		this.rad = rad;
		PI = 3.14159;
	}
	public double getPerimeter() {
		return 2 * PI * rad;
	}
}
