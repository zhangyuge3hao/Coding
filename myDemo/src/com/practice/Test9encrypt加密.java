package com.practice;

import java.util.Scanner;

/*
 * ���󣺼���¼������,Ҫ����������λ������,����Ҫ�����ݽ��м���,���ܹ�������:
 * ÿλ���ֶ�����5,Ȼ�����10���������������,
 * �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
 * ��Ѽ��ܺ���������������̨
 * 
 * ������
 * 		A:����¼��һ��4λ��
 * 			������4567
 * 		B:����һ������Ϊ4������
 * 			int[] arr = new int[4];
 * 			arr = {4,5,6,7};
 * 		C:�������е����ݽ��м��ܹ���Ĳ���
 * 			ÿλ���ֶ�����5,Ȼ�����10���������������
 * 				arr[x] += 5;
 * 				�����arr = {9,10,11,12};
 * 				arr[x] %= 10;
 * 				�����arr = {9,0,1,2};
 * 			�ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����
 * 				�����arr = {2,1,0,9};
 *		D:��Ѽ��ܺ���������������̨
 */
public class Test9encrypt���� {
	public static void main(String[] args) {
		int[] number=getNumArr();
		show(number);
		encrypt(number);
		show(number);
	}
	public static int[] getNumArr(){
		System.out.println("����������4���������Լ��ܣ�");
		Scanner sc = new Scanner(System.in);
		int[] number=new int[4];
		for(int i=0;i<4;i++){
			boolean flag=false;
			while(!flag){
				System.out.println("�������"+(i+1)+"λ��:");
				String num = sc.next();
				if(num.matches("[0-9]{0,1}")){
					number[i]=Integer.parseInt(num);
					flag=true;
				}else{
					System.out.println("�����������������");
					flag=false;
				}
			}
		}
		return number;
	}
	public static void encrypt(int[] number){
		int temp=0;
		for(int i=0;i<(number.length+1)/2;i++){
			System.out.print("ԭ��"+(i+1)+"λ:"+number[i]);
			number[i]+=5;
			number[i]%=10;
			System.out.println("�����ܺ�Ϊ��"+number[i]);
			System.out.print("ԭ��"+(number.length-i)+"λ:"+number[number.length-1-i]);
			number[number.length-1-i]+=5;
			number[number.length-1-i]%=10;
			System.out.println("�����ܺ�Ϊ��"+number[number.length-1-i]);
			temp=number[i];
			number[i]=number[number.length-1-i];
			number[number.length-1-i]=temp;
		}
	}
	public static void show(int[] number){
		System.out.print("[ ");
		for (int i = 0; i < number.length; i++) {
			if(i==(number.length-1)){
				System.out.println(number[i]+" ]");
			}else{
				System.out.print(number[i]+" ,");
			}
		}
	}
}

		/*//����¼��һ��4λ��
		Scanner sc = new Scanner(System.in);
		//��������
		System.out.println("������һ��4λ����");
		int number = sc.nextInt();
		
		//����һ������Ϊ4������
		int[] arr = new int[4];
		arr[0] = number/10/10/10%10;
		arr[1] = number/10/10%10;
		arr[2] = number/10%10;
		arr[3] = number%10;
		
		//�������е����ݽ��м��ܹ���Ĳ���
		//ÿλ���ֶ�����5,Ȼ�����10���������������
		for(int x=0; x<arr.length; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		//�ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		//��Ѽ��ܺ���������������̨
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();*/
