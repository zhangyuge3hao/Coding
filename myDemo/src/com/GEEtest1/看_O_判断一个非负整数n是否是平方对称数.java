package com.GEEtest1;
//�ж�һ���Ǹ�����n(n<256)�Ƿ���ƽ���Գ���
public class ��_O_�ж�һ���Ǹ�����n�Ƿ���ƽ���Գ��� {
	public static void main(String[] args){
		int count = 0;
		/*if(check((int)Math.pow(10,2))){
			System.out.println("��ƽ���Գ���");
			count++;
		}*/
		for(int i = 0;i<256 ;i++){
			if(check((int)Math.pow(i,2))){
				System.out.println(i+"��ƽ���Գ���");
				count++;
			}
		}
		System.out.println("���У�"+count);
	}
	public static boolean check(int n){
		boolean flag = true;
		char[] num = String.valueOf(n).toCharArray(); 
		int len = num.length;
		for(int i = 0,j = len-1;i<=j;i++,j--){
			if(num[i] != num[j]){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
