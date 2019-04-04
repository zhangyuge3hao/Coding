package com.GEEtestTest;

import java.util.Scanner;
public class D_求最大公共子串 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串");
		String a = sc.next();
		System.out.println("请输入第一个字符串");
		String b = sc.next();
		handle(a, b);
	}
	public static void handle(String a,String b){
		//首先找到最小的那个字符串，并和长的字符串比较，看是否在其中，每次缩减一位去比较
		StringBuffer max = new StringBuffer();
		String min = "";
		
		max = (a.length()>b.length())?max.append(a):max.append(b);
		min = (a.length()<b.length())?a:b;
		
		int lMin = min.length(); 
		System.out.println("max:"+max.substring(0)+"--min:"+min);
		for(int i = 0;i<lMin;i++){//由于substring(i,n)并不显示n的值，所以一定要从前往后缩进
			if(max.indexOf(min.substring(i))!=-1){
				System.out.println("最长的字串是："+min.substring(i));
				break;
			}
		}
	}
}
