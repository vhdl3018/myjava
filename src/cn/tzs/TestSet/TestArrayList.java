package cn.tzs.TestSet;
import java.time.LocalDate;
/**
 * 功能：演示java集合的用法
 */
import java.util.*;
public class TestArrayList {
	public static void main(String[] args){
		
		//定义一个ArrayList对象
		ArrayList al = new ArrayList();
		//显示大小
		System.out.println("ArrayList的初始大小："+al.size());
		
		//向al中加入数据（类型是Object）
		Emp staff1 = new Emp("张三", 1345.4,1966,11,21);
		Emp staff2 = new Emp("李四", 2645.4,1956,10,23);
		
		//将两个员工添加到集合中
		al.add(staff1);
		al.add(staff2);
		al.add(staff2);

		System.out.println("ArrayList的初始大小："+al.size());
		
		//如何访问al中对象数据
		//访问第一个对象
		//Emp temp = (Emp)al.get(0);
		//System.out.println("第一个人的名字：" + temp.getName());
		
		//遍历集合中，所有的数据
		for(int i=0; i<al.size(); i++){
			Emp temp = (Emp)al.get(i);
			System.out.println("名字是：" + temp.getName());
		}
		
	}
}
/**
 * 功能：创建Emp类
 * 添加成员属性和方法
 * @author qsqxj
 *
 */
class Emp{
	private String name;
	private double salary;
	private LocalDate hireDay;
	private int id ;
	
	//添加一个静态的Id属性
	private static int nextId = 1;
	
	public Emp(String name, double salary, int year, int month, int day){
		//新方法
		this.setName(name);
		this.setSalary(salary);
		hireDay = LocalDate.of(year, month, day);
		this.setId(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}
	/**
	 * 功能：实现员工加工资的功能
	 * @param byPercent
	 */
	public void raiseSalary(double byPercent){
		double raise = salary*byPercent/100;
		this.salary += raise;
	}

	public int getId() {
		return id;
	}
	/**
	 * 功能：自动给员工生成一个Id
	 * @param id
	 */
	public void setId(int id) {
		this.id = nextId;
		nextId++;
	}
	
	public static int getNextId(){
		return nextId;
	}
}