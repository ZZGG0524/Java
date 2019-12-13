package shiyan4_2;

public class Triangle extends Shape2D implements SolidColorable{
	private double a;
	private double b;
	private double c;
	private boolean flag=false;//标记
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
		//海伦公式
		//S=1/4sqrt[(a+b+c)(a+b-c)(a+c-b)(b+c-a)]
		return 0.25*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a));
	}
	@Override
	public void paintShape() {
		// TODO Auto-generated method stub
		System.out.println("已经将三角形进行着色");
		flag=true;
	}

	@Override
	public boolean isShapePainted() {
		// TODO Auto-generated method stub
		return flag;
	}
}
