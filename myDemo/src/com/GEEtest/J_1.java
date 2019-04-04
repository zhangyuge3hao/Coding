package com.GEEtest;
import java.util.ArrayList;
import java.util.List;
public class J_1 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,9};
		List<Integer> lst = new ArrayList<Integer>();
		new J_1().add(arr, 20, 5, lst);
		}
		/**
		* @param arr 目标数组
		* @param target 需要求和的值
		* @param index 这个参数最为重要，这是为了保证消除重复遍历的情况，能够极大限度减少遍历次数
		* @param cur 当前保存的路径
		* */
		public void add(int[] arr, int target ,int index, List<Integer> cur){
		if( target < getMin(arr))
		return;
		else{
		for(int i = index-1 ; i >= 0 ; i -- ){
		if(arr[i] == target){
		for(Integer o : copyAndAdd(cur,arr[i]))
		System.out.print(o + ",");
		System.out.println();
		//输出等于20的路径
		}
		else{
		add(arr, target-arr[i], i+1 , copyAndAdd(cur,arr[i]));
		}
		}
		}
		}

		//深拷贝一份list,并将新的node加入路径之中
		public List<Integer> copyAndAdd(List<Integer> lst, int item){
		List<Integer> cur_t = new ArrayList<Integer>();
		cur_t.addAll(lst);
		cur_t.add(item);
		return cur_t;

		}

		public int getMin(int[] arr){
		int k = Integer.MAX_VALUE;
		if(null == arr || arr.length < 1)
		return k;

		for(int i = 0; i < arr.length; i++ ){
		if(arr[i] < k)
		k = arr[i];
		}

		return k;
		}
}
