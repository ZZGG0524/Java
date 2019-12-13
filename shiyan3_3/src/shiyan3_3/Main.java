package shiyan3_3;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Class myclass = new Class("1",5);
		
		Student stu1 = new Student(1,"漩涡鸣人",1);
		Course c1 = new Course(1,"数学",5);
		c1.SetGrade(91);
		c1.SetDelay(false);
		stu1.addCourse(c1);
		myclass.addStudent(stu1);
		
		Student stu2 = new Student(2,"宇智波佐助",2);
		Course c2 = new Course(1,"数学",5);
		c2.SetGrade(92);
		c2.SetDelay(false);
		stu2.addCourse(c2);
		Course c3 = new Course(2,"英语",4);
		c3.SetGrade(92);
		c3.SetDelay(false);
		stu2.addCourse(c3);
		myclass.addStudent(stu2);
		
		
		Student stu3 = new Student(3,"春野樱",3);
		Course c4 = new Course(1,"数学",5);
		c4.SetGrade(93);
		c4.SetDelay(false);
		stu3.addCourse(c4);
		Course c5 = new Course(2,"英语",4);
		c5.SetGrade(93);
		c5.SetDelay(false);
		stu3.addCourse(c5);
		Course c6 = new Course(3,"化学",3);
		c6.SetGrade(93);
		c6.SetDelay(false);
		stu3.addCourse(c6);
		myclass.addStudent(stu3);
		
		
		Student stu4 = new Student(4,"自来也",4);
		Course c7 = new Course(1,"数学",5);
		c7.SetGrade(94);
		c7.SetDelay(false);
		stu4.addCourse(c7);
		Course c8 = new Course(2,"英语",4);
		c8.SetGrade(94);
		c8.SetDelay(false);
		stu4.addCourse(c8);
		Course c9 = new Course(3,"化学",3);
		c9.SetGrade(94);
		c9.SetDelay(false);
		stu4.addCourse(c9);
		Course c10 = new Course(4,"物理",2);
		c10.SetGrade(94);
		c10.SetDelay(false);
		stu4.addCourse(c10);
		myclass.addStudent(stu4);
		
		
		Student stu5 = new Student(5,"纲手",5);
		Course c11 = new Course(1,"数学",5);
		c11.SetGrade(95);
		c11.SetDelay(false);
		stu5.addCourse(c11);
		Course c12 = new Course(2,"英语",4);
		c12.SetGrade(95);
		c12.SetDelay(false);
		stu5.addCourse(c12);
		Course c13 = new Course(3,"化学",3);
		c13.SetGrade(95);
		c13.SetDelay(false);
		stu5.addCourse(c13);
		Course c14 = new Course(4,"物理",2);
		c14.SetGrade(95);
		c14.SetDelay(false);
		stu5.addCourse(c14);
		Course c15 = new Course(5,"生物",1);
		c15.SetGrade(95);
		c15.SetDelay(true);
		stu5.addCourse(c15);
		myclass.addStudent(stu5);
		
		int i=1;
		Scanner input= new Scanner(System.in);
		while(i==1){
			System.out.println(myclass.toString());
			myclass.calculateWeightedGrade();
			System.out.println("请输入需要查询的学生的学号:");
			int in=input.nextInt();
			if(in==-1){
				i=0;
			}
			else{
				myclass.GetStu(in);
			}
		}
		input.close();
	}
}
