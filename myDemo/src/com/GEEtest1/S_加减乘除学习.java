package com.GEEtest1;

import java.util.Scanner;
import java.util.Stack;
public class S_�Ӽ��˳�ѧϰ {
	static Stack<Character> oper = new Stack<Character>();
	static Stack<Double> num = new Stack<Double>();

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("������ʽ");
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
			System.out.println("�������");
		}
	}
	public static void getExpression(char[] ex){
		/**
		 * java��Stack��peek�����Ƿ���ջ����Ԫ�ص����Ƴ�������Stack��pop�����ǻ��Ƴ��ġ�
		 * 
		 * 1 ��������ֱ�ӷŵ�num��
		 * 2 �����c1����ջoper��.isEmpty(),ֱ����ջ
		 * 			oper����Ԫ�أ���.peek()��������c1�Ƚϣ�
		 * 				���������ȼ��ߣ�ֱ����ջ
		 * 				peek���c2���ȼ��ߣ�����c2pop��ջ��num�����������ֳ�ջ������ǹ���num��c1��oper
		 * 3 ��ԭ���ʽchar[] ex�Ѿ�ȫ����ջ����oper���գ�operÿ�ε���һ����num�����������㣬ֱ��oper��
		 */
		int len = ex.length;
		for(char n : ex){
			if(isOperator(n)){
				if(oper.isEmpty()){//1+2*3-4/2
					oper.push(n);
				}else{
					if(priority(n,oper.peek()) == 1){//�����ĸ߼�
						oper.push(n);
					}else{//������ƽ�����ߵͼ�,��ջ�ڵ������pop�����㣬�ٰ������ķŽ�ȥ
						double c1 = num.pop();//ջ��Ԫ���Ǽ���
						double c2 = num.pop();//ջ������һ��Ԫ���Ǳ�������Ӧ����c2-c1
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
			double c1 = num.pop();//ջ��Ԫ���Ǽ���
			double c2 = num.pop();//ջ������һ��Ԫ���Ǳ�������Ӧ����c2-c1
			double rs = count(c2,c1,n);
			num.push(rs);
		}
		System.out.println(num.pop());
	}
	public static int priority(char c1,char c2){//c1��c2�߼����ͷ���1
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
