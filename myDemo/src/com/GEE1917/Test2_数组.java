package com.GEE1917;
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
import java.util.Scanner;
public class Test2_数组 {
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
			String[] num = new String[len];
			/**
			 * 在计算权值的时候，需要区分元素来自原始数组还是计算所得。故在生成数组中，在原始数据后添加+标记,用.分割，在计算数据后添加-标记,用.分割。
			 */
			for(int i = 0;i<len ;i++){
				num[i] = (numb[i])+".+";
			}
			huofuman(num,len);
			outRout();
		}else{
			System.out.println("Input illegal.");
		}
	}
	static ArrayList<String> rout = new ArrayList<String>();
	static int count = 1;//记录计入rout时，当前元素的标志，用于权值计算
	public static void outRout(){
		int sum = 0;
		int len = rout.size();
		for(String s : rout){
			String[] temp = s.split("\\.");
			sum += Integer.parseInt(temp[0])*(len-Integer.parseInt(temp[1]));
		}
		System.out.println("带权路径长度为："+sum);
	}
	public static void huofuman(String[] num,int len){//7 19 2 6 32 3 21 10
		/**
		 * 先排序
		 * 将前面两个最小的元素合并为一个后，整理num数组
		 */
		while(len-1>0){
			num = bubbleSort(num,len);
			
			num = cut(num);//取前面两个最小的元素合并为一个后，整理num数组
			
			System.out.print("当前长度："+(len-1)+"--");
			for(String i : num){
				System.out.print(i+" ");
			}System.out.println();
			len--;
		}
	}
	public static String[] cut(String[] num){
		String[] aS = num[0].split("\\.");
		int aN = Integer.parseInt(aS[0]);
		if(aS[1].equals("+")){
			rout.add(aS[0]+"."+count);
		}
		String[] bS = num[1].split("\\.");
		int bN = Integer.parseInt(bS[0]);
		if(bS[1].equals("+")){
			rout.add(bS[0]+"."+count);
		}
		count++;//每一次取出num中的数字相加，就相当于确定了两个num中数字的权值标志。若该数字标志为+是原始数字，则记录其值和权值标志到rout，用以计算路径长度
		
		int l = num.length-1;
		String[] temp = new String[l];
		temp[0] = String.valueOf(aN + bN)+".-";
		for(int i = 1;i<l;i++){
			temp[i] = num[i+1];
		}
		return temp;
	}
	public static String[] bubbleSort(String[] num,int len){
		String temp ;
		while(len>0){
			for(int i = 0;i<len-1;i++){
				if(ifBig(num[i],num[i+1])){
					temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
				}
			}
			len--;
		}
		return num;
	}
	public static boolean ifBig(String a,String b){
		boolean flag = true;
		String[] aS = a.split("\\.");
		String[] bS = b.split("\\.");
		int aN = Integer.parseInt(aS[0]);
		int bN = Integer.parseInt(bS[0]);
		if(aN>bN){
			return true;
		}else{
			return false;
		}
	}
}
