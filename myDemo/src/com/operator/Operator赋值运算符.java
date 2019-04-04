package com.operator;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月3日 下午9:49:39
* 
* 	赋值运算符：
* 		普通赋值运算符： =
* 		扩展赋值运算符： += , -= , *= , /=, %=
* 
* 		当扩展运算符左边变量A不是 int 的时候：
* 		A += 10；	
* 		A = （A的数据类型）A+10       扩展运算会将结果--强制转换--为A（赋值运算）的类型
*/
public class Operator赋值运算符 {
	public static void main(String[] args){
		int a = 10;
		a += 20;  //a=30
		//a =- 20;  //等同于， a = -20的赋值操作，即把 - 算在数字头上 
		//a =+ 20;  //等同于， a = +20的赋值操作，即把 + 算在数字头上
		System.out.println("a="+a);
		a -= 40;  //a=-10
		System.out.println("a="+a);
		a *= 2;   //a=-20
		System.out.println("a="+a);
		a /= 5;   //a=-4
		System.out.println("a="+a);
		a %= 3;   //a=-1
		System.out.println("a="+a);
		
		//注意！！！！！！！！！！！！！
		short b = 1;  
		b += 2;//此时： short = short + int; 
		//为保证 b 的数据类型不变，此处会默认强制转换：  b = (short)(b+2);
		
		System.out.println("(short)b="+b);
	}
}
