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
【评分标准】结果完全正确得20分，每个测试点4分。上传c语言源程序为outstack.c。

 */
import java.util.Scanner;
import java.util.ArrayList;
public class P_2 {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("请输入长度N");
			int n = sc.nextInt();

			String notuse = sc.nextLine();
			System.out.println("请输入出栈顺序");
			String s = sc.nextLine();
			
			String[] p = s.split("\\ ");
			int[] pop = new int[n]; 
			int[] push = new int[n];
			for(int i = 0;i<n;i++){
				pop[i] = Integer.parseInt(p[i]);
				push[i] = i+1;
			}
			check(n,push,pop);
		}
	}
	//获得在n
	public static void check (int len,int[] push,int[] pop){
		boolean flag = true;//当所有任意数都正确，返回true
		//for(int ex = 0;ex<1;ex++){//ex对pop循环
		for(int ex = 0;ex<len;ex++){//ex对pop循环	 
			int n = push[ex];//n充当任意数
			System.out.println(" 任意数是"+n);
			//获得n在pop里的下标,n在push里的下标就是ex
			int index = 0;
			for(int i = 0;i<len;i++){
				if(n == pop[i]){
					index = i;
				}
			}
			
			//找pop中到n后面的，且push中，在n前面的值
			getA(len,ex,index,push,pop);
			
			//判断是否逆序
			if(order()){
			}else{
				System.out.println("NO");
				flag = false;
				break;
			}
			arr.clear();
		}
		if(flag){
			System.out.println("yes");
		}
	}
	public static boolean order(){
		boolean f = true;
		int len = arr.size();
		for(int i = 0 ;i<len ;i++){
			f = true;
			for(int j = i+1 ;j<len ;j++){
				if(arr.get(i)<arr.get(j)){
					f = false;
					return f;
				}
			}
		}
		return f;
	}
	public static void getA(int len,int ex,int index,int[] push,int[]pop){
		//找到pop中在n后面的
		for(int i = index+1 ;i<len ;i++){
			arr.add(pop[i]);
		}
		System.out.println("pop里"+pop[index]+"后的数字是"+arr);

		int lenA = arr.size();
		//用arr里的数去push的ex前面找，找不到就删除arr里的这个,
		int delete = 0;//避免遍历arr的同时删除arr里的东西，导致报错:用单独的delete，和循环i同增，当有remove，就让delete--
		for(int i = 0 ;i<lenA ;i++,delete++){
			boolean f =false;
			if(ex==0){//没有比push第一个元素还早入栈的，arr肯定为空
				f = true;
			}
			for(int j = 0 ;j<ex ;j++){
				if(arr.get(i) == push[j]){//只要找到就退出
					f = true;
					break;
				}
			}
			if(f){
				arr.remove(delete);
				System.out.println("arr"+arr);
				delete--;
			}
		}
		System.out.println("和push里"+pop[index]+"对比后还剩："+arr);
		/*for(int i:copy){
			System.out.print(i);
		}
		System.out.println(arr);
		for(int i = 0 ;i<lenA ;i++){
			if(){
				res.add();
			}
		}*/
	}
}
