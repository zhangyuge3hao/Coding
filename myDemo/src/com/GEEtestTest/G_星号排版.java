package com.GEEtestTest;
import java.util.Scanner;
public class G_星号排版 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入星号的直径，必须为奇数");
		String l = sc.next();
		if(l.matches("\\d+")&&Integer.parseInt(l)%2==1){
			handle(Integer.parseInt(l));
		}else{
			System.out.println("错误");
		}
	}
	public static void handle(int n){
		/*
		 	*****  5  0 0
		 	-***-  3  2 1
		 	--*--  1  4 2
		 */
		//【要点：星号与空格分别输出。】
		//【每行空格总和为偶数，且只输出一般。星号总数为奇数，且两行之间相差两个】
		//【先输出一半，在输出另一半】
		int c = 1;//有效个数
		while(c <= n){
			kongge((n-c)/2);
			star(c);
			System.out.println();
			c += 2;
		}
		c=n-2;

		while(c >= 1){
			kongge((n-c)/2);
			star(c);
			System.out.println();
			c -= 2;
		}	

	}
	public static void kongge(int n){
		for(int i = 0;i<n;i++){
			System.out.print("-");
		}
	}
	public static void star(int n){
		for(int i = 0;i<n;i++){
			System.out.print("*");
		}
	}
	
}
