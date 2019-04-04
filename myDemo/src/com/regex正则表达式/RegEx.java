package com.regex正则表达式;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年7月4日 下午2:44:06
* 
* 	【http://www.runoob.com/java/java-regular-expressions.html】
*    https://regexr.com/  练习网站
*    RegE   was created by gskinner.com, and is proudly hosted by Media Templ_e.1215
1.1
yyooooP
Yoo
YOO
yOOOO
yoo-
yo!!
yo~
Yo.
yop
级范德萨发

			[Yy]o{2,4}\B  匹配一个Y(y),2-4个o，且o不与边界相邻
yoo
yooo
yoooo
yoooooooo

*    
* 	正则表达式能干吗：
* 
* 	1.【匹配】测试字符串内的模式。
* 	      【String中提供了底层的封装匹配方法：boolean matches(regex)】
*	例如，可以测试输入字符串，以查看字符串内是否出现电话号码模式或信用卡号码模式。这称为数据验证。
*	
*	2.【替换】替换文本。
*	      【Split】
*	可以使用正则表达式来识别文档中的特定文本，完全删除该文本或者用其他文本替换它。
*
*	3.【切割】
*	      【Split】
*	将一个字符串切割成不同的部分。
*	
*	4.【获取】基于模式匹配从字符串中提取子字符串。
*	      【Matches】
*	可以查找文档内或输入域内特定的文本。
* 
* 	
		正则表达式				描述
	this\s+is\s+text	注意字符串中的 \s+。
						匹配单词 "this" 后面的 \s+ 可以匹配【多个】空格，之后匹配 is 字符串，再之后 \s+ 匹配【多个】空格然后再跟上 text 字符串。
						可以匹配这个实例：this is text
	^\d+(\.\d+)?		^ 定义了以什么开始
						\d+ 匹配一个或多个数字
						? 设置括号内的选项是可选的
						\. 匹配 "."
						可以匹配的实例："5", "1.5" 和 "2.21"。
						
	捕获组
	从左至右计算其开括号来编号。例如，在表达式（（A）（B（C））），有四个这样的组，根据左括号的顺序分组：
		((A)(B(C)))【通过\1引用】	   (A)【通过\2引用】	  (B(C))【通过\3引用】 	(C)【通过\4引用】
		捕获组会占用内存，通过(?: )，来使用()，但不存储组的内容，同时引用失效
		([a-z]{4})\1([0-9]{3})\2  匹配goqwgoqw025025
		([a-z]{4})：匹配goqw并保存为\1,继续匹配goqw，([0-9]{3})匹配025并存储为\2继续匹配025
		
	matcher 对象的 groupCount 方法来查看表达式有多少个分组。groupCount 方法返回一个 int 值，表示matcher对象当前有多个捕获组。
	还有一个特殊的组（group(0)），它总是代表整个表达式。该组不包括在 groupCount 的返回值中。
	
	【在正则表达式中，所有的“\”多事成对出现：“a[2-9]\\d[1-2]”】
	
	.	（点号）也是一个正则表达式，它匹配除换行外的任何一个字符如："a" 或 "1"甚至是空格。【.不匹配换行   匹配所有字符：[\s\S]
		需要明确匹配“.”,用“\.”
	*	【零次或多次】匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
	+	【一次或多次】匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。
	?	【零次或一次】匹配前面的字符或子表达式。例如，"do(es)?"匹配"do"或"does"中的"do"。? 等效于 {0,1}。
	
	[]	里面放的是要匹配字符串对应位置的【内容】
	{}	里面放的是“{”前面匹配内容的出现【次数】，属于修饰【不能单独出现】，{5}表示精确到5次，{5,7}表示5到7次，特例：{5,}表示5次及以上，逗号后面没有数字表示无穷
		{}默认为贪婪模式，即匹配与表达式相符的最多的字符。\d{2,4} 会优先匹配2356 4个数字
		{}？为非贪婪模式，即匹配与表达式相符的最少的字符
	
	x|y		匹配 x 或 y。例如，'z|food' 匹配"z"或"food"。'(z|f)ood' 匹配"zood"或"food"。
	[xyz]	字符集，一个方括号匹配单一字符（可匹配多个），内容表示这个字符的选择范围，或者。例如，"[abc]"表示匹配所有出现的abc，不论是否连续分离，如"plain"中的"a"。
		[\u4e00-\u9fa5] Unicode 匹配所有中文 一-䱷；
		[Aa][Bb]表示匹配两个连续的字符，且第一个字符可任为A或者a，第二个字符可任为B或者b
	[^xyz]	反向字符集。匹配未包含的任何字符。例如，"[^abc]"匹配"plain"中"p"，"l"，"i"，"n"。
	[a-z]	字符范围。匹配指定范围内的任何字符。例如，"[a-z]"匹配"a"到"z"范围内的任何小写字母。
			
			[Yy][oO]+[pP]?[!.]*  匹配：【1个字符，由Yy组成】【至少一个1字符，分别由Oo组成】【1个或0个Pp】【0个或多个其他字符】
	
	\d	digit 数字字符匹配。等效于 [0-9]。
	\D	非数字字符匹配。等效于 [^0-9]。
	
	\s	匹配任何空白字符，包括空格、制表符、换页符等。与 [ \f\n\r\t\v] 等效。
	\S	匹配任何非空白字符。与 [^ \f\n\r\t\v] 等效。
		匹配所有字符：[\s\S]
	
	\w	words 单词字符：[a-zA-Z_0-9]，匹配所有数字、大小写字母以及下划线_。排除符号（用于用户名的格式判断）
	\W	[^\w]
	-------------------------------------------------------
	零宽匹配，匹配的不是字符而是位置
	^{e} 即匹配{}在字符开始的字符   enter
	{l}$ 即匹配{}在字符结束的字符   tall
	\b	boundary 对【紧挨着】\b的字符，匹配一个字边界，即符合要求且紧挨空格。例如，"er\b"匹配"never"中的"er"，但不匹配"verb"中的"er"。
		ls\b，对ls字符中，s在边界处匹配（以s结束,或s后有. 空格  ， 等{\W}符号）；
		\bls，对ls字符中，l在边界处匹配（以l开始，或l前有. 空格  ， 等{\W}符号）
		\b	单词边界：如hello world中的边界为“空格”，hello，world的边界为“，”，用于取出某个单词
	\B	非字边界匹配，即符合要求且远离空格。"er\B"匹配"verb"中的"er"，但不匹配"never"中的"er"。
	零宽断言：即通过【元素类型】和【之前之后的规定元素】，进行匹配
		之后：是(?= )  不是(?!)    [a-z]+(?=ing)   匹配以ing结尾的字符
		之前：是(?<=)  不是(?<!)   (?<！\d+)[a-z]+  匹配之前有没有数字的一个或多个字符
*/
public class RegEx {
	public static void main(String[] args) {
		//匹配一个ip地址：格式：A.B.C.D 其中ABCD不大于255
		//分析：四个数字，被3个点分开，每个数字不大于255
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个ip地址");
		String ip = sc.next();
		String RegEx = "";
		Pattern p = Pattern.compile(RegEx);
		Matcher m = p.matcher(ip);
		sc.close();
	}
}
