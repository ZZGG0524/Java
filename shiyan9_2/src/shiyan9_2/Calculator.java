package shiyan9_2;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Calculator extends JFrame{//�Զ������ļ�������̳�JFrame���
	//�������
	
	JMenuBar jmb;
	JMenu[] jm;
	JMenuItem[] jmi;
	JTextField jtf;
	JButton[] jb;
	
	public static void main(String[] args)// �������������������Ĺ��캯��
	{
		new Calculator();
	}
	
	public Calculator()//��ӹ��캯��
	{
		//�������
				
		jmb = new JMenuBar();
		jm = new JMenu[3];
		
		jm[0] = new JMenu("�鿴��V��");
		jm[1] = new JMenu("�༭��E��");
		jm[2] = new JMenu("������H��");
		
		jmi = new JMenuItem[4];
		jmi[0] = new JMenuItem("��׼�ͣ�T��");
		jmi[1] = new JMenuItem("���ƣ�C��");
		jmi[2] = new JMenuItem("ճ����P��");
		jmi[3] = new JMenuItem("���ڣ�A��");
		
		jtf = new JTextField("0");
		
		jb = new JButton[28];
		jb[0] = new JButton("MC");
		jb[1] = new JButton("MR");
		jb[2] = new JButton("MS");
		jb[3] = new JButton("M+");
		jb[4] = new JButton("M-");
		jb[5] = new JButton("Backspace");
		jb[6] = new JButton("CE");
		jb[7] = new JButton("C");
		jb[8] = new JButton("+/-");
		jb[9] = new JButton("sqrt");
		jb[10] = new JButton("7");
		jb[11] = new JButton("8");
		jb[12] = new JButton("9");
		jb[13] = new JButton("/");
		jb[14] = new JButton("%");
		jb[15] = new JButton("4");
		jb[16] = new JButton("5");
		jb[17] = new JButton("6");
		jb[18] = new JButton("*");
		jb[19] = new JButton("1/x");
		jb[20] = new JButton("1");
		jb[21] = new JButton("2");
		jb[22] = new JButton("3");
		jb[23] = new JButton("-");
		jb[24] = new JButton("=");
		jb[25] = new JButton("0");
		jb[26] = new JButton(".");
		jb[27] = new JButton("+");
		
		initGUI();//���ò��֣�������
		
		//���ô�������
		this.setTitle("������");//��������
		//this.setIconImage(new ImageIcon("��è.jpg").getImage());//���ô��ڱ���
		this.setSize(400,250);//���ô�С��������
		this.setLocation(200,200);//���ó�ʼλ�ã�Ĭ������Ļ�����Ͻ�
		this.setVisible(true);//������ʾ��λ�ÿɱ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����Ĭ�ϵ��رղ�������Ȼjava�������ûҲ�ر�
	}
	
	//���ò��֡�
	private void initGUI() {
		
		this.setJMenuBar(jmb);
		jmb.add(jm[0]);
		jmb.add(jm[1]);
		jmb.add(jm[2]);
		
		jm[0].add(jmi[0]);
		jm[1].add(jmi[1]);
		jm[1].add(jmi[2]);
		jm[2].add(jmi[3]);
		
				
		jtf.setEditable(false);//�ı��򲻿ɱ༭
		
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gridbag);
				
		c.weightx = 0.01;//�����ϵļ���������������һ�����֣�������������԰������ʹ���϶�Ϊһ��������ִ����������������п�϶
		c.weighty = 0.01;
		c.fill = GridBagConstraints.BOTH;
		
		//�ı���
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 5;
		c.gridheight = 2;
		add(jtf,c);
		
		//MC
		c.gridx = 0; 
		c.gridy = 2; 
		c.gridwidth = 1; // ��ռһ����Ԫ��
		c.gridheight = 1; // ��ռһ����Ԫ��
		addButton(jb[0],gridbag,c);//��Ӱ�ť����岼��
		//MR
		c.gridx = 1; //���У����������ֻ��Ҫ�޸��еĲ������У�����������ʱ���䡣
		addButton(jb[1],gridbag,c);
		//MS
		c.gridx = 2; 
		addButton(jb[2],gridbag,c);
		//M+
		c.gridx = 3; 
		addButton(jb[3],gridbag,c);
		//M-
		c.gridx = 4; 
		addButton(jb[4],gridbag,c);
	
		//Backspace
		c.gridx = 0; 
		c.gridy = 3; 
		addButton(jb[5],gridbag,c);
		//CE
		c.gridx = 1; 
		addButton(jb[6],gridbag,c);
		//C
		c.gridx = 2; 
		addButton(jb[7],gridbag,c);
		//+/-
		c.gridx = 3; 
		addButton(jb[8],gridbag,c);
		//Sqrt
		c.gridx = 4;		
		addButton(jb[9],gridbag,c);
		
		//7
		c.gridx = 0; 
		c.gridy = 4; 
		addButton(jb[10],gridbag,c);
		//8
		c.gridx = 1; 
		addButton(jb[11],gridbag,c);
		//9
		c.gridx = 2; 
		addButton(jb[12],gridbag,c);
		///
		c.gridx = 3; 
		addButton(jb[13],gridbag,c);
		//%
		c.gridx = 4; 
		addButton(jb[14],gridbag,c);
		
		//4
		c.gridx = 0; 
		c.gridy = 5; 
		addButton(jb[15],gridbag,c);
		//5
		c.gridx = 1; 
		addButton(jb[16],gridbag,c);
		//6
		c.gridx = 2; 
		addButton(jb[17],gridbag,c);
		//*
		c.gridx = 3; 
		addButton(jb[18],gridbag,c);
		//1/x
		c.gridx = 4;
		addButton(jb[19],gridbag,c);
		
		//1
		c.gridx = 0;
		c.gridy = 6; 
		addButton(jb[20],gridbag,c);
		//2
		c.gridx = 1;
		addButton(jb[21],gridbag,c);
		//3
		c.gridx = 2;
		addButton(jb[22],gridbag,c);
		//-
		c.gridx = 3;
		addButton(jb[23],gridbag,c);
		//=
		c.gridx = 4;
		c.gridy = 6; 
		c.gridheight = 2; //���������У���ռ������Ԫ��
		addButton(jb[24],gridbag,c);
		
		//0
		c.gridx = 0;
		c.gridy = 7; 
		c.gridwidth = 2; // �������úᣬ��ռ������Ԫ��
		c.gridheight = 1; // �ָ��У���ռһ����Ԫ��
		addButton(jb[25],gridbag,c);
		//.
		c.gridx = 2;
		c.gridwidth = 1; // �ָ��ᣬ��ռһ����Ԫ��
		addButton(jb[26],gridbag,c);
		//+
		c.gridx = 3;
		addButton(jb[27],gridbag,c);
	}
	//��Ӱ�ť����岼��
	private void addButton(JButton jButton, GridBagLayout gridbag,
			GridBagConstraints c) {
		gridbag.setConstraints(jButton, c);
		add(jButton);
	}
}