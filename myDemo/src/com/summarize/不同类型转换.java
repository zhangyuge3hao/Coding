package com.summarize;

import java.util.Arrays;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��17�� ����1:09:43
* 
* 
*/
public class ��ͬ����ת�� {
	public static void main(String [] args){
		// int->String
		int a=10;
		int aaa=1;
		String b = String.valueOf(a);
		System.out.println("--a-"+a+"--b-"+b);
		//String -> int
		int c=Integer.parseInt(b+1);
		System.out.println("--c-"+c+"--b+1-"+b+1);
		
		//double -> String
		double aa = 100.01;
		String bb = String.valueOf(aa);
		System.out.println("--aa-"+aa+"--bb-"+bb);
		//String -> double
		String cc = "11.11";
		double dd = Double.parseDouble(cc);//��String �� �����м���.�Ϳ���תdouble��
		System.out.println("--cc-"+cc+"--dd-"+(dd-10.00));
		
		//String -> char
		char[] d=b.toCharArray();
		for(char str:d){
			System.out.println(str);
		}
		//char -> String 
		String e = String.valueOf(d[0]);//����
		System.out.println("--e-"+e);

		//char->int
		int f=d[1]-'0';  //��ע���Ǽ��š�����0����charתint��+0�������ARSC
		//int -> char
		char m[] = String.valueOf(a).toCharArray();
		char g = (char)('0' + a);
		System.out.println("--d[1]-"+d[1]+"--f-"+f+"--g-"+g);
		
		//String -> String[]
		String h="111";
		String i="222";
		String s1[]={h};
		String s2[]={i};
		//String s3[]=(String) Arrays.asList("123").get(0);

		
	}
}
