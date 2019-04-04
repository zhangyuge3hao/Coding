package com.method;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月17日 上午11:50:24
* 
* 	三个方法：
* 		输入3个数字，判断：
* 			前2个数的最大值：maxTwoInPut
*			前2个数是否相等：equalTwoInPut
* 			前3个数的最大值：maxThreeInPut
*/
public class MethodPractice {
	public static void main(String[] args) {
		System.out.println("/----------有返回值的调用----------/");
		System.out.println("请输入2个或者3个数字：");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("两数中最大的是："+maxTwoInPut(A,B));
		System.out.println("两个数"+equalTwoInPut(A,B));
		int C = sc.nextInt();
		System.out.println("三数中最大的是："+maxThreeInPut(A,B,C));
		System.out.println("/----------void方法的调用，打印水仙花数----------/");
		
		
	}
	public static int maxTwoInPut(int a,int b) {
		if(a>=b){
			return a;
		}else{
			return b;
		}
	}
	public static String equalTwoInPut(int a,int b) {
		String result;
		if(a==b){
			return result="相等";
		}else{
			return result="不相等";
		}
	}
	public static int maxThreeInPut(int a,int b,int c) {
		int max=0;
		int[] arry={a,b,c};
		for(int quantity=0;quantity<3;quantity++){
			if(max<arry[quantity]){
				max=arry[quantity];
			}
		}
		return max;
	}
	
}
