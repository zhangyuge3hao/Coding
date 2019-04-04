package com.regex正则表达式;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年10月9日 上午11:06:48
* 
*  1.【匹配】测试字符串内的模式。
*	   【String中提供了底层的封装匹配方法：boolean matches(regex)】
*	例如，可以测试输入字符串，以查看字符串内是否出现电话号码模式或信用卡号码模式。这称为数据验证。
* 
*/
public class 匹配Matches {
	/*
	 * 判断一个字符串：
	 * 1.长度在5-8位之间，只能是数字和字母； 2.第一位只能是数字但不能为0； 
	 * 3.2-4位必须是3-7之间的数字； 4.最后一位必须是大写字母
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int temp = 1;
		while(temp==1){
			System.out.println("please input a character string");
			String str = sc.next();
			matches(str);
		}
	}
	public static void matches(String str){
		String regex = "[1-9][3-7]{3}(\\w){0,3}[A-Z]";
		//String regex = "[1-9][3-7]{3}(\\w)*[A-Z]";//*表示0次或多次，即违反了第一条要求
		
		if(str.matches(regex)){
			System.out.println("匹配正确");
		}else{
			System.out.println("匹配错误");
		}
		//【疑问：如何输出正则表达式的不同错误信息？】
	}
}
