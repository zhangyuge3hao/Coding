package com.GEEtest1;
import java.util.Scanner;
public class A_����ת�� {//16����ת2����
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("����һ����");
		String a = sc.next();
		if(a.matches("[\\dabcdef]+")){
			to10(a,16);
		}else{
			System.out.println("�������");
		}
	}
	static char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	static int lenA = arr.length;
	public static void to10(String a , int n){
		char[] num = a.toCharArray();
		int len = num.length;
		int temp = len-1;//����
		int getN = 0;
		int d = 0;
		for(int i = 0 ;i<len;i++ ){
			for(int j = 0;j<lenA;j++){
				if(num[i]==arr[j]){
					getN = j;
					break;
				}
			}
			d += getN*(int)Math.pow(n, temp);
			temp--;
		}
		System.out.println(a+"ת��"+n+"λ������"+d);
		toOther(d,2);
	}
	public static void toOther(int num,int n){
		StringBuffer sb = new StringBuffer();
		while(num>0){
			sb.append(num%2);
			num /= 2;
		}
		sb.reverse();
		System.out.println(num+"ת��"+n+"λ������"+sb.substring(0));
	}
}
