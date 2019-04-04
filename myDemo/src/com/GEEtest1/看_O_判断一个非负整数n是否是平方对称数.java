package com.GEEtest1;
//判断一个非负整数n(n<256)是否是平方对称数
public class 看_O_判断一个非负整数n是否是平方对称数 {
	public static void main(String[] args){
		int count = 0;
		/*if(check((int)Math.pow(10,2))){
			System.out.println("是平方对称数");
			count++;
		}*/
		for(int i = 0;i<256 ;i++){
			if(check((int)Math.pow(i,2))){
				System.out.println(i+"是平方对称数");
				count++;
			}
		}
		System.out.println("共有："+count);
	}
	public static boolean check(int n){
		boolean flag = true;
		char[] num = String.valueOf(n).toCharArray(); 
		int len = num.length;
		for(int i = 0,j = len-1;i<=j;i++,j--){
			if(num[i] != num[j]){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
