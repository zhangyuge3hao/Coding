package com.random;

import java.util.Random;
import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��8�� ����9:52:42
* 
* 	ϵͳ����һ��[1,100]����������¶���~
*/
public class GuessNumberGame {
	public static void main(String[] args) {
		/*---------����һ�������---------*/
		Random ra = new Random();
		int number = ra.nextInt(100);
		//System.out.println("������ǣ�"+number);
		
		/*---------��������,ֱ������Ϊֹ---------*/
		while(true){
			System.out.println("������һ��[1,100]�ڵ����֣�");
			Scanner sc = new Scanner(System.in);
			int get_number =sc.nextInt();
			/*---------�ж�---------*/
			if(get_number>number){
				System.out.println("��Ǹ���´���");
			}else if(get_number<number){
				System.out.println("��Ǹ����С��");
			}else{
				System.out.println("��ϲ������");
				break;
			}
		}
		
	}
}
