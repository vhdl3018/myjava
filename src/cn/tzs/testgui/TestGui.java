package cn.tzs.testgui;
/**
 * ���ܣ�gui���濪����ʾ
 * @author qsqxj
 *
 */
//�����
import java.awt.*;
import javax.swing.*;
public class TestGui extends JFrame{
	JButton jb1=null;
	public static void main(String[] args){
		//thisrame��һ�����������ࣨ�����������swing������ࣩ
		TestGui tg = new TestGui();
		
	}
	/**
	 * ���캯��
	 * ��ʼ����ز���
	 */
	public TestGui(){
		//���һ��JButton��ť
		jb1 = new JButton("���ǰ�ť");
		//���һ��button ��ť
		this.add(jb1);
		//���������ñ���
		this.setTitle("hello world");
		
		//���ô�С,������
		this.setSize(400, 400);
		//���ó�ʼλ��
		this.setLocation(100,200);
		
		//���ã����رմ��ڵ�ʱ�򣬱�֤jvmҲ�˳� 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ
		this.setVisible(true);
	}
}
