package com.GEEtest1;
import java.util.Scanner;
public class K_ɾ��ָ���ַ��� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��S1");
		String s1 = sc.next();
		System.out.println("����һ��S2");
		String s2 = sc.next();
		
		int index = s1.indexOf(s2);
		while(index != -1){
			StringBuffer sb = new StringBuffer(s1);
			sb.delete(index,index+s2.length());
			s1 = sb.substring(0);
			index = s1.indexOf(s2);
		}
		
		System.out.println(s1);
	}
}
