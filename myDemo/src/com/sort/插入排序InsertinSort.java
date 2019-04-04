package com.sort;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月22日 上午9:34:09
* 
* * https://www.cnblogs.com/onepixel/articles/7674659.html#!comments
* 
* 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。

3.1 算法描述
一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：

从第一个元素开始，该元素可以认为已经被排序；
取出下一个元素，在已经排序的元素序列中从后向前扫描；
如果该元素（已排序）大于新元素，将该元素移到下一位置；
重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
将新元素插入到该位置后；
重复步骤2~5。
*/
import java.util.Scanner;
public class 插入排序InsertinSort {
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
				insertionSort(n,len,a);//同一个数组，在方法中传递，会直接改变数组中的值，而int 之类的参数是不会改变的
			}else if(s.equals("#")){
				System.out.println("Input abort.");
				flag = false;
			}else{
				System.out.println("Input illegal.");
			}
		}
	}
	public static void  insertionSort(int arr[],int len,int []a) {
	    int preIndex, current;
	    for (int i = 1; i < len; i++) {//i = boundry
	        preIndex = i - 1;//preIndex 有序组的最后一个元素的索引
	        current = arr[i];//current 无序组的第一个
	        
	      //通过preIndex将有序组从后向前遍历，只要遇到比current大的数字，就交换两个的位置，而不是找到需要插入的位置后再一次性换全部调换
	        while (preIndex >= 0 && arr[preIndex] > current) {
	            arr[preIndex + 1] = arr[preIndex];
	            preIndex--;
	        }
	        arr[preIndex + 1] = current;
	    }
	    for(int n :arr){
			System.out.print(n+" ");
		}
		/*System.out.println(a[0]);*/
	}
	public static void InsertionSort(int num[],int len,int[] a){
		int temp = 0;
		for(int b = 1;b<len;b++){//b = boundry,指向有序边界外的第一个未排序元素
			/* i 从右往左遍历有序组内的数字，并和b元素比较，当找到比b小的i，将b放到i的后一位上
			 * 	 若i中没有比b小的数，将b放在0号
			 */
			int index = 0;
			temp = num[b];
			boolean flag = true;
			for(int i = b-1;i>=0&&flag;i--){//i 从右往左遍历有序组内的数字，并和b元素比较,记下比b的小i的索引【找到立即退出】
				if(num[i]<num[b]){
					index = i+1;// index 默认为0，若i中没有比b小的数，index不会被改变，将b放在0号
					flag = false;
				}
			}
			for(int i = b-1; i>=index; i--){//按照index的位置，将有序组中从index到有序组右边界（b-1）的所有元素向右移动
				num[i+1] = num[i];
			}
			num[index]  = temp;
		}
		for(int n :num){
			System.out.print(n+" ");
		}
/*		a[0]=11;
		System.out.println(a[0]);*/
		
	}
	
}
