package cn.tzs.TestException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 功能：测试异常类的相关功能
 * @author qsqxj
 *
 */
public class TestException {
	public static void main(String[] args){
		/*
		int i = 10;
		System.out.print(i/0);
		
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at cn.tzs.TestException.TestException.main(TestException.java:6)
		
		*/
		
		FileReader reader = null;
		
		try {
			reader = new FileReader("D:/JAVA_CODE/aa.txt");
			char c = (char)reader.read();
			char c2 = (char)reader.read();
			
			System.out.println("读取的内容是：" + c +c2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(reader != null){
					reader.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
