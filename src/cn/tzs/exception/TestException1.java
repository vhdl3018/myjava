package cn.tzs.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 功能：测试异常类的
 * @author qsqxj
 *
 */
public class TestException1 {
	public static void main(String[] args){
		//检查异常1.打开文件   Unhandled exception type FileNotFoundException
		//FileReader fr = new FileReader("d:\\aa.txt");
		//2.连接一个ip地址，端口为：4567  
		//Unhandled exception type IOException
		//Unhandled exception type UnknownHostException
		//Socket s =new Socket("192.168.11.1", 99);
		
		//运行异常:
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//int a = 4/0;
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 222
		//int arr[] = {1,2,3};
		//System.out.println(arr[222]);
			
		
		//异常处理
		try {
			//FileReader fr = new FileReader("d:\\aa.txt");
			Socket s =new Socket("192.168.11.1", 99);
			//在出现异常的地方，就终止执行代码了
			//然后进入到catch语句中
			//如果，有多个catch语句，则进入匹配异常的哪个 catch
			System.out.println("go on");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//把异常的信息输出来，利于排错。
			e.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} finally{
			//这个语句块，不管有没有异常，都会执行，
			//一般说，把需要关闭的资源，【文件、资源、数据库等】
		}
			
	}
}
