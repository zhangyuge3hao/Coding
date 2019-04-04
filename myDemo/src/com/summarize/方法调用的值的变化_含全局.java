package com.summarize;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月22日 上午10:38:36
* 
* 
*/
public class 方法调用的值的变化_含全局 {
	//同一个数组，在方法中传递，会直接改变数组中的值，而int 之类的参数是不会改变的
	static int num = 0;
	public static void main(String [] args){
		int a = 10;
		int []b ={10};
		method(a);
		method1(a);
		methodArray(b);
		methodArray2(b);
	}
	public static void method(int a){
		num++;
		a++;
		System.out.println("a"+a+"--num"+num);//a=11
	}
	public static void method1(int a){
		num++;
		System.out.println("a"+a+"--num"+num);//a=10  int 等参数的传递不收其他方法的影响
	}
	public static void methodArray(int []b){
		b[0]=11;
		System.out.println(b[0]+" "+b);//b[0]=11
	}
	public static void methodArray2(int []b){
		System.out.println(b[0]+" "+b);//b[0]=11  数组是存储在内存中单独的一块区域，被之前的方法改变了数组内容，内容就真的被改变了  ,b显示的地址，标志是同一个数组
	}
}
