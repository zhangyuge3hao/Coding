package com.flowcontrol;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月4日 下午5:00:06
* 
* 	流程控制：FlowControl
* 		顺序结构：    Order    从上往下，依次执行
* 		选择结构：    If
* 				Switch
* 		循环结构：	for
* 				while
* 				do while
* 			其中，只有 do while 是一定会进入循环体的，而 for 和 while 因为判断语句在循环前面，有可能更导致跳过循环
* 
* 			三种循环的推荐使用顺序：  for > while > do while 
*/
public class OrderDemo顺序结构 {
	public static void main(String[] args) {
		System.out.println("开始");
		System.out.println("语句A");
		System.out.println("语句B");
		System.out.println("语句C");
		System.out.println("结束");
	}
}
