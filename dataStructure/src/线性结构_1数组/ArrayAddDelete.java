package ���Խṹ_1����;

import java.util.Arrays;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��29�� ����1:32:53
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
	 * ���������ݲ��б�����ʱ�򣬰����鳤�����Ĵ���ѭ��������ѭ���б����϶̵�����
	 * ������i j �ֱ������������
	 * @param arr
	 * @param index
	 * @param elem
	 * @return
	 */
	public static int[] addAtIndex(int[] arr,int index,int elem){//�ڸ���λ�����Ԫ��
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
	public static int[] deleteAtIndex(int[] arr,int index){//�ڸ���λ��ɾ��Ԫ��
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
