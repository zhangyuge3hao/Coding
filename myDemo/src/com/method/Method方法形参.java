package com.method;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��27�� ����2:14:04

*/
public class Method�����β� {
	public static void main(String[] args)  {
		/**
		 *���β�Ϊ��ͨ��������ʱ����ͨ�������ͣ�byte��short��int��long��float��double��char��boolean��
		 *							 1	   2	4	 8	   4	  8	    2	   1
		 *	�β�ֵ�ĸı䡾��Ӱ�졿ʵ��
		 *	
		 */
		int a = 10;
		int b = 20;
		change(a,b);
		/**
		 * ���β�Ϊ������������ʱ�������������ͣ��ࡢ�ֿڡ����飩
		 * 
		 * 	�β�ֵ�ĸı䡾Ӱ�졿ʵ��
		 */
		int[] arr = {1,2,3,4};
		int length = arr.length;
		for(a=0;a<length;a++){
			System.out.print(arr[a]+"  ");
		}
		multiplicative(arr);
		System.out.println();
		for(a=0;a<length;a++){
			System.out.print(arr[a]+"  ");
		}
		
	}
	public static void change(int x,int y){
		x=y;
		y+=x;
		System.out.println("���y��ֵ��"+y);
	}
	
	public static void multiplicative(int[] arr){
		int length = arr.length;
		int a;
		for(a=0;a<length;a++){
			if(arr[a]%2==0){
				arr[a]*=2;
			}
		}
	}
}
