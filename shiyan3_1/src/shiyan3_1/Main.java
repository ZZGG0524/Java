package shiyan3_1;

public class Main {
	public static void main(String [] args) {
		//Բ
		Circle c=new Circle(3);
		System.out.println("�뾶Ϊ3��Բ���ܳ�Ϊ��"+c.GetPerimeter());
		System.out.println("�뾶Ϊ3��Բ�����Ϊ��"+c.GetArea());
		//������
		Triangle t=new Triangle(3,3,3);
		System.out.println("���߽�Ϊ3�������ε��ܳ�Ϊ��"+t.GetPerimeter());
		System.out.println("���߽�Ϊ3�������ε����Ϊ��"+t.GetArea());
		//������
		Rectangle r=new Rectangle(5,6);
		System.out.println("��Ϊ6��Ϊ5�ĳ����ε��ܳ�Ϊ��"+r.GetPerimeter());
		System.out.println("��Ϊ6��Ϊ5�ĳ����ε����Ϊ��"+r.GetArea());
	}
}
