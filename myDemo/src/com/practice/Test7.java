package com.practice;

import java.util.Scanner;

/*
 * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 * 
 * 分析：
 * 		A:定义一个长度为5的数组
 * 		B:通过键盘录入数据给数组中的元素赋值
 * 		C:定义方法将arr数组中的内容反转
 * 			什么是反转?如何实现反转
 * 		D:定义方法对反转后的数组进行遍历
 */
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length=0;
		while(length==0){
			length=getLength(sc);
		}
		
		int[] arr=getScore(length,sc);
		reverse(arr,length);
		//System.out.println();
		show(arr,length);
		sc.close();			//释放Scanner对象
	}
	public static int getLength(Scanner sc){
		System.out.println("请输入数组长度：");
		String len = sc.next();
		boolean flag = true;
		int length;
		while(flag){
			if(len.matches("[0-9]{0,9999}")){
				flag = true;
				length =Integer.parseInt(len);
				return length;
			}else{
				System.out.println("错误，请输入一个数字");
				flag = false;
				return 0;
			}
		}
		return 0;
	}
	public static int[] getScore(int length,Scanner sc){
		boolean flag = true;
		int[] arr = new int[length];
		System.out.println("请输入"+length+"个数（0~100）：");
		for(int i=0;i<length;i++){
			do{
				String s = sc.next();
				//是整数且0<=s<=100
				if(s.matches("[0-9]{1,3}") && Integer.parseInt(s)<=100 && Integer.parseInt(s)>=0){
					System.out.println("第"+(i+1)+"个数"+s+"有效，已计入。");
					arr[i]=Integer.parseInt(s);
					flag=true;
				}else{
					System.out.println("输入无效，重新输入");
					flag=false;
				}
			}while(!flag);	//当flag为false时，表示输入错误，继续循环重新输入。
							//当flag为true时，表示输入成功，退出循环输入下一个数
		}
		show(arr,length);
		return arr;
	}
	//reverse反相，将数组中的数按顺序反转
	public static void reverse (int[] arr,int length){
		int temp=0;
		/*for(int i=0;i<(length+1)/2;i++){
			temp=arr[i];
			arr[i]=arr[length-1-i];
			arr[length-1-i]=temp;
			System.out.println("arr["+i+"]="+arr[i]+"  arr["+(length-1-i)+"]="+arr[length-1-i]);
		}*/
		/**
		 * 在反转时，使用start end 两个变量一起变化也是个不错的思路
		 */
		
		for(int start=0,end=length-1;start<=end;start++,end--){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			System.out.println("arr["+start+"]="+arr[start]+"  arr["+end+"]="+arr[end]);
		}
	}
	public static void show(int[] arr,int length){
		System.out.print("[ ");
		for(int i=0;i<length;i++){
			if(i<(length-1)){
				System.out.print(arr[i]+", ");
			}if(i==(length-1)){
				System.out.println(arr[i]+" ]");
			}
		}
	}
/*		//定义一个长度为5的数组
		int[] arr = new int[5];
		
		//通过键盘录入数据给数组中的元素赋值
		Scanner sc = new Scanner(System.in);
		for(int x=0; x<arr.length; x++) {
			System.out.println("请输入"+(x+1)+"个元素值：");
			int number = sc.nextInt();
			arr[x] = number;
		}
		
		//反转前
		printArray(arr);
		
		//定义方法将arr数组中的内容反转
		reverse(arr);
		
		//定义方法对反转后的数组进行遍历
		printArray(arr);*/

	
	//遍历数组
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	
	/*
	 * 两个明确：
	 * 		返回值类型：void
	 * 		参数列表：int[] arr
	 */
	public static void reverse(int[] arr) {
		for(int start=0,end=arr.length-1; start<=end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
}
