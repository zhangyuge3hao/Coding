package com.random;

import java.util.Random;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��8�� ����9:38:34
* 	
* 	ʹ��random������
* 		A. ������������δ��������ʱ��ctrl + shift + o��ݼ�������
* 			import java.util.Random;
* 		B. ����random����
* 			Random ra = new Random();
* 		C. ʹ��random����
* 			ra.nextInt();  	()��ʲô����д����Ϊ������ȡ�����
* 			ra.nextInt(10);	()��д���֣���10.����ʾ�������[0,10)�ڵ������
* 								[0,10)����ҿ�����ʾ����ȡ��1��/----��ȡ����10----/
*/
public class RandomBasic {
	public static void main(String[] args) {
		Random ra = new Random();
		int random = ra.nextInt(10);
		System.out.println("[0,10)�ڵ��������"+random);
		/*Ҫ����[1,100]�������*/
		int rd = ra.nextInt(100)+1;
		System.out.println("[1,100]�ڵ��������"+rd);
	}
}
