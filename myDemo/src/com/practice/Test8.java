package com.practice;

import java.util.Scanner;

/*
 *��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 *	(1)��������int[] arr = {5,7,3,2,5};
 *	(2)Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
 *	(3)����һ����������Ԫ�ص�һ�γ���λ�õķ���(ע,Ҫ���ҵ�Ԫ�ؾ��Ǽ���¼�������)
 *
 *������
 *		A:��������int[] arr = {5,7,3,2,5};
 *		B:����¼��һ������ѯ������
 *		C:д����ʵ�ֲ���ָ��Ԫ���������е�һ�γ��ֵ�����
 *			�������飬���αȽ�Ԫ�أ������ȣ��ͰѸô����������ؼ���
 *		D:���÷���,������
 */
public class Test8 {
	public static void main(String[] args) {
		int[] arr=initialArr();
		getElem(arr);
	}
	public static int[] initialArr(){
		int[] arr={5,7,3,2,5};
		return arr;
	}
	public static void getElem(int[] arr){
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(!flag){
			System.out.println("������5,7,3,2,5�е�����һ������");
			String index=sc.next();
			if(index.matches("[0-9]{0,99999}") && (Integer.parseInt(index)==5 || Integer.parseInt(index)==7 ||Integer.parseInt(index)==3 ||Integer.parseInt(index)==2 )){
				for(int i=0;i<arr.length;i++){
					if(Integer.parseInt(index)==arr[i]){
						System.out.println("�����е� "+(i+1)+" ��Ԫ�غ� "+index+" �״�ƥ��");
						break;
					}
				}
				flag=true;
			}else{
				System.out.println("������������������");
				//���ﲻ�ø�flag��ֵ����ΪĬ����false������Ϊtrue����ζѭ���Ѿ������������䣬��flagһֱδfalse
			}
		}
		
	}
	
	/*
	//��������int[] arr = {5,7,3,2,5};
			int[] arr = {5,7,3,2,5};
			
			//����¼��һ������ѯ������
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�����뱻��ѯ�����ݣ�");
			int number = sc.nextInt();
			
			//д����ʵ�ֲ���ָ��Ԫ���������е�һ�γ��ֵ�����
			
			//���÷���,������
			int index = getIndex(arr, number);
			System.out.println("index:"+index);
	
	
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr,int value
	 
	public static int getIndex(int[] arr,int value) {
		//�������飬���αȽ�Ԫ�أ������ȣ��ͰѸô����������ؼ���
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				return x;
			}
		}
		return -1;
	}*/
}
