package com.summarize;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��23�� ����10:07:07
* 
* 
*/
public class �����м�����Ľ�������ֵ {
	public static void main(String [] args){
		int x = 1;
		int y = 2;
		System.out.println("x:"+x+" y:"+y);
					//(x+y)
		x = x + y;//x = x + y
		
					//(x+y)-y = x
		y = x - y;//y = x - y = x
		
					//(x+y)-(x) = y
		x = x - y;//y = x - y = y
		System.out.println("x:"+x+" y:"+y);
	}
}
