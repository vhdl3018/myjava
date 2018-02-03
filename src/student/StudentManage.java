package student;

/**
 * 功能：管理学生类
 * @author qsqxj
 *
 */
class StudentManage {
	Student[] stu = null;
	
	public StudentManage(int a){
		this.stu = new Student[a];
	}
	/**
	 * 功能：根据给定的Id，查询当前id对应学生的成绩。
	 * @param id
	 */
	public void printPoint(int id){
		for(int i = 0; i<stu.length; i++){
			if(stu[i].getId() == id){
				System.out.println("ID为："+id+",号的学生成绩为：" + stu[i].getPoint());
			}
		}
	} 
	/**
	 * 功能：打印出成绩相同的学生ID
	 * @param point
	 */
	public void printStudent(double point){
		for(int i = 0; i<stu.length; i++){
			if(stu[i].getPoint() == point){
				System.out.println("成绩为："+point+",ID号的为：" + stu[i].getId());
			}
		}
	}
	/**
	 * 功能：输入学生ID，删除该学生的成绩
	 * @param id
	 */
	public void delPoint(int id){
		for(int i = 0; i<stu.length; i++){
			if(stu[i].getId() == id){
				//System.out.println("ID为："+id+",号的学生成绩为：" + stu[i].getPoint());
				stu[i].setPoint(0);
			}
		}
	}
	
	public void count(){
		
	}
	
}
