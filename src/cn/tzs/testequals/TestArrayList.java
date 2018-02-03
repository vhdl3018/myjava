package cn.tzs.testequals;

import java.util.ArrayList;
public class TestArrayList {
	public static void main(String[] args){
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("杨会", 44444,1876,12,31));
		list.add(new Employee("杨会1", 22244,1976,12,31));
		list.add(new Employee("李四", 9944,2006,12,31));
		
		for(Employee e:list){
			e.raiseSalary(5);
		}
		
		for(Employee e : list){
			//System.out.println(e);
			System.out.println("雇员信息：" + e.getName() + "--" + e.getSalary() + "--" + e.getHireDay());
		}
		
		for(int i = 0; i<list.size(); i++){
			System.out.println("雇员信息：" + list.get(i).getName());
		}
	}
}
