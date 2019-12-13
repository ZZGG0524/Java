package shiyan3_2;

public class Line2D {
	private double A;
	private double B;
	private double C;
    public Line2D(double k,double b){
        A=k;
        B=-1;
        C=b;
    }
    public Line2D(Point2D a,Point2D b){
        if(!a.equals(b))
        {
            A=1/(a.GetX()-b.GetX());
            B=1/(b.GetY()-a.GetY());
            C=b.GetY()/(a.GetY()-b.GetY())-b.GetX()/(a.GetX()-b.GetX());
        }
        else
        {
            System.out.print("Two points is same!\n");
            System.exit(0);
        }
    }
    public Line2D(double a,double b,int t){
        if(t==1)
        {
            A=b;
            B=a;
            C=-a*b;
        }
        else
        {
            System.out.println("Format error!");
            System.exit(0);
        }
    }
    public boolean equals(Line2D b){
        if(A==b.A&&B==b.B&&C==b.C) {
        	return true;
        }
        return false;
    }
    public boolean isParallel(Line2D b){
        if(A*b.B==B*b.A&&C!=b.C) {
        	return true;
        }
        return false;
    }
}
