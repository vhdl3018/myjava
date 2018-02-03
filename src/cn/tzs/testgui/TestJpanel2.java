package cn.tzs.testgui;

import java.awt.*;
import javax.swing.*;
public class TestJpanel2 extends JFrame {
	//定义
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JCheckBox  jcb1,jcb2,jcb3;
	JButton jb1,jb2;
	ButtonGroup bg;
	JRadioButton jrb1,jrb2;
	
	public static void main(String[] args){
		TestJpanel2 tj = new TestJpanel2();
	}
	//构造函数 
	public TestJpanel2(){
		//创建组件 
		jp1 = new JPanel();
		jp2 = new JPanel();		
		jp3 = new JPanel();		
		
		jl1 = new JLabel("你喜欢的运动");
		jl2 = new JLabel("你的性别");
		
		jb1 = new JButton("注册用户");
		jb2 = new JButton("取消注册");
		
		jcb1 = new JCheckBox("足球");
		jcb2 = new JCheckBox("篮球");
		jcb3 = new JCheckBox("网球");
		
		jrb1 = new JRadioButton("男");
		jrb2 = new JRadioButton("女");
		
		//一定要把jrb1,jrb2放入到一个ButtonGruop中云
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		//设置布局管理
		this.setLayout(new GridLayout(3,1));
		
		//添加组件 
		//添加筛选框
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		//添加单选框
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		//添加按钮
		jp3.add(jb1);
		jp3.add(jb2);
		
		//将Jpanel添加到JFrame框架中
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//设置JFrame框架的大小
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
