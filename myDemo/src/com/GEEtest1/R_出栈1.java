package com.GEEtest1;
import java.util.Scanner;
public class R_出栈1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入总数：");
		int n =sc.nextInt();
		String notUse =sc.nextLine();
		System.out.println("输入出栈顺序空格分开：");
		String str =sc.nextLine();
		//建立push
		int[] push = new int[n];
		for(int i = 0 ;i<n ;i++){
			push[i] = i+1;
		}
		//建立pop数组
		if(str.matches("(\\d+\\ )+\\d+")){
			String[] p = str.split("\\ ");
			int len = p.length;
			int[] pop = new int[len];
			for(int i = 0 ;i<len ;i++){
				pop[i] = Integer.parseInt(p[i]);
			}
			System.out.print("push:");
			for(int i : push){
				System.out.print(i+"--");
			}
			System.out.println();
			System.out.print("pop:");
			for(int i : pop){
				System.out.print(i+"--");
			}
			System.out.println();
			boolean f = true;
			for(int i = 0;i<n;i++){
				String before = getPush(push,i,n);
				int[] after = getPop(pop,i,n);
				if(!check(after,before)){
					f = false;
					break;
				}
				System.out.print(check(after,before)+"-是否逆序-");
				System.out.println("before:"+before);
				System.out.print("after:");
				for(int j : after){
					System.out.print(j+"--");
				}
				System.out.println();
			}
			if(f){
				System.out.println("OK");
			}else{
				System.out.println("No");
			}
			
		}else{
			System.out.println("输入错误");
		}
	}
	public static boolean check(int[] after,String before){
		boolean f = true;
		int len = after.length;
		int lenA = 0;
		for(int i = 0;i<len;i++){
			if(before.indexOf(String.valueOf(after[i])) != -1){
				lenA++;
			}
		}
		System.out.println("lenA:"+lenA);
		int[] arr = new int[lenA];
		for(int i = 0;i<len;i++){
			if(before.indexOf(String.valueOf(after[i])) != -1){
				arr[i] = after[i];
			}
		}
		System.out.print("arr:");
		for(int i : arr){
			System.out.print(i+"--");
		}
		System.out.println();
		
		for(int i = 0;i<lenA-1;i++){
			if(arr[i]<arr[i+1]){
				f = false;
			}
		}
		return f;
	}
	
	public static String getPush(int[] push,int n,int len){
		int index = 0;
		String before = "";
		for(int i = 0;i<n;i++){
			before += (i+1);
		}
		return before;
	}
	public static int[] getPop(int[] pop,int n,int len){//n 是任意数的下标
		int index = 0;
		for(int i = 0;i<len;i++){
			if((n+1) == pop[i]){
				index = i;//3 2 1 4 
			}
		}
		//System.out.println("index:"+index);
		int count = len-(index+1);
		//System.out.println("count:"+count);
		int[] after = new int[count];
		for(int i = index+1,j = 0;j<count;i++,j++){
			//System.out.println("j"+j+"-i:"+i+"-pop[i]"+pop[i]);
			after[j] = pop[i];
		}
		return after;
	}
}
