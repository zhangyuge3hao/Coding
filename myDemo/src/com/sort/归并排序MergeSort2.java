package com.sort;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��22�� ����11:51:04
* 
* �鲢�����ǽ����ڹ鲢�����ϵ�һ����Ч�������㷨�����㷨�ǲ��÷��η���Divide and Conquer����һ���ǳ����͵�Ӧ�á���������������кϲ����õ���ȫ��������У�����ʹÿ��������������ʹ�����жμ������������������ϲ���һ���������Ϊ2-·�鲢�� 

5.1 �㷨����
�ѳ���Ϊn���������зֳ���������Ϊn/2�������У�
�������������зֱ���ù鲢����
����������õ������кϲ���һ�����յ��������С�

*/
public class �鲢����MergeSort2 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int [] a = {10};
		boolean flag = true;
		while(flag){
			System.out.println("Please input the numbers for InsertionSort,and split them with ','.Input # to stiop the progarm");
			String s = sc.next();
			if(s.matches("(\\d+\\,)*\\d+")){
				String []num = s.split("\\,");
				int len = num.length;
				int n[] = new int[len];
				for(int i = 0;i < len ;i++){
					n[i] = Integer.parseInt(num[i]);
				}
				//InsertionSort(n,len,a);
				quickSort(n,0,len-1);//ͬһ�����飬�ڷ����д��ݣ���ֱ�Ӹı������е�ֵ����int ֮��Ĳ����ǲ���ı��
			}else if(s.equals("#")){
				System.out.println("Input abort.");
				flag = false;
			}else{
				System.out.println("Input illegal.");
			}
		}
	}
	public static void quickSort(int array[], int low, int high) {// ����low=0��high=array.length-1;
		int pivot, p_pos, i, t;// pivot->λ����;p_pos->��ֵ��
		if (low < high) {
			p_pos = low;
			pivot = array[p_pos];
			for (i = low + 1; i <= high; i++)
				if (array[i] > pivot) {
					p_pos++;
					t = array[p_pos];
					array[p_pos] = array[i];
					array[i] = t;
				}
			t = array[low];
			array[low] = array[p_pos];
			array[p_pos] = t;
			// �ֶ���֮
			quickSort(array, low, p_pos - 1);// ������벿��
			quickSort(array, p_pos + 1, high);// �����Ұ벿��
		}
	}
}
