package cn.tzs.testgui;

import java.awt.*;
import javax.swing.*;
/**
 * 测试JSplitPane的功能
 * @author qsqxj
 *
 */
public class TestDict extends JFrame {
	//定义组件 
	JSplitPane jsp;
	JList jlist;
	JLabel jl1;
	
	public static void main(String[] args){
		TestDict td = new TestDict();
	}
	
	@SuppressWarnings("unchecked")
	public TestDict(){
		//创建组件 
		String[]  words = {"boy", "girl", "box"};
		
		jlist = new JList(words);
		
		jl1 = new JLabel(new ImageIcon("images/img.jpg"));
		
		//拆分窗格
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		jsp.setLeftComponent(jlist);
		jsp.setRightComponent(jl1);
		//设置布局管理器
		
		//可以变化
		jsp.setOneTouchExpandable(true);
		//添加组件 
		this.add(jsp);
		//this.add(jlist);
		//this.add(jl1);
		
		//设置大小
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


}
