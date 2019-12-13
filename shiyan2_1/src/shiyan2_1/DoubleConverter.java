package shiyan2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleConverter {
	public static void main(String [] args) throws IOException{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������һ���ַ���:");
		String s=input.readLine();
		if(!isDouble(s)) {
			System.out.println("������ַ������Ǹ�����!");
			System.exit(0);
		}
		int m=s.length();
		int i;
		char n[]=new char[m];
		for(i=0;i<m;i++) {
			n[i]=s.charAt(i);
		}
		for(i=0;i<m;i++) {
			System.out.print(n[i]);
		}
		input.close();
	}
	//��Ϊ����������TRUE
	public static boolean isDouble(String str){
		String reg = "^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$";
		return str.matches(reg);
	}
}
