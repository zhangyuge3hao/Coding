package com.GEE1917;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��22�� ����4:51:06
* 
* 
*/
import java.util.Scanner;
import java.util.ArrayList;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��20�� ����5:55:44
* 
* ��������ͨ�ŵĵ�����N��4<N<30�����ַ���ɣ��ַ��ڵ����г��ֵ�Ƶ�ȣ�Ȩֵ��ΪW1,W2,,,Wn��
* �Ը���Ȩֵ���й����������������������Ĵ�Ȩ·�����ȡ�(30�֣�
�����ʽ����һ�����ݷ��������롢��һ��ΪN��ֵ���ڶ���ΪN���������Կո�������ʾ���ֵĳ���Ƶ�ȡ�
����������
8
7 19 2 6 32 3 21 10
����ʽ�������Ȩ·�����ȣ�
���������
261

*/

public class Test2_ArrayList {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N");
		int n = sc.nextInt();
		String notUse = sc.nextLine();
		System.out.println("Input numbers split them with space");
		String number = sc.nextLine();
		String[] numb = number.split("\\ ");
		int len = numb.length;
		System.out.println(number+"number---"+len+"len---n"+n);
		
		if(n>=4&&n<30&&n==len&&number.matches("(\\d+\\ )*\\d+")){
			int[] num = new int[len];
			for(int i = 0;i<len ;i++){
				num[i] = Integer.parseInt(numb[i]);
			}
			huofuman(num,len);
		}else{
			System.out.println("Input illegal.");
		}
	}
	static ArrayList<String> rout = new ArrayList<String>();
	static int count = 0;//��¼����routʱ����ǰԪ�صı�־������Ȩֵ����
	public static void huofuman(int[] num,int len){//7 19 2 6 32 3 21 10
		/**
		 * ������
		 * ��ǰ��������С��Ԫ�غϲ�Ϊһ��������num����
		 */
		while(len-1>0){
			num = bubbleSort(num,len);
			count++;
			num = cut(num);//ȡǰ��������С��Ԫ�غϲ�Ϊһ��������num����
			
			System.out.print("��ǰ���ȣ�"+(len-1)+"--");
			for(int i : num){
				System.out.print(i+" ");
			}System.out.println();
			len--;
		}
	}
	public static int[] cut(int[] num){
		int l = num.length-1;
		int[] temp = new int[l];
		temp[0] = num[0] + num[1];
		for(int i = 1;i<l;i++){
			temp[i] = num[i+1];
		}
		return temp;
	}
	public static int[] bubbleSort(int[] num,int len){
		int temp = 0;
		while(len>0){
			for(int i = 0;i<len-1;i++){
				if(num[i]>num[i+1]){
					temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
				}
			}
			len--;
		}
		return num;
	}
}
