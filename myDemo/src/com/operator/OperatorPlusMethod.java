package com.operator;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年4月21日 下午2:17:44
* 
* 
*/
public class OperatorPlusMethod {
	public static void main(String [] args){
		/* 字符参与加法运算
		 * 即用字符对应的ASCII码进行运算。
		 * a = 97
		 * A = 65
		 * 0 = 48
		 */
		int a = 10;
		int b = 20; 
		char c = 'a';
		char C = 'A';
		System.out.println(a + b);
		System.out.println(a + c);// a = 97
		System.out.println(a + C);// A = 65
		System.out.println(c + C);
		/* 字符串参与加法运算
		 * 
		 * 算数运算，是以表达式从左往右的顺序依次进行的。
		 * 在从左往右的运算中，数字与数字相加仍做加法运算，
		 * 在从左往右的运算中，当加数中出现字符串时，之后的结果自动转为字符串类型，
		 * 	     并以字符串拼接的方式，将之后的元素全部“拼接”在后面
		 */
		System.out.println("hello" + a);// =hello10
		System.out.println("hello" + a + b+c);// =hello1020
		
		/**
		 * 注意：使用()将字符串后面的运算部分括起来，括起来的部分在参与运算时仍有较高的优先权
		 */
		System.out.println("hello" + (a + b)+40);// ||---=hello3040---||
		
		System.out.println(a + c + "hello");// =30hello
		
		System.out.println("a="+a);// a=10 ，变量的输出也是靠 ----字符串 做拼接加法---- 来实现的
	}
}
