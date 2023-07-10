package ex09package.study.area;

public class CircleP {

	double rad;
	final double PI;
	
	public CircleP(double rad) {
		this.rad = rad;
		PI = 3.14159;
	}
	public double getArea() {
		return PI * rad * rad;
	}
}
