package com.sort;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��22�� ����11:51:04
* ��������Ļ���˼�룺ͨ��һ�����򽫴��ż�¼�ָ��ɶ����������֣�����һ���ּ�¼�Ĺؼ��־�����һ���ֵĹؼ���С����ɷֱ���������ּ�¼�������������Դﵽ������������

6.1 �㷨����
��������ʹ�÷��η�����һ������list����Ϊ�����Ӵ���sub-lists���������㷨�������£�

������������һ��Ԫ�أ���Ϊ ����׼����pivot����
�����������У�����Ԫ�رȻ�׼ֵС�İڷ��ڻ�׼ǰ�棬����Ԫ�رȻ�׼ֵ��İ��ڻ�׼�ĺ��棨��ͬ�������Ե���һ�ߣ�������������˳�֮�󣬸û�׼�ʹ������е��м�λ�á������Ϊ������partition��������
�ݹ�أ�recursive����С�ڻ�׼ֵԪ�ص������кʹ��ڻ�׼ֵԪ�ص�����������
* �ص㣺��Ч��ʱ�临�Ӷ�Ϊnlogn��
���÷��η���˼�룺��������һ����ֵpivot��Ȼ���������ֵΪ���ֻ�׼�����������зֳɱ�pivot��ͱ�pivotС�������֣��������Ի�����������н��п���ֱ��������Ϊһ��Ԫ��Ϊֹ��

*/
public class ��������QuickSort {
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
