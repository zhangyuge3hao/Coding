package com.GEE1917;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��20�� ����5:48:09
* 
* ����K������{N1��N2������NK},���������������пɱ�ʾΪ{Ni��Ni+1������Nj}��1<i<j<=K���������������������������������Ԫ�غ�����һ����
* �����������{-2,11,-4,13,-5,-2},�������������Ϊ{11,-4,13}������Ϊ20��������������еĵ�һ�������һ��Ԫ�أ��Լ����������и������ĺ�ֵ����30�֣�

�����ʽ��������������ɲ���������ÿ����������ռ2�У���һ��Ϊ����K��<10000��,�ڶ���ΪK���������м��ÿո�ָ��KΪ��ʱ�������������������������

�����ʽ����ÿ������������һ����������ͣ�������������е�һ�������һ��Ԫ�أ��м��ÿո�ָ������������������в�Ψһ����������i��j��С��Ү����
������K��Ԫ�ض�Ϊ����������������Ϊ0������������е���βԪ�⡣


* 
*/
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input K");
		int k = sc.nextInt();
		String notUse = sc.nextLine();
		System.out.println("Input numbers,split it with space");
		String s = sc.nextLine();
		if(k<10000&&k>0&&s.matches("(\\d+\\ )+\\d+")){
			System.out.println("Ok");
			String[] n =s.split("\\ ");
			int len = n.length;
			int[] num = new int[len];
			boolean flag = false;
			for(int i = 0;i<len;i++){
				num[i] = Integer.parseInt(n[i]);
				if(num[i]>=0){
					flag = true;
				}
			}
			if(flag){
				getLong(num);
			}else{
				System.out.println("K��Ԫ�ض�Ϊ����������������Ϊ0");
				System.out.println(num[0]+"---"+num[len-1]);
			}
		}else{
			System.out.println("Input illegal.");
		}
	}
	public static void getLong(int[] num){
		
	}
}
