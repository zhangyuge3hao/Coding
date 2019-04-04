package com.practice;

import java.util.Scanner;

/*
 * 需求：键盘录入一个月份，输出该月份对应的季节。
 * 		一年有四季
 * 		3,4,5	春季
 * 		6,7,8	夏季
 * 		9,10,11	秋季
 * 		12,1,2	冬季
 * 
 * 分析：
 * 		A:键盘录入一个月份,用Scanner实现
 * 		B:判断该月份是几月,根据月份输出对应的季节
 * 			if
 * 			switch
 */
public class Test {
	public static void main(String[] args) {
		//键盘录入一个月份,用Scanner实现
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入月份(1-12)：");
		int month = sc.nextInt();	
		//目前我们已经实现了我们的需求
		//但是我觉得代码稍微有些麻烦
		//所以我想改进
		//如何改进呢?能不能把相同季节的月份放到一起判断呢
		//能
		//month == 3 || month == 4 || month == 5
		
		if((month == 1) || (month == 2) || (month == 12)) {
			System.out.println("冬季");
		}else if((month == 3) || (month == 4) || (month == 5)) {
			System.out.println("春季");
		}else if((month == 6) || (month == 7) || (month == 8)) {
			System.out.println("夏季");
		}else if((month == 9) || (month == 10) || (month == 11)) {
			System.out.println("秋季");
		}else {
			System.out.println("你输入的月份有误");
		}
	}
}
