package com.regex正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年7月5日 上午9:23:42
* 
* 	Pattern 类：【Pattern 模式】
		pattern 对象是一个【正则表达式的编译】表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。
		Pattern p = Pattern.compile(s);
							compile 汇编，编辑；	s 是正则表达式		pattern 模式
		【Pattern，即将正则表达式编译成一种模式】 每个正则表达式都用compile预编译，加快之后运行的速度
		 Pattern p = Pattern.compile(regEx);
			
	Matcher 类：
		Matcher 对象是对【输入字符串】进行【解释和匹配】操作的引擎。
		与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象m,。
		通过解释 Pattern 对 character sequence{字符串序列-接口，String实现了这个接口，传入实现的对象是可以的，<--【多态】} 执行匹配操作的引擎。 

		【Matcher，用Pattern提供的模式去匹配字符】
		 Matcher m = p.matcher(s);
		 
		 匹配正则表达式的两种写法，及其区别
		 /----------------------------------/
	一.	 Pattern p = Pattern.compile(regEx);
		 Matcher m = p.matcher(s);
		 m.matches();	//返回一个Boolean类型变量
		   可理解为，Pattern p代表着对应正则表达式regEx已编译好的一种模式，用这种模式去匹配字符串s，然后把结果返回在Matcher对象m中
		
	二.	 Boolean b = "a88a".matches("[a-z]");	//返回一个Boolean类型变量
		 /----------------------------------/
	 相同：方法一二实现的功能同为用途正则表达式去匹配字符串并返回Boolean值
	 
	不同：1.方法一提前编译了正则表达式，比方法二运行时编译的做法效率高
		2.方法一Pattern和Matcher包含了很多其他方法，这是matches不具备的
		 
		通过调用模式的 matcher 方法从模式创建匹配器。创建匹配器后，可以使用它执行三种不同的匹配操作： 
		A.matches 方法尝试将整个输入序列与该模式匹配。 
		B.lookingAt 尝试将输入序列从头开始与该模式匹配。 
		C.find 方法扫描输入序列以查找与该模式匹配的下一个子序列。 

			
	PatternSyntaxException：
		PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
	1	public String getDescription()		获取错误的描述。
	2	public int getIndex() 				获取错误的索引。
	3	public String getPattern() 			获取错误的正则表达式模式。
	4	public String getMessage() 			返回多行字符串，包含语法错误及其索引的描述、错误的正则表达式模式和模式中错误索引的可视化指示。
*/
public class RegExPatternMatcher {
	
	public static void main(String[] args) {
		catCheck("cat cat cfat ccatt cat");
		numMatch("c s112e s2 w2");
		basic();
	}
	public static void basic(){
		p("abc".matches("..."));
		p("a8729a".replaceAll("\\d", "-"));  //将所有数字位替换为-
		p("abc".matches("[a-z]{3}"));
	}
	public static void p(Object o){  //p为Object
		System.out.println(o);
	}
	
	/*
	 * 匹配一串字符中所有的“cat”子串	
	 * 方法：	start: 给出所捕获的子串的初始索引
	 * 		end：方法最后一个匹配字符的索引加【 1】
	 */
	public static void catCheck(String s){
		//定义/编写正则表达式
		String regEx = "\\bcat\\b";
		//使用Pattern编译正则表达式
		Pattern p = Pattern.compile(regEx);
		//对【字符串】用正则表达式编译结果【进行匹配】
		Matcher m = p.matcher(s);
		
		int count = 0;
		System.out.println("字符总长度："+String.valueOf(s).length());
		
		while(m.find()){	//m.find() 该方法查找全部输入内容中，符合条件的下一个子序列
			count++;
			System.out.println("匹配次数："+count);
			System.out.println("	开始索引："+m.start());
			System.out.println("	结束索引："+m.end());
		}
	}
	
	/*
	 * 从一个给定的字符串中找到数字串
	 * 方法：捕获组	group
	 * 		可以通过调用 matcher 对象的 groupCount 方法来查看表达式有多少个分组。groupCount 方法返回一个 int 值，表示matcher对象当前有多个捕获组。
	 * 		还有一个特殊的组（group(0)），它总是代表整个表达式。该组不包括在 groupCount 的返回值中。
	 */
	public static void numMatch(String s){
		/*
		 * 首先用(\\d+)表示一个或多个数字
		 * 为了包含在数字前有其他字符的情况，在前面写(\\D*)表示0个或多个非数字
		 * 为了找到字符后继续向下判断，在右面写(.*)表示0个或多个字符（不确定数字还是非数字）
		 */
		String regex = "(\\D*)(\\d+).*";//共3个捕获组
		//String regex = "(\\^*\\D)";//共3个捕获组
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		int count = 0;
		int len = String.valueOf(s).length();
		System.out.println("字符总长度："+len);
		boolean flag = true;
		System.out.println("共有捕获组："+m.groupCount()+" 个");
		m.find();
		for(int num=0;num<=m.groupCount();num++){
			
			System.out.println("m.group("+count+")："+m.group(count));
			count++;
			flag = false;
		}
/*		while(m.find()){
			System.out.println("m.group("+count+")："+m.group(count));
			count++;
			flag = false;
		}*/
		if(flag){
			System.out.println("没有找到数字");
		}
	}
}
