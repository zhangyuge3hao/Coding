package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��18�� ����3:19:55
* 
* 
*/
import java.util.Scanner;

public class F_������������� {
	public static void main(String [] args){
/*	�ؾ��ѹ�ʽ
  		���������߳��ֱ�Ϊabc�����ΪS�����ܳ�Ϊm=(a+b+c)/3
		S=������m*(m-a)*(m-b)*(m-c)
*/	Scanner sc= new Scanner(System.in);
		while(true){
			System.out.println("type a b c,and split them with .");
			String s=sc.next();
			
			if(s.matches("\\d+[.]\\d+[.]\\d+")){

				String str[]=s.split("\\.");
/*				for(String ss:str){
					System.out.println(ss);
				}*/
				int a=Integer.parseInt(str[0]);
				int b=Integer.parseInt(str[1]);
				int c=Integer.parseInt(str[2]);
				double m=(a+b+c)/2;
				System.out.println("����ǣ�"+Math.sqrt(m*(m-a)*(m-b)*(m-c)));
			}else{
				System.out.println("Input illegal");
			}
		}
		
	}
}
