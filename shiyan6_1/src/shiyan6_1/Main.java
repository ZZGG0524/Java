package shiyan6_1;

import java.util.Random;

public class Main {
	public static void main(String [] args) throws IllegalRationalException {
		Random ron1=new Random();
		Random ron2=new Random();
		Rational [] rational=new Rational[100];//存储分数
		InverseComparator [] inverseComparator=new InverseComparator[100];//存储分数的倒数
		try {
			for(int i=0;i<10;i++) {
				int numerator=ron1.nextInt(100);
				int denominator=ron2.nextInt(100);
				rational[i]=new Rational(numerator,denominator);
				inverseComparator[i]=new InverseComparator(denominator,numerator);
			}
		} catch (IllegalRationalException e) {
			// TODO: handle exception
		}
	}
}
