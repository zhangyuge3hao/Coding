package com.method;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月31日 上午10:26:48
* 
* 	通过输入数组长度，自动生成数组，并输出、求最大值、求和
*/
public class MethodPracticeArr {
	public static void main(String[] args) {
		int[] arr=initial();
		traversal(arr);
		max(arr);
		sum(arr);
	}
	//初始化数组
	public static int[] initial (){	//返回一个数组类型的方法，数据变量应写成数组变量 （二维同理）
		int length=getLength();
		int arr[]=new int[length];
		for(int temp=0;temp<length;temp++){
			arr[temp]=(int)(Math.random()*10);
			//System.out.print(arr[temp]+ "  ");
		}
		return  arr;
	}
	//遍历输出数组
	public static void traversal (int[] arr){
		System.out.print("生成的数组是：[ ");
		int length=arr.length;
		for(int temp=0;temp<length;temp++){
			if(temp<length-1){
				System.out.print(arr[temp]+", ");
			}else{
				System.out.print(arr[temp]+" ");
			}
		}
		System.out.println("]");
	}
	//求最大值
	public static void max(int[] arr){
		int max=0;
		int min=arr[0];
		int length=arr.length;
		for(int temp=0;temp<length;temp++){
			if(max<=arr[temp]){
				max=arr[temp];
			}
			if(min>=arr[temp]){
				min=arr[temp];
			}
		}
		System.out.println("最大值是："+max+"，最小值是："+min);
	}
	//求元素和
	public static void sum(int[] arr){
		int sum=0;
		int length=arr.length;
		for(int temp=0;temp<length;temp++){
			sum+=arr[temp];
		}
		System.out.println("元素和是："+sum);
	}
	//输入数组长度
	public static int getLength(){
		System.out.println("请输入数组长度：");
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		return length;
	}
	
}
