package com.GEEtest;
/**
 * 【问题描述】对于一个栈，已知元素的进栈序列，判断一个由栈中所有元素组成的排列是否是可能的出栈序列。
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

判断标准：出栈序列中，元素i之后所有比i小的元素间必须是降序排列的。

D （4 3 1 2） 选项的出栈顺序最后的 1 和 2 是无法完成的,可以发现： 如果把最后两个元素的顺序逆置一下，就可以完成了

总结：
按顺序入栈的序列，任意元素 e ，比 e 先入栈的元素，并且比 e 后出栈的元素，一定是逆序的。

读起来有点绕口，那么先记下 “ 后出先入逆序 ”

比如序列：3 1 2 4

选择任意元素 e ，这里选择 3
比 3 后出栈的有三个元素 1 2 4
其中比 3 先入栈的有两个元素 1 2
但是 1 2 是正序的，而不是逆序的
所以这个序列不是合法出栈序列
 */

import java.util.ArrayList;
import java.util.Scanner;
public class P_备份_判断一个由栈中所有元素组成的排列是否是可能的出栈序列 {
/**
 *  输入
 * @param args
 */
	public static void main(String []args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("输入整数N（3≤N≤10）：");
			/**
			 * next() 与 nextLine() 区别
next():
1、一定要读取到有效字符后才可以结束输入。以空格、回车、Tab键都会视为结束符。。
2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
next() 不能得到带有空格的字符串。
nextLine()：
1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
			 */
			String num = sc.nextLine();// 用空格分开，必须用nextLine才能接受到空格
			System.out.println("输入入栈顺序，用空格分隔");
			String push = sc.nextLine();
			System.out.println("输入出栈顺序，用空格分隔");
			String pop = sc.nextLine();
			int n = Integer.parseInt(num);
			if(n>=3&&n<=10){
				int ph[] = new int[n];
				int pp[] = new int[n];
				String p1[] = push.split("\\ ");
				String p2[] = pop.split("\\ ");
/*				for(String a:p1){
					System.out.println(a);
				}
				for(String a:p2){
					System.out.println(a);
				}*/
				for(int i = 0; i<n;i++){
					ph[i]=Integer.parseInt(p1[i]);
					pp[i]=Integer.parseInt(p2[i]);
				}
				//check(n,ph,pp);
				check(4,ph,pp);
			}else{
				System.out.println("输入整数N错误");
			}
			
		}
	}
	public static void check(int len, int ph[],int pp[]){
		/**
		 * 对于任意元素，比他先入栈的元素，在他后面出栈时，必须是逆序
		 * 用i遍历pp[i],对每个pp[i]当做任意元素
		 * 因为最终比较的是：在pp中，这些元素的顺序是否逆序
		 * 先要去pp找到在n=pp[i]后面的出栈元素
		 * 再根据这些元素去ph中比对，保留也在n前面出现的元素
		 * 看在arr中这些元素是否逆序
		 */
		//ArrayList<String> list = new ArrayList<String>();
		//不同于String，ArrayList中int 必须加[]
		ArrayList<Integer> arr = new ArrayList<Integer>();//记录ph中在n前的，且出现在pp中的元素
		int n = 0;
		int indexP = 0;//记录n在数组pp中的下标
		int indexH = 0;//记录n在数组ph中的下标
		boolean flag = true;//记录出栈pp组中，对于所有数字而言，是否都是正确序列
		for(int i = 0;i<len ;i++){
		//int i=0;
			flag = true;//跟随i跟新
			n=pp[i];//确定检查节点n
			for(int j = 0;j<len ;j++){//在pp找到在后面的入栈元素,放到arr里，
				if(n==pp[j]){
					indexP = j;
				}
				if(n==ph[j]){
					indexH = j;
				}
			}
			for(int j = indexP+1 ;j<len ;j++){//在pp找到在后面的入栈元素,放到arr里，
				arr.add(pp[j]);
			}
			int lenArr = arr.size();
			boolean f = true;//判断arr中的元素是否在ph的n的前面，需要每次更新
			for(int j = 0;j<lenArr ;j++){//删掉arr中，不属于ph中 n 前面的元素
				f = false;
				for(int k = 0;k<indexH;k++){
					if(arr.get(j)==ph[k]){
						f = true;//false 就不会被从arr中剔除
					}
				}
				if(f){
					arr.remove(j);
				}
			}
			System.out.println("剔除后："+arr);//1 2 3 4 ,3 2 1 4 ,3 1 2 4
			int lenArrAfter = arr.size();
			for(int j = 0;j<lenArrAfter-1;j++){
				f = false;
				if(arr.get(j)<arr.get(j+1)){
					f = true;//true 说明不逆序，是错误序列
				}
			}
			if(f){
				System.out.println("错误");
				flag = false;
				break;
			}else{
				System.out.println("正确");
				flag = true;
			}
		}
		if(flag){
			System.out.println("是正确序列");
		}else{
			System.out.println("是错误序列");
		}

	}
}
