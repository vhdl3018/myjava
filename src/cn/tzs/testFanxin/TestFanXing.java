package cn.tzs.testFanxin;
import java.util.*;
public class TestFanXing {
	public static void main(String[] args){
		//泛型
		ArrayList<Dog> al = new ArrayList<Dog>();
		//创建一个狗类
		Dog dog1 = new Dog();
		
		//放入到集合中
		al.add(dog1);
		
		
		//取出		
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