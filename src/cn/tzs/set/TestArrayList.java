package cn.tzs.set;
import java.time.LocalDate;
/**
 * ���ܣ���ʾjava���ϵ��÷�
 */
import java.util.*;
public class TestArrayList {
	public static void main(String[] args){
		
		//����һ��ArrayList����
		ArrayList al = new ArrayList();
		//��ʾ��С
		System.out.println("ArrayList�ĳ�ʼ��С��"+al.size());
		
		//��al�м������ݣ�������Object��
		Emp staff1 = new Emp("����", 1345.4,1966,11,21);
	}
}
/**
 * ���ܣ�����Emp��
 * ��ӳ�Ա���Ժͷ���
 * @author qsqxj
 *
 */
class Emp{
	private String name;
	private double salary;
	private LocalDate hireDay;
	private int id ;
	
	//���һ����̬��Id����
	private static int nextId = 1;
	
	public Emp(String name, double salary, int year, int month, int day){
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