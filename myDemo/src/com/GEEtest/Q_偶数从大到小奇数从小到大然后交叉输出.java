package com.GEEtest;
/**
 * ����һ���������飬�����е�ż���Ӵ�С����������С��������
 * Ȼ�󽻲��������һ���������������2018ר˶��
 */
import java.util.Scanner;
public class Q_ż���Ӵ�С������С����Ȼ�󽻲���� {//
	public static void main(String []args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f){
			System.out.println("Input some numbers, split them with ','");
			String s = sc.next();
			if(s.matches("(\\d+\\,)*\\d+")){//˳��н����ԵĲ���[]
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
		 * ȡa[]���ܳ���������ż���鳤
		 * ����cj��co����¼����������Ԫ�ظ��������ʱ��cj��co������߽�
		 */
		int lenS = a.length;
		int j[] = new int[lenS];
		int o[] = new int[lenS];
		int cj = 0;//��������
		int co = 0;//ż������
		for(int i = 0;i<lenS ;i++){//���ս����������ֱ�תΪint������j[],o[]
			if(Integer.parseInt(a[i])%2==0){
				o[co] = Integer.parseInt(a[i]);
				co++;
			}else{
				j[cj] = Integer.parseInt(a[i]);
				cj++;
			}
		}	
		
		boblleSortUp(j);//������С��������

		boblleSortDown(o);//ż���Ӵ�С����

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
		
		//Ȼ�󽻲��������һ�����������ż���Ӵ�С����������С��������
		int jNum = lenS-cj;
		int oNum = 0;
		for(int i = 0;i<=lenS;i++){
			if(i%2==0){//�����������һ�����������
				if(jNum<lenS){
					System.out.print(j[jNum]+"��");
					//System.out.print("----i:"+i);
					//System.out.println("---"+jNum);
					jNum++;
				}
			}else{//�������ż��
				if(oNum<co){
					System.out.print(o[oNum]+"��");
					//System.out.println("i:"+i);
					oNum++;
				}
			}
		}
	}
	public static void boblleSortDown(int arr[]){
		/**
		 * ���� ð������
		 * ��ǰ�������������Ƚϣ�һ�ְ���С��һ���ŵ��������
		 * ÿһ�ֺ�����߽���ǰ��һλ
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
		 * ����
		 * ��ǰ�������������Ƚϣ�һ�ְ�����һ���ŵ��������
		 * ÿһ�ֺ�����߽���ǰ��һλ
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
