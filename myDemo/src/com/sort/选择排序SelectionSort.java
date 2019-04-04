package com.sort;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��22�� ����9:16:46
* 
* * https://www.cnblogs.com/onepixel/articles/7674659.html#!comments
* 
* ѡ������(Selection-sort)��һ�ּ�ֱ�۵������㷨�����Ĺ���ԭ��������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ�ã�Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ���Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ� 

2.1 �㷨����
n����¼��ֱ��ѡ������ɾ���n-1��ֱ��ѡ������õ��������������㷨�������£�

��ʼ״̬��������ΪR[1..n]��������Ϊ�գ�
��i������(i=1,2,3��n-1)��ʼʱ����ǰ���������������ֱ�ΪR[1..i-1]��R(i..n������������ӵ�ǰ��������-ѡ���ؼ�����С�ļ�¼ R[k]���������������ĵ�1����¼R������ʹR[1..i]��R[i+1..n)�ֱ��Ϊ��¼��������1�������������ͼ�¼��������1��������������
n-1�˽��������������ˡ�
* 
* 
* ��򵥵�����
*/

import java.util.Scanner;
public class ѡ������SelectionSort {
	public static void main(String [] args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("Please input numbers for selectionSort,and split them ','.Input # to stop the program.");
			String s = sc.next();
			if(s.matches("(\\d+\\,)*\\d+")){
				String num[] = s.split("\\,");
				int len = num.length;
				int n[] = new int[len];
				for(int i = 0;i < len;i++){
					n[i]=Integer.parseInt(num[i]);
				}
				SelectionSort(n,len);
			}else if(s=="#"){
				System.out.println("Input abort.");
				flag=false;
			}else{
				System.out.println("Input illegal.");
			}
		}
	}
	public static void SelectionSort(int num[],int len){
		int temp = 0;
		for(int i = 0;i<len-1;i++){
			for(int j = i+1;j<len;j++){
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int n : num){
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
}
