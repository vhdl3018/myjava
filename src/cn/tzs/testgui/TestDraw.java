package cn.tzs.testgui;

import java.awt.*;
import javax.swing.*;
/**
 * ���ܣ����Ի�ͼԭ��
 * @author qsqxj
 *
 */
public class TestDraw  extends JFrame{
	//�������
	MyPanel mp = null;
	
	public static void main(String[] args){
		TestDraw td = new TestDraw();
	}
	
	public TestDraw(){
		
		//����һ��MyPanel�໭�� 
		mp = new MyPanel();
		
		//��mypanel������ӵ�JFrame�����
		this.add(mp);
		
		//����JFrame��ܵ��������
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}

//����һ��MyPanel�����Լ�����壬�����ڻ�ͼ��ʵ�ֻ�ͼ������
class MyPanel extends JPanel{
	//����JPanel��paint()����
	//Graphics�ǻ�ͼ����Ҫ�࣬����԰�������һֻ��
	
	public void paint(Graphics g){
		//1�����ø��ຯ�� ��� ��ʼ��
		//��仰�����١�
		super.paint(g);
	
		//��ͼ����
		//�Ȼ�һ��Բ
		g.drawOval(10,10,30,30);
	
	}
}
