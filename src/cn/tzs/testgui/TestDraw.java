package cn.tzs.testgui;

import java.awt.*;
import javax.swing.*;
/**
 * 功能：测试绘图原理
 * @author qsqxj
 *
 */
public class TestDraw  extends JFrame{
	//定义组件
	MyPanel mp = null;
	
	public static void main(String[] args){
		TestDraw td = new TestDraw();
	}
	
	public TestDraw(){
		
		//定义一个MyPanel类画板 
		mp = new MyPanel();
		
		//将mypanel画板添加到JFrame框架中
		this.add(mp);
		
		//设置JFrame框架的相关属性
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}

//定义一个MyPanel（我自己的面板，是用于绘图和实现绘图的区域）
class MyPanel extends JPanel{
	//覆盖JPanel的paint()方法
	//Graphics是绘图的重要类，你可以把它理解成一只笔
	
	public void paint(Graphics g){
		//1、调用父类函数 完成 初始化
		//这句话不能少。
		super.paint(g);
	
		//画图测试
		//先画一个圆
		g.drawOval(10,10,30,30);
	
	}
}
