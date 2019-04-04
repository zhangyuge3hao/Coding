package com.GEE1917;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年3月22日 下午4:51:06
* 
* 
*/
import java.util.Scanner;
import java.util.ArrayList;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年3月20日 下午5:55:44
* 
* 假设用于通信的电文由N（4<N<30）个字符组成，字符在电文中出现的频度（权值）为W1,W2,,,Wn，
* 试根据权值序列构造哈夫曼树，并计算该树的带权路径长度。(30分）
输入格式：仅一组数据分两行输入、第一行为N的值，第二行为N个整数，以空格间隔，表示数字的出现频度。
输入样例：
8
7 19 2 6 32 3 21 10
出格式：输出带权路径长度，
输出样例：
261

*/

public class Test2_ArrayList {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N");
		int n = sc.nextInt();
		String notUse = sc.nextLine();
		System.out.println("Input numbers split them with space");
		String number = sc.nextLine();
		String[] numb = number.split("\\ ");
		int len = numb.length;
		System.out.println(number+"number---"+len+"len---n"+n);
		
		if(n>=4&&n<30&&n==len&&number.matches("(\\d+\\ )*\\d+")){
			int[] num = new int[len];
			for(int i = 0;i<len ;i++){
				num[i] = Integer.parseInt(numb[i]);
			}
			huofuman(num,len);
		}else{
			System.out.println("Input illegal.");
		}
	}
	static ArrayList<String> rout = new ArrayList<String>();
	static int count = 0;//记录计入rout时，当前元素的标志，用于权值计算
	public static void huofuman(int[] num,int len){//7 19 2 6 32 3 21 10
		/**
		 * 先排序
		 * 将前面两个最小的元素合并为一个后，整理num数组
		 */
		while(len-1>0){
			num = bubbleSort(num,len);
			count++;
			num = cut(num);//取前面两个最小的元素合并为一个后，整理num数组
			
			System.out.print("当前长度："+(len-1)+"--");
			for(int i : num){
				System.out.print(i+" ");
			}System.out.println();
			len--;
		}
	}
	public static int[] cut(int[] num){
		int l = num.length-1;
		int[] temp = new int[l];
		temp[0] = num[0] + num[1];
		for(int i = 1;i<l;i++){
			temp[i] = num[i+1];
		}
		return temp;
	}
	public static int[] bubbleSort(int[] num,int len){
		int temp = 0;
		while(len>0){
			for(int i = 0;i<len-1;i++){
				if(num[i]>num[i+1]){
					temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
				}
			}
			len--;
		}
		return num;
	}
}
