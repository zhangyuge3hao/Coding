package com.GEEtestTest;
/**
 * �ַ���ת��    
   ����   To be or not to be
   ���   oT eb ro ton ot eb

 * @author Zy
 *
 */
import java.util.Scanner;
public class F_�ַ���ת��_�� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�,�ÿո����");
		String s = sc.nextLine();
		String[] arr = s.split("\\ ");
		int len = arr.length;
		reverse(len,arr);
		reverse1(len,arr);
	}
	public static void reverse(int len,String[] arr){

		 String rev = "";
		 for(int i = 0;i<len ;i++){
			 StringBuffer sb = new StringBuffer();
			 sb.append(arr[i]);
			 rev += sb.reverse().toString()+" ";
		 }
		 System.out.println(rev);
	}
	
	public static void reverse1(int len,String[] arr){
		//String[] rev = new String[len];//String �����½���Ĭ��ֵ��null
		String rev = "";
		for(int i = 0;i<len ;i++){
			char[] temp = arr[i].toCharArray();
			int lenC = temp.length;
			
			for(int j =lenC-1;j>=0;j--){
				rev += String.valueOf(temp[j]); 
			}
			rev += " ";
		}
		System.out.println("--"+rev);
	}
}
