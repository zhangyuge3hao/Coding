package com.GEEtest1;
import java.util.Scanner;
public class L_大数相减 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		String s1 = sc.next();
		System.out.println("输入一个数");
		String s2 = sc.next();
		if(s1.matches("\\d+")&&s2.matches("\\d+")){
			minus(s1,s2);
		}
	}
	public static void minus(String s1,String s2){

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		char[] max = {};
		char[] min = {};
		if(a.length==b.length){
			for(int i = 0;i<a.length;i++){
				if((a[i]-'0')>(b[i]-'0')){
					max = a;
					min = b;
					break;
				}else{
					max = b;
					min = a;
					break;
				}
			}
		}else{
			max = a.length<b.length?b:a;
			min = a.length>b.length?b:a;
		}
		
	
		int lenA = max.length;
		int lenB = min.length;
		int[] res = new int[lenA];
		int temp = 0;
		int tocken = 0;
		for(int i = lenA-1,j = lenB-1,k = lenA-1;i>=0;i--,j--,k--,temp++){
			int n1 = max[i]-'0';
			int n2 = temp<lenB?(min[j]-'0'):0;
			if(n1>=(n2+tocken)){
				res[i] = n1-(n2+tocken);
				tocken = 0;
			}else{
				res[i] = n1+10-(n2+tocken);
				tocken = 1;
			}
		}
		for(int i:res){
			System.out.print(i);
		}
		System.out.println();
		
	}

}
