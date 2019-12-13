package third  ;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Firstframe extends JFrame{
	private static JFrame firstframe;
	int count = 0;
	JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JButton j1 = new JButton("浏览");
		JButton j2 = new JButton("浏览");
		JButton j3 = new JButton("开始");
	//	JTextArea j4 = new JTextArea(15,20);
		DefaultListModel<String> lstModel = new DefaultListModel<>();
		JList<String> logLst = new JList<>(lstModel);
		JScrollPane j4 = new JScrollPane(logLst);
		JLabel j5 = new JLabel("打开路径：");
		JLabel j6 = new JLabel("保存路径：");
	public Firstframe() {
		init();
	}
	public void init() {
		firstframe = new JFrame("发送邮件");
		
		firstframe.setSize(500,400);
		GridBagLayout layout = new GridBagLayout();
		firstframe.setLayout(layout);
		firstframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
//		j1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				showFileOpenDialog(firstframe, text1);
//			}
//		});
		j1.addActionListener(e->showFileOpenDialog(firstframe, text1));
		j2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showFileSaveDialog(firstframe,text2);
			}
		});
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				lstModel.addElement("test" +count++);
				scrollListToBottom();
			}

			private void scrollListToBottom() {
				// TODO Auto-generated method stub
				Rectangle lastcell = logLst.getCellBounds(lstModel.getSize()-1, lstModel.getSize()-1);
				j4.getViewport().scrollRectToVisible(lastcell);
			}
		});

		
		GridBagConstraints s = new GridBagConstraints();
		s.fill = GridBagConstraints.BOTH;
		s.gridx = 0;
		s.gridy = 0;
		s.gridheight = 1;
		s.gridwidth = 1;
		s.weightx = 0;
		s.weighty = 0;
		firstframe.add(j5,s);
		s.gridx = 1;
		s.weightx = 1;
		firstframe.add(text1,s);
		s.gridx = 2;
		s.weightx = 0;
		s.gridwidth = 0;
		firstframe.add(j1, s);
		
		s.gridx = 0;
		s.gridy = 1;
		s.gridheight = 1;
		s.gridwidth = 1;
		s.weightx = 0;
		s.weighty = 0;
		firstframe.add(j6,s);
		s.gridx = 1;
		s.weightx = 1;
		firstframe.add(text2,s);
		s.gridx = 2;
		s.weightx = 0;
		s.gridwidth = 0;
		firstframe.add(j2, s);
		
		s.gridx = 2;
		s.gridy = 2;
		firstframe.add(j3, s);
		
		s.gridx = 0;
		s.gridy = 3;
		s.weightx = 1;
		s.weighty = 1;
		firstframe.add(j4,s); 
		

		firstframe.setVisible(true);
		
	}
	private void showFileOpenDialog(Component parent,JTextField jTextArea) {
		JFileChooser jFileChooser=new JFileChooser();
		jFileChooser.setCurrentDirectory(new File("."));
		jFileChooser.setFileSelectionMode(jFileChooser.FILES_AND_DIRECTORIES);
		jFileChooser.setMultiSelectionEnabled(false);
		jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("zip(*.zip,*.rar)","zip","rar"));
		jFileChooser.setFileFilter(new FileNameExtensionFilter("image(*.jpg,*.png,*.gif)","jpg","png","gif"));
		
		int result=jFileChooser.showOpenDialog(parent);
		if(result==jFileChooser.APPROVE_OPTION) {
			File file=jFileChooser.getSelectedFile();
			jTextArea.setText(file.getAbsolutePath());
  		}
	}
	private void showFileSaveDialog(Component parent,JTextField jTextArea) {
		JFileChooser jFileChooser=new JFileChooser();
		jFileChooser.setSelectedFile(new File("wenjian.zip"));
		int result=jFileChooser.showSaveDialog(parent); 
		if(result==JFileChooser.APPROVE_OPTION) {
			String path = jFileChooser.getSelectedFile().getPath();
			File file = new File(path);
			
			if(file.exists()) {
				int confirm = JOptionPane.showConfirmDialog(firstframe, "文件已经存在，是否覆盖？");
				if(confirm == JOptionPane.YES_OPTION) {
					text2.setText(path);
				}else {
					text2.setText(path);
				}
			}
			//File file=jFileChooser.getSelectedFile();
			//jTextArea.setText(file.getAbsolutePath());
		}
	}


}
