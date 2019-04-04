package com.GEEtestTest;
/*
N个猴子围成一个圈
1、从第一只猴子开始报数，第一只猴子报1
2、每个报2的猴子退出，然后从下一只猴子重新开始报数，
3、要求输出退出的顺序和最后剩下的人
*/
import java.util.Scanner;
public class J_猴子选大王 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入猴子总数");
		String s = sc.next();
		if(s.matches("\\d+")){
			int n = Integer.parseInt(s);
			yuesefu(n);
		}else{
			System.out.println("输入错误");
		}
	}
	public static void yuesefu(int n){
		int k = 1, m = 2;
		System.out.println("总数："+n+"从"+k+"号猴子开始报数，报到m结束："+m);
		int[] mon = new int[n];
		int out = 0;
		int num = 0;//报数是从1开始的，所以初始是0
		for(int i = (k-1);out<n;i++){
			if(mon[i]!=-1){
				if(num==(m-1)){
					mon[i]=-1;
					out++;
					num=0;
					
					if(out==n){
						System.out.println((i+1)+"最后退出");
					}else{
						System.out.println((i+1)+"退出");
					}
				}else{
					num++;
				}
			}
			if(i==(n-1)){
				i=-1;
			}
		}
		System.out.println(out+"退出总数");
	}
}
