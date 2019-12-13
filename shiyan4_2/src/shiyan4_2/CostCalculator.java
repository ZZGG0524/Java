package shiyan4_2;

public class CostCalculator {
	private double borderCost;
	private double solidCost;
	public CostCalculator(double borderCost, double solidCost) {
		this.borderCost=borderCost;
		this.solidCost=solidCost;
	}
	public double calculate(Shape2D shape) {
		/*if(shape.getClass().getSimpleName().equals("Circle")) {//获得类的名称与相应的类作比较
			return borderCost*shape.GetPerimeter();
		}
		else if(shape.getClass().getSimpleName().equals("Triangle")) {
			return solidCost*shape.GetArea();
		}
		else if(shape.getClass().getSimpleName().equals("Rectangle")) {
			return borderCost*shape.GetPerimeter()+solidCost*shape.GetArea();
		}
		else{
			return 0;
		}*/
		if(shape instanceof Circle) {
			return borderCost*shape.GetPerimeter();
		}
		else if(shape instanceof Triangle) {
			return solidCost*shape.GetArea();
		}
		else if(shape instanceof Rectangle) {
			return borderCost*shape.GetPerimeter()+solidCost*shape.GetArea();
		}
		else {
			return 0;
		}
	}
}
