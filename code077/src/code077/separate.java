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
            // ��ȡ�ļ�
            StringBuffer sb= new StringBuffer("");
            FileReader reader = new FileReader("G:\\����\\����\\test.txt");
            BufferedReader br = new BufferedReader(reader);
            String str = null;
            while((str = br.readLine()) != null) {//һ��һ�еض�
            	if(str.startsWith("#")||str.contains("---")
            			||str.contains("...")||str.contains(":")
            			||str.length()==0||str.contains("-")) {
            		continue;
            		//ȥ���ļ��ڲ�Ҫ������
            	}else if(str.contains("http://flypy.com"));
            		sb.append(str+"\r\n");
            		System.out.println(str);
            }
                           
            br.close();
            reader.close();
            //����ļ�
            FileWriter writer = new FileWriter("G:\\����\\����\\�ı�һ.txt");
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

