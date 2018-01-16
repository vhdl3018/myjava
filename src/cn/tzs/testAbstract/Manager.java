package cn.tzs.testAbstract;
/**
 * ����Manager�࣬�̳и������صĹ���
 */
import java.time.LocalDate;
public class Manager extends Person {

	private double salary;
	private LocalDate hireDay;	
	public Manager(String name, double salary,int year,int month,int day) {
		super(name);
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return String.format("An employee with a salary of $%.2f", salary);
	}
	/**
	 * ���ܣ�ʵ��Ա�����ٷֱ��ǹ���
	 * @param byPercent
	 */
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent/100;
		salary += raise;
	}
	
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}

	
}
