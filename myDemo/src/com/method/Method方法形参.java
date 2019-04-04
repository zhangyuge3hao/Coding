package com.method;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月27日 下午2:14:04

*/
public class Method方法形参 {
	public static void main(String[] args)  {
		/**
		 *当形参为普通数据类型时（普通数据类型：byte、short、int、long、float、double、char、boolean）
		 *							 1	   2	4	 8	   4	  8	    2	   1
		 *	形参值的改变【不影响】实参
		 *	
		 */
		int a = 10;
		int b = 20;
		change(a,b);
		/**
		 * 当形参为引用数据类型时（引用数据类型：类、街口、数组）
		 * 
		 * 	形参值的改变【影响】实参
		 */
		int[] arr = {1,2,3,4};
		int length = arr.length;
		for(a=0;a<length;a++){
			System.out.print(arr[a]+"  ");
		}
		multiplicative(arr);
		System.out.println();
		for(a=0;a<length;a++){
			System.out.print(arr[a]+"  ");
		}
		
	}
	public static void change(int x,int y){
		x=y;
		y+=x;
		System.out.println("输出y的值："+y);
	}
	
	public static void multiplicative(int[] arr){
		int length = arr.length;
		int a;
		for(a=0;a<length;a++){
			if(arr[a]%2==0){
				arr[a]*=2;
			}
		}
	}
}
