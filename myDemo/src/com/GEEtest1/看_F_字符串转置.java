package com.GEEtest1;
import java.util.Scanner;
public class 看_F_字符串转置 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一组字符，空格隔开");
		String s = sc.nextLine();
		String[] a = s.split("\\ ");
		a(a);
		System.out.println(" ");
		b(a);
		sc.close();
	}
	public static void b(String[] a){
		int len = a.length;
		for(int i = 0;i<len;i++){
			StringBuffer sb = new StringBuffer();
			sb.append(a[i]);
			System.out.print(sb.reverse().toString());
			System.out.print(" ");
		}
		
	}
	public static void a(String[] a){
		int len = a.length;
		for(int i = 0;i<len;i++){
			char[] c =	a[i].toCharArray();
			int lenC = c.length;
			for(int j = lenC-1;j>=0;j--){
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
	}
}
