package com.GEEtestTest;
/*
N������Χ��һ��Ȧ
1���ӵ�һֻ���ӿ�ʼ��������һֻ���ӱ�1
2��ÿ����2�ĺ����˳���Ȼ�����һֻ�������¿�ʼ������
3��Ҫ������˳���˳������ʣ�µ���
*/
import java.util.Scanner;
public class J_����ѡ���� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������");
		String s = sc.next();
		if(s.matches("\\d+")){
			int n = Integer.parseInt(s);
			yuesefu(n);
		}else{
			System.out.println("�������");
		}
	}
	public static void yuesefu(int n){
		int k = 1, m = 2;
		System.out.println("������"+n+"��"+k+"�ź��ӿ�ʼ����������m������"+m);
		int[] mon = new int[n];
		int out = 0;
		int num = 0;//�����Ǵ�1��ʼ�ģ����Գ�ʼ��0
		for(int i = (k-1);out<n;i++){
			if(mon[i]!=-1){
				if(num==(m-1)){
					mon[i]=-1;
					out++;
					num=0;
					
					if(out==n){
						System.out.println((i+1)+"����˳�");
					}else{
						System.out.println((i+1)+"�˳�");
					}
				}else{
					num++;
				}
			}
			if(i==(n-1)){
				i=-1;
			}
		}
		System.out.println(out+"�˳�����");
	}
}
