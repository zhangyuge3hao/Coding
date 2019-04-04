package com.GEEtest1;
/**
 * 1 生成int的push 和pop数组
 * 2 对push循环，每次循环的元素看做一个检查位，进行判断，所有检查位都为逆序，输出OK
 * 3 根据检查位n：生成String before（push中n前面的元素）、in[] after（pop中n后面的）
 * 4 用after中的每一个元素，去before里indexOf，==-1（能找到，count++），！=-1，找不到，记为0
 * 5 用after中，非0元素建立sort数组，判断是否逆序
 */
import java.util.Scanner;
public class R_出栈 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入长度");
		int n = sc.nextInt();
		String noruse = sc.nextLine();
		System.out.println("输入出栈顺序，空格隔开");
		String s = sc.nextLine();
		int[] push = new int[n];
		for(int i = 0 ;i<n ;i++){
			push[i] = i+1;
		}
		String[] p = s.split("\\ ");
		
		int lpop = p.length;
		int[] pop = new int[lpop];
		for(int i = 0 ;i<lpop ;i++){
			pop[i] = Integer.parseInt(p[i]);;
		}//数组准备完毕
		
		for(int i:push){
			System.out.print(i+"--");
		}
		System.out.println();
		for(int i:pop){
			System.out.print(i+"--");
		}
		
		boolean f = true;
		for(int i = 0; i<n;i++){
			String before = getBefore(i,push);
			int[] after = getAfter(i,push,pop,n);
			
			System.out.println("before:"+before);
			System.out.print("after:");
			for(int j:after){
				System.out.print(j+"--");
			}
			System.out.println();
			if(check(before,after)){
				
			}else{
				f = false;
				break;
			}
		}
		if(f){
			System.out.println("逆序,OK");
		}else{
			System.out.println("NO");
		}
		
	}
	public static boolean check(String before ,int[] after){
		int lenA = after.length;
		int lenN = 0;
		for(int i =0;i<lenA ;i++){
			if(before.indexOf(String.valueOf(after[i])) != -1){
				lenN++;
			}else{
				after[i] = 0;
			}
		}
		System.out.println("lenN:"+lenN);
		int[] sort = new int[lenN];
		for(int i =0,j = 0;i<lenA ;i++){
			if(after[i] != 0){
				sort[j] = after[i];
				j++;
			}
		}
		System.out.print("sort:");
		for(int i:sort){
			System.out.print(i+"--");
		}
		boolean f = true;
		for(int i = 0;i<lenN-1;i++){
			if(sort[i]<sort[i+1]){
				f = false;
				break;
			}
		}
		
		return f;
	}
	public static String getBefore(int n,int[] push){
		int[] before = new int[n];
		String be = "";
		for(int i = 0;i<n;i++){
			before[i] = push[i];
			be += push[i];
		}
		return be;
	}
	public static int[] getAfter(int n,int[] push,int[] pop,int len){
		//先得到n在pop里的下标
		int index = 0;
		for(int i = 0;i<len;i++){
			if((n+1) == pop[i]){
				index = i;
			}
		}
		System.out.println();
		System.out.println("push中下标："+n+" pop:"+index);
		//用n在pop里的下标
		int lenA = len-(index+1);
		int[] after = new int[lenA];
		for(int i = index+1,j = 0;i<len;i++,j++){
			after[j] = pop[i];
		}
		return after;
	}
}
