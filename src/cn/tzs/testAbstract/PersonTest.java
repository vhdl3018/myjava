package cn.tzs.testAbstract;
/**
 * ���ܣ����Գ�������������
 * @author qsqxj
 *
 */
public class PersonTest {
	public static void main(String [] args){
		//����һ��������������飬���ڴ��ʵ����Ķ���
		Person persons[] = new Person[2];
		//�ڶ��������У����һ���������һ��ѧ������
		persons[0] = new Manager("����", 12222.22, 1998,12,23);
		persons[1] = new Student("�׾�", "С��");
		
		//ѭ����ӡ������������ݣ��鿴p���õķ����������ĸ�����ķ���
		for(Person p : persons){
			System.out.println(p.getDescription());
		}
	}
}
