package 线性结构_1数组;

import java.util.Arrays;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月23日 下午3:28:09
* 
*/
import java.util.Random;
public class A数组基础 {
	public static void main(String[] args){
		//int[] arr = new int[3];
		int[] a = new int[] {1,2,3};//【】
		int len = a.length;
		int ele0 = a[0];
		System.out.println(Arrays.toString(a));
		
		int[] arr = arrLonger(a,4);
		
		Random ra = new Random();
		int index = ra.nextInt(a.length);//随机删除一位
		arrShort(arr,index);
	}
	
	//未解决 数组长度不可变的问题
	public static int[] arrLonger(int[] arr,int n){
		int len = arr.length;
		int[] a = new int[len+1];
		for(int i = 0;i<len;i++){
			a[i] = arr[i];
		}
		a[len]=n;
		System.out.println(Arrays.toString(a));
		return a;
	}
	public static void arrShort(int[] a,int index){
		System.out.println(Arrays.toString(a));
		System.out.print("删掉第"+index+"索引位后的数组：");
		int len = a.length;
		int arr[] = new int[len-1]; 
		/*for(int i = index;i < len-1 ;i++){
			a[i] = a[i+1];
		}
		a[len] = 0;*/
		for(int i = 0; i<len-1;i++){
			if(i < index){
				arr[i]=a[i];
			}else{
				arr[i]=a[i+1];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
