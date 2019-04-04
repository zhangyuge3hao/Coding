package com.array;

import java.util.Arrays;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月8日 下午10:10:34
* 
* 	数组：      存储[同一种]数据类型的 (多个元素) 的  [容器]
* 	定义格式：
* 		  A. 数据类型[] 数组名
* 							int[] array;  定义一个int类型的数组，数组名叫array  (推荐方式)
* 		  B. 数据类型    数组名[]
* 							int array[];  定义一个int类型的变量，变量名叫array数组
* 	初始化：
* 		  数组的初始化，就是为数组在开辟内存空间，并为数组中的每个元素赋初值
* 	  	  初始化方式：	
* 		  A. 动态初始化:	
* 			  只申请数组的长度，由系统给数组赋初值			数据类型  [] 数据名 = new 数据类型[数组长度];				
* 		  B. 静态初始化：
* 			  给数组赋初值，由系统决定数组的长度（分配内存大小)	数据类型  [] 数据名 = new 数据类型[]{元素1,元素2,....,元素n};
* 									  			数据类型  [] 数据名 = {元素1,元素2,....,元素n};   (格式化简后)
* 	常见问题：
* 		  A. 数组越界：数组中只有3个元素，但要输出arr[3](第4个元素)，访问了不存在的索引。会报错：
* 			 java.lang.ArrayIndexOutOfBoundsException: 3（3表示越界的索引号）
* 		  B. 空指针异常： 数组内存的堆地址为空：
* 			 java.lang.NullPointerException
*/
public class ArrayBasic {
	public static void main(String[] args) {
		/* -----数组的动态初始化-----
		 * 数据类型  [] 数据名 = new 数据类型[数组长度];
		 * 
		 * 获取数组长度
		 */
		System.out.println("/---------数组的动态初始化---------/");
		int[] arr = new int[3];
		int len = arr.length;
		/*
		 * 左边：
		 * 		int：定义数组中每个元素的数据类型，为int
		 * 		[]：表示这是数组
		 * 		arr：数组名
		 * 右边：
		 * 		new：为数组申请分配开辟内存空间
		 * 		int：定义数组中每个元素的数据类型，为int
		 * 		[]：表示这是数组
		 * 		3：数组长度，表示数组内有3个元素,【不显式的定义出来，默认值是0】
		 */
		System.out.println("arr="+arr);//直接输出arr，输出的是地址：     [I@2d11f5f1    （只有一个[,表示一维数组）
		/*
		 * 	输出数组中的每个元素，输出格式：
		 * 		数组名[索引]  （索引是元素编号的专业说法）
		 * 		通过索引可以输出确定的数组元素
		 * 		数组中元素的索引从0开始，到数组长度-1结束
		 * 		若输出数组索引越界：java.lang.ArrayIndexOutOfBoundsException: 3（3表示越界的索引号）
		 */
		for(int index=0;index<3;index++){
			System.out.println("元素"+index+"是："+arr[index]);
		}
		
		
		/* -----数组的静态初始化-----
		 * 
		 * 数据类型  [] 数据名 = new 数据类型[]{元素1,元素2,....,元素n};
		 * 
		 * 数据类型  [] 数据名 = {元素1,元素2,....,元素n};   (格式化简后)
		 */
		System.out.println("/---------数组的静态初始化---------/");
		int[] arr1 = {1,6,3,4};
		for(int index=0;index<=3;index++){
			System.out.println("元素"+index+"是："+arr1[index]);
		}
		System.out.println("arr1="+arr1);//直接输出arr，输出的是地址：     [I@2d11f5f1    （只有一个[,表示一维数组）
		
		System.out.println("/---------数组的最大值---------/");
		int temp =arr1[0];;
		for(int index=0;index<3;index++){
			if(arr1[index]>=temp){
				temp=arr1[index];
			}
		}
		System.out.println("最大值是："+temp);
		System.out.println("输出全部："+Arrays.toString(arr1));
	}
}
