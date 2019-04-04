package com.operator;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月3日 下午10:23:20
* 	
* 	关系运算符：
* 		> , >= , == , <= , < , !=
* 		所以比较结果只有两种情况：true / false
* 		所以结果是boolean类型
* 	
* 	不要把 “==” 和 “=” 搞混
*/
public class Operator关系运算符 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		boolean d = (a == b);   //结果是boolean类型,这样可以作为化简的三元表达式
								// d=(a==b) <======>  d=(a==b)?a:b
		//==
		System.out.println(d);   //false
		System.out.println(a == c);   //true
		System.out.println("------------");
		
		//注意！！！！！！！！！！！！！！！！！！！！！！！
		System.out.println(a == b);   //false
		System.out.println(a = b);    //20   表示：把 b 赋值给 a ，然后输出 a 
		System.out.println("------------");
		
		//!=
		System.out.println(a != b);   //true
		System.out.println(a != c);   //false
		System.out.println("------------");
		//>
		System.out.println(a > b);   //false
		System.out.println(a > c);   //false
		System.out.println("------------");
		//>=
		System.out.println(a >= b);   //false
		System.out.println(a >= c);   //true
		System.out.println("------------");
		//<=
		System.out.println(a <= b);   //true
		System.out.println(a <= c);   //true
		System.out.println("------------");
		//<
		System.out.println(a < b);   //true
		System.out.println(a < c);   //false
		System.out.println("------------");
	}
}
