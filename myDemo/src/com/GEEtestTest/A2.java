package com.GEEtestTest;
/**
 * 十进制转化为十二进制
 * 
 * 
 */
import java.util.Scanner;
public class A2 {
	public static void main(String[] args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("输入一个数");
			String a = sc.next();
			System.out.println("进制");
			String b = sc.next();
			if(b.matches("\\d+")){
				to10(a,Integer.parseInt(b));
				//toOther(a,Integer.parseInt(b));
			}else{
				System.out.println("illegal");
			}
		}
		
	}
	static char[] b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L'};
	public static void to10(String numGet,int n){
		char[] num = numGet.toCharArray();
		for(char i : num){
			System.out.println(i);
		}
		int len = num.length;
		int pow = len-1;
		int res = 0;
		int checkNum = 0;//将10进制以上的数字化为10进制数参与运算
		for(int i = 0;i<len ;i++,pow--){
			for(int j = 0;j<b.length ;j++){
				if(num[i] == b[j]){
					checkNum =j;
				}
			}
			System.out.println(checkNum+"--checkNum");
			res += checkNum*(int)Math.pow(2, pow);
		}
		System.out.println(numGet+"转"+n+"进制:"+res);
	}
	public static void toOther(String numGet,int n){
		int num = 0;
		if(numGet.matches("\\d+")){
			num = Integer.parseInt(numGet);
			System.out.println(num+"转"+n+"进制");
			StringBuffer sb = new StringBuffer();
			while(num!=0){
				sb.append(b[num%n]);
				num /= n;
			}
			System.out.println(sb.reverse().toString());
		}else{
			System.out.println("illegal");
		}
	}
	
}
