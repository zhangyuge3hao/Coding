package com.practice;

import java.util.Scanner;

/*
 * �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ��4����ίƽ��ֵ��
 * ��д����ʵ�֡�(������С������)
 * 
 * ������
 * 		A:����һ������Ϊ6������
 * 		B:����¼����ί�ķ���
 * 		C:д����ʵ�ֻ�ȡ��߷�,��ͷ�
 * 		D:д��������ί�ķ�����
 * 		E:ƽ���֣�(��-��߷�-��ͷ�)/(arr.length-2)
 * 		F:���ƽ���ּ���
 */
public class Test6 {
	public static void main(String[] args) {
		int[] arr = new int[6]; 
		//����6������
		getScore(arr);
		show(arr);
		int sc = getMaxMin(arr);
		finalScore(arr,sc);
	}
	public static void getScore(int[] arr){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("������6�����֣�0~100����");
		for(int i=0;i<6;i++){
			do{
				String s = sc.next();
				//��������0<=s<=100
				if(s.matches("[0-9]{1,3}") && Integer.parseInt(s)<=100 && Integer.parseInt(s)>=0){
					System.out.println("��"+(i+1)+"��"+s+"��Ч���Ѽ��롣");
					arr[i]=Integer.parseInt(s);
					flag=true;
				}else{
					System.out.println("������Ч����������");
					flag=false;
				}
			}while(!flag);
		}
	}
	public static void show(int[] arr){
		System.out.print("[ ");
		for(int i=0;i<6;i++){
			if(i==5){
				System.out.println(arr[i]+" ]");
			}else{
				System.out.print(arr[i]+", ");
			}
		}
	}
	public static int getMaxMin(int[] arr){
		int max=0;
		int min=100;
		for(int i=0 ;i<6;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("ȥ��һ����߷֣�"+max+" ��һ����ͷ֣�"+min);
		return max+min;
	}
	public static void finalScore(int[] arr,int sc){
		int sum =0;
		for(int i = 0; i<6; i++){
			sum+=arr[i];
		}
		System.out.println(sum+"  "+sc+" "+(sum-sc)+" "+(sum-sc)/4);
		sum-=sc;
		double score=sum;	//��Ҫdouble���ʱ���������ת��double���ٽ������һ������
		score/=4;
		System.out.println("���յ÷֣�"+score);
	}
		//����һ������Ϊ6������
		/*int[] arr = new int[6];
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//����¼����ί�ķ���
		for(int x=0; x<arr.length; x++) {
			//��������
			System.out.println("�������"+(x+1)+"����ί�����ķ���(0-100)��");
			int score = sc.nextInt();
			arr[x] = score;
		}
		
		//д����ʵ�ֻ�ȡ��߷�,��ͷ�
		//���÷���
		int max = getMax(arr);
		int min = getMin(arr);
		
		//д��������ί�ķ�����
		int sum = sum(arr);
		
		//ƽ���֣�(��-��߷�-��ͷ�)/(arr.length-2)
		int avg = (sum-max-min)/(arr.length-2);
		
		//���ƽ���ּ���
		System.out.println("��ѡ�ֵ����յ÷��ǣ�"+avg);*/

	/*
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr
	 */
	/*public static int sum(int[] arr) {
		//������ͱ���
		int sum = 0;
		
		for(int x=0; x<arr.length; x++) {
			sum += arr[x];
		}
		
		return sum;
	}
	
	
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr
	 
	public static int getMin(int[] arr) {
		//���������
		int min = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		
		return min;
	}
	
	
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr
	 
	public static int getMax(int[] arr) {
		//���������
		int max = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		
		return max;
	}*/
}
