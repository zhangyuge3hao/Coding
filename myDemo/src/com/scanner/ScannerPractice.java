package com.scanner;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��4�� ����4:05:31
* 
* 
*/
import java.util.*;
public class ScannerPractice {
	public static void main(String[] args) {
		//��������
		Scanner sc1 = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);  //ֻҪ����һ��Scanner�������
		
		//���ն���
		System.out.println("�����һ����");
		int elm1 = sc1.nextInt();
		System.out.println("����ڶ�����");
		int elm2 = sc1.nextInt();
		int i = (int)(elm1+elm2);
		System.out.println("������Ϊ��"+i);
		
		//�ж��Ƿ����
		//boolean flag = (elm1==elm2)?true:false;  ��������Ƚϵ���������ø��򵥵Ĺ�ϵ���ʽ
		boolean flag = (elm1==elm2);
		System.out.println("�����Ƿ���ȣ�"+flag);
		
		//����������Ƚ�
		System.out.println("�����������");
		int elm3 = sc1.nextInt();
		int temp = (elm1>elm2)?elm1:elm2;
		int max =  (elm3>temp)?elm3:temp;
		System.out.println("�������еĴ�����"+max);
	}
}
