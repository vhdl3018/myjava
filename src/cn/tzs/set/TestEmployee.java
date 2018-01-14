package cn.tzs.set;

import java.util.*;
public class TestEmployee {
	public static void main(String[] args){
		Employee[] emp = new Employee[3];
		
		//��������Ա
		Employee emp1 = new Employee("С��", 22,2345.4);
		Employee emp2 = new Employee("С��", 33,3345.4);
		Employee emp3 = new Employee("����", 45,1345.4);
		/*
		 * ͨ������ķ�ʽ
		 * emp[0] = new Employee("С��", 22,2345.4);
		emp[1] = new Employee("С��", 33,3345.4);
		emp[2] = new Employee("����", 45,1345.4);
		
		
		for(int i = 0; i<emp.length; i++){
			System.out.println("��"+(i+1)+"��Ա������Ϣ��"+emp[i].getId()+"--"+emp[i].getAge()+"--"+emp[i].getName()+"--"+emp[i].getSalary());
		}
		
		*/
		EmployeeManage em = new EmployeeManage();
		em.addEmp(emp1);
		em.addEmp(emp2);
		em.addEmp(emp3);
		
		//��ӡ������Ա����Ϣ
		em.allEmp();
		em.altEmp(3, 10000);
		em.infoEmp(3);
		em.delEmp(2);
		em.allEmp();
	}
}
class EmployeeManage{
	private ArrayList al = null;
	
	public EmployeeManage(){
		al = new ArrayList();
	}
	
	//���Ա��
	public void addEmp(Employee e){
		al.add(e);
	}
	//ɾ��Ա��
	public void delEmp(int id){
		for(int i=0; i<al.size(); i++){
			Employee temp= (Employee) al.get(i);
			if(temp.getId() == id){
				al.remove(i);
			}
		}
	}
	
	//�޸�Ա����нˮ
	public void altEmp(int id, double salary){
		for(int i=0; i<al.size(); i++){
			Employee temp= (Employee) al.get(i);
			if(temp.getId() == id){
				temp.setSalary(salary);
			}
		}
	}
	
	//��ȡָ��id��Ա����Ϣ
	
	public void infoEmp(int id){
		for(int i=0; i<al.size(); i++){
			Employee temp= (Employee) al.get(i);
			if(temp.getId() == id){
				System.out.println(temp.getId()+"--"+temp.getName() + "--" + temp.getAge() + "--" + temp.getSalary());
			}
		}
	}
	
	//��ӡ������Ա����Ϣ
	public void allEmp(){
		for(int i=0; i<al.size(); i++){
			Employee temp= (Employee) al.get(i);
				System.out.println("Ա����Ϣ��" + temp.getId()+"--"+temp.getName() + "--" + temp.getAge() + "--" + temp.getSalary());
		}
	}
	
}

class Employee{
	private String name;
	private int age;
	private double salary;
	private int id;
	private static int nextId=1;

	public Employee(String name,int age, double salary){
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
		this.setId(0);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	/**
	 * ΪԱ���Զ����ID��
	 * @param id
	 */
	public void setId(int id) {
		this.id = nextId;
		nextId++;
	}
	
}