package com.GEEtest;
/**
 * 输入一串整数数组，将其中的偶数从大到小排序，奇数从小到大排序。
 * 然后交叉输出（第一个输出奇数）。（2018专硕）
 */
import java.util.Scanner;
public class Q_偶数从大到小奇数从小到大然后交叉输出 {//
	public static void main(String []args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("Input some numbers, split them with ','");
			String s = sc.next();
			if(s.matches("(\\d+\\,)*\\d+")){//顺序承接明显的不用[]
				String a[] = s.split("\\,");
				getR(a);
				System.out.println();
			}else{
				System.out.println("input illegal");
			}
		}
	}
	
	public static void getR(String a[]){
		/**
		 * 取a[]的总长来定义奇偶数组长
		 * 加入cj、co来记录放入就数组的元素个数，输出时用cj、co来定义边界
		 */
		int lenS = a.length;
		int j[] = new int[lenS];
		int o[] = new int[lenS];
		int cj = 0;//奇数总数
		int co = 0;//偶数总数
		for(int i = 0;i<lenS ;i++){//将收进来的数，分别转为int并发给j[],o[]
			if(Integer.parseInt(a[i])%2==0){
				o[co] = Integer.parseInt(a[i]);
				co++;
			}else{
				j[cj] = Integer.parseInt(a[i]);
				cj++;
			}
		}	
		
		boblleSortUp(j);//奇数从小到大排序

		boblleSortDown(o);//偶数从大到小排序

		out(o,co,j,cj,lenS);
	}
	public static void out(int o[],int co,int j[],int cj,int lenS){
		for(int i : o){
			System.out.print(i);
		}
		System.out.println("---"+co);
		for(int i : j){
			System.out.print(i);
		}
		System.out.println("---"+cj);//6,3,8,4,0,1,5
		System.out.println("lenS---"+lenS);
		
		//然后交叉输出（第一个输出奇数）偶数从大到小排序，奇数从小到大排序
		int jNum = lenS-cj;
		int oNum = 0;
		for(int i = 0;i<=lenS;i++){
			if(i%2==0){//输出奇数（第一个输出奇数）
				if(jNum<lenS){
					System.out.print(j[jNum]+"、");
					//System.out.print("----i:"+i);
					//System.out.println("---"+jNum);
					jNum++;
				}
			}else{//输出奇数偶数
				if(oNum<co){
					System.out.print(o[oNum]+"、");
					//System.out.println("i:"+i);
					oNum++;
				}
			}
		}
	}
	public static void boblleSortDown(int arr[]){
		/**
		 * 降序 冒泡排序
		 * 从前往后两个两个比较，一轮吧最小的一个放到数组最后
		 * 每一轮后数组边界往前移一位
		 */
		int len = arr.length;
		int temp = 0;
		while(len>0){
			for(int i = 0;i<len-1;i++){
				if(arr[i]<arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			len--;
		}
	}
	public static void boblleSortUp(int arr[]){
		/**
		 * 升序
		 * 从前往后两个两个比较，一轮吧最大的一个放到数组最后
		 * 每一轮后数组边界往前移一位
		 */
		int len = arr.length;
		int temp = 0;
		while(len>0){
			for(int i = 0;i<len-1;i++){
				if(arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			len--;
		}
	}

}
