package com.GEEtestTest;

import java.util.Scanner;
public class D_����󹫹��Ӵ� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ���ַ���");
		String a = sc.next();
		System.out.println("�������һ���ַ���");
		String b = sc.next();
		handle(a, b);
	}
	public static void handle(String a,String b){
		//�����ҵ���С���Ǹ��ַ��������ͳ����ַ����Ƚϣ����Ƿ������У�ÿ������һλȥ�Ƚ�
		StringBuffer max = new StringBuffer();
		String min = "";
		
		max = (a.length()>b.length())?max.append(a):max.append(b);
		min = (a.length()<b.length())?a:b;
		
		int lMin = min.length(); 
		System.out.println("max:"+max.substring(0)+"--min:"+min);
		for(int i = 0;i<lMin;i++){//����substring(i,n)������ʾn��ֵ������һ��Ҫ��ǰ��������
			if(max.indexOf(min.substring(i))!=-1){
				System.out.println("����ִ��ǣ�"+min.substring(i));
				break;
			}
		}
	}
}
