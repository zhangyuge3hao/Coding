package com.operator;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��4�� ����9:41:52
* 	
* 	��Ԫ�������
* 		��ϵ���ʽ ? ���ʽ1 : ���ʽ2
* 			����ϵ���ʽΪtrue������б��ʽ1�����㣬�����ؽ��
* 			����ϵ���ʽΪfalse������б��ʽ2�����㣬�����ؽ��
*/
public class Operator��Ԫ����� {
	public static void main(String[] args) {
		int a = 25;
		int b = 20;
		int d = 30;
		int c ;
		//�Ƚ�2���������ֵ
		//c = (a>b)?++a:++b;
		c = (a>b)?a:b;
		System.out.println("a��b�е����ֵ��"+c);
		
		boolean e = (a>b)?true:false;
		System.out.println("e="+e);
		
		//�Ƚ�3���������ֵ
		int temp = (a>b)?a:b;
		int max =(temp>d)?temp:d;
		System.out.println("a��b��c�е����ֵ��"+max);
	}
}
