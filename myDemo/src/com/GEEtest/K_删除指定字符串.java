package com.GEEtest;
import java.util.Scanner;

public class K_ɾ��ָ���ַ��� {
	public static void main(String []args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("input s1");
			String s1 = sc.next();
			System.out.println("input s2");
			String s2 = sc.next();
			String s ="";
			
			int index = s1.indexOf(s2);//����s2��s1�ĵ�һ��λ�õ��±� String ����ֱ����indexOf
			int count = 0;
			while(index != -1){//ֻҪs1�д���s2
				//s1 = s1.substring(0, index) + s1.substring(index+s2.length());
				StringBuffer sb = new StringBuffer(s1);
				//sb. delete (1,4)�ô����������ɾ������ֵ1(����)������ֵ4(������)֮��������ַ�
				sb.delete(index,index+s2.length());
				s1 = sb.toString();//StringBuffer��������Ҫת��String
				
				index = s1.indexOf(s2);
				count++;
			}
			System.out.println("after:"+s1+"  count:"+count);
		}
	}
}
