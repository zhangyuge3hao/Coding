package com.GEE1917;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年3月20日 下午5:48:09
* 
* 给定K个整数{N1、N2、、、NK},其任意连续子序列可表示为{Ni、Ni+1、、、Nj}，1<i<j<=K。最大连续子序列是所有连续子序列中元素和最大的一个。
* 例如给定序列{-2,11,-4,13,-5,-2},其最大连续子列为{11,-4,13}，最大和为20。请给出孩子序列的第一个和最后一个元素，以及该子序列中各整数的和值．（30分）

输入格式：试输入包含若干测试用例，每个测试用例占2行，第一行为正数K（<10000）,第二行为K个整数，中间用空格分割。当K为零时，输入结束．该用例不被处理。

输出格式：对每个试用例，在一行里输出最大和，最大连续了序列的一个和最后一个元素，中间用空格分隔·如果最大连续子序列不唯一，则输出序号i和j最小的耶个。
若所有K个元素都为负數，则定义其最大和为0，输出整个序列的首尾元意。


* 
*/
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input K");
		int k = sc.nextInt();
		String notUse = sc.nextLine();
		System.out.println("Input numbers,split it with space");
		String s = sc.nextLine();
		if(k<10000&&k>0&&s.matches("(\\d+\\ )+\\d+")){
			System.out.println("Ok");
			String[] n =s.split("\\ ");
			int len = n.length;
			int[] num = new int[len];
			boolean flag = false;
			for(int i = 0;i<len;i++){
				num[i] = Integer.parseInt(n[i]);
				if(num[i]>=0){
					flag = true;
				}
			}
			if(flag){
				getLong(num);
			}else{
				System.out.println("K个元素都为负數，定义其最大和为0");
				System.out.println(num[0]+"---"+num[len-1]);
			}
		}else{
			System.out.println("Input illegal.");
		}
	}
	public static void getLong(int[] num){
		
	}
}
