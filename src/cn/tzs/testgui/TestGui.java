package cn.tzs.testgui;
/**
 * 功能：gui界面开发演示
 * @author qsqxj
 *
 */
//引入包
import java.awt.*;
import javax.swing.*;
public class TestGui extends JFrame{
	JButton jb1=null;
	public static void main(String[] args){
		//thisrame是一个顶层容器类（可以添加其它swing组件的类）
		TestGui tg = new TestGui();
		
	}
	/**
	 * 构造函数
	 * 初始化相关参数
	 */
	public TestGui(){
		//添加一个JButton按钮
		jb1 = new JButton("我是按钮");
		//添加一个button 按钮
		this.add(jb1);
		//给窗体设置标题
		this.setTitle("hello world");
		
		//设置大小,按像素
		this.setSize(400, 400);
		//设置初始位置
		this.setLocation(100,200);
		
		//设置，当关闭窗口的时候，保证jvm也退出 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示
		this.setVisible(true);
	}
}
