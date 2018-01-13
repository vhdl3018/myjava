package cn.tzs.testLocalDate;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class TestLocalDate {
	public static void main(String[] args){
		LocalDate date = LocalDate.of(2018,2,12);
		
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		//int year = date.getYear();
		
		//��date����Ϊ��ǰ�µĵ�һ��
		date = date.minusDays(today-1);
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		
		//��ǰ��������ʵ�����ڲ���ʹ��ӡ�����ո�ռλ��
		//���ʵ�ִ�ӡ���µļ����أ�
		
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
		//ֻҪ���ڵĵ�ǰ��ֵΪ�������·�ֵ ����ִ��ѭ����
		while(date.getMonthValue() == month){
			//��ʽ�������ǰ�������·��еĵڼ���
			System.out.printf("%3d",date.getDayOfMonth());
			//��ǰ�·������룬�������������ʱ�����ں������*
			if(date.getDayOfMonth() == today){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			//ÿ��ӡһ�����ں���ѵ�ǰ���������һ��
			date = date.plusDays(1);
			//�����ǰ���ڣ���һ�����ڵ�����һ�����ӡһ�����з���
			if(date.getDayOfWeek().getValue() == 1) System.out.println();
		}
		if(date.getDayOfWeek().getValue() != 1) System.out.println();

	}
}
