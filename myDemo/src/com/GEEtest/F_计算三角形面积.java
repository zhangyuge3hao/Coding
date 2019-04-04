package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月18日 下午3:19:55
* 
* 
*/
import java.util.Scanner;

public class F_计算三角形面积 {
	public static void main(String [] args){
/*	秦九昭公式
  		三角形三边长分别为abc，面积为S，半周长为m=(a+b+c)/3
		S=根号下m*(m-a)*(m-b)*(m-c)
*/	Scanner sc= new Scanner(System.in);
		while(true){
			System.out.println("type a b c,and split them with .");
			String s=sc.next();
			
			if(s.matches("\\d+[.]\\d+[.]\\d+")){

				String str[]=s.split("\\.");
/*				for(String ss:str){
					System.out.println(ss);
				}*/
				int a=Integer.parseInt(str[0]);
				int b=Integer.parseInt(str[1]);
				int c=Integer.parseInt(str[2]);
				double m=(a+b+c)/2;
				System.out.println("面积是："+Math.sqrt(m*(m-a)*(m-b)*(m-c)));
			}else{
				System.out.println("Input illegal");
			}
		}
		
	}
}
