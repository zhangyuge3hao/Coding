package ���Խṹ_1����;

import java.util.Arrays;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��23�� ����3:28:09
* 
*/
import java.util.Random;
public class A������� {
	public static void main(String[] args){
		//int[] arr = new int[3];
		int[] a = new int[] {1,2,3};//����
		int len = a.length;
		int ele0 = a[0];
		System.out.println(Arrays.toString(a));
		
		int[] arr = arrLonger(a,4);
		
		Random ra = new Random();
		int index = ra.nextInt(a.length);//���ɾ��һλ
		arrShort(arr,index);
	}
	
	//δ��� ���鳤�Ȳ��ɱ������
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
		System.out.print("ɾ����"+index+"����λ������飺");
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
