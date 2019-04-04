package com.GEEtest1;
import java.util.Scanner;
import java.util.Stack;
public class S_加减乘除完整{
	static Stack<Character> oper = new Stack<Character>();
	static Stack<Double> num = new Stack<Double>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入表达式");
		String s = sc.next();
		if(s.matches("(\\d+[+\\-\\*/])+\\d+")){
			char[] c = s.toCharArray();
			getResult(c);
		}else{
			System.out.println("输入错误");
		}
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
	}
	/**
	 * java里Stack的peek方法是返回栈顶的元素但不移除它。但Stack的pop方法是会移除的。
	 * 
	 * 1 遇到数字直接放到num里
	 * 2 运算符c1，若栈oper里.isEmpty(),直接入栈
	 * 			oper里有元素，先.peek()出来，和c1比较，
	 * 				新来的优先级高，直接入栈
	 * 				peek里的c2优先级高，先用c2pop出栈，num的上两个数字出栈，计算记过如num，
	 * 				
	 * 				c1再次判断才能入oper
	 * 				由于oper栈顶因比n高级出去后，第二个元素称为栈顶，这个元素也可能比n高级或者平级，需要再比一次
					这种情况只会发生一次，因为只有两个优先层级,重新判断栈是否为空
	 * 
	 * 3 当原表达式char[] ex已经全部入栈，且oper不空，oper每次弹出一个和num的上两个运算，直到oper空
	 */
	public static void getResult(char[] chr){//1-2*3-4/2
		for(char n : chr){
			if(isOperator(n)){
				if(oper.isEmpty()){
					oper.push(n);
				}else{
					if(priority(n,oper.peek()) == 1){//只有先来的高级才放进去
						oper.push(n);
					}else{//平级和低级都计算，注意现出来的是减数在后面，第二个出来的才是被减数,
						double c1 = num.pop();
						double c2 = num.pop();
						double res = count(c2,c1,oper.pop());
						num.push(res);
						//由于oper栈顶因比n高级出去后，第二个元素称为栈顶，这个元素也可能比n高级或者平级，需要再比一次
						//这种情况只会发生一次，因为只有两个优先层级,重新判断栈是否为空
						if(oper.isEmpty()){
							oper.push(n);
						}else{
							if(priority(n,oper.peek()) == 1){//只有先来的高级才放进去
								oper.push(n);
							}else{//平级和低级都计算，注意现出来的是减数在后面，第二个出来的才是被减数,
								double c11 = num.pop();
								double c22 = num.pop();
								double res1 = count(c22,c11,oper.pop());
								num.push(res1);
								
								oper.push(n);
							}
						}
						
					}
				}
			}else{
				num.push((double)(n-'0'));
			}
		}
		while(!oper.isEmpty()){
			double c1 = num.pop();
			double c2 = num.pop();
			double res = count(c2,c1,oper.pop());
			num.push(res);
		}
		System.out.println(num.pop());
	}
	public static boolean isOperator(char n){
		if(n == '+'||n == '-'||n == '*'||n == '/'){
			return true;
		}else{
			return false;
		}
	}
	public static double count(double x,double y,char n){
		double res = 0;
		switch(n){
		case '+':
			res = x + y;
			break;
		case '-':
			res = x - y;
			break;
		case '*':
			res = x * y;
			break;
		case '/':
			res = x / y;
			break;
		}
		return res;
	}
	public static int priority(char c1,char c2){//c1高于c2 会true
		switch(c1){
		case '+':
		case '-':
			return (c2=='*'||c2=='/')?-1:0;
		case '*':
		case '/':
			return (c2=='+'||c2=='-')?1:0;
		}
		return 1;
	}

}