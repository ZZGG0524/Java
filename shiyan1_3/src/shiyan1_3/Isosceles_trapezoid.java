package shiyan1_3;

import java.util.*;

public class Isosceles_trapezoid {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		int i,j,k;
		System.out.println("������������ε��ϱ߳��ȣ�");
		int m=input.nextInt();
		System.out.println("������������εĲ�����");
		int n=input.nextInt();
		int t=n;
		for(i=0;i<n;i++) {
			for(k=t-1;k>0;k--) {
				System.out.print(" ");
			}
			for(j=0;j<(m+2*i);j++) {
				System.out.print("*");
			}
			t--;
			System.out.println();
		}
		input.close();
	}
}
