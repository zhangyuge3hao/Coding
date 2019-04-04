package com.GEEtest1;
import java.util.ArrayList;
/**
 * 比如，进栈序列为1 2 3 4，则可能的出栈序列有4 3 2 1，1 4 3 2等。而1 4 2 3就不是。
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

判断标准：出栈序列中，元素i之后所有比i小的元素间必须是降序排列的。
 */
import java.util.Scanner;
public class R_出栈序列 {
	public static void main(String[] args){
		int[] pop = {3,2,1,4,5};
		int[] push = {1,2,3,4,5};
		int n=5;
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] push = new int[n];
		for(int i = 0;i<n;i++){
			push[i] = i+1;
		}
		
		String notuse = sc.nextLine();
		String s = sc.nextLine();
		String[] p = s.split("\\ "); 
		
		int len = p.length;
		int[] pop = new int[len];
		for(int i = 0;i<len;i++){
			pop[i] = Integer.parseInt(p[i]);
		}//数组准备完毕
*/		
		//int t = 3;//当前判断数
		for(int i = 0;i<n;i++){
			handle(push,pop,i,n);
		}
		
		
		
		for(int i :pop){
			System.out.print(i);
		}
		System.out.println();
		for(int i :push){
			System.out.print(i);
		}
	}
	public static void handle(int[] push,int[] pop,int t,int n){
		//寻找t在pop后面的数字组，并和push中t前面的数字组
		//t在push中的下标
		int tpush = 0;
		for(int i = 0; i<n;i++){
			if(t==push[i]){
				tpush = i;
			}
		}
		//t在pop中的下标s
		int tpop = 0;
		for(int i = 0; i<n;i++){
			if(t==pop[i]){
				tpop = i;
			}
		}
		//t在pop中，下标tpop后面还有几个元素：
		int lt = n-(tpop+1);
		int[] remin = new int[lt];
		
		System.out.println("t在push中的下标tpush:"+tpush+"--t在pop中的下标stpop:"+tpop);
		//t在pop后的元素
		for(int i = tpop+1,j = 0; i<n;i++,j++){
			remin[j]=pop[i];
		}
		//t在push前的元素
		String tpushB = "";
		for(int i = 0; i<tpush;i++){
			tpushB+=push[i];
		}
		
		getElem(tpushB,remin);
	}
	public static void getElem(String tpushB,int[] spop){
		for(int i:spop){
			System.out.print(i+"--");
		}
	System.out.println("   t在push前的元素tpushB:"+tpushB);
		int len = spop.length;
		for(int i =0 ;i<len;i++){
			if(tpushB.indexOf(String.valueOf(spop[i]))==-1){
				spop[i] = 0;
			}
		}
		for(int i:spop){
			System.out.print(i+"--");
		}
		boolean f = true;
		for(int i =0 ;i<len-1;i++){
			if(spop[i]<spop[i+1]){
				f = false;
				break;
			}
		}
		if(f){
			System.out.println("逆序");
		}else{
			System.out.println("不逆序");
		
		System.out.println("spop:"+spop.toString()+"--tpushB:"+tpushB);
		}
	}
}
