package shiyan3_1;

public class Main {
	public static void main(String [] args) {
		//圆
		Circle c=new Circle(3);
		System.out.println("半径为3的圆的周长为："+c.GetPerimeter());
		System.out.println("半径为3的圆的面积为："+c.GetArea());
		//三角形
		Triangle t=new Triangle(3,3,3);
		System.out.println("三边皆为3的三角形的周长为："+t.GetPerimeter());
		System.out.println("三边皆为3的三角形的面积为："+t.GetArea());
		//长方形
		Rectangle r=new Rectangle(5,6);
		System.out.println("长为6宽为5的长方形的周长为："+r.GetPerimeter());
		System.out.println("长为6宽为5的长方形的面积为："+r.GetArea());
	}
}
