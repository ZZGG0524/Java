package code077 ;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class replace {
	//static Map<String,Integer>map=new HashMap<String,Integer>();
	//读入字/词
	static Map<String,String>zi=new HashMap<String,String>();
	static Map<String,String>ci=new HashMap<String,String>();
	//保存输出的字+词频信息
	static Map<String,String>outzi=new HashMap<String,String>();
	//保存输出的词+词频信息
	static Map<String,String>outci=new HashMap<String,String>();
	//判断该字/词是否为第一次出现
	static Set<String>set=new HashSet<String>();
	public static void main(String[] args) {
		read();
		write();
	}
	
	public static void write() {
		
		try {
			//////////////////////////
			//////////////////////////统一改为文件的绝对路径
			File filezi =new File("G:\\桌面\\测试\\outzi.txt");
			File fileci =new File("G:\\桌面\\测试\\outci.txt");
            PrintStream pszi = new PrintStream(new FileOutputStream(filezi));
            PrintStream psci = new PrintStream(new FileOutputStream(fileci));
            //遍历map
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
    	//读入字信息
    	try {
            BufferedReader inzi = new BufferedReader(new FileReader("G:\\桌面\\测试\\字频文件.txt"));
            String str;
            while ((str = inzi.readLine()) != null) {
            	String f[]=str.split(" ");
            	zi.put(f[0],f[1]);
            }
        } catch (IOException e) {
        }
    	//读入词信息
	 try {
            BufferedReader inci = new BufferedReader(new FileReader("G:\\桌面\\测试\\词频文本.txt"));
            String str;
            while ((str = inci.readLine()) != null) {
            	String f[]=str.split("	");
            	ci.put(f[0],f[1]);
            }
        } catch (IOException e) {
        }
	 //读入文件一
	 try {
         BufferedReader map = new BufferedReader(new FileReader("G:\\桌面\\测试\\文本一.txt"));
         String str;
         while ((str = map.readLine()) != null) {
         	String f[]=str.split("	");
         	//没出现过
         	if(!set.contains(f[0]))
         	{
         		//如果是字
         		if(f[0].length()==1)
         		{
         			outzi.put(f[0], zi.get(f[0])==null?"0":zi.get(f[0]));
         		}
         		//如果是词
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
