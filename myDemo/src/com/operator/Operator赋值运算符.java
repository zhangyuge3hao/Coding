package com.operator;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��3�� ����9:49:39
* 
* 	��ֵ�������
* 		��ͨ��ֵ������� =
* 		��չ��ֵ������� += , -= , *= , /=, %=
* 
* 		����չ�������߱���A���� int ��ʱ��
* 		A += 10��	
* 		A = ��A���������ͣ�A+10       ��չ����Ὣ���--ǿ��ת��--ΪA����ֵ���㣩������
*/
public class Operator��ֵ����� {
	public static void main(String[] args){
		int a = 10;
		a += 20;  //a=30
		//a =- 20;  //��ͬ�ڣ� a = -20�ĸ�ֵ���������� - ��������ͷ�� 
		//a =+ 20;  //��ͬ�ڣ� a = +20�ĸ�ֵ���������� + ��������ͷ��
		System.out.println("a="+a);
		a -= 40;  //a=-10
		System.out.println("a="+a);
		a *= 2;   //a=-20
		System.out.println("a="+a);
		a /= 5;   //a=-4
		System.out.println("a="+a);
		a %= 3;   //a=-1
		System.out.println("a="+a);
		
		//ע�⣡������������������������
		short b = 1;  
		b += 2;//��ʱ�� short = short + int; 
		//Ϊ��֤ b ���������Ͳ��䣬�˴���Ĭ��ǿ��ת����  b = (short)(b+2);
		
		System.out.println("(short)b="+b);
	}
}
