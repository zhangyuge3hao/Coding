package com.GEEtestTest;

import java.util.Scanner;
public class L_������� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ������");
		String a = sc.next();
		System.out.println("����ڶ�������");
		String b = sc.next();	
		if(a.matches("\\d+")&&b.matches("\\d+")){
			add(a,b);
		}else{
			System.out.println("�������");
		}
	}
	public static void add(String aa,String bb){
		char[] a = aa.toCharArray();
		char[] b = bb.toCharArray();
		int len1 = a.length;
		int len2 = b.length;
		int len = (len1<len2)?len2:len1+1;
		int[] res = new int[len];
		int temp = 0;//temp�ڱ����������±��ǰ�Ʊ������=len��������a��b���жϼ����Ƿ���Ҫ��Ϊ0
		int n1 = 0;
		int n2 = 0;//��������ÿһλ����������
		int tocken = 0;//��λ
		for(int i = len-1,j = len1-1,k = len2-1;i>=0;i--,k--,j--){
			n1 = (temp<len1)?(a[j]-'0'):0;
			n2 = (temp<len2)?(b[k]-'0'):0;
			if(n1+n2+tocken<=9){
				res[i]=n1+n2+tocken;
				tocken=0;
			}else{
				res[i]=n1+n2+tocken-10;
				tocken=1;
			}
			temp++;
		}
		for(int i = 0;i<len;i++){
			if(res[0]==0&&i==0){
				continue;
			}
			System.out.print(res[i]);
		}
	}
}
