package shiyan4_2;

public class Rectangle extends Shape2D implements BorderColorable,SolidColorable{
	private double a;
	private double b;
	private boolean flag_s=false;//��״shape�ı��
	private boolean flag_b=false;//��border�ı��
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
		System.out.println("�Ѿ��������ν�����ɫ");
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
		System.out.println("�Ѿ��������εı���ɫ");
		flag_b=true;
	}

	@Override
	public boolean isBorderPainted() {
		// TODO Auto-generated method stub
		return flag_b;
	}
}
