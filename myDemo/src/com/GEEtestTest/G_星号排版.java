package com.GEEtestTest;
import java.util.Scanner;
public class G_�Ǻ��Ű� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ǻŵ�ֱ��������Ϊ����");
		String l = sc.next();
		if(l.matches("\\d+")&&Integer.parseInt(l)%2==1){
			handle(Integer.parseInt(l));
		}else{
			System.out.println("����");
		}
	}
	public static void handle(int n){
		/*
		 	*****  5  0 0
		 	-***-  3  2 1
		 	--*--  1  4 2
		 */
		//��Ҫ�㣺�Ǻ���ո�ֱ��������
		//��ÿ�пո��ܺ�Ϊż������ֻ���һ�㡣�Ǻ�����Ϊ������������֮�����������
		//�������һ�룬�������һ�롿
		int c = 1;//��Ч����
		while(c <= n){
			kongge((n-c)/2);
			star(c);
			System.out.println();
			c += 2;
		}
		c=n-2;

		while(c >= 1){
			kongge((n-c)/2);
			star(c);
			System.out.println();
			c -= 2;
		}	

	}
	public static void kongge(int n){
		for(int i = 0;i<n;i++){
			System.out.print("-");
		}
	}
	public static void star(int n){
		for(int i = 0;i<n;i++){
			System.out.print("*");
		}
	}
	
}
