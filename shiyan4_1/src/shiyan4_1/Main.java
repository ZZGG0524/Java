package shiyan4_1;

public class Main {
	public static void main(String [] args) {
		String s;
		ReArrayList r1 = new ReArrayList(1);
		s="dog";
		r1.add(s);
		System.out.println("Ԫ�� "+s+" ��������ɹ���");
		System.out.println("rearraylist���鳤��Ϊ:"+r1.size());
		s="cat";
		r1.add(s);
		System.out.println("Ԫ�� "+s+" ��������ɹ���");
		System.out.println("rearraylist���鳤��Ϊ:"+r1.size());
		s="rabbit";
		r1.add(s);
		System.out.println("Ԫ�� "+s+" ��������ɹ���");
		System.out.println("rearraylist���鳤��Ϊ:"+r1.size());
		System.out.println("rearraylist�����1��Ԫ����:"+r1.get(0).toString());
		System.out.println("rearraylist�����2��Ԫ����:"+r1.get(1).toString());
		System.out.println("rearraylist�����3��Ԫ����:"+r1.get(2).toString());
		
		ReDoubledArrayList r2=new ReDoubledArrayList(1);
		s="fox";
		r2.add(s);
		System.out.println("Ԫ�� "+s+" ��������ɹ���");
		System.out.println("redoublearraylist���鳤��Ϊ:"+r2.size());
		s="mouse";
		r2.add(s);
		System.out.println("Ԫ�� "+s+" ��������ɹ���");
		System.out.println("redoublearraylist���鳤��Ϊ:"+r2.size());
		s="ant";
		r2.add(s);
		System.out.println("Ԫ�� "+s+" ��������ɹ���");
		System.out.println("redoublearraylist���鳤��Ϊ:"+r2.size());
		System.out.println("redoublearraylist�����1��Ԫ����:"+r2.get(0).toString());
		System.out.println("redoublearraylist�����2��Ԫ����:"+r2.get(1).toString());
		System.out.println("redoublearraylist�����3��Ԫ����:"+r2.get(2).toString());
	}
}
