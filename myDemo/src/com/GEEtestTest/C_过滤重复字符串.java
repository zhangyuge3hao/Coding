package com.GEEtestTest;
/*�����ظ��ַ���*/
import java.util.Scanner;
public class C_�����ظ��ַ��� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ�");
		String s = sc.next();
		handle(s.toCharArray());
	}
	public static void handle(char[] s){
		//��String��Ϊchar[],�½�һ��StringBuffer, ����char�����ÿһλ��ȥbuffer��Ѱ��indexOf���Ҳ����ͷŽ�ȥappend���ҵ�������
		StringBuffer sb = new StringBuffer();
		int len = s.length;
		int lenS = sb.length();
		for(int i= 0;i<len;i++){
			//StringBuffer����ͨ���β��ҵ�String���Ƿ����һ����ĸ,indexOf����һ���±꣬�±�λ-1��ʱ���ʾ������
			if(sb.indexOf(String.valueOf(s[i]))==-1){
				sb.append(s[i]);	
			}
		}
		System.out.println(sb.substring(0));
	}
}
