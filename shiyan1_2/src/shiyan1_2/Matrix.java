package shiyan1_2;

import java.util.*;

public class Matrix {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		int i,j,k;
		int a,b,c,d;
		System.out.println("�������һ��������У�");
		a=input.nextInt();
		System.out.println("�������һ��������У�");
		b=input.nextInt();
		int x[][]=new int[a][b];
		System.out.println("������ڶ���������У�");
		c=input.nextInt();
		System.out.println("������ڶ���������У�");
		d=input.nextInt();
		int y[][]=new int[c][d];
		if(b!=c) {
			System.out.println("�������ݣ�");
			System.exit(0);
		}
		System.out.println("�������һ�������е�����Ԫ�أ�");
		for(i=0;i<a;i++) {
			for(j=0;j<b;j++) {
				x[i][j]=input.nextInt();
			}
		}
		System.out.println("������ڶ��������е�����Ԫ�أ�");
		for(i=0;i<c;i++) {
			for(j=0;j<d;j++) {
				y[i][j]=input.nextInt();
			}
		}
		int z[][]=new int[a][d];
		for(i=0;i<a;i++) {
			for(j=0;j<d;j++) {
				int m=0,n=0;
				for(k=0;k<c;k++) {
					m=x[i][k]*y[k][j];
					n+=m;
				}
				z[i][j]=n;
			}
		}
		System.out.println("����������˵Ľ��Ϊ��");
		for(i=0;i<a;i++) {
			for(j=0;j<d;j++) {
				System.out.printf(z[i][j]+"\t");
			}
			System.out.println();
		}
		input.close();
	}
}