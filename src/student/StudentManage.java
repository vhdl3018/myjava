package student;

/**
 * ���ܣ�����ѧ����
 * @author qsqxj
 *
 */
class StudentManage {
	Student[] stu = null;
	
	public StudentManage(int a){
		this.stu = new Student[a];
	}
	/**
	 * ���ܣ����ݸ�����Id����ѯ��ǰid��Ӧѧ���ĳɼ���
	 * @param id
	 */
	public void printPoint(int id){
		for(int i = 0; i<stu.length; i++){
			if(stu[i].getId() == id){
				System.out.println("IDΪ��"+id+",�ŵ�ѧ���ɼ�Ϊ��" + stu[i].getPoint());
			}
		}
	} 
	/**
	 * ���ܣ���ӡ���ɼ���ͬ��ѧ��ID
	 * @param point
	 */
	public void printStudent(double point){
		for(int i = 0; i<stu.length; i++){
			if(stu[i].getPoint() == point){
				System.out.println("�ɼ�Ϊ��"+point+",ID�ŵ�Ϊ��" + stu[i].getId());
			}
		}
	}
	/**
	 * ���ܣ�����ѧ��ID��ɾ����ѧ���ĳɼ�
	 * @param id
	 */
	public void delPoint(int id){
		for(int i = 0; i<stu.length; i++){
			if(stu[i].getId() == id){
				//System.out.println("IDΪ��"+id+",�ŵ�ѧ���ɼ�Ϊ��" + stu[i].getPoint());
				stu[i].setPoint(0);
			}
		}
	}
	
	public void count(){
		
	}
	
}
