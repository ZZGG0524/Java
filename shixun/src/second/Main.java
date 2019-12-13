package second;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
	public static void main(String[] args) {
		JFrame jFrame=new JFrame();
		jFrame.setSize(500,500);
		jFrame.setLocation(1100,300);
		
		JPanel jPanel=new JPanel();
		
		JTextArea jTextArea=new JTextArea(1,30);
		jTextArea.setLineWrap(true);
		JTextArea jTextArea2=new JTextArea(1,30);
		jPanel.add(jTextArea);
		jPanel.add(jTextArea2);
		
		JButton jButton=new JButton("ä¯ÀÀ");
		JButton jButton2=new JButton("ä¯ÀÀ");
		JButton jButton3=new JButton("¿ªÊ¼");
		
		JTextArea jTextArea3=new JTextArea(10,40);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showFileOpenDialog(jFrame, jTextArea);
			}
		});
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showFileSaveDialog(jFrame,jTextArea2);
			}
		});
		jPanel.add(jButton);
		jPanel.add(jButton2);
		jPanel.add(jTextArea3);
		
		jFrame.setContentPane(jPanel);
		jFrame.setVisible(true);
		
		System.out.println();
	}
	public static void showFileOpenDialog(Component parent,JTextArea jTextArea) {
		JFileChooser jFileChooser=new JFileChooser();
		jFileChooser.setCurrentDirectory(new File("."));
		jFileChooser.setFileSelectionMode(jFileChooser.FILES_AND_DIRECTORIES);
		jFileChooser.setMultiSelectionEnabled(false);
		jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("zip(*.zip,*.rar)","zip","rar"));
		jFileChooser.setFileFilter(new FileNameExtensionFilter("image(*.jpg,*.png,*.gif)","jpg","png","gif"));
		
		int result=jFileChooser.showOpenDialog(parent);
		if(result==jFileChooser.APPROVE_OPTION) {
			File file=jFileChooser.getSelectedFile();
			jTextArea.append(file.getAbsolutePath());
		}
	}
	public static void showFileSaveDialog(Component parent,JTextArea jTextArea) {
		JFileChooser jFileChooser=new JFileChooser();
		jFileChooser.setSelectedFile(new File("wenjian.zip"));
		int result=jFileChooser.showSaveDialog(parent);
		if(result==JFileChooser.APPROVE_OPTION) {
			File file=jFileChooser.getSelectedFile();
			jTextArea.append(file.getAbsolutePath());
		}
	}
}
