package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��17�� ����5:04:43
* 
* 
*/
import java.util.Scanner;

public class B_�����ظ��ַ��� {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("������һЩ�ַ�");
		while(true){
			String s=sc.next();
			rmR(s);
		}
	}
	public static void rmR(String s){
		int len=s.length();
		int temp=0;
		boolean flag=true;
		char before []=s.toCharArray();
		char later []=new char[len];
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(before[i]==later[j]){
					flag=false;
				}
			}
			if(flag){
				//later[i]=before[i];
				later[temp]=before[i];
				temp++;
			}
			flag=true;
		}
		for(char st:later){
			System.out.print(st);
		}
	}
}