package shiyan9_1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Display_txt extends JFrame {
	
	JFrame jframe = new JFrame();
	JTextArea content;
	boolean flag = true;
	String str_filePath = null;
	
	public Display_txt(){
		//�����
		content = new JTextArea(10,50);
		content.setAutoscrolls(true);
		JScrollPane contentScroll = new JScrollPane(content);
		content.setBorder(BorderFactory.createBevelBorder(1));
		JPanel upper = new JPanel(new BorderLayout());
		upper.add(contentScroll);
		//��ť
		JButton filePath = new JButton("���ļ�");
		filePath.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					JFileChooser jfc = new JFileChooser();
					if(jfc.showOpenDialog(jframe)==JFileChooser.APPROVE_OPTION ){
						str_filePath = jfc.getSelectedFile().getAbsolutePath();
					}
					BufferedReader bufferedReader = new BufferedReader(new FileReader(str_filePath));
					String str_line;
					while((str_line=bufferedReader.readLine())!=null){
						if(flag){
							content.setText(str_line);
							flag = false;
						}
						else{
							content.setText(content.getText()+"\n"+str_line);
						}
					}
					bufferedReader.close();
				}catch(FileNotFoundException e1){
					e1.printStackTrace();
				}catch(IOException e2){
					e2.printStackTrace();
				}
			}
		});
		JPanel buttonp = new JPanel();
		buttonp.add(filePath);
		JPanel all = new JPanel(new GridLayout(1,1));
		all.add(upper);
		jframe.add(buttonp,BorderLayout.SOUTH);
		jframe.add(all,BorderLayout.CENTER);
		jframe.pack();
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension screen = tool.getScreenSize();
		jframe.setLocation(screen.width/2-jframe.getWidth()/2,screen.height/2-jframe.getHeight()/2);
		jframe.setTitle("TXTС˵�Ķ���");
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Display_txt display_demo = new Display_txt();
	}
 
}