package com.operator;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��4��21�� ����11:26:06
* 	
* 	�����(operator)�����ڶԳ����ͱ������в����ķ���
* 	
* 	���ʽ����������������ķ���java�﷨��ʽ��
* 
* 		��������ࣨ��5�֣���
* 			���������
* 			��ֵ�����
* 			��ϵ�����
* 			�߼������
* 			��Ԫ�����
* 
* 		����������� + , - , * , / , % , ++ , --
*  
*/
public class OperatorBasic {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);// =0
		//��������������������һ��������,�� int ����������������С�����Զ�����ȡ����
		
		//Ҫ�õ�С��������ͱ����и�������������(������λ��û�й�ϵ)��
		System.out.println(3.0 / 4);// =0.75
		System.out.println(3 / 4.0);// =0.75
		float aa = 3.0f;
		float bb = 4.00f;
		System.out.println(aa * b);// =12.0
		System.out.println(a / bb);// =0.75
	}
}
