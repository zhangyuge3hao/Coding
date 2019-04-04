package com.GEEtest;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月31日 下午3:08:54
* 
* 给定一个整数t，以及n个整数，在这n个整数中找到加和为t的所有组合。
* 思路一：
* 	获取到每一个组合用的数字，和目标数字比较，大于目标数字pass，等于输出
* 		小于目标数字，记下当前数字，和后面的数字相加后与target比较
* 
*/
import java.util.Scanner;
public class J_加和 {
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		int target =0;
		String s[] ={};
		while(true){
			System.out.println("Please input the target number:");
			String tar = sc.next();
			System.out.println("Please input the source number,split it with ','");
			String resour = sc.next();
			if(tar.matches("\\d+")&&resour.matches("(\\d+[\\,])*\\d+")){
				target=Integer.parseInt(tar);
				s =resour.split(",");
				int sn[] = new int[s.length];
				for(int i=0;i<s.length;i++){
					sn[i]=Integer.parseInt(s[i]);
				}
				find(target,sn);
			}else{
				System.out.println("Input illegal");
			}		
		}
	}
	public static void find(int target ,int re[]){//sn中是用来匹配的所有数字
/*		System.out.println("the target:"+target);
		for(int i : sn){
			System.out.println(i);
		}
		
		必须排序，否则
		排序 用于保证备选组中的0和相同数字的组合不被忽略
		
*		for(从头遍历sn中所有数字){
 * 			以当前数字，与target比较，<=即为一种组成序列，
 * 			>target即跳过(不用写)
 * 			=target{
 *				返回当前
 * 			}<target即为一种组成序列{
 * 				当前+向后一位，和target比较
 * 					> 退出
 * 					= 记录输出
 * 					< 再向后加一位
 * 			}
 * 			
		}
		*/
		int sn[] = bobbleSort(re);
		String union ="";//记录每次生成的加和组，便于输出
		int count =0;//记录共有多少成功组
		int sum=0;
		for(int i=0;i<sn.length;i++){

			union="";
			if(sn[i]==target){
				union+="|"+sn[i];
				System.out.println(union);
				count++;
			}else if(sn[i]<target){
				int j=i;//通过j，记录当前数字，并进入比较循环，保护i的在比较循环中不被改变
				boolean flag=true;
				union="";
				sum=0;
				while(flag){//当sum=，>target,或备选组中所有数字相加都<target时，flag=false退出
					sum+=sn[j];
					union+="|"+sn[j];
					if(sum==target){
						System.out.println(union);
						count++;
						flag=false;
					}else if(){
						
					}else if(sum>target){
						flag=false;
					}else if(sum<target&&j==sn.length-1){
						flag=false;
					}else{
						j++;//每次j更新，表示当前sum<target且j<备用组数组边界，用于将下一个数字加入到sum中
					}
				}
			}
		}
		System.out.println("There are "+count+" groups of result.");
	}
	public static int[] bobbleSort(int num[]){//冒泡排序 升序
		int temp = 0;
		int len = num.length;
		while(len>=1){
			for(int i = 0; i<len-1;i++){
				if(num[i]>num[i+1]){
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
			len--;
		}
		for(int n : num){
			System.out.print(n+" ");
		}
		System.out.println();
		return num;
	}
}
