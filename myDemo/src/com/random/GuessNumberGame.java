package com.random;

import java.util.Random;
import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月8日 下午9:52:42
* 
* 	系统产生一个[1,100]的随机数，猜对它~
*/
public class GuessNumberGame {
	public static void main(String[] args) {
		/*---------产生一个随机数---------*/
		Random ra = new Random();
		int number = ra.nextInt(100);
		//System.out.println("随机数是："+number);
		
		/*---------输入数字,直到猜中为止---------*/
		while(true){
			System.out.println("请输入一个[1,100]内的数字：");
			Scanner sc = new Scanner(System.in);
			int get_number =sc.nextInt();
			/*---------判断---------*/
			if(get_number>number){
				System.out.println("抱歉，猜大了");
			}else if(get_number<number){
				System.out.println("抱歉，猜小了");
			}else{
				System.out.println("恭喜猜中了");
				break;
			}
		}
		
	}
}
