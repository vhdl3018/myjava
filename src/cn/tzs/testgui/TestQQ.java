package cn.tzs.testgui;
import java.awt.*;
import javax.swing.*;

/**
 * ���ܣ�����QQ�������
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
		String[] chatters = {"С��","��һ"};
		
		jcb = new JComboBox(chatters);
		jtf = new JTextField(10);
		jb = new JButton("����");
		
		//������ 
		
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		this.add(jsp);
		this.add(jp1, BorderLayout.SOUTH);
		
		
		this.setSize(400,300);
		this.setIconImage(new ImageIcon("images/qq.png").getImage());
		this.setTitle("��ѶQQ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
