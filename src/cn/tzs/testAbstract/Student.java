package cn.tzs.testAbstract;
/**
 * ���ܣ�ͨ������Student��ʵ�ֳ�����
 * @author qsqxj
 *
 */
public class Student extends Person {
	private String major;
	/**
	 * ��������Ĺ��췽��
	 * @param name
	 * @param major
	 */
	public Student(String name, String major){
		//���ó�����Ĺ��췽��������������Ĺ��췽����һ�е���
		super(name);
		this.major = major;
	}
	/**
	 * ��д�����ǣ�����Ķ���ĳ��󷽷�
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "A student majoring in " + major; 
	}

}
