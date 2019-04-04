package com.operator;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月4日 上午9:41:52
* 	
* 	三元运算符：
* 		关系表达式 ? 表达式1 : 表达式2
* 			若关系表达式为true，则进行表达式1的运算，并返回结果
* 			若关系表达式为false，则进行表达式2的运算，并返回结果
*/
public class Operator三元运算符 {
	public static void main(String[] args) {
		int a = 25;
		int b = 20;
		int d = 30;
		int c ;
		//比较2个数的最大值
		//c = (a>b)?++a:++b;
		c = (a>b)?a:b;
		System.out.println("a，b中的最大值是"+c);
		
		boolean e = (a>b)?true:false;
		System.out.println("e="+e);
		
		//比较3个数的最大值
		int temp = (a>b)?a:b;
		int max =(temp>d)?temp:d;
		System.out.println("a，b，c中的最大值是"+max);
	}
}
