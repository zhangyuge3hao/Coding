package com.regex正则表达式;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年10月9日 上午11:02:47
* 
* 将字符串以某个符号进行拆分，把结果存入数组
* "zhangsan   lisi     wangwu" 不同数量的空格
* "woshi.zhagnyuge.com" 特定字符
* "汉，字，测，试" 汉字
* "12,34.56 78" 多个分隔符
* "akkkkdsaaaadfd%%der" 对重复的字符进行切割【正则表达式的封装、复用和组的使用】
* 
* 	"组"的使用:
* 	有()即为组，第一个()记为1组，若无括号，则表示整个正则表达式为第0组.
* 	有几个左括号就有几个组，每个组所属"("在表达式中从左至右次序，表示这个组的编号
* 	例：((A)(B(C)))
* 	共有4个"("，即有4组
* 	按照"("出现的顺序，可知第1,2,3,4组分别为：((A)(B(C)))，\A， (B(C))，(C)
*/
public class 切割拆分Split与组的使用 {
	public static void main(String[] args) {

		String str = "zhang  yu    ge";
		split(str);
		String str1 = "zhang.yu.ge";
		split1(str1);
		String str2 = "章，鱼，哥";
		split2(str2);
		String str3 = "zhang yu,ge-1";
		split3(str3);
		String str4 = "aqkkdsaaaadfd%%der";
		split4(str4);
	}
	public static void split(String str){
		String regex = " +";	//一个或多个相同符号的切割
		String strs[] = str.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
	public static void split1(String str1){
		String regex = "\\.";	//"."在正则中表示通配符，需要"\\"进行转义，需要双斜杠
		String strs[] = str1.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
	public static void split2(String str2){
		String regex = "，";		//"，"汉字和中文逗号也可分割
		String strs[] = str2.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
	public static void split3(String str3){
		String regex = " |,|-";	//使用"|"表示或者，可以分割多个不同的" ,-"
		String strs[] = str3.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
	public static void split4(String str4){
		/*
		 * 为了实现规则的复用，就需要用()对规则进行封装，即【先封装再调用】
		 * 被封装的规则叫做组，每个组都有自己的编号，在使用中租的编号从1开始计算，可以用编号对组进行调用
		 * 需要注意编号必须在组的后面
		 */
		String regex = "(.)\\1+";	
		/* 用 相同字符 进行切割，由于需要切割的字符本身不确定和字符个数不确定：
		 * 用"."通配符点来匹配不同的切割字符，用()对"."进行封装拉实现复用，以应对切割字符的不同出现次数
		 * "1"表示和调用第一个组(.)，但是只写"1"会只识别数字1，故加上"\\"进行转义
		 * 实现(.)的复用后，用+来最后实现复用次数的不确定性
		 */
		String strs[] = str4.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
}
