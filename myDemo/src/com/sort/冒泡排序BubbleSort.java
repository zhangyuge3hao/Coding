package com.sort;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��20�� ����2:02:34
* https://www.cnblogs.com/onepixel/articles/7674659.html#!comments
* ð������Bubble Sort��
	ð��������һ�ּ򵥵������㷨�����ظ����߷ù�Ҫ��������У�һ�αȽ�����Ԫ�أ�������ǵ�˳�����Ͱ����ǽ����������߷����еĹ������ظ��ؽ���ֱ��û������Ҫ������Ҳ����˵�������Ѿ�������ɡ�����㷨��������������ΪԽС��Ԫ�ػᾭ�ɽ������������������еĶ��ˡ� 

1.1 �㷨����
	�Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
	��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԣ�����������Ԫ��Ӧ�û�����������
	������е�Ԫ���ظ����ϵĲ��裬�������һ����
	�ظ�����1~3��ֱ��������ɡ�
*/
import java.util.Scanner;

public class ð������BubbleSort {
	public static void main(String [] args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("please input the numbers and split with ','.Input # to stop the program.");
			String s = sc.next();
			if(s.matches("(\\d+\\,)*\\d+")){
				String []arr = s.split(",");
				int []num = new int[arr.length];
				for(int i = 0;i < arr.length;i++){
					num[i]=Integer.parseInt(arr[i]);
				}
				bobbleSort(num,num.length);
			}else if(s=="#"){
				flag=false;
			}else{
				System.out.println("Input illegal");
			}
		}
		sc.close();
	}
	public static void bobbleSort(int[] num,int len){
		int temp = 0;
		while(len>=1){
			for(int i = 0; i<len-1; i++){
				if(num[i]>num[i+1]){
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
			len--;//ÿ��ð�ݻὫ���ֵ�ŵ�����´β��ر���
		}
		for(int n : num){
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
