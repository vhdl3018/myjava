package cn.tzs.testequals;

public class TestEquals {
	public static void main(String[] args){
		Employee e1 = new Employee("Ñî»á", 44444,1876,12,31);
		Employee e2 = e1;
		Employee e3 = new Employee("Ñî»á", 44444,1876,12,31);
		Employee d1 = new Employee("Ñî»ád1", 422244,1176,12,31);
		
		System.out.println("e1==e2--->" + (e1==e2));
		System.out.println("e1==e2--->" + (e1==e3));
		
		System.out.println("e1.equals(e3)--->" + e1.equals(e3));
		System.out.println("e1.equals(d1)--->" + e1.equals(d1));
		
		System.out.println("d1.toString()--->" + d1.toString());
		
		
		Manager c1 = new Manager("ÑîCa",8000,1987,10,10);
		Manager b1 = new Manager("ÑîCa",8000,1987,10,10);
		b1.setBonus(10000);
		
		System.out.println("b1.toString()--->" + b1);
		System.out.println("c1.equals(b1)--->" + c1.equals(b1));
		System.out.println("e1.hashCode--->" + e1.hashCode());
		System.out.println("e3.hashCode--->" + e3.hashCode());
		System.out.println("c1.hashCode--->" + c1.hashCode());
		System.out.println("b1.hashCode--->" + b1.hashCode());
		
		
	}
}
