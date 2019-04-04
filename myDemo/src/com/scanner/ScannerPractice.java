package com.scanner;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月4日 下午4:05:31
* 
* 
*/
import java.util.*;
public class ScannerPractice {
	public static void main(String[] args) {
		//创建对象
		Scanner sc1 = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);  //只要申请一个Scanner对象就行
		
		//接收对象
		System.out.println("输入第一个数");
		int elm1 = sc1.nextInt();
		System.out.println("输入第二个数");
		int elm2 = sc1.nextInt();
		int i = (int)(elm1+elm2);
		System.out.println("两数和为："+i);
		
		//判断是否相等
		//boolean flag = (elm1==elm2)?true:false;  两个数相比较的情况可以用更简单的关系表达式
		boolean flag = (elm1==elm2);
		System.out.println("两数是否相等："+flag);
		
		//与第三个数比较
		System.out.println("输入第三个数");
		int elm3 = sc1.nextInt();
		int temp = (elm1>elm2)?elm1:elm2;
		int max =  (elm3>temp)?elm3:temp;
		System.out.println("三个数中的大数："+max);
	}
}
