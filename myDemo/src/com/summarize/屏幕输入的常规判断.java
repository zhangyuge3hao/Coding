package com.summarize;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年7月3日 上午9:37:25
* 
* 
*/
public class 屏幕输入的常规判断 {
	//获取原数及其位数长度
	public static int getLength(String theString) {
	//public int getLength(int theNumber) {
		int len = theString.length();//现将该int数转成string来求长度
		//int len = String.valueOf(theString).length();//现将该int数转成string来求长度
		System.out.println("字符"+theString+"长度为："+len);
		return len;
	}

	//判断一个数（的每一位）是否全为数字
	public static boolean checkInt(String theString,int len){
		if(theString.matches("[0-9]*")){//[0-9]{0,999}
			System.out.println("输入正确，全部是数字");
			return false;
		}else{
			//Pattern r = Pattern.compile("\\^*\\D");
			//Matcher m = r.matcher(theString);
			String s = theString.replaceAll("[0-9]+(\\.[0-9]{0,})?", "");
			System.out.println("输入错误,存在非法字符："+s);
			//System.out.println(s+"   "+m.matches());
			return true;
		}
	}
	
	/**
	 *  \^*\D	提取出所有的数字【一】
	 *  
	 * 	[0-9]+(\\.[0-9]{0,})?  提取出所有的非数字【一】
	 * 
	 * 	([1-9]+[0-9]*|0)(\\.[\\d]+)? 提取出所有的非数字【二】
	 * 
	 *	----------输出判断结果------------
	 * 	String pattern = "\^*\D";
	 *	Pattern r = Pattern.compile(pattern);
	 *	Matcher m = r.matcher(str);
	 *	System.out.println(m.matches());
	 *
	 *	----------输出具体数值------------
	 *	String s = theString.replaceAll("[0-9]+(\\.[0-9]{0,})?", "");
	 *	System.out.println("存在非法字符："+s);
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag){
			System.out.println("请输入一个数：");
			String s = sc.next();
			flag=checkInt(s,getLength(s));
		}
	}
}
