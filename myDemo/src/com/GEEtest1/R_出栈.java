package com.GEEtest1;
/**
 * 1 ����int��push ��pop����
 * 2 ��pushѭ����ÿ��ѭ����Ԫ�ؿ���һ�����λ�������жϣ����м��λ��Ϊ�������OK
 * 3 ���ݼ��λn������String before��push��nǰ���Ԫ�أ���in[] after��pop��n����ģ�
 * 4 ��after�е�ÿһ��Ԫ�أ�ȥbefore��indexOf��==-1�����ҵ���count++������=-1���Ҳ�������Ϊ0
 * 5 ��after�У���0Ԫ�ؽ���sort���飬�ж��Ƿ�����
 */
import java.util.Scanner;
public class R_��ջ {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���볤��");
		int n = sc.nextInt();
		String noruse = sc.nextLine();
		System.out.println("�����ջ˳�򣬿ո����");
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
		}//����׼�����
		
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
			System.out.println("����,OK");
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
		//�ȵõ�n��pop����±�
		int index = 0;
		for(int i = 0;i<len;i++){
			if((n+1) == pop[i]){
				index = i;
			}
		}
		System.out.println();
		System.out.println("push���±꣺"+n+" pop:"+index);
		//��n��pop����±�
		int lenA = len-(index+1);
		int[] after = new int[lenA];
		for(int i = index+1,j = 0;i<len;i++,j++){
			after[j] = pop[i];
		}
		return after;
	}
}
