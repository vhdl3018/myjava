package cn.tzs.testFanxin;

import java.lang.reflect.Method;

public class TestFanXing2 {
	public static void main(String args[]){
		//Gen<Integer> gen1 = new Gen<Integer>(10);
		Gen<Bird> gen1 = new Gen<Bird>(new Bird());
		gen1.showTypeName();
	}
}

//������
class Bird{
	public void test1(){
		System.out.println("aa");
	}
	
	public void count(int a, int b){
		System.out.println(a+b);
	}
}

//����һ����
class Gen<T>{
	private T o;
	
	//�������캯�� 
	public Gen(T a) {
		// TODO Auto-generated constructor stub
		o = a;
	}

	//�õ�T����������
	public void showTypeName(){
		System.out.println("�����ǣ�" + o.getClass().getName());
		
		//ͨ��������ƣ����ǿ��Եõ�T������͵ĺܶ���Ϣ
		Method[]  birdMethods = o.getClass().getDeclaredMethods();
		for(int i=0 ; i<birdMethods.length; i++){
			System.out.println(birdMethods[i].getName());
		}
	}
}
