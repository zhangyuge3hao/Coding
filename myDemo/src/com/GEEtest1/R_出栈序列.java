package com.GEEtest1;
import java.util.ArrayList;
/**
 * ���磬��ջ����Ϊ1 2 3 4������ܵĳ�ջ������4 3 2 1��1 4 3 2�ȡ���1 4 2 3�Ͳ��ǡ�
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
�����ֱ�׼�������ȫ��ȷ��20�֣�ÿ�����Ե�4�֡��ϴ�c����Դ����Ϊoutstack.c��

�жϱ�׼����ջ�����У�Ԫ��i֮�����б�iС��Ԫ�ؼ�����ǽ������еġ�
 */
import java.util.Scanner;
public class R_��ջ���� {
	public static void main(String[] args){
		int[] pop = {3,2,1,4,5};
		int[] push = {1,2,3,4,5};
		int n=5;
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] push = new int[n];
		for(int i = 0;i<n;i++){
			push[i] = i+1;
		}
		
		String notuse = sc.nextLine();
		String s = sc.nextLine();
		String[] p = s.split("\\ "); 
		
		int len = p.length;
		int[] pop = new int[len];
		for(int i = 0;i<len;i++){
			pop[i] = Integer.parseInt(p[i]);
		}//����׼�����
*/		
		//int t = 3;//��ǰ�ж���
		for(int i = 0;i<n;i++){
			handle(push,pop,i,n);
		}
		
		
		
		for(int i :pop){
			System.out.print(i);
		}
		System.out.println();
		for(int i :push){
			System.out.print(i);
		}
	}
	public static void handle(int[] push,int[] pop,int t,int n){
		//Ѱ��t��pop����������飬����push��tǰ���������
		//t��push�е��±�
		int tpush = 0;
		for(int i = 0; i<n;i++){
			if(t==push[i]){
				tpush = i;
			}
		}
		//t��pop�е��±�s
		int tpop = 0;
		for(int i = 0; i<n;i++){
			if(t==pop[i]){
				tpop = i;
			}
		}
		//t��pop�У��±�tpop���滹�м���Ԫ�أ�
		int lt = n-(tpop+1);
		int[] remin = new int[lt];
		
		System.out.println("t��push�е��±�tpush:"+tpush+"--t��pop�е��±�stpop:"+tpop);
		//t��pop���Ԫ��
		for(int i = tpop+1,j = 0; i<n;i++,j++){
			remin[j]=pop[i];
		}
		//t��pushǰ��Ԫ��
		String tpushB = "";
		for(int i = 0; i<tpush;i++){
			tpushB+=push[i];
		}
		
		getElem(tpushB,remin);
	}
	public static void getElem(String tpushB,int[] spop){
		for(int i:spop){
			System.out.print(i+"--");
		}
	System.out.println("   t��pushǰ��Ԫ��tpushB:"+tpushB);
		int len = spop.length;
		for(int i =0 ;i<len;i++){
			if(tpushB.indexOf(String.valueOf(spop[i]))==-1){
				spop[i] = 0;
			}
		}
		for(int i:spop){
			System.out.print(i+"--");
		}
		boolean f = true;
		for(int i =0 ;i<len-1;i++){
			if(spop[i]<spop[i+1]){
				f = false;
				break;
			}
		}
		if(f){
			System.out.println("����");
		}else{
			System.out.println("������");
		
		System.out.println("spop:"+spop.toString()+"--tpushB:"+tpushB);
		}
	}
}
