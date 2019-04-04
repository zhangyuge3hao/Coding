package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月18日 上午11:31:43
* 
* 
*/
import java.util.Scanner;
public class D_N以内的所有素数 {
	public static void main(String[]  args){
		Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println("Please input some number bigger than 2");//质数必须大于2，且只有1和本身两个约数
			String n=sc.next();
			if(n.matches("\\d+")&&Integer.parseInt(n)>=2){
				check(Integer.parseInt(n));
			}else{
				System.out.println("Input illegal");
			}
		}
	}
	//判断素数的方法：当一个数n，对2到根号n之间的所有整数都无法整除，n即为素数，也即质数
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
				System.out.println(temp+"是质数");
				count++;
			}
			temp++;
		}
		System.out.println("2到"+num+"中共有"+count+"个质数");
	}
}
