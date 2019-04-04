package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ����_Yu Zhang E-mail:zy1128zy@163.com
 * @version ����ʱ�䣺2019��2��20�� ����11:34:07
 * 
 * 
 */
public class ������ {
	public static void main(String [] args){

		int[] a = { 2, 6, 1, 7, 4, 9 };
		final int SUM = 20;
		ArrayList<String> x = findExp(a, SUM);
		for (String s : x) {
			System.out.println(s);
		}
	}

	private static ArrayList<String> findExp(int[] a, final int SUM) {
		ArrayList<String> result = new ArrayList<String>(); // ��ŵ��������ҵ��ı��ʽ
		Arrays.sort(a); // �Գ�ʼ���ݽ������򣬱����㷨��ʵ��
		ArrayList<Integer> l = new ArrayList<Integer>(); // ��ŵ��ǵ�ǰ�ҵ��ĺϷ���Ԫ�أ���ЩԪ�صĺ�С��SUM
		find(a, SUM, 0, l, result); // ͨ���ݹ�ķ�ʽ���в���
		return result;
	}

	// �ݹ麯����ÿһ�εĶ����ܼ򵥣�
	// ���Ѿ��ҵ���n��Ԫ�صĻ����ϣ�Ѱ�ҵ�n+1��Ԫ�أ�
	private static void find(int[] a, final int SUM, int cur, ArrayList<Integer> l, ArrayList<String> result) {
		int beg = l.size() == 0 ? 0 : l.get(l.size() - 1) + 1; // ��ǰԪ�صĲ��ҷ�Χ����ʼλ��
		for (int i = beg; i < a.length; i++) { // ����ʼλ�õ�����λ�ã����Һ��ʵ�Ԫ��
			cur += a[i]; // ��ǰ��Ԫ�صĺ͵Ļ����ϣ����ϵ�ǰԪ��
			if (cur < SUM) { // �����ȻС��SUM��֤����ǰԪ��(��n+1��)�Ϸ�������Ѱ�ҵ�n+2��Ԫ��
				l.add(i);
				find(a, SUM, cur, l, result);
				cur -= a[i]; // ������i��Ԫ�ص�Ӱ�죬Ϊ�������i+1��Ԫ����׼��
				l.remove(l.size() - 1); // ������i��Ԫ�ص�Ӱ�죬Ϊ�������i+1��Ԫ����׼��
			} else if (cur == SUM) { // �������SUM��֤���ҵ��˱��ʽ
				StringBuilder s = new StringBuilder();
				for (int x : l) { // ������ʽ��������result
					s.append(a[x]);
					s.append(" + ");
				}
				s.append(a[i]);
				s.append(" = ");
				s.append(SUM);
				result.add(s.toString());

				break; // ���ݵ���һ��״̬
			} else { // �������SUM��Ҳ���ݵ���һ��״̬
				break;
			}
		}
	}
}
/*
 * static int[] flag = new int[100]; static int index = 0;// ��¼��ǰ
 * 
 * public static void numGroup(int[] arr, int start, int length, int sum) { if
 * (sum == 0) { for (int j = 0; j < index; j++) { System.out.print(flag[j]+"   "
 * +index); } System.out.println(); } else { for (int i = start; i < length;
 * i++) { flag[index++] = arr[i];
 * TestStockOriginalOccupationService.numGroup(arr, i + 1, length-1, sum -
 * arr[i]); } } index--; } public static void main(String[] args) { int[] arr =
 * { 1, 3, 2, 4, 5, 6, 7, 8, 9,10,44,55,66 }; Arrays.sort(arr); int sum = 7; }
 * 
 * public static void main(String[] args) { int[] keys = { 1, 2, 3, 4, 5, 6, 7,
 * 121, 154, 156465, 154, 4564, 1564, 121, 11 }; getNum(keys, 11); }
 * 
 * public static void getNum(int[] keys, int kill) { int n = keys.length; int
 * nbit = 1 << n; int in; int list[] = new int[keys.length]; for (int i = 0; i <
 * nbit; i++) { in = 0; for (int j = 0; j < n; j++) { int tmp = 1 << j; //
 * ��0��n����λ if ((tmp & i) != 0) { // �����㣬ͬΪ1ʱ�Ż���1 in += keys[j];
 * list.add(keys[j]); } } if (in == kill) for(int s : list){
 * System.out.println(s); }; } for(int s : list){ System.out.println(s); }; }
 */
