package com.GEEtest1;
import java.util.Scanner;
public class K_Լɪ�� {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("��������n����ʼ�˺�k����������m���ո����");
		String s = sc.nextLine();
		if(s.matches("\\d+\\ \\d+\\ \\d+")){
			String[] st = s.split("\\ ");
			int n = Integer.parseInt(st[0]);
			int k = Integer.parseInt(st[1]);
			int m = Integer.parseInt(st[2]);
			//System.out.println("n:"+n+"k:"+k+"m:"+m);
			yuesefu(n,k,m);
		}else{
			System.out.println("�������");
		}
	}
	public static void yuesefu(int n,int k,int m){
		int[] play = new int[n];
		int out = 0;
		int temp = 0;
		for(int i = (k-1);out<n;i++){
			if(play[i] != -1){
				if(temp == (m-1)){
					play[i] = -1;
					temp = 0;
					out++;
					System.out.println((i+1)+"�˳�");
				}else{
					temp++;
				}
			}
			if(i == (n-1)){
				i = -1;
			}
		}
	}
}