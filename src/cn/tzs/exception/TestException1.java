package cn.tzs.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ���ܣ������쳣���
 * @author qsqxj
 *
 */
public class TestException1 {
	public static void main(String[] args){
		//����쳣1.���ļ�   Unhandled exception type FileNotFoundException
		//FileReader fr = new FileReader("d:\\aa.txt");
		//2.����һ��ip��ַ���˿�Ϊ��4567  
		//Unhandled exception type IOException
		//Unhandled exception type UnknownHostException
		//Socket s =new Socket("192.168.11.1", 99);
		
		//�����쳣:
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//int a = 4/0;
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 222
		//int arr[] = {1,2,3};
		//System.out.println(arr[222]);
			
		
		//�쳣����
		try {
			//FileReader fr = new FileReader("d:\\aa.txt");
			Socket s =new Socket("192.168.11.1", 99);
			//�ڳ����쳣�ĵط�������ִֹ�д�����
			//Ȼ����뵽catch�����
			//������ж��catch��䣬�����ƥ���쳣���ĸ� catch
			System.out.println("go on");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//���쳣����Ϣ������������Ŵ�
			e.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} finally{
			//������飬������û���쳣������ִ�У�
			//һ��˵������Ҫ�رյ���Դ�����ļ�����Դ�����ݿ�ȡ�
		}
			
	}
}
