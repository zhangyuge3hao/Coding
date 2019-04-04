package com.flowcontrol;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月5日 上午9:29:22
* 
* 	选择语句switch的结构：
* 
* 		switch(表达式){
* 			case 值1:
* 				语句体1;
* 				break;
* 			case 值2:
* 				语句体2;
* 				break;
* 			  ......
* 	 		default:
* 				语句体n+1;
* 				break; 
* 		}
* 		
* 		switch结构执行顺序：
* 			A. 先计算switch旁的 表达式
* 			B. 用case旁的 值去匹配表达式结果，匹配中就执行该case下的  语句体
* 			C. 若无匹配项，则执行default下的  语句体（default旁没有值，类似if-elseif结构中左后的else）
* 
* 		说明：
* 			switch 旁边的 表达式：只能是 byte、short、int、char 类型，不能是boolean类型的判断语句
* 							在JDK5以后，可以是 （枚举）
* 							在JDK7以后，可以是 （字符串）
* 			case 旁的值，是和  表达式  匹配的内容
* 			break：当执行到case或default下的break时，退出switch选择结构体
* 			default: 当所有case都无法匹配的时候，执行
* 
* 		case的穿透：当case下没有break（退出循环）时，
*				    将会继续执行下面的case结果（而不进行判断），直到遇到break退出
*/
public class SwitchDemo选择结构 {
	public static void main(String[] args) {
		System.out.println("请输入数字");
		//键盘录入的值1,2,3...7，输出对应星期一..星期天
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch(day){    //表达式只能用： byte、short、int、char，
						//    不能用： boolean、long、float、double
			case 1:     //case 后面直接跟内容，不必赋值
				System.out.println("Mon");
				break;
			case 2:
				System.out.println("Tus");
				break;
			case 3:
				System.out.println("Wen");
				break;
			case 4:
				System.out.println("Thu");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("Sat");
				break;
			case 7:			//将所有判断条件都用case写完
				System.out.println("Sun");
				break;
			default:		//default用于提供错误异常
				System.out.println("输入有误");
				break;
		}
		System.out.println();
		
		/*
		 * case的穿透：当case下没有break（退出循环）时，
		 * 将会继续执行下面的case结果（而不进行判断），直到遇到break退出
		 */
		System.out.println("case的穿透");
		switch(1){
		case 1:				//由于case判断的穿透这一属性，可简洁的让多个case对应一个结果
		case 2:
		case 3:
			System.out.println("a");
		case 4:
		case 5:
		case 6:
			System.out.println("b");
			break;
		default:
			System.out.println("default");
			break;
		}
		//将直接输出全部a b c d
	}
}
