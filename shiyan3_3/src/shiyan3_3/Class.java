package shiyan3_3;

public class Class {
	private String class_name;
	private int stu_num;
	private Student [] stu_info;
	private int i=0;
	public Class(String class_name,int stu_num) {
		this.class_name=class_name;
		this.stu_num=stu_num;
		this.stu_info=new Student[stu_num];
	}
	public void addStudent(Student student) {
		this.stu_info[i]=student;
		i++;
	}
	public void calculateWeightedGrade() {
		for(int j=0;j<this.stu_num;j++)
		{
			this.stu_info[j].GetWeightedGrade();
		}
	}
	public String toString() {
		return "班级名称是："+this.class_name+",班级人数为："+this.stu_num;
	}
	public void GetStu(int sno) {
		int j = -1;
		for(int t=0;t<this.stu_num;t++){
			if(this.stu_info[t].GetSno()==sno)
			j = t;
		}
		if(j!=-1){
			this.stu_info[j].printStudentInfo();
		}
		else{
			System.out.println("没找到该学生！");
		}
	}
}
