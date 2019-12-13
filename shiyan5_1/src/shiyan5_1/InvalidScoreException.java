package shiyan5_1;

public class InvalidScoreException extends Exception{
	private static final long serialVersionUID = 1L;
	private double grade;
	public InvalidScoreException(double grade) {
		this.grade=grade;
	}
	public double GetGrade() {
		return grade;
	}
}
