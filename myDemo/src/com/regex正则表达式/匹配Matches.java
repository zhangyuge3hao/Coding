package com.regex������ʽ;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��10��9�� ����11:06:48
* 
*  1.��ƥ�䡿�����ַ����ڵ�ģʽ��
*	   ��String���ṩ�˵ײ�ķ�װƥ�䷽����boolean matches(regex)��
*	���磬���Բ��������ַ������Բ鿴�ַ������Ƿ���ֵ绰����ģʽ�����ÿ�����ģʽ�����Ϊ������֤��
* 
*/
public class ƥ��Matches {
	/*
	 * �ж�һ���ַ�����
	 * 1.������5-8λ֮�䣬ֻ�������ֺ���ĸ�� 2.��һλֻ�������ֵ�����Ϊ0�� 
	 * 3.2-4λ������3-7֮������֣� 4.���һλ�����Ǵ�д��ĸ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int temp = 1;
		while(temp==1){
			System.out.println("please input a character string");
			String str = sc.next();
			matches(str);
		}
	}
	public static void matches(String str){
		String regex = "[1-9][3-7]{3}(\\w){0,3}[A-Z]";
		//String regex = "[1-9][3-7]{3}(\\w)*[A-Z]";//*��ʾ0�λ��Σ���Υ���˵�һ��Ҫ��
		
		if(str.matches(regex)){
			System.out.println("ƥ����ȷ");
		}else{
			System.out.println("ƥ�����");
		}
		//�����ʣ�������������ʽ�Ĳ�ͬ������Ϣ����
	}
}
