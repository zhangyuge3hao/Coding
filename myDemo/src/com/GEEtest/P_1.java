package com.GEEtest;
/**
 ����������������һ��ջ����֪Ԫ�صĽ�ջ���У��ж�һ����ջ������Ԫ����ɵ������Ƿ��ǿ��ܵĳ�ջ���С�
���磬��ջ����Ϊ1 2 3 4������ܵĳ�ջ������4 3 2 1��1 4 3 2�ȡ���1 4 2 3�Ͳ��ǡ�
��������ʽ���ӱ�׼�����ȡ��һ����һ������N��3��N��10����������N��Ԫ�أ����ջ������1 2 3 ���� N��
�ڶ����ǿո�ָ���1~N�����ֵ�һ�����С�
�������ʽ�����׼�����ӡ���������������ǿ��ܵĳ�ջ���У����ӡ��YES����
�����ӡ��NO��������ĩҪ���һ���س�����
������������
3
3 1 2 
�����������
NO
������˵������ջ����Ϊ1 2 3�ĳ�ջ������û��3 1 2

 */
import java.util.ArrayList;
import java.util.Scanner;
public class P_1 {

	public static void main(String []args){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] push = {1,2,3,4};
		int[] pop = {3,2,1,4};


		int ex = 3;
		int lenA = arr.size();
		//��arr�����ȥpush��exǰ���ң��Ҳ�����ɾ��arr������,
		int delete = 0;//�������arr��ͬʱɾ��arr��Ķ��������±���:�õ�����delete����ѭ��iͬ��������remove������delete--
		for(int i = 0 ;i<lenA ;i++,delete++){
			boolean f =true;
			if(ex==0){//û�б�push��һ��Ԫ�ػ�����ջ�ģ�arr�϶�Ϊ��
				f = true;
			}
			for(int j = 0 ;j<ex ;j++){
				if(arr.get(delete) == push[j]){//ֻҪ�ҵ����˳�
					f = false;
					break;
				}
			}
			if(f){
				arr.remove(delete);
				System.out.println("arr"+arr);
				delete--;
			}
		}
		System.out.println(arr);
		//System.out.println("��push��"+pop[index]+"�ԱȺ�ʣ��"+arr);
	}
	
}
