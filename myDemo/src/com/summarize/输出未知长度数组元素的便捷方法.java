package com.summarize;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年10月9日 下午4:13:19
* 
* 
*/
public class 输出未知长度数组元素的便捷方法 {
	public static void main(String[] args) {
		String[] str = {"a","b","c","d"};
		regular(str);
		convenient(str);
	}
	//输出未知长度数组元素的【一般】方法：
	public static void regular(String[] str){
		int i=0;
		for(i=0;i<str.length;i++){
			System.out.println("--"+str[i]+"--");
		}
		System.out.println("-----------------");
	}
	//输出未知长度数组元素的【便捷】方法：
	public static void convenient(String[] str){
		for(String st : str){//是J2SE 1.5提供的另一种形式的for循环,可以用来处理不知道str长度的情况
			System.out.println("--"+st+"--");
		}
	}
}
