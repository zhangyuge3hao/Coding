package com.GEEtest;
/**
 * 题目描述：输入一个字符串S1,对输入的字符进行压缩，如果不能压缩则原封不动。
 * @author pc
 *
 */
import java.util.Scanner;
public class L_字符串压缩 {
	public static void main(String []args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("input s1");
			String s1 = sc.next();
			StringBuffer sb = new StringBuffer();//buffer可以加int、String、char不用转格式
			char s[] = s1.toCharArray();
			char temp = s[0];//temp是s的第一个元素，所以刚进循环一定相等，connt会+1，所以在初始化为0
			int count = 0;
			for(char c:s){
				if(c==temp){
					count++;
				}else{//若遍历元素c不等于temp，说明上一个元素结束，保存上个元素和count的值
					sb.append(count);
					sb.append(temp);
					temp=c;//跟新temp，以便下一个c和temp比较，判断当前c是否重复
					count=1;//在循环进行中，count从1开始
				}
			}
			sb.append(count);
			sb.append(temp);
			
			String result = sb.toString();
			if(result.length()>=s1.length()){//如果不能压缩则原封不动。压缩后结果反而变长了，就输出原数
				System.out.println(s1);
			}else{
				System.out.println(result);
			}
			
		}
	}
}
