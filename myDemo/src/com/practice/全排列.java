package com.practice;

import java.util.Scanner;
public class х╚ееап {
	public static void sq(char data[], int k) { 
		if (k == data.length) {
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}
		
		for (int i = k; i < data.length; i++) { 
			{
				char temp = data[k]; 
				data[k] = data[i];
				data[i] = temp;
			}
			
			sq(data, k + 1);
			{
				char temp = data[k];
				data[k] = data[i];
				data[i] = temp;
			}
		}
}
	 
	public static void main(String[] args) {
		String yy ;
		Scanner qq = new Scanner(System.in);
		yy = qq.next();
		char data[] = yy.toCharArray();
		sq(data, 0); 
	}
}
