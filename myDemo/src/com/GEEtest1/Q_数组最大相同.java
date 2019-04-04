package com.GEEtest1;

public class Q_数组最大相同 {
	public static void main(String[] args){
		int[] a = {2,3,5,6};
		int[] b = {3,6,8};
		int la = a.length;
		int lb = b.length;
		for(int i = 0;i<lb;i++){
			boolean f = false;
			for(int j = 0;j<la;j++){
				if(b[i]==a[j]){
					System.out.println(b[i]+"存在");
					f = true;
					break;
				}
			}
			if(!f){
				System.out.println(b[i]+"不存在");
			}
		}
	}
}
