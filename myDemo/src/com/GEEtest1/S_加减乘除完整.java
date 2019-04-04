package com.GEEtest1;
import java.util.Scanner;
import java.util.Stack;
public class S_�Ӽ��˳�����{
	static Stack<Character> oper = new Stack<Character>();
	static Stack<Double> num = new Stack<Double>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ʽ");
		String s = sc.next();
		if(s.matches("(\\d+[+\\-\\*/])+\\d+")){
			char[] c = s.toCharArray();
			getResult(c);
		}else{
			System.out.println("�������");
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
	 * java��Stack��peek�����Ƿ���ջ����Ԫ�ص����Ƴ�������Stack��pop�����ǻ��Ƴ��ġ�
	 * 
	 * 1 ��������ֱ�ӷŵ�num��
	 * 2 �����c1����ջoper��.isEmpty(),ֱ����ջ
	 * 			oper����Ԫ�أ���.peek()��������c1�Ƚϣ�
	 * 				���������ȼ��ߣ�ֱ����ջ
	 * 				peek���c2���ȼ��ߣ�����c2pop��ջ��num�����������ֳ�ջ������ǹ���num��
	 * 				
	 * 				c1�ٴ��жϲ�����oper
	 * 				����operջ�����n�߼���ȥ�󣬵ڶ���Ԫ�س�Ϊջ�������Ԫ��Ҳ���ܱ�n�߼�����ƽ������Ҫ�ٱ�һ��
					�������ֻ�ᷢ��һ�Σ���Ϊֻ���������Ȳ㼶,�����ж�ջ�Ƿ�Ϊ��
	 * 
	 * 3 ��ԭ���ʽchar[] ex�Ѿ�ȫ����ջ����oper���գ�operÿ�ε���һ����num�����������㣬ֱ��oper��
	 */
	public static void getResult(char[] chr){//1-2*3-4/2
		for(char n : chr){
			if(isOperator(n)){
				if(oper.isEmpty()){
					oper.push(n);
				}else{
					if(priority(n,oper.peek()) == 1){//ֻ�������ĸ߼��ŷŽ�ȥ
						oper.push(n);
					}else{//ƽ���͵ͼ������㣬ע���ֳ������Ǽ����ں��棬�ڶ��������Ĳ��Ǳ�����,
						double c1 = num.pop();
						double c2 = num.pop();
						double res = count(c2,c1,oper.pop());
						num.push(res);
						//����operջ�����n�߼���ȥ�󣬵ڶ���Ԫ�س�Ϊջ�������Ԫ��Ҳ���ܱ�n�߼�����ƽ������Ҫ�ٱ�һ��
						//�������ֻ�ᷢ��һ�Σ���Ϊֻ���������Ȳ㼶,�����ж�ջ�Ƿ�Ϊ��
						if(oper.isEmpty()){
							oper.push(n);
						}else{
							if(priority(n,oper.peek()) == 1){//ֻ�������ĸ߼��ŷŽ�ȥ
								oper.push(n);
							}else{//ƽ���͵ͼ������㣬ע���ֳ������Ǽ����ں��棬�ڶ��������Ĳ��Ǳ�����,
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
	public static int priority(char c1,char c2){//c1����c2 ��true
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