package com.practice;

import java.util.Scanner;

/*
 * ���󣺼���¼��һ���·ݣ�������·ݶ�Ӧ�ļ��ڡ�
 * 		һ�����ļ�
 * 		3,4,5	����
 * 		6,7,8	�ļ�
 * 		9,10,11	�＾
 * 		12,1,2	����
 * 
 * ������
 * 		A:����¼��һ���·�,��Scannerʵ��
 * 		B:�жϸ��·��Ǽ���,�����·������Ӧ�ļ���
 * 			if
 * 			switch
 */
public class Test {
	public static void main(String[] args) {
		//����¼��һ���·�,��Scannerʵ��
		Scanner sc = new Scanner(System.in);
		
		//��������
		System.out.println("�������·�(1-12)��");
		int month = sc.nextInt();	
		//Ŀǰ�����Ѿ�ʵ�������ǵ�����
		//�����Ҿ��ô�����΢��Щ�鷳
		//��������Ľ�
		//��θĽ���?�ܲ��ܰ���ͬ���ڵ��·ݷŵ�һ���ж���
		//��
		//month == 3 || month == 4 || month == 5
		
		if((month == 1) || (month == 2) || (month == 12)) {
			System.out.println("����");
		}else if((month == 3) || (month == 4) || (month == 5)) {
			System.out.println("����");
		}else if((month == 6) || (month == 7) || (month == 8)) {
			System.out.println("�ļ�");
		}else if((month == 9) || (month == 10) || (month == 11)) {
			System.out.println("�＾");
		}else {
			System.out.println("��������·�����");
		}
	}
}
