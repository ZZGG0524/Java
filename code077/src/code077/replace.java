package code077 ;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class replace {
	//static Map<String,Integer>map=new HashMap<String,Integer>();
	//������/��
	static Map<String,String>zi=new HashMap<String,String>();
	static Map<String,String>ci=new HashMap<String,String>();
	//�����������+��Ƶ��Ϣ
	static Map<String,String>outzi=new HashMap<String,String>();
	//��������Ĵ�+��Ƶ��Ϣ
	static Map<String,String>outci=new HashMap<String,String>();
	//�жϸ���/���Ƿ�Ϊ��һ�γ���
	static Set<String>set=new HashSet<String>();
	public static void main(String[] args) {
		read();
		write();
	}
	
	public static void write() {
		
		try {
			//////////////////////////
			//////////////////////////ͳһ��Ϊ�ļ��ľ���·��
			File filezi =new File("G:\\����\\����\\outzi.txt");
			File fileci =new File("G:\\����\\����\\outci.txt");
            PrintStream pszi = new PrintStream(new FileOutputStream(filezi));
            PrintStream psci = new PrintStream(new FileOutputStream(fileci));
            //����map
            for(Map.Entry<String, String> entry : outzi.entrySet()){
                String mapKey = entry.getKey();
                String mapValue = entry.getValue();
                pszi.append(mapKey+"	"+mapValue+"\n");
            }
            for(Map.Entry<String, String> entry : outci.entrySet()){
                String mapKey = entry.getKey();
                String mapValue = entry.getValue();
                psci.append(mapKey+"	"+mapValue+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		

	}

    public static void read() {
    	//��������Ϣ
    	try {
            BufferedReader inzi = new BufferedReader(new FileReader("G:\\����\\����\\��Ƶ�ļ�.txt"));
            String str;
            while ((str = inzi.readLine()) != null) {
            	String f[]=str.split(" ");
            	zi.put(f[0],f[1]);
            }
        } catch (IOException e) {
        }
    	//�������Ϣ
	 try {
            BufferedReader inci = new BufferedReader(new FileReader("G:\\����\\����\\��Ƶ�ı�.txt"));
            String str;
            while ((str = inci.readLine()) != null) {
            	String f[]=str.split("	");
            	ci.put(f[0],f[1]);
            }
        } catch (IOException e) {
        }
	 //�����ļ�һ
	 try {
         BufferedReader map = new BufferedReader(new FileReader("G:\\����\\����\\�ı�һ.txt"));
         String str;
         while ((str = map.readLine()) != null) {
         	String f[]=str.split("	");
         	//û���ֹ�
         	if(!set.contains(f[0]))
         	{
         		//�������
         		if(f[0].length()==1)
         		{
         			outzi.put(f[0], zi.get(f[0])==null?"0":zi.get(f[0]));
         		}
         		//����Ǵ�
         		else
         		{
         			outci.put(f[0], ci.get(f[0])==null?"0":ci.get(f[0]));
         		}
         		set.add(f[0]);
         	}    
         }
     } catch (IOException e) {
     }
    }
}
