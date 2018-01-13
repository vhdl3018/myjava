package cn.tzs.testObj;

import java.time.LocalDate;

public class TestCallBy {
	public static void main(String[] args){
		/*
		 * 测试1：测试调用方法是否更改参数的类型
		 */
		System.out.println("************************测试基本数据类型引用方式***************************");
		double percent = 10;
		System.out.println("基本类型数据测试前：percent = " + percent);
		TestCallBy.tripValue(percent);
		System.out.println("基本类型数据测试后：percent = " + percent);
		/*
		 * 测试2：测试调用对象后，是否更改对象的属性值 
		 */
		System.out.println("************************测试对象引用方式***************************");
		Employee emp = new Employee("小王", 2345.4,1986,12,23);
		System.out.println("对象调用方法前的薪水：" + emp.getSalary());
		TestCallBy.tripeSalary(emp);
		System.out.println("对象调用方法后的薪水：" + emp.getSalary());
		
		
		/*
		 * 测试3：；测试对象引用的方式
		 * 
		 */
		System.out.println("************************测试对象引用方式***************************");
		Employee A = new Employee("张三", 1345.4,1966,11,21);
		Employee B = new Employee("李四", 2645.4,1956,10,23);	
		
		System.out.println("测试前，A对象的姓名：" + A.getName());
		System.out.println("测试前，B对象的姓名：" + B.getName());
		
		TestCallBy.swap(A,B);
		
		System.out.println("测试后，A对象的姓名：" + A.getName());
		System.out.println("测试后，B对象的姓名：" + B.getName());
	}
	
	/**
	 * 功能：通过此方法，测试基本类型数据传参的方式
	 * @param x
	 */
	public static void tripValue(double x){
		x = 3*x;
		System.out.println("调用方法结束后:x = "+x);
	}
	/**
	 * 功能：通过方法，测试对象数据的值参方式
	 * @param emp
	 */
	public static void tripeSalary(Employee emp){
		emp.raiseSalary(20);
	}
	
	/**
	 * 功能：测试对象引用的方式
	 * @param a
	 * @param b
	 */
	public static void swap(Employee a,Employee b){
		Employee temp = a;
		a = b;
		b = temp;
		System.out.println("内部程序测试结束后，a对象的姓名：" + a.getName());
		System.out.println("内部程序测试结束后，b对象的姓名：" + b.getName());
	}
}


/**
 * 功能：创建Emp类
 * 添加成员属性和方法
 * @author qsqxj
 *
 */
class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	private int id ;
	
	//添加一个静态的Id属性
	private static int nextId = 1;
	
	public Employee(String name, double salary, int year, int month, int day){
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
