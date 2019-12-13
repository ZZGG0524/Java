package shiyan3_3;

public class Student {
	private int sno;
	private String sname;
	private int course_num;
	private Course [] course;
	private int WeightedGrade=0;
	private int i=0;
	public Student(int sno, String sname, int course_num) {
		this.sno=sno;
		this.sname=sname;
		this.course_num=course_num;
		this.course=new Course[this.course_num];
	}
	public void addCourse(Course course) {
		this.course[i]=course;
		i++;
	}
	public int GetSno() {
		return this.sno;
	}
	public void calculateWeightedGrade() {
		int sumgrade = 0;
		int sumcredit = 0;
		for(int j=0;j<this.course_num;j++){
			if(!this.course[j].isDelay()){
				sumgrade = sumgrade+this.course[j].GetGrade()*this.course[j].GetCredit();
				sumcredit = sumcredit+this.course[j].GetCredit();
			}
		}
		this.WeightedGrade =  sumgrade/sumcredit;
	}
	public int GetWeightedGrade() {
		return this.WeightedGrade;
	}
	public String toString() {
		return "这个学生的学号是："+sno+",姓名是： "+sname+",选课数目为："+course_num;
	}
	public void printStudentInfo() {
		System.out.println("这个学生的学号是："+sno+",姓名是： "+sname+",选课数目为："+course_num);
		for(int t=0;t<this.course_num;t++) {
			System.out.println("    "+this.course[t].toString()+"    "+this.course[t].GetGrade());
		}
		calculateWeightedGrade();
		System.out.println("加权成绩为："+this.WeightedGrade);
	}
}
