package com.GEEtest1;

public class ��_I_��1000���ڵ����� {
	public static void main(String[] args){
		int n = 1000;
		int count = 0;
		for(int i = 0;i<=n;i++){
			if(check(i)){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("������"+count);
	}
	public static boolean check(int n){
		int sum = 0;
		for(int i = 1;i<n;i++){
			if(n%i==0){
				sum += i;
			}
		}
		if(sum == n){
			return true;
		}else{
			return false;
		}
	}
}
