package com.method;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��17�� ����11:50:24
* 
* 	����������
* 		����3�����֣��жϣ�
* 			ǰ2���������ֵ��maxTwoInPut
*			ǰ2�����Ƿ���ȣ�equalTwoInPut
* 			ǰ3���������ֵ��maxThreeInPut
*/
public class MethodPractice {
	public static void main(String[] args) {
		System.out.println("/----------�з���ֵ�ĵ���----------/");
		System.out.println("������2������3�����֣�");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("�����������ǣ�"+maxTwoInPut(A,B));
		System.out.println("������"+equalTwoInPut(A,B));
		int C = sc.nextInt();
		System.out.println("�����������ǣ�"+maxThreeInPut(A,B,C));
		System.out.println("/----------void�����ĵ��ã���ӡˮ�ɻ���----------/");
		
		
	}
	public static int maxTwoInPut(int a,int b) {
		if(a>=b){
			return a;
		}else{
			return b;
		}
	}
	public static String equalTwoInPut(int a,int b) {
		String result;
		if(a==b){
			return result="���";
		}else{
			return result="�����";
		}
	}
	public static int maxThreeInPut(int a,int b,int c) {
		int max=0;
		int[] arry={a,b,c};
		for(int quantity=0;quantity<3;quantity++){
			if(max<arry[quantity]){
				max=arry[quantity];
			}
		}
		return max;
	}
	
}
