package cn.tzs.testgui;

import java.awt.*;
import javax.swing.*;
/**
 * ����JSplitPane�Ĺ���
 * @author qsqxj
 *
 */
public class TestDict extends JFrame {
	//������� 
	JSplitPane jsp;
	JList jlist;
	JLabel jl1;
	
	public static void main(String[] args){
		TestDict td = new TestDict();
	}
	
	@SuppressWarnings("unchecked")
	public TestDict(){
		//������� 
		String[]  words = {"boy", "girl", "box"};
		
		jlist = new JList(words);
		
		jl1 = new JLabel(new ImageIcon("images/img.jpg"));
		
		//��ִ���
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		jsp.setLeftComponent(jlist);
		jsp.setRightComponent(jl1);
		//���ò��ֹ�����
		
		//���Ա仯
		jsp.setOneTouchExpandable(true);
		//������ 
		this.add(jsp);
		//this.add(jlist);
		//this.add(jl1);
		
		//���ô�С
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


}
