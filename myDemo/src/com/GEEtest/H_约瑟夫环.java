package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月22日 下午4:53:16
* 
* 通过输入的：元素总数n，开始位置m，退出tocken k，给出约瑟夫环输出顺序
* 	思路：1，总数n是多少就建立多长的数组，让下标记录元素编号
* 		2，使用if(i=n-1)i=-1,让一个for循环多次遍历全部元素，且避开取余操作
* 		3，让元素内容作为判断条件，退出的元素赋值-1，并不在进入
* 		4，temp记录上一个人报的数，当前元素退出循环时清空temp=-1，保证退出口令的循环
*/
import java.util.Scanner;
public class H_约瑟夫环 {
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		int n=0,m=0,k=0;
		while(true){
			System.out.println("请输入总数n，开始索引m(开始人的编号)，退出口令k（报这个数字的人退出），并用.区分");
			String s=sc.next();
			if(s.matches("\\d+[\\.]\\d+[\\.]\\d+")){
				String input[]=s.split("\\.");
				n=Integer.parseInt(input[0]);
				m=Integer.parseInt(input[1]);
				k=Integer.parseInt(input[2]);
				if(m<=n&&k<=n){
					yuesefu(n,m,k);
				}else{
					System.out.println("Input illegal");
				}
			}else{
				System.out.println("Input illegal");
			}
		}
	}
	public static void yuesefu(int n,int m,int k){
		//按n，m建立循环19.5.3
		int temp =0;//记录上个人报的数
		int check=0;//记录退出循环个数
		int ysf[] = new int[n];// 新建无数据默认是0
		String s = "";
		for (int i = (m-1); check < n; i++) {//从m对应的下标m-1开始，check（已报数人数）=n 时（所有人都报数了）退出（因写死了i始终在0到n-1之间循环）
			if (ysf[i] != -1) {// 只有有效玩家可参与
				if (temp == (k - 1)) {// 上个人报的数比退出口令小1，这个人就要退出循环
					ysf[i] = -1;
					s = s + "|" + (i + 1);
					check++;
					temp = -1;
				} else {
					ysf[i] = temp;
				}
				temp++;//当前回合报数
			}
			if (i == (n - 1)) {// 在最后，保障一轮一轮遍历循环
				i = -1;
			}
		}
		String res[]=s.split("\\|");
		System.out.println("输出顺序："+s+"---最后一个输出的是剩下的是："+res[n]);
	}
}
