package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����
 * (1)����һ��int���͵�һά���飬����Ϊ{171,72,19,16,118,51,210,7,18}
 * (2)���������������Ҫ���Ԫ�غ͡�
 * 		Ҫ����͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż����
 * 
 * ������
 * 		A:����һ��int���͵�һά����
 * 		B:����һ����ͱ���
 * 		C:��������,��ȡ�����е�ÿһ��Ԫ��
 * 		D:�жϸ�Ԫ���Ƿ�������������������������ۼ�
 * 			�����������x
 * 			��λ������7��x%10 != 7
 * 			ʮλ������7��x/10%10 != 7
 * 			������ż����x%2 == 0
 * 		E:�����ͽ��
 */
public class Test5 {
	public static void main(String[] args) {
		ArrayList<Integer> elem = new  ArrayList<Integer>();
		int i=64;
		do{
			elem.add(i);
			i++;
		}while(i<=75);
		
		// ת�� ArrayList Ϊ Array
		//String[] simpleArray = list.toArray(new String[list.size()]);
		//Integer[] newElem1 = new Integer[elem.size()];
		//newElem1 = elem.toArray(new Integer[elem.size()]);
		int temp=0;
		int sum= 0;
		
        for (Iterator<Integer> it = elem.iterator();it.hasNext();temp++) {
        	
        	int elem2=it.next();		//ע������������������hasNext�У�ÿ��.next�������������������һ��Ԫ�أ�
        								//���Ե���һ���ڵ���в���ʱ��һ��Ҫ���ڵ�ȡ����������������ֻ����һ��.next()
        	
        	if((elem2%10 != 7) && (elem2/10%10 != 7) && (elem2%2 == 0) ){
        	//if(elem2%10!=7 && (elem2/10)%10!=7 && elem2%2==0){
        		System.out.println("��"+temp+"��Ԫ���ǣ�" + elem2);
        		sum+=elem2;
        	}
        }
		System.out.println("����ǣ�"+sum);
	}
}		
		//����һ��int���͵�һά����
		/*int[] arr = {171,72,19,16,118,51,210,7,18};
		
		//����һ����ͱ���
		int sum = 0;
		
		//��������,��ȡ�����е�ÿһ��Ԫ��
		for(int x=0; x<arr.length; x++) {
			//�жϸ�Ԫ���Ƿ�������������������������ۼ�
			if((arr[x]%10 != 7) && (arr[x]/10%10 != 7) && (arr[x]%2 == 0)) {
				sum += arr[x];
			}
		}
		
		//�����ͽ��
		System.out.println("sum:"+sum);*/

