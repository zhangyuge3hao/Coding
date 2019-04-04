package com.sort;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月22日 上午11:51:04
* 
* 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。 

5.1 算法描述
把长度为n的输入序列分成两个长度为n/2的子序列；
对这两个子序列分别采用归并排序；
将两个排序好的子序列合并成一个最终的排序序列。

*/
public class 归并排序MergeSort2 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int [] a = {10};
		boolean flag = true;
		while(flag){
			System.out.println("Please input the numbers for InsertionSort,and split them with ','.Input # to stiop the progarm");
			String s = sc.next();
			if(s.matches("(\\d+\\,)*\\d+")){
				String []num = s.split("\\,");
				int len = num.length;
				int n[] = new int[len];
				for(int i = 0;i < len ;i++){
					n[i] = Integer.parseInt(num[i]);
				}
				//InsertionSort(n,len,a);
				quickSort(n,0,len-1);//同一个数组，在方法中传递，会直接改变数组中的值，而int 之类的参数是不会改变的
			}else if(s.equals("#")){
				System.out.println("Input abort.");
				flag = false;
			}else{
				System.out.println("Input illegal.");
			}
		}
	}
	public static void quickSort(int array[], int low, int high) {// 传入low=0，high=array.length-1;
		int pivot, p_pos, i, t;// pivot->位索引;p_pos->轴值。
		if (low < high) {
			p_pos = low;
			pivot = array[p_pos];
			for (i = low + 1; i <= high; i++)
				if (array[i] > pivot) {
					p_pos++;
					t = array[p_pos];
					array[p_pos] = array[i];
					array[i] = t;
				}
			t = array[low];
			array[low] = array[p_pos];
			array[p_pos] = t;
			// 分而治之
			quickSort(array, low, p_pos - 1);// 排序左半部分
			quickSort(array, p_pos + 1, high);// 排序右半部分
		}
	}
}
