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
		* @param arr Ŀ������
		* @param target ��Ҫ��͵�ֵ
		* @param index ���������Ϊ��Ҫ������Ϊ�˱�֤�����ظ�������������ܹ������޶ȼ��ٱ�������
		* @param cur ��ǰ�����·��
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
		//�������20��·��
		}
		else{
		add(arr, target-arr[i], i+1 , copyAndAdd(cur,arr[i]));
		}
		}
		}
		}

		//���һ��list,�����µ�node����·��֮��
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
