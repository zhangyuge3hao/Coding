package com.GEEtest;
/**
【问题描述】对于一个栈，已知元素的进栈序列，判断一个由栈中所有元素组成的排列是否是可能的出栈序列。
比如，进栈序列为1 2 3 4，则可能的出栈序列有4 3 2 1，1 4 3 2等。而1 4 2 3就不是。
【输入形式】从标准输入读取第一行是一个整数N（3≤N≤10），代表有N个元素，其进栈序列是1 2 3 …… N。
第二行是空格分隔的1~N的数字的一个排列。
【输出形式】向标准输出打印结果。如果该排列是可能的出栈序列，则打印“YES”，
否则打印“NO”。在行末要输出一个回车符。
【输入样例】
3
3 1 2 
【输出样例】
NO
【样例说明】进栈序列为1 2 3的出栈序列里没有3 1 2

 */
import java.util.Scanner;
import java.util.ArrayList;
public class P_判断一个由栈中所有元素组成的排列是否是可能的出栈序列 {
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();//存放在pop中取出的在n后面的，且在push中在n前面的值
	
	public static void main(String args[]){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("请输入长度N");
			int N = sc.nextInt();
			System.out.println("请输入出栈顺序，用空格隔开");
			String p = sc.nextLine();//收空格，用nextLine
			if(N>10||N<3){
				System.out.println("长度N错误");
			}else{
				String pp[] = p.split("\\ ");
				
				int push[] = new int[N];
				int pop[] = new int[N];
				for(int i = 0;i<N ;i++){
					push[i]=i+1;
					//pop[i]=Integer.parseInt(pp[i]);
				}
				check(N,push,pop);
			}
		}
	}
	public static void check(int len,int push[],int pop[]){
		for(int i:pop){
			System.out.print(i);
		}
		System.out.println();
		for(int i:push){
			System.out.print(i);
		}
		System.out.println();
		for(int i = 0;i<len;i++){
			int index = 0;
			for(int j = 0;j<len;j++){//找到n在pop里的index
				if(i==pop[j]){
					index = j;
				}
			}
			get(i,index,len,pop);
		}
		
		
	}
	/**
	 * 1 2 3 4
输入出栈顺序，用空格分隔
3 2 1 4
	 * @param n
	 * @param index
	 * @param pop
	 */
	//存放在pop中的在n后面的值
	public static void get(int n,int index,int len,int pop[]){
		for(int i:pop){
			System.out.print(i);
		}
		System.out.println();
		for(int i = index+1;i<len;i++){
			arr.add(i);
		}
		for(Integer i:arr){
			System.out.print(i);
		}
	}
}
