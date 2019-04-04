package com.summarize;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月23日 上午10:07:07
* 
* 
*/
public class 不用中间变量的交换两个值 {
	public static void main(String [] args){
		int x = 1;
		int y = 2;
		System.out.println("x:"+x+" y:"+y);
					//(x+y)
		x = x + y;//x = x + y
		
					//(x+y)-y = x
		y = x - y;//y = x - y = x
		
					//(x+y)-(x) = y
		x = x - y;//y = x - y = y
		System.out.println("x:"+x+" y:"+y);
	}
}
