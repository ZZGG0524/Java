package shiyan3_2;

public class Point2D {
	private double x;
	private double y;
	public Point2D(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Point2D p) {
		if((this.x==p.x)&&(this.y==p.y)) {
			return true;
		}
		else {
			return false;
		}
	}
	public double GetX(){
		return this.x;
	}
	public double GetY() {
		return this.y;
	}
}
