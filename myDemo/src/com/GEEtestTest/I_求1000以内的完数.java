package com.GEEtestTest;

public class I_��1000���ڵ����� {
	public static void main(String[] args){
		int count = 0;
		for(int i = 1;i<1000;i++){
			int sum = 0;
			for(int j = 1;j<i;j++){//Ѱ�������������Լ������������=�Լ�����������
				if(i%j == 0){
					sum += j;
				}
			}		
			if(sum == i){
				System.out.println("��������"+i);
				count++;
			}
		}
		System.out.println("������"+count);
	}
}
