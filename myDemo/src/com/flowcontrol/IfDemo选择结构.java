package com.flowcontrol;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月4日 下午5:07:18
* 	
* 	if语句有3种格式：
* 		A. if(关系表达式){            ---适合做 一 种情况的判断
* 				语句体
* 			}
* 			流程：1， 先计算关系表达式
* 				2， 若关系表达式为true，则执行语句体
* 				3， 若关系表达式为false，则跳过语句体
* 
* 		B. if(关系表达式){            ---适合做 两 种情况的判断
* 				语句体1
* 			}else{
* 				语句体2
* 			}
* 			流程：1， 先计算关系表达式
* 				2， 若关系表达式为true，则执行语句体1
* 				3， 若关系表达式为false，则执行else中语句体2
* 
*  		B. if(关系表达式1){            ---适合做 多 种情况的判断，平时用这种
* 				语句体1
* 			}else if(关系表达式2){
* 				语句体2
* 			}else if(关系表达式){
* 				语句体2
* 			.......
* 			}else{
* 				语句体n+1 ---------这个else很容易忘记，但要记得写
* 			}
* 			流程：1， 先计算关系表达式
* 				2， 若关系表达式为true，则执行语句体1
* 				3， 若关系表达式为false，则执行else中语句体2
* 
*/
import java.util.*;
public class IfDemo选择结构 {
	public static void main(String[] args) {
		//第一种if语句
		System.out.println("---------第一种if语句--开始----------");
		int a = 10;
		int b = 21;
		if(a==b){
			System.out.println("若a==b，则显示");
		}
		if(a!=b){
			System.out.println("若a!=b，则显示");
		}
		System.out.println("---------第一种if语句--结束，第二种开始----------");
		
		//第二种if语句
		if(a%2==0){
			System.out.println("若a%2==0为true，则a为偶数");
		}else{
			System.out.println("若a%2==0为false，则a为奇数");
		}
		System.out.println("---------第二种if语句--结束，第三种开始----------");
		
		//第三种if语句
		/*实现功能
		 * x>=3 y=2x+1
		 * -1<=x<=3 y=2x
		 * x<=-1 y=2x-1
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入X的值：");
		int x = sc.nextInt();
		
		if(x>=3){
			System.out.println("x>=3,y=2x+1,y="+(2*x+1));//使用()将字符串后面的运算部分括起来，括起来的部分仍有较高的优先权
		}else if(-1<=x && x<=3){
			System.out.println("-1<=x<=3,y=2x,y="+2*x);
		}else if(x<=-1){
			System.out.println("x<=-1,y=2x-1,y="+(2*x-1));
		}else{
			System.out.println("x不存在，末尾的else必须要写");
		}
		System.out.println("---------第三种if语句--写法一结束----------");
		
		System.out.println("---------第三种if语句--写法二开始----------");
		
		int  y ;	//y在定义时不给初值
		if(x>=3){
			y=(2*x+1);
			System.out.println("x>=3,y=2x+1,y="+y);
		}else if(-1<=x && x<=3){
			y=2*x;
			System.out.println("-1<=x<=3,y=2x,y="+y);
		}else if(x<=-1){
			y=2*x-1;
			System.out.println("x<=-1,y=2x-1,y="+y);
		}else{
			y = 0;       //这里如果不给y赋值，选择体外会使用y变量时报错
			System.out.println("x不存在，末尾的else必须要写，同时y也要赋值");
		}
		System.out.println("y（选择体外）="+y);  //若果不在最后的else里不写y的取值，这的y会报错：
										//The local variable y may not have been initialized
										//当计算机历遍整个if语句，只要发现有判断体中存在y没有赋值的情况，就会报错：y没有赋初值。
	}
}


