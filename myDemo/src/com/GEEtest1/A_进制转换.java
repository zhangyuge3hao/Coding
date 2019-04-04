package com.GEEtest1;
import java.util.Scanner;
public class A_进制转换 {//16进制转2进制
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("输入一个数");
		String a = sc.next();
		if(a.matches("[\\dabcdef]+")){
			to10(a,16);
		}else{
			System.out.println("输入错误");
		}
	}
	static char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	static int lenA = arr.length;
	public static void to10(String a , int n){
		char[] num = a.toCharArray();
		int len = num.length;
		int temp = len-1;//阶数
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
		System.out.println(a+"转成"+n+"位数字是"+d);
		toOther(d,2);
	}
	public static void toOther(int num,int n){
		StringBuffer sb = new StringBuffer();
		while(num>0){
			sb.append(num%2);
			num /= 2;
		}
		sb.reverse();
		System.out.println(num+"转成"+n+"位数字是"+sb.substring(0));
	}
}
