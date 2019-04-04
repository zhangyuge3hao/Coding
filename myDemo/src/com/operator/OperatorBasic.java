package com.operator;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年4月21日 上午11:26:06
* 	
* 	运算符(operator)：用于对常量和变量进行操作的符号
* 	
* 	表达式：用运算符连起来的符合java语法的式子
* 
* 		运算符分类（共5种）：
* 			算术运算符
* 			赋值运算符
* 			关系运算符
* 			逻辑运算符
* 			三元运算符
* 
* 		算术运算符： + , - , * , / , % , ++ , --
*  
*/
public class OperatorBasic {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);// =0
		//整数和整数的算数运算一定是整数,且 int 类型遇到除出来的小数会自动向下取整。
		
		//要得到小数结果，就必须有浮点数参与运算(浮点数位置没有关系)。
		System.out.println(3.0 / 4);// =0.75
		System.out.println(3 / 4.0);// =0.75
		float aa = 3.0f;
		float bb = 4.00f;
		System.out.println(aa * b);// =12.0
		System.out.println(a / bb);// =0.75
	}
}
