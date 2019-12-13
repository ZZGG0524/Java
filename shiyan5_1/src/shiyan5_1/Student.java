package shiyan5_1;

public class Student {
	private String name;
	private double grade;
	public Student(String name,double grade) {
		this.name=name;
		this.grade=grade;
	}
	public Student(String name) {
		this.name=name;
	}
	public Student(double grade) {
		this.grade=grade;
	}
	public String GetName() {
		return name;
	}
	public double GetGrade() {
		return grade;
	}
}