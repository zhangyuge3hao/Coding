package com.operator;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��3�� ����10:23:20
* 	
* 	��ϵ�������
* 		> , >= , == , <= , < , !=
* 		���ԱȽϽ��ֻ�����������true / false
* 		���Խ����boolean����
* 	
* 	��Ҫ�� ��==�� �� ��=�� ���
*/
public class Operator��ϵ����� {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		boolean d = (a == b);   //�����boolean����,����������Ϊ�������Ԫ���ʽ
								// d=(a==b) <======>  d=(a==b)?a:b
		//==
		System.out.println(d);   //false
		System.out.println(a == c);   //true
		System.out.println("------------");
		
		//ע�⣡��������������������������������������������
		System.out.println(a == b);   //false
		System.out.println(a = b);    //20   ��ʾ���� b ��ֵ�� a ��Ȼ����� a 
		System.out.println("------------");
		
		//!=
		System.out.println(a != b);   //true
		System.out.println(a != c);   //false
		System.out.println("------------");
		//>
		System.out.println(a > b);   //false
		System.out.println(a > c);   //false
		System.out.println("------------");
		//>=
		System.out.println(a >= b);   //false
		System.out.println(a >= c);   //true
		System.out.println("------------");
		//<=
		System.out.println(a <= b);   //true
		System.out.println(a <= c);   //true
		System.out.println("------------");
		//<
		System.out.println(a < b);   //true
		System.out.println(a < c);   //false
		System.out.println("------------");
	}
}
