package com.method;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��31�� ����10:26:48
* 
* 	ͨ���������鳤�ȣ��Զ��������飬������������ֵ�����
*/
public class MethodPracticeArr {
	public static void main(String[] args) {
		int[] arr=initial();
		traversal(arr);
		max(arr);
		sum(arr);
	}
	//��ʼ������
	public static int[] initial (){	//����һ���������͵ķ��������ݱ���Ӧд��������� ����άͬ��
		int length=getLength();
		int arr[]=new int[length];
		for(int temp=0;temp<length;temp++){
			arr[temp]=(int)(Math.random()*10);
			//System.out.print(arr[temp]+ "  ");
		}
		return  arr;
	}
	//�����������
	public static void traversal (int[] arr){
		System.out.print("���ɵ������ǣ�[ ");
		int length=arr.length;
		for(int temp=0;temp<length;temp++){
			if(temp<length-1){
				System.out.print(arr[temp]+", ");
			}else{
				System.out.print(arr[temp]+" ");
			}
		}
		System.out.println("]");
	}
	//�����ֵ
	public static void max(int[] arr){
		int max=0;
		int min=arr[0];
		int length=arr.length;
		for(int temp=0;temp<length;temp++){
			if(max<=arr[temp]){
				max=arr[temp];
			}
			if(min>=arr[temp]){
				min=arr[temp];
			}
		}
		System.out.println("���ֵ�ǣ�"+max+"����Сֵ�ǣ�"+min);
	}
	//��Ԫ�غ�
	public static void sum(int[] arr){
		int sum=0;
		int length=arr.length;
		for(int temp=0;temp<length;temp++){
			sum+=arr[temp];
		}
		System.out.println("Ԫ�غ��ǣ�"+sum);
	}
	//�������鳤��
	public static int getLength(){
		System.out.println("���������鳤�ȣ�");
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		return length;
	}
	
}
