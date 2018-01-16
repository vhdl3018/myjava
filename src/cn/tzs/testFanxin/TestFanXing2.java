package cn.tzs.testFanxin;

import java.lang.reflect.Method;

public class TestFanXing2 {
	public static void main(String args[]){
		//Gen<Integer> gen1 = new Gen<Integer>(10);
		Gen<Bird> gen1 = new Gen<Bird>(new Bird());
		gen1.showTypeName();
	}
}

//定义类
class Bird{
	public void test1(){
		System.out.println("aa");
	}
	
	public void count(int a, int b){
		System.out.println(a+b);
	}
}

//定义一个类
class Gen<T>{
	private T o;
	
	//建立构造函数 
	public Gen(T a) {
		// TODO Auto-generated constructor stub
		o = a;
	}

	//得到T的类型名称
	public void showTypeName(){
		System.out.println("类型是：" + o.getClass().getName());
		
		//通过反射机制，我们可以得到T这个类型的很多信息
		Method[]  birdMethods = o.getClass().getDeclaredMethods();
		for(int i=0 ; i<birdMethods.length; i++){
			System.out.println(birdMethods[i].getName());
		}
	}
}
