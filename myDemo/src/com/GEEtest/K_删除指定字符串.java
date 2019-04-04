package com.GEEtest;
import java.util.Scanner;

public class K_删除指定字符串 {
	public static void main(String []args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("input s1");
			String s1 = sc.next();
			System.out.println("input s2");
			String s2 = sc.next();
			String s ="";
			
			int index = s1.indexOf(s2);//查找s2在s1的第一个位置的下标 String 可以直接用indexOf
			int count = 0;
			while(index != -1){//只要s1中存在s2
				//s1 = s1.substring(0, index) + s1.substring(index+s2.length());
				StringBuffer sb = new StringBuffer(s1);
				//sb. delete (1,4)该代码的作用是删除索引值1(包括)到索引值4(不包括)之间的所有字符
				sb.delete(index,index+s2.length());
				s1 = sb.toString();//StringBuffer用完了需要转回String
				
				index = s1.indexOf(s2);
				count++;
			}
			System.out.println("after:"+s1+"  count:"+count);
		}
	}
}
