package shiyan3_1;

public class Circle extends Shape2D{
	private double r;
	Circle(double r){
		this.r=r;
	}
	public double GetPerimeter() {
		return 2*Math.PI*r;
	}
	public double GetArea() {
		return Math.PI*r*r;
	}
}
