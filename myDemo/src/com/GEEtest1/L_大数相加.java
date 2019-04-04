package com.GEEtest1;
import java.util.Scanner;
public class L_大数相加 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个数");
		String a1 = sc.next();
		int lenA = a1.length();
		System.out.println("输入第二个数");
		String b1 = sc.next();
		int lenB = b1.length();
		
		char[] max = lenA<lenB?b1.toCharArray():a1.toCharArray();
		char[] min = lenA>lenB?b1.toCharArray():a1.toCharArray();

		add(min,max);
	}
	public static void add(char[] min,char[] max){
		
		int lenSum = max.length+1;
		int leni = min.length;
		int lena = max.length;
		int[] sum = new int[lenSum];
		int temp = 0;//进位
		int limit = 0;
		for(int i = lenSum-1,j = lena-1,k = leni-1;i>=0;i--,j--,k--,limit++){
			
			int n1 = (limit<lena)?(max[j]-'0'):0;
			int n2 = (limit<leni)?(min[k]-'0'):0;
			if(n1+n2+temp<9){
				sum[i]=n1+n2+temp;
				temp = 0;
			}
			if(n1+n2+temp>9){
				sum[i]=n1+n2+temp-10;
				temp = 1;
			}
		}
		
		for(int i = 0;i<lenSum;i++){
			if(i==0&&sum[0]==0){
				
			}else{
				System.out.print(sum[i]);
			}

		}
		System.out.println();
		for(int i:sum){
			System.out.print(i);
		}
		
		
	}
}
