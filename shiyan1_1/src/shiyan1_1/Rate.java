package shiyan1_1;

import java.util.*;

public class Rate {
	public static void main(String [] args) {
		double rate;
		int year;
		int money;
		Scanner input=new Scanner(System.in);
		System.out.println("���������");
		money=input.nextInt();
		System.out.println("�����������ʣ�");
		rate=input.nextDouble();
		System.out.println("��������ʱ�䣺");
		year=input.nextInt();
		System.out.println("���ı�ϢΪ��"+(money*Math.pow(1+rate,year)));
		input.close();
	}
}
