package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月23日 下午4:10:58
* 	在一般语言中对整型数都有个最大限制，现给出两个超出正常范围的十进制数对其进行求和，带进位的加法。
* 
*/
import java.util.Scanner;
public class I_大数相加 {
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println();
			System.out.println("Please input the first number:");
			String s1=sc.next();
			System.out.println("Please input the second number:");
			String s2=sc.next();
			if(s1.matches("\\d+")&&s2.matches("\\d+")){
				add(s1,s2);
			}else{
				System.out.println("Input illegal.");
			}
		}
	}
	public static void add(String a,String b){//为了下一步将加数转变为字符数组，所以传进来的是String
		char s1[]=a.toCharArray();
		char s2[]=b.toCharArray();
		int len1=a.length();
		int len2=b.length();
		int token=0;//进位标记
		int temp1=1;//记录a已经参与计算的位数，当temp1>len1时，剩余的位数用0来参与运算
		int temp2=1;//记录b已经参与计算的位数
		int n1=0;
		int n2=0;
		int len=(len1<len2?len2:len1)+1;//存储结果的数组，比最大数的长度大1(保证进位)
		int res[]=new int[len];
		for(int i=len-1,j=len1-1,k=len2-1 ;i>=0;i--,j--,k--){//i j k都是从数组（右对齐，len最长）最后往前遍历相加并记录每一位的结果
			n1=temp1<=len1?(s1[j]-'0'):0;
			n2=temp2<=len2?(s2[k]-'0'):0;//因为便利总长len肯定大于两个加数的长度，当temp超过len12的时候，加数的下表就是负数了
			/*if(temp1<=len1){
				n1=s1[j];
			}else{
				n1=0;
			}
			if(temp2<=len2){
				n2=s2[k];
			}else{
				n2=0;
			}*/
			if((n1+n2+token)<=9){
				res[i]=(n1+n2+token);
				token=0;
			}else{
				res[i]=n1+n2+token-10;
				token=1;//进位
			}
			temp1++;
			temp2++;
		}
		System.out.print("The result is :");
		for(int i=0;i<len;i++){
			if(i==0&&res[i]==0){
			}else{
				System.out.print(res[i]);
			}
		}
	}
}
