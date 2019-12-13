package shiyan1_1;

import java.util.*;

public class Rate {
	public static void main(String [] args) {
		double rate;
		int year;
		int money;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入存款金额：");
		money=input.nextInt();
		System.out.println("请输入年利率：");
		rate=input.nextDouble();
		System.out.println("请输入存款时间：");
		year=input.nextInt();
		System.out.println("存款的本息为："+(money*Math.pow(1+rate,year)));
		input.close();
	}
}
