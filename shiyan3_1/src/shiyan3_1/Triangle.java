package shiyan3_1;

public class Triangle extends Shape2D{
	private double a;
	private double b;
	private double c;
	Triangle(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public double GetPerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public double GetArea() {
		// TODO Auto-generated method stub
		//º£Â×¹«Ê½
		//S=1/4sqrt[(a+b+c)(a+b-c)(a+c-b)(b+c-a)]
		return 0.25*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a));
	}
}
