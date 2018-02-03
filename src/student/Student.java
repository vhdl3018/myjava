package student;

/**
 * 功能：建立学生类
 * @author qsqxj
 *
 */
class Student {
	private String name;
	private int id;
	private double point;
	
	public Student(String name, int id, double point){
		this.name = name;
		this.id = id;
		this.point = point;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
}
