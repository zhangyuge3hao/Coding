package com.operator;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��4��21�� ����2:17:44
* 
* 
*/
public class OperatorPlusMethod {
	public static void main(String [] args){
		/* �ַ�����ӷ�����
		 * �����ַ���Ӧ��ASCII��������㡣
		 * a = 97
		 * A = 65
		 * 0 = 48
		 */
		int a = 10;
		int b = 20; 
		char c = 'a';
		char C = 'A';
		System.out.println(a + b);
		System.out.println(a + c);// a = 97
		System.out.println(a + C);// A = 65
		System.out.println(c + C);
		/* �ַ�������ӷ�����
		 * 
		 * �������㣬���Ա��ʽ�������ҵ�˳�����ν��еġ�
		 * �ڴ������ҵ������У�������������������ӷ����㣬
		 * �ڴ������ҵ������У��������г����ַ���ʱ��֮��Ľ���Զ�תΪ�ַ������ͣ�
		 * 	     �����ַ���ƴ�ӵķ�ʽ����֮���Ԫ��ȫ����ƴ�ӡ��ں���
		 */
		System.out.println("hello" + a);// =hello10
		System.out.println("hello" + a + b+c);// =hello1020
		
		/**
		 * ע�⣺ʹ��()���ַ�����������㲿�����������������Ĳ����ڲ�������ʱ���нϸߵ�����Ȩ
		 */
		System.out.println("hello" + (a + b)+40);// ||---=hello3040---||
		
		System.out.println(a + c + "hello");// =30hello
		
		System.out.println("a="+a);// a=10 �����������Ҳ�ǿ� ----�ַ��� ��ƴ�Ӽӷ�---- ��ʵ�ֵ�
	}
}
