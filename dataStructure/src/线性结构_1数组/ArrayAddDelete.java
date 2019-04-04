package 线性结构_1数组;

import java.util.Arrays;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年3月29日 下午1:32:53
* 
* 
*/
public class ArrayAddDelete {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};
		arr = addAtIndex(arr,1,5);
		System.out.println(Arrays.toString(arr));
		arr = deleteAtIndex(arr,1);
		System.out.println(Arrays.toString(arr));
	}
	/**
	 * 当两个数据并行遍历的时候，按数组长度最大的创造循环，并在循环中保护较短的数组
	 * 或者让i j 分别两个数组计数
	 * @param arr
	 * @param index
	 * @param elem
	 * @return
	 */
	public static int[] addAtIndex(int[] arr,int index,int elem){//在给定位置添加元素
		int len = arr.length;
		
		int[] a = new int[len+1]; 
		for(int i = 0;i<len+1;i++){
			if(i<index){
				a[i] = arr[i];
			}else if(i == index){
				a[i] = elem;
			}else{
				a[i] = arr[i-1];
			}
		}
		return a;
	}
	public static int[] deleteAtIndex(int[] arr,int index){//在给定位置删除元素
		int len = arr.length;
		int[] a = new int[len - 1];
		for(int i = 0;i<len;i++){
			if(i<index){
				a[i] = arr[i];
			}else if(i == index){
				
			}else{
				a[i-1] = arr[i];
			}
		}
		return a;
	}
}
