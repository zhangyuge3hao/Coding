package com.GEEtest1;
/*
 * 输入一串整数数组，将其中的偶数从大到小排序，奇数从小到大排序。然后交叉输出（第一个输出奇数）。
 */
import java.util.Scanner;
public class P_交叉输出 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	/*	int[] a = {2,3,1,4,6};
	//	a=bubbleSort(a);
		for(int i : a){
			System.out.println(i);
		}*/
		System.out.println("输入一串整数数组,空格分开");
		String s = sc.nextLine();
		if(s.matches("(\\d+\\ )+\\d+")){
			String[] x = s.split("\\ ");
			getArr(x);
		}else{
			System.out.println("输入错误");
		}
	}
	public static void getArr(String[] x){
		int lenX = x.length;
		int lenO = 0;
		int lenJ = 0;
		for(int i = 0;i<lenX;i++){
			if(Integer.parseInt(x[i])%2==0){
				lenO++;
			}else{
				lenJ++;
			}
		}
		int[] o = new int[lenO];
		int[] j = new int[lenJ];
		for(int i = 0,h = 0,k = 0;i<lenX;i++){
			if(Integer.parseInt(x[i])%2==0){
				if(h<lenO){
					o[h]=Integer.parseInt(x[i]);
					h++;
				}
			}else{
				if(k<lenJ){
					j[k]=Integer.parseInt(x[i]);
					k++;
				}
			}
		}

	/*	for(int i : o){
			System.out.print(i+"--");
		}
		System.out.println();
		for(int i : j){
			System.out.print(i+"--");
		}
		System.out.println("-----");*/
		display(bubbleSortDown(o),bubbleSortUp(j));
	
	}
	public static void display(int[] o,int[] j){//偶数从大到小排序，奇数从小到大排序。然后交叉输出（第一个输出奇数）。
		int lenO = o.length;
		int lenJ = j.length;
		for(int i : o){
			System.out.print(i+"--");
		}
		System.out.println();
		for(int i : j){
			System.out.print(i+"--");
		}
		System.out.println("-----");
		System.out.println("-----");
		for(int i = 0,x = 0,y = 0;i<(lenO+lenJ)*2;i++){//3 12 5 3 7 11 8
			
			if(i%2==0){
				if(x<lenJ){
					System.out.print(j[x]+"--");
					x++;
				}	
			}else{
				if(y<lenO){
					System.out.print(o[y]+"--");
					y++;
				}
			}
		}

	}
	public static int[] bubbleSortUp(int[] a){
		int len = a.length;
		while(len>0){
			int temp = 0;
			for(int i = 0;i<len-1;i++){
				if(a[i]>a[i+1]){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			len--;
		}
		return a;
	}
	public static int[] bubbleSortDown(int[] a){
		int len = a.length;
		while(len>0){
			int temp = 0;
			for(int i = 0;i<len-1;i++){
				if(a[i]<a[i+1]){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			len--;
		}
		return a;
	}
}
