package com.GEEtestTest;
/**
 * 字符串转置    
   输入   To be or not to be
   输出   oT eb ro ton ot eb

 * @author Zy
 *
 */
import java.util.Scanner;
public class F_字符串转置_练 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一组字符,用空格隔开");
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
		//String[] rev = new String[len];//String 数组新建的默认值是null
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
