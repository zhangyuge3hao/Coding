package com.GEEtestTest;

import java.util.Scanner;
public class H_����������� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������߱߳����ÿո����");
		String str = sc.nextLine();
		String[] x = str.split("\\ "); 

		int a = 0;
		int b = 0;
		int c = 0;
		int m = 0;//���ܳ�,���=������(m*(m-a)*(m-b)*(m-c))
		double s = 0;
		
		if(x.length == 3&&str.matches("[\\d+]\\ [\\d+]\\ [\\d+]")){
		//if(x.length == 3&&s.matches("[\\d+]\\ [\\d+]\\ [\\d+]")){
			a = Integer.parseInt(x[0]);
			b = Integer.parseInt(x[1]);
			c = Integer.parseInt(x[2]);
			m = (a + b +c)/2;
			s = Math.sqrt(m*(m-a)*(m-b)*(m-c));
			
			System.out.println("�����"+ s );
		}else{
			System.out.println("�������");
		}
	}
}
