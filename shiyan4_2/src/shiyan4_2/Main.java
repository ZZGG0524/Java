package shiyan4_2;

public class Main {
	public static void main(String [] args) {
		//���õ���
		CostCalculator cost=new CostCalculator(1,4);
		//Բ
		Circle c=new Circle(3);
		//System.out.println("�뾶Ϊ3��Բ���ܳ�Ϊ��"+c.GetPerimeter());
		System.out.println("�뾶Ϊ3��Բ�ı���ɫ�ļ۸�Ϊ��"+cost.calculate(c));
		//������
		Triangle t=new Triangle(3,3,3);
		//System.out.println("���߽�Ϊ3�������ε��ܳ�Ϊ��"+t.GetPerimeter());
		System.out.println("���߽�Ϊ3�������ε������ɫ�ļ۸�Ϊ��"+cost.calculate(t));
		//������
		Rectangle r=new Rectangle(5,6);
		//System.out.println("��Ϊ6��Ϊ5�ĳ����ε��ܳ�Ϊ��"+r.GetPerimeter());
		//System.out.println("��Ϊ6��Ϊ5�ĳ����ε����Ϊ��"+r.GetArea());
		System.out.println("��Ϊ6��Ϊ5�ĳ����εıߺ������ɫ�ļ۸�Ϊ��"+cost.calculate(r));
	}
}
