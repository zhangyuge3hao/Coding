package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
 * @version 创建时间：2019年2月20日 上午11:34:07
 * 
 * 
 */
public class 简单排序 {
	public static void main(String [] args){

		int[] a = { 2, 6, 1, 7, 4, 9 };
		final int SUM = 20;
		ArrayList<String> x = findExp(a, SUM);
		for (String s : x) {
			System.out.println(s);
		}
	}

	private static ArrayList<String> findExp(int[] a, final int SUM) {
		ArrayList<String> result = new ArrayList<String>(); // 存放的是所有找到的表达式
		Arrays.sort(a); // 对初始数据进行排序，便于算法的实现
		ArrayList<Integer> l = new ArrayList<Integer>(); // 存放的是当前找到的合法的元素，这些元素的和小于SUM
		find(a, SUM, 0, l, result); // 通过递归的方式进行查找
		return result;
	}

	// 递归函数，每一次的动作很简单，
	// 在已经找到的n个元素的基础上，寻找第n+1个元素，
	private static void find(int[] a, final int SUM, int cur, ArrayList<Integer> l, ArrayList<String> result) {
		int beg = l.size() == 0 ? 0 : l.get(l.size() - 1) + 1; // 当前元素的查找范围的起始位置
		for (int i = beg; i < a.length; i++) { // 从起始位置到结束位置，查找合适的元素
			cur += a[i]; // 在前面元素的和的基础上，加上当前元素
			if (cur < SUM) { // 如果仍然小于SUM，证明当前元素(第n+1个)合法，继续寻找第n+2个元素
				l.add(i);
				find(a, SUM, cur, l, result);
				cur -= a[i]; // 消除第i个元素的影响，为了试验第i+1个元素做准备
				l.remove(l.size() - 1); // 消除第i个元素的影响，为了试验第i+1个元素做准备
			} else if (cur == SUM) { // 如果等于SUM，证明找到了表达式
				StringBuilder s = new StringBuilder();
				for (int x : l) { // 构造表达式，并存入result
					s.append(a[x]);
					s.append(" + ");
				}
				s.append(a[i]);
				s.append(" = ");
				s.append(SUM);
				result.add(s.toString());

				break; // 回溯到上一个状态
			} else { // 如果大于SUM，也回溯到上一个状态
				break;
			}
		}
	}
}
/*
 * static int[] flag = new int[100]; static int index = 0;// 记录当前
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
 * 由0到n右移位 if ((tmp & i) != 0) { // 与运算，同为1时才会是1 in += keys[j];
 * list.add(keys[j]); } } if (in == kill) for(int s : list){
 * System.out.println(s); }; } for(int s : list){ System.out.println(s); }; }
 */
