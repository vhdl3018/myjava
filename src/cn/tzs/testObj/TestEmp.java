package cn.tzs.testObj;

import java.time.LocalDate;
/**
 * ���ܣ������Զ���Emp���������Ժͷ���
 * @author qsqxj
 *
 */
public class TestEmp {
	/**
	 * ����Emp���������Ժͷ���
	 * @param args
	 */
	public static void main(String[] args){
		Emp[] staff = new Emp[4];
		
		//����ĸ�Ա�� 
		staff[0] = new Emp("С��", 2345.4,1986,12,23);
		staff[1] = new Emp("С��", 3345.4,1976,2,13);
		staff[2] = new Emp("����", 1345.4,1966,11,21);
		staff[3] = new Emp("����", 2645.4,1956,10,23);	
		//��ÿ��Ա��������5%��нˮ
		for(Emp e:staff){
			e.raiseSalary(5.0);
		}
		
		//ѭ����ӡ��Ա����Ϣ
		
		for(Emp e:staff){
			System.out.println("Ա����Ϣ��"+"ID��:"+e.getId()+",������"+e.getName() + ",нˮ��"+e.getSalary()+",��ְʱ�䣺"+e.getHireDay());
		}
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