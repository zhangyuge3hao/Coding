package com.diedai;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月22日 下午4:11:03
* 	
* 	迭代，自己调用自己，需注意条件控制，否则会进入死循环从而main函数堆栈溢出报错。所以必须有一个边界条件，当条件满足时不再自我调用。
* 	
* 		 |f(x-1)+2 ，	x>1
* 	f(x)=|					求f(3):
* 		 |3，		x=1
*/
public class test1 {
	public static void main(String [] args){
		int n = f(3);
		System.out.println(n);
	}
	public static int f(int x){
		if(x==1){
			return 3;
		}
		if(x>1){
			return f(x-1)+2;
		}
		return -1;
	}
}
