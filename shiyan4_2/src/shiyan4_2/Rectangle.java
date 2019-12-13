package shiyan4_2;

public class Rectangle extends Shape2D implements BorderColorable,SolidColorable{
	private double a;
	private double b;
	private boolean flag_s=false;//形状shape的标记
	private boolean flag_b=false;//边border的标记
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
	
	@Override
	public void paintShape() {
		// TODO Auto-generated method stub
		System.out.println("已经将长方形进行着色");
		flag_s=true;
	}

	@Override
	public boolean isShapePainted() {
		// TODO Auto-generated method stub
		return flag_s;
	}

	@Override
	public void paintBorder() {
		// TODO Auto-generated method stub
		System.out.println("已经将长方形的边着色");
		flag_b=true;
	}

	@Override
	public boolean isBorderPainted() {
		// TODO Auto-generated method stub
		return flag_b;
	}
}
