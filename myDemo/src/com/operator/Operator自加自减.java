package com.operator;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��4��21�� ����4:03:34
* 
* 	++/--����ʹ�õ�ʱ���ڱ���ǰ��û��Ӱ��
* 
* 	��++/--�ڱ��ʽ����Ϊһ������ʱ��       ��++/--ͬ��
* 
* 		++�ں������ñ����ڱ��ʽ����������Ȼ�������++
* 		++��ǰ ����������Լ�++�����ڱ��ʽ��������
* 
*/
public class Operator�Լ��Լ� {
	public static void main(String[] args){
		int a = 10;
		int b ;
		int c ;
		b = a++;   //b=10   ++�ں�������a�ڱ��ʽ����������Ȼ�������++
		c = a;     //c=11
		//b = ++a;   //b=11
		System.out.println("b:"+b); 
		System.out.println("c:"+c);	
		
		int A = 10;
		int B ;  
		int C ;
		B = ++A;    //B=11   ++��ǰ ��������a++���ٰ�A�ڱ��ʽ��������
		C = A++;    //C=11
		System.out.println("B:"+B);
		System.out.println("C:"+C);
	}
}
