package cn.tzs.testgui;
/**
 * 功能：测试流式布局
 */
import java.awt.*;
import javax.swing.*;
public class TestFlowLayout extends JFrame{

	//定义需要的组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args){
		TestFlowLayout tfl = new TestFlowLayout();
	}
	
	//构造函数
	public TestFlowLayout(){
		//创建组件
		jb1 = new JButton("关羽");
		jb2 = new JButton("张飞");		
		jb3 = new JButton("黄忠");		
		jb4 = new JButton("赵云");		
		jb5 = new JButton("马超");		
		jb6 = new JButton("魏延");
		
		//添加组件
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		//设置窗体属性
		this.setTitle("边界布局安全");
		this.setSize(400,200);
		this.setLocation(200,200);
		
		//禁止用户改变窗体大小
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示窗体
		this.setVisible(true);
		
		
		
		
	}
	
	
}
