package cn.tzs.testgui;

/**
 * 功能：测试多种布局
 * @author qsqxj
 *
 */
import java.awt.*;
import javax.swing.*;
public class TestJpanel extends JFrame{
	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args){
		TestJpanel tj = new TestJpanel();
	}
	
	//构造函数 
	public TestJpanel(){
		//创建组件 
		//JPanel布局默认为FlowLayout
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("西瓜");
		jb2 = new JButton("苹果");
		jb3 = new JButton("荔枝");
		jb4 = new JButton("葡萄");
		jb5 = new JButton("桔子");
		jb6 = new JButton("香蕉");
		
		//设置布局管理器
		
		this.setLayout(new GridLayout(2,1));
		//添加组件 
		jp1.add(jb1);
		jp1.add(jb2);		
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		this.add(jp1);
		this.add(jp2);
		
		//
		
		//给窗体设置标题
		this.setTitle("hello world");
		
		//设置大小,按像素
		this.setSize(400, 150);
		//设置初始位置
		this.setLocation(100,200);
		
		//设置，当关闭窗口的时候，保证jvm也退出 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示
		this.setVisible(true);
		

	}
}
