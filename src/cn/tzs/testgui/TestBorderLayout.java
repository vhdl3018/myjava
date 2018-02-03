package cn.tzs.testgui;
/**
 * 功能：BorderLayout（边界布局）
 * 1、继承JFrame
 * 2、定义你需要 的组件
 * 3、创建组件（构造函数）
 * 4、添加组件 
 * 5、设置窗体属性
 * 6、显示窗体
 * @author qsqxj
 *
 */

import java.awt.*;
import javax.swing.*;
public class TestBorderLayout extends JFrame{
	//定义组件 
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args){
		TestBorderLayout tj = new TestBorderLayout();
	}
	
	public TestBorderLayout(){
		//创建组件
		jb1 = new JButton("中部");
		jb2 = new JButton("东部");		
		jb3 = new JButton("南部");		
		jb4 = new JButton("西部");	
		jb5 = new JButton("北部");
		
		//添加各个组件 
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.EAST);
		this.add(jb4,BorderLayout.WEST);
		this.add(jb5,BorderLayout.SOUTH);
		
		//设置窗体属性
		this.setTitle("边界布局安全");
		this.setSize(400,200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
