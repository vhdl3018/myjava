package student;

public class TestStudent {
	public static void main(String[] args){
		StudentManage sm = new StudentManage(3);
		
		sm.stu[0] = new Student("sb", 1, 99);
		sm.stu[1] = new Student("sbs", 2, 90);
		sm.stu[2] = new Student("sdb", 3, 49);
		
		sm.delPoint(2);
		
		sm.printPoint(1);
		sm.printPoint(2);
		sm.printPoint(3);
		
	}
}
