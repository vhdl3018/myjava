package cn.tzs.testgui;

import java.awt.*;
import javax.swing.*;
public class TestJpanel3 {
	//定义
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox jcb1;
	JList jlist;
	JScrollPane jsp;
	
	public static void main(String[] args){
		
	}
	//构造函数 
	public TestJpanel3(){
		jp1 =new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("你的籍贯");
		jl2 = new JLabel("旅游地点");
		
		String[] jg = {"四川 ","安徽","北京"};
	}
}
