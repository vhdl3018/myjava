package cn.tzs.testgui;
/**
 * ���ܣ�BorderLayout���߽粼�֣�
 * 1���̳�JFrame
 * 2����������Ҫ �����
 * 3��������������캯����
 * 4�������� 
 * 5�����ô�������
 * 6����ʾ����
 * @author qsqxj
 *
 */

import java.awt.*;
import javax.swing.*;
public class TestBorderLayout extends JFrame{
	//������� 
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args){
		TestBorderLayout tj = new TestBorderLayout();
	}
	
	public TestBorderLayout(){
		//�������
		jb1 = new JButton("�в�");
		jb2 = new JButton("����");		
		jb3 = new JButton("�ϲ�");		
		jb4 = new JButton("����");	
		jb5 = new JButton("����");
		
		//��Ӹ������ 
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.EAST);
		this.add(jb4,BorderLayout.WEST);
		this.add(jb5,BorderLayout.SOUTH);
		
		//���ô�������
		this.setTitle("�߽粼�ְ�ȫ");
		this.setSize(400,200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
