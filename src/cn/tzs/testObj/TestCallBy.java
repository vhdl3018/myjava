package cn.tzs.testObj;

import java.time.LocalDate;

public class TestCallBy {
	public static void main(String[] args){
		/*
		 * ����1�����Ե��÷����Ƿ���Ĳ���������
		 */
		System.out.println("************************���Ի��������������÷�ʽ***************************");
		double percent = 10;
		System.out.println("�����������ݲ���ǰ��percent = " + percent);
		TestCallBy.tripValue(percent);
		System.out.println("�����������ݲ��Ժ�percent = " + percent);
		/*
		 * ����2�����Ե��ö�����Ƿ���Ķ��������ֵ 
		 */
		System.out.println("************************���Զ������÷�ʽ***************************");
		Employee emp = new Employee("С��", 2345.4,1986,12,23);
		System.out.println("������÷���ǰ��нˮ��" + emp.getSalary());
		TestCallBy.tripeSalary(emp);
		System.out.println("������÷������нˮ��" + emp.getSalary());
		
		
		/*
		 * ����3�������Զ������õķ�ʽ
		 * 
		 */
		System.out.println("************************���Զ������÷�ʽ***************************");
		Employee A = new Employee("����", 1345.4,1966,11,21);
		Employee B = new Employee("����", 2645.4,1956,10,23);	
		
		System.out.println("����ǰ��A�����������" + A.getName());
		System.out.println("����ǰ��B�����������" + B.getName());
		
		TestCallBy.swap(A,B);
		
		System.out.println("���Ժ�A�����������" + A.getName());
		System.out.println("���Ժ�B�����������" + B.getName());
	}
	
	/**
	 * ���ܣ�ͨ���˷��������Ի����������ݴ��εķ�ʽ
	 * @param x
	 */
	public static void tripValue(double x){
		x = 3*x;
		System.out.println("���÷���������:x = "+x);
	}
	/**
	 * ���ܣ�ͨ�����������Զ������ݵ�ֵ�η�ʽ
	 * @param emp
	 */
	public static void tripeSalary(Employee emp){
		emp.raiseSalary(20);
	}
	
	/**
	 * ���ܣ����Զ������õķ�ʽ
	 * @param a
	 * @param b
	 */
	public static void swap(Employee a,Employee b){
		Employee temp = a;
		a = b;
		b = temp;
		System.out.println("�ڲ�������Խ�����a�����������" + a.getName());
		System.out.println("�ڲ�������Խ�����b�����������" + b.getName());
	}
}


/**
 * ���ܣ�����Emp��
 * ��ӳ�Ա���Ժͷ���
 * @author qsqxj
 *
 */
class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	private int id ;
	
	//���һ����̬��Id����
	private static int nextId = 1;
	
	public Employee(String name, double salary, int year, int month, int day){
		//�·���
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
	 * ���ܣ�ʵ��Ա���ӹ��ʵĹ���
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
	 * ���ܣ��Զ���Ա������һ��Id
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
