package shiyan3_1;

public class Rectangle extends Shape2D{
	private double a;
	private double b;
	
	Rectangle(double a,double b){
		this.a=a;
		this.b=b;
	}

	@Override
	public double GetPerimeter() {
		// TODO Auto-generated method stub
		return 2*(a+b);
	}

	@Override
	public double GetArea() {
		// TODO Auto-generated method stub
		return a*b;
	}
}
