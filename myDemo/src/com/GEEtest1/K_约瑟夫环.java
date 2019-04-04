package com.GEEtest1;
import java.util.Scanner;
public class K_约瑟夫环 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("输入总数n，开始人号k，报数结束m，空格隔开");
		String s = sc.nextLine();
		if(s.matches("\\d+\\ \\d+\\ \\d+")){
			String[] st = s.split("\\ ");
			int n = Integer.parseInt(st[0]);
			int k = Integer.parseInt(st[1]);
			int m = Integer.parseInt(st[2]);
			//System.out.println("n:"+n+"k:"+k+"m:"+m);
			yuesefu(n,k,m);
		}else{
			System.out.println("输入错误");
		}
	}
	public static void yuesefu(int n,int k,int m){
		int[] play = new int[n];
		int out = 0;
		int temp = 0;
		for(int i = (k-1);out<n;i++){
			if(play[i] != -1){
				if(temp == (m-1)){
					play[i] = -1;
					temp = 0;
					out++;
					System.out.println((i+1)+"退出");
				}else{
					temp++;
				}
			}
			if(i == (n-1)){
				i = -1;
			}
		}
	}
}