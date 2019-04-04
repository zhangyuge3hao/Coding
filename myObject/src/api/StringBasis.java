package api;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月13日 下午4:59:16
* 
* Scanner方法：
* 	1. 描述：用于获取键盘录入的数据（包括基本数据类型、字符串）
* 		使用 Scanner(System.in)有参方法
* 		所以创建对象方法：Scanner s = new Scanner(System.in);
•	使用成员方法
* 
* -----------------------------------------------------------
* 	String：
* 		字符串类，是由多个字符组成的一串数据
* 		字符串的本质是一个【字符类型的数组】
* 	
* 	成员方法：
* 		String(String original) 
* 		String(char[] value) 
* 		String(char[] value, int index, int count) 

*/
public class StringBasis {
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		
		
		//方法1
		//String(String original) ：把【字符串数据】封装成字符串对象
		String s1 = new String("abcd");	
		System.out.println(s1);
		System.out.println("----------");
		
		//方法2
		//String(char[] value) :把【字符数组的数据】封装成字符串对象
		char[] chs={'a','b','c','d'}; 
		String s2 = new String(chs);
		System.out.println(s2);
		System.out.println("----------");
		
		//方法3
		//String(char[] value, int index, int count):把【字符数组的数据】的 一部分 封装成字符串对象
		//即从index下表起的后count位 包含的字符
		String s3 = new String(chs,0,3);//此处要注意数组越界问题，即 index + count <= chs.length()-1,输出从下标0开始的3个连续的数字
		System.out.println(s3);
		System.out.println("----------");
		
		//方法4
		//最简单的方法：
		String s4 = "abcd";
		System.out.println(s4);

	}
}
