package com.summarize;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��22�� ����10:38:36
* 
* 
*/
public class �������õ�ֵ�ı仯_��ȫ�� {
	//ͬһ�����飬�ڷ����д��ݣ���ֱ�Ӹı������е�ֵ����int ֮��Ĳ����ǲ���ı��
	static int num = 0;
	public static void main(String [] args){
		int a = 10;
		int []b ={10};
		method(a);
		method1(a);
		methodArray(b);
		methodArray2(b);
	}
	public static void method(int a){
		num++;
		a++;
		System.out.println("a"+a+"--num"+num);//a=11
	}
	public static void method1(int a){
		num++;
		System.out.println("a"+a+"--num"+num);//a=10  int �Ȳ����Ĵ��ݲ�������������Ӱ��
	}
	public static void methodArray(int []b){
		b[0]=11;
		System.out.println(b[0]+" "+b);//b[0]=11
	}
	public static void methodArray2(int []b){
		System.out.println(b[0]+" "+b);//b[0]=11  �����Ǵ洢���ڴ��е�����һ�����򣬱�֮ǰ�ķ����ı����������ݣ����ݾ���ı��ı���  ,b��ʾ�ĵ�ַ����־��ͬһ������
	}
}
