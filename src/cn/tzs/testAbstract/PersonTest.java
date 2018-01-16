package cn.tzs.testAbstract;
/**
 * 功能：测试抽象类的相关属性
 * @author qsqxj
 *
 */
public class PersonTest {
	public static void main(String [] args){
		//创建一个顶级父类的数组，用于存放实现类的对象
		Person persons[] = new Person[2];
		//在对象数组中，添加一个经理对象、一个学生对象
		persons[0] = new Manager("马云", 12222.22, 1998,12,23);
		persons[1] = new Student("雷军", "小米");
		
		//循环打印对象数组的内容，查看p调用的方法到底是哪个子类的方法
		for(Person p : persons){
			System.out.println(p.getDescription());
		}
	}
}
