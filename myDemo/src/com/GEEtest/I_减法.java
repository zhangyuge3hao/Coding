package com.GEEtest;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��30�� ����4:11:38
* 
* 
*/
public class I_���� {
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
		int sign=0;//С����ȥ����    = ������ȥС��*-1
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
		int res[] = new int[len1]; //����ĳ���һ��С��max�ĳ��ȣ������ڶ�λ�����У���������λ��������ֻ�м������ܻ����
		int token=0;//��λ���
		int tempNin=1;//С���Ĳ�������λ��
		int minus=0;
		int subtractor=0;//�����жϲ���¼����λ������ʱ������Ӧ��ȡ��ֵ

		for(int i=len1-1,j=len1-1,k=len2-1;i>=0;i--,j--,k--){//i���������res[]��   j:��������s1[]��   k:��������s2[]
			if(tempNin<=len2){
				subtractor=s2[k]-'0';
			}else{
				subtractor=0;
			}
			minus=s1[j]-'0';
			if((minus-token)<subtractor){//��������ȥ���λ��С�ڼ���������ǰλ������������Ҫ����һλ��1
				res[i]=minus-token+10-subtractor;//����һλ��1 ��+10
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
