package shiyan2_2;

import java.util.*;

public class Caps {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		s=s.toLowerCase();//将字符串内所有字母置为小写
		StringBuffer str=new StringBuffer(s);
				
		char c=0;    //将字符串中第一个字符置为大写
		c=s.charAt(0);
		if(c>='a'&&c<='z'){
			c=capital(c);
			str.deleteCharAt(0);
			str.insert(0,c);
		}
		
		int i;
		for(i=0;i<s.length()-1;i++) {
			c=s.charAt(i);
			if((c==' ')||(c==',')||(c==';')||(c=='.')||(c=='!')||(c=='	')) {
				c=s.charAt(i+1);
				if((c>='a'&&c<='z')) {
					c=capital(c);
					str.deleteCharAt(i+1);
					str.insert(i+1,c);
				}
			}
		}
		System.out.println(str);
		input.close();
	}
	static char capital(char c) {   //返回c的大写
		c-=32;
		return c;
	}
}