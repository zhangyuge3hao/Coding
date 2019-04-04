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
import java.util.ArrayList;
import java.util.Scanner;
public class P_1 {

	public static void main(String []args){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] push = {1,2,3,4};
		int[] pop = {3,2,1,4};


		int ex = 3;
		int lenA = arr.size();
		//用arr里的数去push的ex前面找，找不到就删除arr里的这个,
		int delete = 0;//避免遍历arr的同时删除arr里的东西，导致报错:用单独的delete，和循环i同增，当有remove，就让delete--
		for(int i = 0 ;i<lenA ;i++,delete++){
			boolean f =true;
			if(ex==0){//没有比push第一个元素还早入栈的，arr肯定为空
				f = true;
			}
			for(int j = 0 ;j<ex ;j++){
				if(arr.get(delete) == push[j]){//只要找到就退出
					f = false;
					break;
				}
			}
			if(f){
				arr.remove(delete);
				System.out.println("arr"+arr);
				delete--;
			}
		}
		System.out.println(arr);
		//System.out.println("和push里"+pop[index]+"对比后还剩："+arr);
	}
	
}
