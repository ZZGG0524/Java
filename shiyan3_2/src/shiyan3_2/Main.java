package shiyan3_2;

public class Main {
	public static void main(String [] args) {
		Point2D p1=new Point2D(5,6);
		Point2D p2=new Point2D(3,4);
		
		Line2D l1=new Line2D(1,3);
		Line2D l2=new Line2D(p1,p2);
		Line2D l3=new Line2D(2,3,1);
		System.out.println(l1.isParallel(l2));
		System.out.println(l1.isParallel(l3));
		System.out.println(l2.isParallel(l3));
	}
}
