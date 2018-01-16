package cn.tzs.testAbstract;
/**
 * 功能：通过子类Student来实现抽象父类
 * @author qsqxj
 *
 */
public class Student extends Person {
	private String major;
	/**
	 * 生成子类的构造方法
	 * @param name
	 * @param major
	 */
	public Student(String name, String major){
		//调用抽象父类的构造方法，必须在子类的构造方法第一行调用
		super(name);
		this.major = major;
	}
	/**
	 * 重写（覆盖）父类的定义的抽象方法
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "A student majoring in " + major; 
	}

}
