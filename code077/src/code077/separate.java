package code077;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class separate {
      public static void main(String[] args) {
            try {
            // 读取文件
            StringBuffer sb= new StringBuffer("");
            FileReader reader = new FileReader("G:\\桌面\\测试\\test.txt");
            BufferedReader br = new BufferedReader(reader);
            String str = null;
            while((str = br.readLine()) != null) {//一行一行地读
            	if(str.startsWith("#")||str.contains("---")
            			||str.contains("...")||str.contains(":")
            			||str.length()==0||str.contains("-")) {
            		continue;
            		//去除文件内不要的内容
            	}else if(str.contains("http://flypy.com"));
            		sb.append(str+"\r\n");
            		System.out.println(str);
            }
                           
            br.close();
            reader.close();
            //输出文件
            FileWriter writer = new FileWriter("G:\\桌面\\测试\\文本一.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(sb.toString());
            bw.close();
            writer.close();
      }
      catch(FileNotFoundException e) {
                  e.printStackTrace();
            }
            catch(IOException e) {
                  e.printStackTrace();
            }
      }
}

