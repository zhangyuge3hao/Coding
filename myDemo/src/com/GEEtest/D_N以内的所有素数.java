package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��18�� ����11:31:43
* 
* 
*/
import java.util.Scanner;
public class D_N���ڵ��������� {
	public static void main(String[]  args){
		Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println("Please input some number bigger than 2");//�����������2����ֻ��1�ͱ�������Լ��
			String n=sc.next();
			if(n.matches("\\d+")&&Integer.parseInt(n)>=2){
				check(Integer.parseInt(n));
			}else{
				System.out.println("Input illegal");
			}
		}
	}
	//�ж������ķ�������һ����n����2������n֮��������������޷�������n��Ϊ������Ҳ������
	public static void check(int num){
		boolean flag=true;
		int temp=2;
		int count =0;
		while(temp<=num){
			int limit =(int)Math.sqrt(temp);
			for(int i=2;i<=limit;i++){
				if(temp%i==0){
					flag=false;
					i=limit+1;
				}else{
					flag=true;
				}
			}
			if(flag){
				System.out.println(temp+"������");
				count++;
			}
			temp++;
		}
		System.out.println("2��"+num+"�й���"+count+"������");
	}
}
