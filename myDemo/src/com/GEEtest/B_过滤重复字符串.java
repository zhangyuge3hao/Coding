package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月17日 下午5:04:43
* 
* 
*/
import java.util.Scanner;

public class B_过滤重复字符串 {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一些字符");
		while(true){
			String s=sc.next();
			rmR(s);
		}
	}
	public static void rmR(String s){
		int len=s.length();
		int temp=0;
		boolean flag=true;
		char before []=s.toCharArray();
		char later []=new char[len];
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(before[i]==later[j]){
					flag=false;
				}
			}
			if(flag){
				//later[i]=before[i];
				later[temp]=before[i];
				temp++;
			}
			flag=true;
		}
		for(char st:later){
			System.out.print(st);
		}
	}
}