package cn.tzs.TestSet;

import java.util.*;
public class TestEmployee {
	public static void main(String[] args){
		Employee[] emp = new Employee[3];
		
		//创建三个员
		Employee emp1 = new Employee("小王", 22,2345.4);
		Employee emp2 = new Employee("小李", 33,3345.4);
		Employee emp3 = new Employee("张三", 45,1345.4);
		/*
		 * 通过数组的方式
		 * emp[0] = new Employee("小王", 22,2345.4);
		emp[1] = new Employee("小李", 33,3345.4);
		emp[2] = new Employee("张三", 45,1345.4);
		
		
		for(int i = 0; i<emp.length; i++){
			System.out.println("第"+(i+1)+"个员工的信息："+emp[i].getId()+"--"+emp[i].getAge()+"--"+emp[i].getName()+"--"+emp[i].getSalary());
		}
		
		*/
		EmployeeManage em = new EmployeeManage();
		em.addEmp(emp1);
		em.addEmp(emp2);
		em.addEmp(emp3);
		
		//打印出所有员工信息
		em.allEmp();
		em.altEmp(3, 10000);
		em.infoEmp(3);
		em.delEmp(2);
		em.allEmp();
	}
}
/**
 * 员工管理类
 * @author qsqxj
 *
 */
class EmployeeManage{
	private ArrayList al = null;
	//构造方法，生成一个ArrayList类
	public EmployeeManage(){
		al = new ArrayList();
	}
	
	//添加员工
	public void addEmp(Employee e){
		al.add(e);
	}
	//删除员工
	public void delEmp(int id){
		for(int i=0; i<al.size(); i++){
			Employee temp= (Employee) al.get(i);
			if(temp.getId() == id){
				al.remove(i);
			}
		}
	}
	
	//修改员工的薪水
	public void altEmp(int id, double salary){
		for(int i=0; i<al.size(); i++){
			Employee temp= (Employee) al.get(i);
			if(temp.getId() == id){
				temp.setSalary(salary);
			}
		}
	}
	
	//获取指定id的员工信息
	
	public void infoEmp(int id){
		for(int i=0; i<al.size(); i++){
			Employee temp= (Employee) al.get(i);
			if(temp.getId() == id){
				System.out.println(temp.getId()+"--"+temp.getName() + "--" + temp.getAge() + "--" + temp.getSalary());
			}
		}
	}
	
	//打印出所有员工信息
	public void allEmp(){
		for(int i=0; i<al.size(); i++){
			Employee temp= (Employee) al.get(i);
				System.out.println("员工信息：" + temp.getId()+"--"+temp.getName() + "--" + temp.getAge() + "--" + temp.getSalary());
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
	 * 为员工自动添加ID号
	 * @param id
	 */
	public void setId(int id) {
		this.id = nextId;
		nextId++;
	}
	
}