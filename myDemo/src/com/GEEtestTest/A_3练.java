package com.GEEtestTest;
/*十进制转化为十二进制*/
/*十二进制转化为十进制*/
import java.util.Scanner;
public class A_3练 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		int n = sc.nextInt();
		String a = to12(n);
		to10(a);
	}
	static char[] b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	public static String to12(int n){
		//用n除以12，余数按下标从b中获取存到sb，reverse
		StringBuffer sb = new StringBuffer();
		String re = "";
		while(n!=0){
			sb.append(b[n%12]);
			n /= 12;
		}
		re =sb.reverse().toString();
		System.out.println(n+"转换成12进制得："+re);
		return re;
	}
	public static void to10(String n){
		//10 = 每一位上的数（需要转换）*pow（当前进制，当前阶数）
		char[] a = n.toCharArray();
		int len = a.length;
		int lenB = b.length;
		int jie = len-1;//记录当前数字阶数，第一个数字从len-1开始
		int re = 0;
		int checkN = 0;
		for(int i = 0;i<len ;i++,jie--){
			for(int j = 0;j<lenB;j++){
				if(a[i] == b[j]){
					checkN = j;
				}
			}
			re += checkN*(int)Math.pow(12, jie);
		}
		System.out.println(n+"转换成10进制得："+re);
	}
}

