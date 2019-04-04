package com.GEEtest1;
import java.util.Scanner;
public class D_最大子串 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个字符串");
		String a = sc.next();
		System.out.println("输入第二个字符串");
		String b = sc.next();
		handle(a,b);
	}
	public static void handle(String a ,String b){
		int lenA = a.length();
		int lenB = b.length();
		StringBuffer max = new StringBuffer();
		StringBuffer min = new StringBuffer();
		min.append(lenA<lenB?a:b);
		max.append(lenA>lenB?a:b);
		int lenMim = min.length();
		for(int i = 0;i<lenMim;i++){
			String temp = min.substring(i).toString();
			if(max.indexOf(temp)!=-1){//buffer里面没有contain
				System.out.println(":"+temp);
				break;
			}
		}
	}
}
