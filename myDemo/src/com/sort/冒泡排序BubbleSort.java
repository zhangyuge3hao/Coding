package com.sort;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月20日 下午2:02:34
* https://www.cnblogs.com/onepixel/articles/7674659.html#!comments
* 冒泡排序（Bubble Sort）
	冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。 

1.1 算法描述
	比较相邻的元素。如果第一个比第二个大，就交换它们两个；
	对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
	针对所有的元素重复以上的步骤，除了最后一个；
	重复步骤1~3，直到排序完成。
*/
import java.util.Scanner;

public class 冒泡排序BubbleSort {
	public static void main(String [] args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("please input the numbers and split with ','.Input # to stop the program.");
			String s = sc.next();
			if(s.matches("(\\d+\\,)*\\d+")){
				String []arr = s.split(",");
				int []num = new int[arr.length];
				for(int i = 0;i < arr.length;i++){
					num[i]=Integer.parseInt(arr[i]);
				}
				bobbleSort(num,num.length);
			}else if(s=="#"){
				flag=false;
			}else{
				System.out.println("Input illegal");
			}
		}
		sc.close();
	}
	public static void bobbleSort(int[] num,int len){
		int temp = 0;
		while(len>=1){
			for(int i = 0; i<len-1; i++){
				if(num[i]>num[i+1]){
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
			len--;//每次冒泡会将最大值放到最后，下次不必遍历
		}
		for(int n : num){
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
