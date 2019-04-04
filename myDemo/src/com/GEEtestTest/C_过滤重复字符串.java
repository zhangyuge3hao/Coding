package com.GEEtestTest;
/*过滤重复字符串*/
import java.util.Scanner;
public class C_过滤重复字符串 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一串字符");
		String s = sc.next();
		handle(s.toCharArray());
	}
	public static void handle(char[] s){
		//将String化为char[],新建一个StringBuffer, 遍历char数组的每一位并去buffer中寻找indexOf，找不到就放进去append，找到就跳过
		StringBuffer sb = new StringBuffer();
		int len = s.length;
		int lenS = sb.length();
		for(int i= 0;i<len;i++){
			//StringBuffer可以通过形参找到String里是否包含一组字母,indexOf返回一个下标，下标位-1的时候表示不存在
			if(sb.indexOf(String.valueOf(s[i]))==-1){
				sb.append(s[i]);	
			}
		}
		System.out.println(sb.substring(0));
	}
}
