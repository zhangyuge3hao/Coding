package com.regex正则表达式;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年10月10日 下午1:18:43
* 
* 	使用String自带的replaceAll方法
* 	replace("regex","replacement")
* 	用replacement部分去替换原字符串中满足regex规则的子字符串
* 	replacement部分也可以是正则规则，并可使用"$1"的形式来复用"regex"部分中的组合规则
* 
*/
public class 替换replace {
	public static void main(String[] args) {
		String str = "13866668888";//替换电话中间的几位
		String str1 = "aqkkdsaaaadfd%%der";//替换重复部分、删除重复的字符【要求重复的字符缩减个数后保留】
		replaceAll(str);
		DeRe(str1);
	}
	public static void replaceAll(String str){
		String s = str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		/*
		 * 在一个多参数的方法中，当后一个参数需要复用前一个参数中的正则表达组时，应当用"$"符号和该组的下表来复用这个组
		 * 在replaceAll中，"$1"表示组1"(\\d{3})"，"$2"表示组2"(\\d{4})"
		 */
		System.out.println(s);
	}
	public static void DeRe(String str1){
		System.out.println(str1.replaceAll("(.)\\1+", "-"));//用"-"替换重复部分
		System.out.println(str1.replaceAll("(.)\\1+", "$1"));//删除重复的字符【要求重复的字符缩减个数后保留】
	}
}
