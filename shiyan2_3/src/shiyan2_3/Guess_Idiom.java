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
		String [] idioms= {"���ٹ���","������Ǩ","�������","�󴵷���","�������","�������","��������","���߹���","���ó���","ĺ�ƴ���"};
		String [] chars= {"��","ʮ","��","��","��","��","��","��","��","��","��","˵","��","��","��","��","ͼ","��","��","��"};
		String [] str=new String[10];
		String [] arr=new String[10];
		int [] flag1=new int[6];//��¼��ȡchars�����������
		int [] flag2=new int[4];//��¼��ȡs�����������
		int [] flag3=new int[10];//��str���Ҵ���arr
		s=idioms[index];//���ѡ���һ������
		flag1=randomArr(flag1,20);//����6�����ظ��������
		flag2=randomArr(flag2,5);//����4�����ظ��������
		flag3=randomArr(flag3,11);//����10�����ظ��������
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
		System.out.println("������д���ѡ������Ϊ�ĳ����е��κ�һ����:");
		for(i=0;i<10;i++) {
			System.out.print(i+":");
			System.out.print(arr[i]+' ');
		}
		System.out.println();
		
		//��ʼ��Ϸ
		int t=6;
		int k;
		int count1=0;
		int count2=0;
		char [] result= {'*','*','*','*'};
		while(t>0) {
			System.out.print("���������ѡ��:");
			k=input.nextInt();
			m=s.indexOf(arr[k]);
			if(m==-1) {
				count1++;
				t--;
				System.out.println("���´��ˣ���ʣ"+t+"�λ��ᣡ");
				if(count1==6) {
					System.out.print("��Ϸ����!");
					break;
				}
			}
			else {
				count2++;
				System.out.println("���¶���'"+arr[k]+"'���ڳ����е�λ����"+(m+1));
				result[m]=s.charAt(m);
				print(result);
				if(count2==4) {
					System.out.println("�����Ѳ³���");
					System.out.print("��Ϸ������");
					break;
				}
			}
		}
		input.close();
	}
    public static int[] randomArr(int[] arr,int num) {//�������ظ��������
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
