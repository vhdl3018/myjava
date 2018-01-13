package cn.tzs.testObj;

import java.time.LocalDate;
/**
 * 功能：测试自定义Emp类的相关属性和方法
 * @author qsqxj
 *
 */
public class TestEmp {
	/**
	 * 测试Emp类的相关属性和方法
	 * @param args
	 */
	public static void main(String[] args){
		Emp[] staff = new Emp[4];
		
		//添加四个员工 
		staff[0] = new Emp("小王", 2345.4,1986,12,23);
		staff[1] = new Emp("小李", 3345.4,1976,2,13);
		staff[2] = new Emp("张三", 1345.4,1966,11,21);
		staff[3] = new Emp("李四", 2645.4,1956,10,23);	
		//给每个员工，增加5%的薪水
		for(Emp e:staff){
			e.raiseSalary(5.0);
		}
		
		//循环打印出员工信息
		
		for(Emp e:staff){
			System.out.println("员工信息："+"ID号:"+e.getId()+",姓名："+e.getName() + ",薪水："+e.getSalary()+",入职时间："+e.getHireDay());
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