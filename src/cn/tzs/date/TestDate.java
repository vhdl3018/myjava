package cn.tzs.date;

import java.util.Date;

/**
 * ���ܣ�����Date�����ع���
 */
public class TestDate {

	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();

		// System.out.println(d);
		System.out.println(t);
		System.out.println(d.getTime());
	}

}
