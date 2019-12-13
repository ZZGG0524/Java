package shiyan3_3;

public class Course {
	private int cno;
	private String cname;
	private int credit;
	private boolean delay;
	private int grade;
	public Course(int cno, String cname, int credit) {
		this.cno=cno;
		this.cname=cname;
		this.credit=credit;
	}
	public void SetDelay(boolean delay) {
		this.delay=delay;
	}
	public boolean isDelay() {
		return delay;
	}
	public void SetGrade(int grade) {
		if(grade>=0&&grade<=100) {
			this.grade=grade;
		}
		else {
			System.out.println("³É¼¨ÎŞĞ§£¡");
			this.grade=-1;
		}
	}
	public int GetGrade() {
		return this.grade;
	}
	public int GetCredit(){
		return this.credit;
	}
	public String toString() {
		return cno+"    "+cname +"    "+credit;
	}
}
