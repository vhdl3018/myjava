package cn.tzs.testgui;

/**
 * ���ܣ����Զ��ֲ���
 * @author qsqxj
 *
 */
import java.awt.*;
import javax.swing.*;
public class TestJpanel extends JFrame{
	//�������
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args){
		TestJpanel tj = new TestJpanel();
	}
	
	//���캯�� 
	public TestJpanel(){
		//������� 
		//JPanel����Ĭ��ΪFlowLayout
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("����");
		jb2 = new JButton("ƻ��");
		jb3 = new JButton("��֦");
		jb4 = new JButton("����");
		jb5 = new JButton("����");
		jb6 = new JButton("�㽶");
		
		//���ò��ֹ�����
		
		this.setLayout(new GridLayout(2,1));
		//������ 
		jp1.add(jb1);
		jp1.add(jb2);		
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		this.add(jp1);
		this.add(jp2);
		
		//
		
		//���������ñ���
		this.setTitle("hello world");
		
		//���ô�С,������
		this.setSize(400, 150);
		//���ó�ʼλ��
		this.setLocation(100,200);
		
		//���ã����رմ��ڵ�ʱ�򣬱�֤jvmҲ�˳� 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ
		this.setVisible(true);
		

	}
}
