package cn.tzs.testAbstract;
/**
 * ���ܣ����춥���ĳ����࣬��һ�����󷽷�getDescription()
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
