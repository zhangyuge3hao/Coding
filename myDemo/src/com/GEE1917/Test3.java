package com.GEE1917;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��21�� ����11:44:45
* 
* ��ĳ���ַ��������Ȳ�����100)���������š������źʹ�Сд��ĸ�������볣��������ʽ��һ�����κ�һ�������Ŷ����ڵ����������ұ��Ҿ��������������ƥ�䡣
* дһ�������ҵ��޷�ƥ��������ź������ţ����ԭ�����ַ�����������һ�б������ƥ�����ţ�����ƥ����������á�$"��ע������ƥ���������á�������ע��
* ��40��د
�����ʽ����������������ݣ�ÿ������һ�У�����һ���ַ�����ֻ�����������Ŵ�Сд��ĸ���ַ������Ȳ���100��
ע�⣺cin.get1ine(str,100)���ֻ������99���ַ���
�����ʽ����ÿ��������ݣ�������У���һ�а���ԭʼ�����ַ����ڶ����ɡ�$���͡������Ϳո���ɣ��±ꡰ$���͡�������ʾ��֮��Ӧ�������ź������Ų���ƥ�䡤
�����룺
)(rttyy())sss)(
�������
)(rttyy())sss)(
?            ?$

*/
public class Test3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("input a formula,split it with space");
		String s = sc.nextLine();
		if(s.matches("[a-zA-Z\\(\\)]+")&&s.length()<=100){
			System.out.println("OK");//)(a())a(
			char[] arr = s.toCharArray();
			
			checkFormat(arr);//ΪerrIndleft��errIndRight�������
			for(char a : arr){
				System.out.print(a);
			}System.out.println();
			
			printOut(arr);//����errIndleft��errIndRight������
		}else{
			System.out.println("Input illeglal");
		}
	}
	static Stack<String> oper = new Stack<String>();
	static Stack<Character> cha = new Stack<Character>();
	static ArrayList<Integer> errIndRight = new ArrayList<Integer>();
	static ArrayList<Integer> errIndleft = new ArrayList<Integer>();
	public static void checkFormat(char[] arr){//ΪerrIndleft��errIndRight�������
		/**
		 * ��������Сѧ��ĸ��ȫ����ջcha������(��)�жϺ���ջoper
		 * ����(�������index,��"(+2"��ֱ����ջ
		 * ����)��isEmpty����operΪ�գ����󡣼�¼errIndRight
		 * 				���գ�peek��ֺ���(,����(���������)����ʾ�ɹ����
		 * �����oper��ʣ���(��Ϊ���󣬼�¼errIndleft
		 * 
		 */
		int len = arr.length;
		String push = "";
		
		for(int i = 0;i<len;i++){
			if(arr[i] == '('){//����(�������index,��"(+2"��ֱ����ջ
				push = "(+"+i;
				oper.add(push);
			}else if(arr[i] == ')'){
				if(!oper.isEmpty()){//���գ�peek��ֺ���(,����(���������)����ʾ�ɹ����
					String get = oper.peek();
					String[] p = get.split("\\+");
					if(p[0].equals("(")){
						oper.pop();
					}else{
						System.out.println("ջ���������");
					}
				}else{//isEmpty����operΪ�գ����󡣼�¼errIndRight
					errIndRight.add(i);
					System.out.println((i+1)+"����Ԫ��)ǰ���Ѿ�û��(,����,����errIndRight");
				}
			}else{
				cha.add(arr[i]);
			}
		}
		while(!oper.isEmpty()){
			String[] p = oper.peek().split("\\+");
			if(p[0].equals("(")){
				oper.pop();
				errIndleft.add(Integer.parseInt(p[1]));
			}else{
				System.out.println("ջ���������");
			}
		}
	}public static void printOut(char[] arr){//����errIndleft��errIndRight������ )(a())a(
		int len = arr.length;
		char[] out = new char[len];//�½�һ����arr�ȳ���out���飬����Ԫ�س�ʼ��Ϊ.
		for(int i = 0;i<len;i++){
			out[i] = '.';
		}
		System.out.println("�����(���±��У�");
		for(int i :errIndleft){
			System.out.print(i+" ");
			out[i] = '$'; //��errIndleft��¼��(������±��滻Ϊ$
		}
		System.out.println();
		System.out.println("�����)���±��У�");
		for(int i :errIndRight){
			System.out.print(i+" ");
			out[i] = '?'; //��errIndRight��¼��)������±��滻Ϊ?
		}
		System.out.println();
		for(char a : out){
			System.out.print(a);
		}
	}

}
