package com.GEEtestTest;
import java.util.Scanner;
public class E_N以内的所有素数 {
	public static void main(String[] arags){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入范围上限");
		String s =sc.next();
		if(s.matches("\\d+")){
			check(Integer.parseInt(s));
		}else{
			System.out.println("请输入范围上限");
		}
	}//对一个数n，若2~根号n之间的所有整数，对n取余，余数都不等于0，这个n就是质数
	public static void check(int n){
		int count = 0;
		for(int i = 2;i<=n ;i++){
			boolean flag = true;
			int limit = (int)Math.sqrt(i);
			for(int j = 2;j<=limit;j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("是素数："+i);
				count++;
			}
		}
		System.out.println(n+"中共有素数："+count);
	}
}
