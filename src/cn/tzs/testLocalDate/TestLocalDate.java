package cn.tzs.testLocalDate;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class TestLocalDate {
	public static void main(String[] args){
		LocalDate date = LocalDate.of(2018,2,12);
		
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		//int year = date.getYear();
		
		//将date设置为当前月的第一天
		date = date.minusDays(today-1);
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		
		//当前的星期与实际星期差几，就打打印几个空格占位。
		//如何实现打印上月的几天呢？
		
		LocalDate up = date.minusMonths(1);
		int last = up.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
		//System.out.println(last);
		//System.out.println(value);
		
		for(int i=value-1; i>0 ; i--){
			System.out.printf("%3d",last-i+1);
			System.out.print(" ");
			//System.out.print(last-i);	
		}
		
		/*
		for(int i = 1; i<value;i++){
			System.out.print("    ");
		}
		*/
		//只要日期的当前月值为给定的月份值 ，就执行循环体
		while(date.getMonthValue() == month){
			//格式化输出当前日期在月份中的第几天
			System.out.printf("%3d",date.getDayOfMonth());
			//当前月份日期与，给定的日期相等时，则在后面加上*
			if(date.getDayOfMonth() == today){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			//每打印一个日期后，则把当前日期向后移一天
			date = date.plusDays(1);
			//如果当前日期，是一个星期的星期一，则打印一个换行符。
			if(date.getDayOfWeek().getValue() == 1) System.out.println();
		}
		if(date.getDayOfWeek().getValue() != 1) System.out.println();

	}
}
