package com.GEEtest;
/**
����������������һ��ջ����֪Ԫ�صĽ�ջ���У��ж�һ����ջ������Ԫ����ɵ������Ƿ��ǿ��ܵĳ�ջ���С�
���磬��ջ����Ϊ1 2 3 4������ܵĳ�ջ������4 3 2 1��1 4 3 2�ȡ���1 4 2 3�Ͳ��ǡ�
��������ʽ���ӱ�׼�����ȡ��һ����һ������N��3��N��10����������N��Ԫ�أ����ջ������1 2 3 ���� N��
�ڶ����ǿո�ָ���1~N�����ֵ�һ�����С�
�������ʽ�����׼�����ӡ���������������ǿ��ܵĳ�ջ���У����ӡ��YES����
�����ӡ��NO��������ĩҪ���һ���س�����
������������
3
3 1 2 
�����������
NO
������˵������ջ����Ϊ1 2 3�ĳ�ջ������û��3 1 2

 */
import java.util.Scanner;
import java.util.ArrayList;
public class P_�ж�һ����ջ������Ԫ����ɵ������Ƿ��ǿ��ܵĳ�ջ���� {
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();//�����pop��ȡ������n����ģ�����push����nǰ���ֵ
	
	public static void main(String args[]){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("�����볤��N");
			int N = sc.nextInt();
			System.out.println("�������ջ˳���ÿո����");
			String p = sc.nextLine();//�տո���nextLine
			if(N>10||N<3){
				System.out.println("����N����");
			}else{
				String pp[] = p.split("\\ ");
				
				int push[] = new int[N];
				int pop[] = new int[N];
				for(int i = 0;i<N ;i++){
					push[i]=i+1;
					//pop[i]=Integer.parseInt(pp[i]);
				}
				check(N,push,pop);
			}
		}
	}
	public static void check(int len,int push[],int pop[]){
		for(int i:pop){
			System.out.print(i);
		}
		System.out.println();
		for(int i:push){
			System.out.print(i);
		}
		System.out.println();
		for(int i = 0;i<len;i++){
			int index = 0;
			for(int j = 0;j<len;j++){//�ҵ�n��pop���index
				if(i==pop[j]){
					index = j;
				}
			}
			get(i,index,len,pop);
		}
		
		
	}
	/**
	 * 1 2 3 4
�����ջ˳���ÿո�ָ�
3 2 1 4
	 * @param n
	 * @param index
	 * @param pop
	 */
	//�����pop�е���n�����ֵ
	public static void get(int n,int index,int len,int pop[]){
		for(int i:pop){
			System.out.print(i);
		}
		System.out.println();
		for(int i = index+1;i<len;i++){
			arr.add(i);
		}
		for(Integer i:arr){
			System.out.print(i);
		}
	}
}
