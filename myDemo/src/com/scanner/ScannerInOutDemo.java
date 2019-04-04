package com.scanner;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月4日 上午10:25:35
* 	
* 	为了实现程序运行时接收新变量，可以用Scanner类方法
* 	Scanner类是封装在类util（utility）基础工具包中，调用方法：
* 
* 		A： 引入包：
* 			import java.util.Scanner;
* 		B: 创建键盘录入Scanner对象
* 			Scanner sc = new Scanner(System.in);
* 		C: 使用Scanner对象，接收数据
* 			int in = sc.nextInt();
* 
* 	注：Java类的编写顺序中，package >　import > class;
* 
*/
/*引入包*/
import java.util.Scanner;

public class ScannerInOutDemo {
	public static void main(String [] args){
		/*创建Scanner对象*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入数字");
		/*接收对象*/
		int in = sc.nextInt();  //接收int对象
		System.out.println("输入的是："+in);
	}
}
