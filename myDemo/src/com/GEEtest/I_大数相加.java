package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��23�� ����4:10:58
* 	��һ�������ж����������и�������ƣ��ָ�����������������Χ��ʮ���������������ͣ�����λ�ļӷ���
* 
*/
import java.util.Scanner;
public class I_������� {
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
	public static void add(String a,String b){//Ϊ����һ��������ת��Ϊ�ַ����飬���Դ���������String
		char s1[]=a.toCharArray();
		char s2[]=b.toCharArray();
		int len1=a.length();
		int len2=b.length();
		int token=0;//��λ���
		int temp1=1;//��¼a�Ѿ���������λ������temp1>len1ʱ��ʣ���λ����0����������
		int temp2=1;//��¼b�Ѿ���������λ��
		int n1=0;
		int n2=0;
		int len=(len1<len2?len2:len1)+1;//�洢��������飬��������ĳ��ȴ�1(��֤��λ)
		int res[]=new int[len];
		for(int i=len-1,j=len1-1,k=len2-1 ;i>=0;i--,j--,k--){//i j k���Ǵ����飨�Ҷ��룬len��������ǰ������Ӳ���¼ÿһλ�Ľ��
			n1=temp1<=len1?(s1[j]-'0'):0;
			n2=temp2<=len2?(s2[k]-'0'):0;//��Ϊ�����ܳ�len�϶��������������ĳ��ȣ���temp����len12��ʱ�򣬼������±���Ǹ�����
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
				token=1;//��λ
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
