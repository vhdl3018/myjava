package cn.tzs.testReflection;

public class TestEmployee {
	public static void main(String[] args){
		Employee e = new Employee("Ëµ±ðÈË",1111.09,2018,02,18);
		
		
		Class cl = e.getClass();
		System.out.println(cl.getName() + " " + e.getName());
		
	}
}
