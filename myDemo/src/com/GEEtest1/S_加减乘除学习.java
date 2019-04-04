package com.GEEtest1;

import java.util.Scanner;
import java.util.Stack;
public class S_加减乘除学习 {
	static Stack<Character> oper = new Stack<Character>();
	static Stack<Double> num = new Stack<Double>();

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("输入表达式");
		String str = sc.next();
		if(str.matches("(\\d+[+\\-\\*/])+\\d+")){
			System.out.println(str);
			char[] ex = str.toCharArray();
			getExpression(ex);
			System.out.println(priority('+','*'));
			System.out.println(priority('+','-'));
			System.out.println(priority('/','*'));
			System.out.println(priority('/','-'));
			System.out.println(isOperator('+'));
			System.out.println(isOperator('1'));
			System.out.println(count(1,3,'+'));
			System.out.println(count(1,3,'-'));
			System.out.println(count(1,3,'*'));
			System.out.println(count(1,3,'/'));
		}else{
			System.out.println("输入错误");
		}
	}
	public static void getExpression(char[] ex){
		/**
		 * java里Stack的peek方法是返回栈顶的元素但不移除它。但Stack的pop方法是会移除的。
		 * 
		 * 1 遇到数字直接放到num里
		 * 2 运算符c1，若栈oper里.isEmpty(),直接入栈
		 * 			oper里有元素，先.peek()出来，和c1比较，
		 * 				新来的优先级高，直接入栈
		 * 				peek里的c2优先级高，先用c2pop出栈，num的上两个数字出栈，计算记过如num，c1入oper
		 * 3 当原表达式char[] ex已经全部入栈，且oper不空，oper每次弹出一个和num的上两个运算，直到oper空
		 */
		int len = ex.length;
		for(char n : ex){
			if(isOperator(n)){
				if(oper.isEmpty()){//1+2*3-4/2
					oper.push(n);
				}else{
					if(priority(n,oper.peek()) == 1){//新来的高级
						oper.push(n);
					}else{//新来的平级或者低级,将栈内的运算符pop并计算，再把新来的放进去
						double c1 = num.pop();//栈顶元素是减数
						double c2 = num.pop();//栈顶的下一个元素是被减数，应当是c2-c1
						double rs = count(c2,c1,oper.pop());
						num.push(rs);
						oper.push(n);
					}
				}
			}else{
				num.push((double)(n-'0'));
			}
		}
		while(!oper.isEmpty()){
			char n = oper.pop();
			double c1 = num.pop();//栈顶元素是减数
			double c2 = num.pop();//栈顶的下一个元素是被减数，应当是c2-c1
			double rs = count(c2,c1,n);
			num.push(rs);
		}
		System.out.println(num.pop());
	}
	public static int priority(char c1,char c2){//c1币c2高级，就返回1
		switch(c1){
		case  '+':
		case  '-':
			return (c2=='*'||c2=='/')?-1:0;
		case  '*':
		case  '/':
			return (c2=='+'||c2=='-')?1:0;
		}
		return 1;
	}
	public static boolean isOperator(char c){
		if(c=='+'||c=='-'||c=='*'||c=='/'){
			return true;
		}else{
			return false;
		}
	}
	public static double count(double x,double y,char c){
		double res = 0;
		switch(c){
		case  '+':
			res = x + y; 
			break;
		case  '-':
			res = x - y; 
			break;
		case  '*':
			res = x * y; 
			break;
		case  '/':
			res = x / y; 
			break;
		}
		return res;
	}
}
