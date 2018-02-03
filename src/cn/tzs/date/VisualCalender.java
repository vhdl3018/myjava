package cn.tzs.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VisualCalender {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入日期（格式：2010-2-11）：");
		String temp = scanner.nextLine();
		
		//String temp = "2030-5-10";
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			//System.out.println(date.getDay());
			calendar.setTime(date);
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			System.out.println("---" + calendar.getMaximum(Calendar.DATE));
			int day = calendar.get(Calendar.DATE);
			//System.out.println(day);
			calendar.set(Calendar.DATE, 1);
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			
			int maxDate = calendar.getMaximum(Calendar.DATE);
			//System.out.println("---" + maxDate);
			System.out.println("日\t一\t二\t三\t四\t五\t六");			
			for(int i = 0; i< calendar.get(Calendar.DAY_OF_WEEK)-1; i++){
				System.out.print("\t");
			}
			for(int i =1; i<=maxDate; i++){
				if(i == day){
					System.out.print("[" + i +"]"+"\t");
				}else{
					System.out.print(i+"\t");
				}
				
				if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ){	
					System.out.print('\n');
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
