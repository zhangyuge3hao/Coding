package com.method;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��24�� ����9:38:33
* 
* 	���������أ�
* 		һ����������[����]�ķ������ͽ�������������
* 		���صķ�������[��������ͬ]�⣬[�����б�]���벻ͬ��
* 			A. ����������ͬ
* 			B. �������Ͳ�ͬ
* 			C. �����뷽������ֵ�޹�
*/
public class Method�������� {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		short short1 = 5;
		short short2 = 6;
		System.out.println("sum(c,b)="+sum(c,b));
		System.out.println("sum(short1,short2)="+sum(short1,short2));
		System.out.println("sum(c,b,a)="+sum(c,b,a));
		System.out.println("sum('1','A')="+sum('1','A'));	//�ַ���ӣ��ӵ���ASC��ֵ
		/*
		 * byte \ short \ long --- initial
		 */
		System.out.println();
	
		System.out.println("compare('1','A')���жϽ���ǣ�"+compare('1','A'));
		System.out.println("compare('��','��')���жϽ���ǣ�"+compare('��','��'));
		System.out.println("compare('love','life')���жϽ���ǣ�"+compare("love","life"));
		System.out.println("compare(1,3)���жϽ���ǣ�"+compare(1,3));
		System.out.println("compare(2,2)���жϽ���ǣ�"+compare(2,2));
		System.out.println("compare(3l,3l)���жϽ���ǣ�"+compare(3L,3L));	//Ҫֱ�ӵ���long���͵ķ������أ���ֱ�������ֺ���ӡ�L���Ա�ʾ��������
		System.out.println("compare(3F,3F)���жϽ���ǣ�"+compare(3F,3F));	//Ҫֱ�ӵ���float���͵ķ������أ���ֱ�������ֺ���ӡ�F���Ա�ʾ��������
		System.out.println("compare(true,false)���жϽ���ǣ�"+compare(true,false));

	}
	public static int sum(int a, int b){			//�����׼����
		System.out.print("/---a+b(int)---/");
		return a+b;
	}
	public static int sum(short a, short b){		//���׼�����������Ͳ�ͬ����˵�����������뷵��ֵ�޹�
		System.out.print("/---a+b(short)---/");
		return a+b;	//����short������� ���Զ� �������͵���int
		//return (short)(a+b);
		//����Ȼʹ�÷���short���򱨴�Type mismatch: cannot convert from int to short
	}
	public static int sum(int a, int b , int c){	//���׼��������������ͬ
		System.out.print("/---a+b+c---/");
		return a+b+c;
	}

	/*
	 * byte \ char \ short \ int \ long ---compare method
	 */
	public static boolean compare(byte a, byte b){
		System.out.print("/---byte---/");
		return a == b;
	}
	public static boolean compare(char a, char b){
		System.out.print("/---char---/");
		return a == b;
	}
	public static boolean compare(String a, String b){
		System.out.print("/---String---/");
		return a == b;
	}
	public static boolean compare(short a, short b){
		System.out.print("/---short---/");
		return a == b;
	}
	public static boolean compare(int a, int b){
		System.out.print("/---int---/");
		return a == b;
	}
	public static boolean compare(long a, long b){
		System.out.print("/---long---/");
		return a == b;
	}
	public static boolean compare(float a, float b){
		System.out.print("/---float---/");
		return a == b;
	}
	public static boolean compare(boolean a, boolean b){
		System.out.print("/---boolean---/");
		return a == b;
	}
}
