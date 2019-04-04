package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月18日 下午3:53:37
* 
* 
*/
import java.util.Scanner;
public class G_求完数 {
	public static void main(String [] args){
/*		问题：输出1000以内的完数
		完数：如果一个数恰好等于除它本身外的因子之和，这个数就是完数。
		例如6=1+2+3;28=1+2+4+7+14
*/	
		Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println("input a range,split the limits with .");
			String s =sc.next();
			if(s.matches("\\d+[\\.]\\d+")){
				String str[]=s.split("\\.");
				int a=0;
				if(Integer.parseInt(str[0])<=1){
					a=2;
				}else{
					a=Integer.parseInt(str[0]);
				}
				int b=Integer.parseInt(str[1]);
				if(a<=b){
					System.out.println("区间内共有"+getNum(a,b)+"个完数");
				}else{
					System.out.println("Input illegal");
				}
				//System.out.println(findX(a));
			}else{
				System.out.println("Input illegal");
			}
		}
	}
	public static int getNum(int n,int m){
		int count=0;
		for(int i=n;i<=m;i++){
			if(findX(i)==i){
				System.out.println(i+"是完数");
				count++;
			}
		}
		return count;
	}
	public static int findX(int n){//找出所有【除去本身外的】约数
		int x=0;
		int sum=1;
		for(int i=2;i<n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
	/*public static int findX(int n){//算的是找出那几个数相乘得n
		int x=0;
		int sum=1;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				sum+=i;
				n/=i;
				i=1;
			}
		}
		return sum;
	}public static int findX(int n){
		int x=0;
		int sum=1;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				sum+=i;
				findX(x=n/i);	
			}
		}
		return sum;
	}*/
}
