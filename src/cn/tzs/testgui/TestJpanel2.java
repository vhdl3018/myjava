package cn.tzs.testgui;

import java.awt.*;
import javax.swing.*;
public class TestJpanel2 extends JFrame {
	//����
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JCheckBox  jcb1,jcb2,jcb3;
	JButton jb1,jb2;
	ButtonGroup bg;
	JRadioButton jrb1,jrb2;
	
	public static void main(String[] args){
		TestJpanel2 tj = new TestJpanel2();
	}
	//���캯�� 
	public TestJpanel2(){
		//������� 
		jp1 = new JPanel();
		jp2 = new JPanel();		
		jp3 = new JPanel();		
		
		jl1 = new JLabel("��ϲ�����˶�");
		jl2 = new JLabel("����Ա�");
		
		jb1 = new JButton("ע���û�");
		jb2 = new JButton("ȡ��ע��");
		
		jcb1 = new JCheckBox("����");
		jcb2 = new JCheckBox("����");
		jcb3 = new JCheckBox("����");
		
		jrb1 = new JRadioButton("��");
		jrb2 = new JRadioButton("Ů");
		
		//һ��Ҫ��jrb1,jrb2���뵽һ��ButtonGruop����
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		//���ò��ֹ���
		this.setLayout(new GridLayout(3,1));
		
		//������ 
		//���ɸѡ��
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		//��ӵ�ѡ��
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		//��Ӱ�ť
		jp3.add(jb1);
		jp3.add(jb2);
		
		//��Jpanel��ӵ�JFrame�����
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//����JFrame��ܵĴ�С
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
