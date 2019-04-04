package com.regex正则表达式;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月1日 上午11:20:55
* 	
* 	RegEx-----regular expression------正则表达式：独立的一套判断规则，java只是一种应用环境
*
* 	调用方法和格式：
* 	boolean b = Pattern.matches("a*b", "aaaaab");
* 	判断当前字符串（Pattern）是否符合指定正则表达式(内)，并返回boolean类型结果
* 
* 	常用正则表达规则
* 	A.字符
* 		x 	字符 x  	-->除了一些特殊字符外，字符代表其所表示的本身
*		\\ 	反斜线字符 	-->常用   \ 要用两个斜杠   \\ 表示
*	B.字符类 
*		[abc] 		a、b 或 c（简单类） 					-->是-3各种各任意一个
*		[^abc] 		任何字符，除了 a、b 或 c（否定） 			-->不是-这其中的任意一个
*		[a-zA-Z] 	a 到 z 或 A 到 Z，两头的字母包括在内（范围） 	-->并集
*	C.预定义字符类 
*		. 		任何字符（与行结束符可能匹配也可能不匹配）	-->不要乱用
*		\d 		数字：[0-9] 						-->小写为 是
*		\D 		非数字： [^0-9] 					-->大写为 否
*		\s 		空白字符：[ \t\n\x0B\f\r] 
*		\S 		非空白字符：[^\s] 
*		\w 		单词字符：[a-zA-Z_0-9] 				-->单词字符包括0-9
*		\W 		非单词字符：[^\w] 
*	D.Greedy 数量词 
*		X? 		X，一次或一次也没有 
*		X* 		X，零次或多次 
*		X+ 		X，一次或多次 
*		X{n} 	X，恰好 n 次 
*		X{n,}	X，至少 n 次 
*		X{n,m}	X，至少 n 次，但是不超过 m 次 
*/
public class RegExBasic {
	public static void main(String[] args) {
		/*
		 * 判断qq号
		 * 1.在5~15位之间
		 * 2.不能以0开头
		 * 3.全为数字
		 */
		String qq = "12345";
		Boolean result = qq.matches("[1-9][0-9]{4,14}");
		System.out.println(result);
	}
}
