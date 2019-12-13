package shiyan2_3;

import java.util.*;

public class Guess_Idiom {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		int index=random.nextInt(10);
		int i,j;
		int m;
		String s;
		String [] idioms= {"哀毁骨立","安土重迁","暴虎冯河","大吹法螺","洞烛其奸","佛口蛇心","形销骨立","贼走关门","聚蚊成雷","暮云春树"};
		String [] chars= {"五","十","六","河","蛇","香","湖","爱","恨","丑","给","说","好","或","看","及","图","年","已","马"};
		String [] str=new String[10];
		String [] arr=new String[10];
		int [] flag1=new int[6];//记录抽取chars产生的随机数
		int [] flag2=new int[4];//记录抽取s产生的随机数
		int [] flag3=new int[10];//将str打乱存入arr
		s=idioms[index];//随机选择的一个成语
		flag1=randomArr(flag1,20);//产生6个不重复的随机数
		flag2=randomArr(flag2,5);//产生4个不重复的随机数
		flag3=randomArr(flag3,11);//产生10个不重复的随机数
		for(i=0;i<4;i++) {
			m=flag2[i];
			str[i]=String.valueOf(s.charAt(m-1));
		}
		for(i=4,j=0;i<10&&j<6;i++,j++) {
			str[i]=chars[flag1[j]];
		}
		for(i=0;i<10;i++) {
			arr[i]=str[flag3[i]-1];
		}
		System.out.println("请从下列词中选出你认为的成语中的任何一个字:");
		for(i=0;i<10;i++) {
			System.out.print(i+":");
			System.out.print(arr[i]+' ');
		}
		System.out.println();
		
		//开始游戏
		int t=6;
		int k;
		int count1=0;
		int count2=0;
		char [] result= {'*','*','*','*'};
		while(t>0) {
			System.out.print("请输入你的选择:");
			k=input.nextInt();
			m=s.indexOf(arr[k]);
			if(m==-1) {
				count1++;
				t--;
				System.out.println("您猜错了，还剩"+t+"次机会！");
				if(count1==6) {
					System.out.print("游戏结束!");
					break;
				}
			}
			else {
				count2++;
				System.out.println("您猜对了'"+arr[k]+"'字在成语中的位置是"+(m+1));
				result[m]=s.charAt(m);
				print(result);
				if(count2==4) {
					System.out.println("成语已猜出！");
					System.out.print("游戏结束！");
					break;
				}
			}
		}
		input.close();
	}
    public static int[] randomArr(int[] arr,int num) {//产生不重复的随机数
        Random rd=new Random();
        for(int i=0;i<arr.length;i++) {
            int count=0;
            int temp=rd.nextInt(num);
            for(int j=0;j<arr.length;j++) {
                if(arr[j]==temp) {
                    count++;
                }
            }if(count>0) {
                i--;
            }else {
                arr[i]=temp;
            }
        }
        return arr;
    }
    public static void print(char [] result) {
    	for(int i=0;i<result.length;i++) {
    		System.out.print("["+result[i]+"]");
    	}
    	System.out.println();
    }
}
