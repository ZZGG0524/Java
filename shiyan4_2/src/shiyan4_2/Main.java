package shiyan4_2;

public class Main {
	public static void main(String [] args) {
		//设置单价
		CostCalculator cost=new CostCalculator(1,4);
		//圆
		Circle c=new Circle(3);
		//System.out.println("半径为3的圆的周长为："+c.GetPerimeter());
		System.out.println("半径为3的圆的边着色的价格为："+cost.calculate(c));
		//三角形
		Triangle t=new Triangle(3,3,3);
		//System.out.println("三边皆为3的三角形的周长为："+t.GetPerimeter());
		System.out.println("三边皆为3的三角形的面积着色的价格为："+cost.calculate(t));
		//长方形
		Rectangle r=new Rectangle(5,6);
		//System.out.println("长为6宽为5的长方形的周长为："+r.GetPerimeter());
		//System.out.println("长为6宽为5的长方形的面积为："+r.GetArea());
		System.out.println("长为6宽为5的长方形的边和面积着色的价格为："+cost.calculate(r));
	}
}
