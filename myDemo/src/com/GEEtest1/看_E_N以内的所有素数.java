package com.GEEtest1;
import java.util.Scanner;
public class ��_E_N���ڵ��������� {
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
		System.out.println(count+" ��");
	}
	public static boolean get(int n){
		int limit = (int)Math.sqrt(n);
		for(int i = 2;i<=limit;i++){
			if(n%i==0){//�����n����1������n����ȡ�࣬������0����������
				return false;
			}
		}
		return true;
	}
}
