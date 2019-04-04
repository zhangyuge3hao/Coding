package com.GEEtest;

import java.util.Scanner;

/**
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。
 * 比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。 
给定一个string iniString为待压缩的串(长度小于等于10000)，
保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。 
测试样例 
“aabcccccaaa” 
返回：”a2b1c5a3” 
“welcometonowcoderrrrr” 
返回：”welcometonowcoderrrrr”

解题思路：定义一个StringBuilder,遍历字符串，停机是否有重复出现的字符，有的话则累加，
每个字符后面跟上对应字符的个数，与原字符串长度进行比较，短则采用，否则，不采用。

 * @author pc
 *
 */
public class L_字符串压缩_学习 {
	public static void main(String []args){
		//压缩
		Scanner input=new Scanner(System.in);
		String  a=input.next();
		char x[]=a.toCharArray();
		StringBuffer str=new StringBuffer();
		int count=0;
		char y=x[0];//y是x第一个元素，在循环中，y表示每次出现的新字符
		for(char c:x){//依次遍历x数组
			//用y表示for遍历中，剩余字符的第一个字符，若c=y，让count开始记录相等次数
			if(c==y){
				count++;
			}else{
			//若c！=y，说明上一个重复字符已经结束（哪怕重复0次），就在StringBuffer中记录上一个数字y和count
				str.append(y);
				str.append(count);
				y=c;
				count=1;
			}
		}
		str.append(y);
		str.append(count);
		System.out.println(str.toString());
		
		
		//解压
	/*	Scanner input=new Scanner(System.in);
		String  a=input.next();
		char x[]=a.toCharArray();
		StringBuffer str=new StringBuffer();
		int c[]=new int[x.length/2]; 
		char m[]=new char[x.length/2]; 
		int index=0;
		int ind=0;
		for(int i=0;i<x.length;i++){
			if(i%2!=0){
				c[index]=Integer.parseInt(String.valueOf(x[i]));
				index++;
			}else{
				m[ind]=x[i];
				ind++;
			}
		}
		for(int j=0;j<c.length;j++){
			for(int k=0;k<c[j];k++){
			str.append(m[j]);
			}
		}
		System.out.println(str.toString());
		*/
	}
}
