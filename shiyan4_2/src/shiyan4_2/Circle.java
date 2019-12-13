package shiyan4_2;

public class Circle extends Shape2D implements BorderColorable{
	private double r;
	private boolean flag=false;//标记
	Circle(double r){
		this.r=r;
	}
	@Override
	public void paintBorder() {
		// TODO Auto-generated method stub
		System.out.println("已经将圆的边着色");
		flag=true;
	}

	@Override
	public boolean isBorderPainted() {
		// TODO Auto-generated method stub
		return flag;
	}

	@Override
	public double GetPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}

	@Override
	public double GetArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

}
