package shiyan5_1;

import java.util.Arrays;

public class StuArray implements ReList{
	private int i=0;
	public Student [] stu;
	public StuArray() {
		stu=new Student[i];
	}
	@Override
	public void add(Object obj){
		// TODO Auto-generated method stub
		stu=Arrays.copyOf(stu,stu.length+1);//容量每次增加1
		stu[i]=(Student)obj;
		i++;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return i;
	}
	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return stu[index];
	}
}
