package com.GEEtest;

import java.util.Scanner;

/**
 * �����ַ��ظ����ֵĴ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ�
 * ���磬�ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3������ѹ������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ����� 
����һ��string iniStringΪ��ѹ���Ĵ�(����С�ڵ���10000)��
��֤�����ַ����ɴ�СдӢ����ĸ��ɣ�����һ��string��Ϊ�����ѹ�����δ�仯�Ĵ��� 
�������� 
��aabcccccaaa�� 
���أ���a2b1c5a3�� 
��welcometonowcoderrrrr�� 
���أ���welcometonowcoderrrrr��

����˼·������һ��StringBuilder,�����ַ�����ͣ���Ƿ����ظ����ֵ��ַ����еĻ����ۼӣ�
ÿ���ַ�������϶�Ӧ�ַ��ĸ�������ԭ�ַ������Ƚ��бȽϣ�������ã����򣬲����á�

 * @author pc
 *
 */
public class L_�ַ���ѹ��_ѧϰ {
	public static void main(String []args){
		//ѹ��
		Scanner input=new Scanner(System.in);
		String  a=input.next();
		char x[]=a.toCharArray();
		StringBuffer str=new StringBuffer();
		int count=0;
		char y=x[0];//y��x��һ��Ԫ�أ���ѭ���У�y��ʾÿ�γ��ֵ����ַ�
		for(char c:x){//���α���x����
			//��y��ʾfor�����У�ʣ���ַ��ĵ�һ���ַ�����c=y����count��ʼ��¼��ȴ���
			if(c==y){
				count++;
			}else{
			//��c��=y��˵����һ���ظ��ַ��Ѿ������������ظ�0�Σ�������StringBuffer�м�¼��һ������y��count
				str.append(y);
				str.append(count);
				y=c;
				count=1;
			}
		}
		str.append(y);
		str.append(count);
		System.out.println(str.toString());
		
		
		//��ѹ
	/*	Scanner input=new Scanner(System.in);
		String  a=input.next();
		char x[]=a.toCharArray();
		StringBuffer str=new StringBuffer();
		int c[]=new int[x.length/2]; 
		char m[]=new char[x.length/2]; 
		int index=0;
		int ind=0;
		for(int i=0;i<x.length;i++){
			if(i%2!=0){
				c[index]=Integer.parseInt(String.valueOf(x[i]));
				index++;
			}else{
				m[ind]=x[i];
				ind++;
			}
		}
		for(int j=0;j<c.length;j++){
			for(int k=0;k<c[j];k++){
			str.append(m[j]);
			}
		}
		System.out.println(str.toString());
		*/
	}
}
