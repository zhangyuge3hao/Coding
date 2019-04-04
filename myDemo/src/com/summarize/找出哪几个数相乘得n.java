package com.summarize;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月18日 下午5:24:28
* 
* 
*/
public class 找出哪几个数相乘得n {
	public static void main(String [] args){//算的是找出那几个数相乘得n
		int n=14;
		int x=0;
		int sum=1;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				sum+=i;
				n/=i;
				System.out.println(i);
				i=1;
			}
		}
	}
}
