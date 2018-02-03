package cn.tzs.testgui;
import java.awt.*;
import javax.swing.*;

/**
 * 功能：制作QQ聊天界面
 * @author qsqxj
 *
 */
public class TestQQ extends  JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea jta = null;
	JScrollPane jsp = null;
	JPanel jp1 = null;
	JComboBox<?> jcb = null;
	JTextField jtf = null;
	JButton jb = null;
	
	public static void main(String[] args){
		TestQQ  qq = new TestQQ();
	}
	
	@SuppressWarnings("unchecked")
	public TestQQ(){
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		jp1 = new JPanel();
		String[] chatters = {"小李","王一"};
		
		jcb = new JComboBox(chatters);
		jtf = new JTextField(10);
		jb = new JButton("发送");
		
		//添加组件 
		
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		this.add(jsp);
		this.add(jp1, BorderLayout.SOUTH);
		
		
		this.setSize(400,300);
		this.setIconImage(new ImageIcon("images/qq.png").getImage());
		this.setTitle("腾讯QQ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
