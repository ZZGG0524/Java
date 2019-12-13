package shiyan4_1;

public class Main {
	public static void main(String [] args) {
		String s;
		ReArrayList r1 = new ReArrayList(1);
		s="dog";
		r1.add(s);
		System.out.println("元素 "+s+" 插入数组成功！");
		System.out.println("rearraylist数组长度为:"+r1.size());
		s="cat";
		r1.add(s);
		System.out.println("元素 "+s+" 插入数组成功！");
		System.out.println("rearraylist数组长度为:"+r1.size());
		s="rabbit";
		r1.add(s);
		System.out.println("元素 "+s+" 插入数组成功！");
		System.out.println("rearraylist数组长度为:"+r1.size());
		System.out.println("rearraylist数组第1个元素是:"+r1.get(0).toString());
		System.out.println("rearraylist数组第2个元素是:"+r1.get(1).toString());
		System.out.println("rearraylist数组第3个元素是:"+r1.get(2).toString());
		
		ReDoubledArrayList r2=new ReDoubledArrayList(1);
		s="fox";
		r2.add(s);
		System.out.println("元素 "+s+" 插入数组成功！");
		System.out.println("redoublearraylist数组长度为:"+r2.size());
		s="mouse";
		r2.add(s);
		System.out.println("元素 "+s+" 插入数组成功！");
		System.out.println("redoublearraylist数组长度为:"+r2.size());
		s="ant";
		r2.add(s);
		System.out.println("元素 "+s+" 插入数组成功！");
		System.out.println("redoublearraylist数组长度为:"+r2.size());
		System.out.println("redoublearraylist数组第1个元素是:"+r2.get(0).toString());
		System.out.println("redoublearraylist数组第2个元素是:"+r2.get(1).toString());
		System.out.println("redoublearraylist数组第3个元素是:"+r2.get(2).toString());
	}
}
