package com.GEEtest1;
import java.util.Scanner;
public class 看_E_N以内的所有素数 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	//	boolean flag = 
		int count = 0;
		for(int i = 2 ;i<n ;i++){
			if(get(i)){
				System.out.println(i+" YES");
		//		flag = ;
				count++;
			}
		}
		System.out.println(count+" 个");
	}
	public static boolean get(int n){
		int limit = (int)Math.sqrt(n);
		for(int i = 2;i<=limit;i++){
			if(n%i==0){//这个数n，被1到根号n的数取余，都不得0，才是质数
				return false;
			}
		}
		return true;
	}
}
