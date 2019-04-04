package com.GEEtest;

import java.util.ArrayList;
import java.util.Arrays;

public class j_2 {
	public static void main(String[] args) {
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
	} // �ݹ麯����ÿһ�εĶ����ܼ򵥣�
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
				break; // ���ݵ���һ��״̬ }else { //�������SUM��Ҳ���ݵ���һ��״̬ break; } } }}
			}
		}
	}
}
