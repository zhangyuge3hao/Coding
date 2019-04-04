package com.sort;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月22日 上午11:51:04
* 快速排序的基本思想：通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序。

6.1 算法描述
快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：

从数列中挑出一个元素，称为 “基准”（pivot）；
重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
* 特点：高效，时间复杂度为nlogn。
采用分治法的思想：首先设置一个轴值pivot，然后以这个轴值为划分基准将待排序序列分成比pivot大和比pivot小的两部分，接下来对划分完的子序列进行快排直到子序列为一个元素为止。

*/
public class 快速排序QuickSort {
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
