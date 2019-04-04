package com.method;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月24日 上午9:38:33
* 
* 	方法的重载：
* 		一个类允许多个[重名]的方法，就叫做方法的重载
* 		重载的方法除了[方法名相同]外，[参数列表]必须不同：
* 			A. 参数个数不同
* 			B. 参数类型不同
* 			C. 重载与方法返回值无关
*/
public class Method方法重载 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		short short1 = 5;
		short short2 = 6;
		System.out.println("sum(c,b)="+sum(c,b));
		System.out.println("sum(short1,short2)="+sum(short1,short2));
		System.out.println("sum(c,b,a)="+sum(c,b,a));
		System.out.println("sum('1','A')="+sum('1','A'));	//字符相加，加的是ASC码值
		/*
		 * byte \ short \ long --- initial
		 */
		System.out.println();
	
		System.out.println("compare('1','A')的判断结果是："+compare('1','A'));
		System.out.println("compare('中','国')的判断结果是："+compare('中','国'));
		System.out.println("compare('love','life')的判断结果是："+compare("love","life"));
		System.out.println("compare(1,3)的判断结果是："+compare(1,3));
		System.out.println("compare(2,2)的判断结果是："+compare(2,2));
		System.out.println("compare(3l,3l)的判断结果是："+compare(3L,3L));	//要直接调用long类型的方法重载，可直接在数字后面加“L”以表示数据类型
		System.out.println("compare(3F,3F)的判断结果是："+compare(3F,3F));	//要直接调用float类型的方法重载，可直接在数字后面加“F”以表示数据类型
		System.out.println("compare(true,false)的判断结果是："+compare(true,false));

	}
	public static int sum(int a, int b){			//定义标准方法
		System.out.print("/---a+b(int)---/");
		return a+b;
	}
	public static int sum(short a, short b){		//与标准方法参数类型不同，且说明方法重载与返回值无关
		System.out.print("/---a+b(short)---/");
		return a+b;	//两个short类型相加 会自动 提升类型的至int
		//return (short)(a+b);
		//若仍然使用返回short，则报错Type mismatch: cannot convert from int to short
	}
	public static int sum(int a, int b , int c){	//与标准方法参数个数不同
		System.out.print("/---a+b+c---/");
		return a+b+c;
	}

	/*
	 * byte \ char \ short \ int \ long ---compare method
	 */
	public static boolean compare(byte a, byte b){
		System.out.print("/---byte---/");
		return a == b;
	}
	public static boolean compare(char a, char b){
		System.out.print("/---char---/");
		return a == b;
	}
	public static boolean compare(String a, String b){
		System.out.print("/---String---/");
		return a == b;
	}
	public static boolean compare(short a, short b){
		System.out.print("/---short---/");
		return a == b;
	}
	public static boolean compare(int a, int b){
		System.out.print("/---int---/");
		return a == b;
	}
	public static boolean compare(long a, long b){
		System.out.print("/---long---/");
		return a == b;
	}
	public static boolean compare(float a, float b){
		System.out.print("/---float---/");
		return a == b;
	}
	public static boolean compare(boolean a, boolean b){
		System.out.print("/---boolean---/");
		return a == b;
	}
}
