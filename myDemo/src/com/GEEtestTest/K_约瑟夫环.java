package com.GEEtestTest;
/*	
约瑟夫环运作如下：
1、一群人围在一起坐成环状（如：N）
2、从某个编号开始报数（如：K）
3、数到某个数（如：M）的时候，此人出列，下一个人重新报数
4、一直循环，直到所有人出列，约瑟夫环结束
*/
import java.util.Scanner;
public class K_约瑟夫环 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入总人数n、开始报数的人k、报到数字m退出，用空格分开");
		String s = sc.nextLine();
		if(s.matches("\\d+\\ \\d+\\ \\d+")){
			String[] input = s.split("\\ ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			int m = Integer.parseInt(input[2]);
			if(k<n&&m<n){
				yuesefu(n,k,m);
			}else{
				System.out.println("输入错误");
			}
		}else{
			System.out.println("输入错误!");
		}
	}
	public static void yuesefu(int n,int k,int m){
		/**
		 * 数组中存-1表示已经退出游戏，失去资格，有资格的玩家才能进如游戏
		 * 不用取余循环，for中当玩家退出个数=总数-1的时候游戏结束
		 * i++正常，在循环中当i=n-1时，强制转回-1
		 * 玩家编号就是数组下标号+1
		 */
		System.out.println("总人数："+n+"--开始报数的人："+k+"报到数字m退出："+m);
		int[] play = new int[n];
		int out = 0;//退出总数
		int num = 0;//上一个玩家报的数(因为对第一个人来说，上一个报数的是0)，当num=m-1，当前玩家退出
		for(int i = k-1;out < n;i++){
			if(play[i]!=-1){//判断资格
				if(num == m-1){
					play[i] = -1;
					num = 0;
					out++;
					System.out.println((i+1)+"退出");
				}else{
					num++;
				}
			}
			if(i == n-1){
				i=-1;//for决定了后面还有个i++，回到0，从第一个人开始
			}
		}
		System.out.println("退出人数："+out);
	}
}
