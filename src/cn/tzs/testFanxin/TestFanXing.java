package cn.tzs.testFanxin;
import java.util.*;
public class TestFanXing {
	public static void main(String[] args){
		//����
		ArrayList<Dog> al = new ArrayList<Dog>();
		//����һ������
		Dog dog1 = new Dog();
		
		//���뵽������
		al.add(dog1);
		
		
		//ȡ��		
		@SuppressWarnings("unused")
		Dog temp = al.get(0);
		
	}
}
class Cat{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private String color;
	private int age;
}

class Dog{
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
	private String name;
	private int age;
	
}