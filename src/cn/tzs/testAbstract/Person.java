package cn.tzs.testAbstract;
/**
 * 功能：构造顶级的抽象类，给一个抽象方法getDescription()
 * @author qsqxj
 *
 */
public abstract class Person {
	private String name;
	public abstract String getDescription();
	
	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
