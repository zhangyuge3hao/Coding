package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月17日 下午3:28:39
* 
* 
*/
import java.util.Scanner;
public class A_twelveToTwelve {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);

		while(true){
			System.out.println("请输入一个12进制的数字");
			String s=sc.next();
			if(s.toLowerCase().matches("[0-9ab]*")){
				toD(s);
			}else{
				System.out.println("输入错误");
			}
		}	
	}
	public static void toD(String s){
		int D=0;
		char[] each=s.toCharArray();
		int temp=0;
		int count=0;
		for(int i=s.length()-1;i>=0;i--){
			if(String.valueOf(each[i]).matches("\\d*")){
				temp=each[i]-'0';
			}else{
				switch (each[i]){
				case 'a':
					temp=10;
					break;
				case 'b':
					temp=11;
					break;
				}
			}
			D+=temp*(int)Math.pow(12,count);
			count++;
		}

		System.out.println("D:"+D);
		toT(D);
	}
	public static void toT(int s){
		String T="";
		int temp=0;
		String yu="";
		while(s>0){
			temp=s%12;
			if(temp<10){
				yu=String.valueOf(temp);
			}else{
				switch(temp){
				case 10:
					yu="a";
					break;
				case 11:
					yu="b";
					break;
				default:
					System.out.println("输入错误");
				}
			}
			T=yu+T;
			s=s/12;
		}	
		System.out.println("T:"+T);
	}
}
