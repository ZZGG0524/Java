package shiyan5_1;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) throws InvalidScoreException {
		Scanner input=new Scanner(System.in);
		StuArray stuarray=new StuArray();
		
		System.out.println("������ѧ���������ͳɼ���");
		String name=null;
		double grade;
		double avg=0;
		int count=0;
		boolean n=true;
		while(n) {
			try {
				double score;
				name=input.next();
				score=input.nextDouble();
				if(name.equals("-1")) {
					n=false;
					break;
				}
				if(score==-1) {
					n=false;
					Student stu_name=new Student(name);
					stuarray.add(stu_name);
					break;
				}
				grade=score;
				if(grade<0||grade>100) {
					throw new InvalidScoreException(grade);
				}
				else{
					Student stu=new Student(name,grade);
					stuarray.add(stu);
				}
			}catch(InvalidScoreException e){
				System.out.println("�ɼ� "+e.GetGrade()+" ��Ч��");
				System.out.println("����������ɼ���");
				grade=input.nextDouble();
				Student stu=new Student(name,grade);
				stuarray.add(stu);
			}
		}
		System.out.println("ѧ���������ͳɼ����£�");
		for(int i=0;i<stuarray.size();i++) {
			avg+=((Student)stuarray.get(i)).GetGrade();
			if(((Student)stuarray.get(i)).GetGrade()>=60) {
				count++;
			}
			System.out.println(((Student)stuarray.get(i)).GetName()+"	"+((Student)stuarray.get(i)).GetGrade());
		}
		System.out.printf("ƽ���ɼ���%.1f\n",avg/stuarray.size());
		System.out.printf("������    ��%.1f%%\n",(double)count*100/stuarray.size());
		input.close();
	}
}
