package com.GEEtest;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月30日 下午4:11:38
* 
* 
*/
public class I_减法 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Please input the minuend.");
			String s1 = sc.next();
			System.out.println("Please input the subtractor.");
			String s2 = sc.next();
			if(s1.matches("\\d+")&&s2.matches("\\d+")){
				minus(s1,s2);
			}else{
				System.out.println("Input illegal");
			}
			
		}
	}
	public static void minus(String a,String b){
		int max=0;
		int min=0;
		int sign=0;//小数减去大数    = 大数减去小数*-1
		if(Integer.parseInt(a)>Integer.parseInt(b)){
			max=Integer.parseInt(a);
			min=Integer.parseInt(b);
			sign=1;
		}else{
			max = Integer.parseInt(b);
			min = Integer.parseInt(a);
			sign=-1;
		}
		
		char s1[]=String.valueOf(max).toCharArray();
		char s2[]=String.valueOf(min).toCharArray();
		int len1 = s1.length;
		int len2 = s2.length;
		int res[] = new int[len1]; //结果的长度一定小于max的长度，所以在对位减法中，按被减数位数遍历，只有减数可能会溢出
		int token=0;//退位标记
		int tempNin=1;//小数的参与运算位数
		int minus=0;
		int subtractor=0;//用于判断并记录减数位数不够时，减数应当取得值

		for(int i=len1-1,j=len1-1,k=len2-1;i>=0;i--,j--,k--){//i：结果数组res[]；   j:被减数组s1[]；   k:减数数组s2[]
			if(tempNin<=len2){
				subtractor=s2[k]-'0';
			}else{
				subtractor=0;
			}
			minus=s1[j]-'0';
			if((minus-token)<subtractor){//被减数减去标记位后，小于减数，即当前位数不够减，需要向上一位借1
				res[i]=minus-token+10-subtractor;//向上一位借1 ：+10
				token=1;
			}else{
				res[i]=minus-token-subtractor;
				token=0;
			}
			tempNin++;
		}
		boolean flag = true; 
		String r= "";
		for(int i =0;i<len1;i++){
			if(res[i]!=0){
				flag =false;
			}
			if(flag){
				
			}else{
				r=r+res[i];
				System.out.print(i);
			}	
		}
		System.out.println();
		System.out.println("result:"+sign*Integer.parseInt(r)+" compare with:"+(Integer.parseInt(a)-Integer.parseInt(b)));
	}
}
