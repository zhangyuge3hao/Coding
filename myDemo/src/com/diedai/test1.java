package com.diedai;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��22�� ����4:11:03
* 	
* 	�������Լ������Լ�����ע���������ƣ�����������ѭ���Ӷ�main������ջ����������Ա�����һ���߽�����������������ʱ�������ҵ��á�
* 	
* 		 |f(x-1)+2 ��	x>1
* 	f(x)=|					��f(3):
* 		 |3��		x=1
*/
public class test1 {
	public static void main(String [] args){
		int n = f(3);
		System.out.println(n);
	}
	public static int f(int x){
		if(x==1){
			return 3;
		}
		if(x>1){
			return f(x-1)+2;
		}
		return -1;
	}
}
