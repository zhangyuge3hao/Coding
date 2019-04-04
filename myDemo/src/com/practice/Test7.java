package com.practice;

import java.util.Scanner;

/*
 * ����
 * (1)����¼��5��int���͵����ݴ洢����arr��
 * (2)���巽����arr�����е����ݷ�ת
 * (3)���巽���Է�ת���������б���
 * 
 * ������
 * 		A:����һ������Ϊ5������
 * 		B:ͨ������¼�����ݸ������е�Ԫ�ظ�ֵ
 * 		C:���巽����arr�����е����ݷ�ת
 * 			ʲô�Ƿ�ת?���ʵ�ַ�ת
 * 		D:���巽���Է�ת���������б���
 */
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length=0;
		while(length==0){
			length=getLength(sc);
		}
		
		int[] arr=getScore(length,sc);
		reverse(arr,length);
		//System.out.println();
		show(arr,length);
		sc.close();			//�ͷ�Scanner����
	}
	public static int getLength(Scanner sc){
		System.out.println("���������鳤�ȣ�");
		String len = sc.next();
		boolean flag = true;
		int length;
		while(flag){
			if(len.matches("[0-9]{0,9999}")){
				flag = true;
				length =Integer.parseInt(len);
				return length;
			}else{
				System.out.println("����������һ������");
				flag = false;
				return 0;
			}
		}
		return 0;
	}
	public static int[] getScore(int length,Scanner sc){
		boolean flag = true;
		int[] arr = new int[length];
		System.out.println("������"+length+"������0~100����");
		for(int i=0;i<length;i++){
			do{
				String s = sc.next();
				//��������0<=s<=100
				if(s.matches("[0-9]{1,3}") && Integer.parseInt(s)<=100 && Integer.parseInt(s)>=0){
					System.out.println("��"+(i+1)+"����"+s+"��Ч���Ѽ��롣");
					arr[i]=Integer.parseInt(s);
					flag=true;
				}else{
					System.out.println("������Ч����������");
					flag=false;
				}
			}while(!flag);	//��flagΪfalseʱ����ʾ������󣬼���ѭ���������롣
							//��flagΪtrueʱ����ʾ����ɹ����˳�ѭ��������һ����
		}
		show(arr,length);
		return arr;
	}
	//reverse���࣬�������е�����˳��ת
	public static void reverse (int[] arr,int length){
		int temp=0;
		/*for(int i=0;i<(length+1)/2;i++){
			temp=arr[i];
			arr[i]=arr[length-1-i];
			arr[length-1-i]=temp;
			System.out.println("arr["+i+"]="+arr[i]+"  arr["+(length-1-i)+"]="+arr[length-1-i]);
		}*/
		/**
		 * �ڷ�תʱ��ʹ��start end ��������һ��仯Ҳ�Ǹ������˼·
		 */
		
		for(int start=0,end=length-1;start<=end;start++,end--){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			System.out.println("arr["+start+"]="+arr[start]+"  arr["+end+"]="+arr[end]);
		}
	}
	public static void show(int[] arr,int length){
		System.out.print("[ ");
		for(int i=0;i<length;i++){
			if(i<(length-1)){
				System.out.print(arr[i]+", ");
			}if(i==(length-1)){
				System.out.println(arr[i]+" ]");
			}
		}
	}
/*		//����һ������Ϊ5������
		int[] arr = new int[5];
		
		//ͨ������¼�����ݸ������е�Ԫ�ظ�ֵ
		Scanner sc = new Scanner(System.in);
		for(int x=0; x<arr.length; x++) {
			System.out.println("������"+(x+1)+"��Ԫ��ֵ��");
			int number = sc.nextInt();
			arr[x] = number;
		}
		
		//��תǰ
		printArray(arr);
		
		//���巽����arr�����е����ݷ�ת
		reverse(arr);
		
		//���巽���Է�ת���������б���
		printArray(arr);*/

	
	//��������
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	
	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�void
	 * 		�����б�int[] arr
	 */
	public static void reverse(int[] arr) {
		for(int start=0,end=arr.length-1; start<=end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
}
