package com.practice;
/*
 * ���󣺴�ӡ5λ���е����л�������
 * 		ʲô�ǻ�������?������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * 
 * ������
 * 		A:5λ���������������ݵķ�Χ,��forѭ��ʵ��
 * 		B:�õ�ÿһ��5λ����,��ȡ���λ,ʮλ,ǧλ,��λ������
 * 			��λ�ȡ��?����x��һ��5λ��
 * 			��λ��x%10
 * 			ʮλ��x/10%10
 * 			ǧλ��x/10/10/10%10
 * 			��λ��x/10/10/10/10%10
 * 		C:�������������ж�,�����������������������
 */
public class Test3������U����ȡ����U���鷽�� {
	public static void main(String[] args) {
		/*
		 * ˼·������10000~99999
		 * ��5λ����ÿһλ�浽�����Ȼ��ֱ�ȡǰ��һλ���бȽ�
		 * 		��������Ϊ����ǿ�����ҳ���ͬλ���Ļ������Ŀ���չ��
		 */
		
		//����+��� 5λ������������
		int length = 0;
		int sum = 0;
		for (int i = 10000; i <= 99999; i++) {
			//�ж�һ��int���͵ı����ж೤���ж�������λ����
			Integer len = i;  					//ת��Ϊ��װ��Integer
			length = len.toString().length();	//��length()��ȡtoString�ĳ���
			
			//�������β�ֺ��������
			int arr[] = new int[length];
			split(i,length,arr);
			
			//�ж��ǻ����������
			if(check (arr)){
				System.out.print("/---- ");
				for (int j = 0; j < length; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println("----/");
				sum++;
			}
		//	System.out.println("---------------");	
		}
		System.out.println("���ƻ�������"+sum+" ��");
	}
	public static int[] split(int i,int length,int[] arr){
		
		//��������
		int index = length-1;
		while(i>0){
			arr[index]=i%10;
			i/=10;
			index--;
		}
		return arr;
	}
	public static boolean check (int[] arr){
		//boolean flag = true;
		//boolean temp = true;
		
		int flag = 0;
		int length = arr.length-1;
		//System.out.println("   ---"+length);
		for (int i = 0; i < (length+1)/2; i++) {
			if(arr[i]==arr[length-i]){
				flag += 0;
			}else{
				flag += -1;
			}
			//System.out.println("flag="+flag);
			//System.out.println(arr[i]+"  "+arr[length-i]);
		}
		//System.out.println("/---flag="+flag);
		if(flag==0){
			return true;
		}else{
			return false;
		}
	}
}
//5λ���������������ݵķ�Χ,��forѭ��ʵ��
/*for(int x=10000; x<100000; x++) {
	//�õ�ÿһ��5λ����,��ȡ���λ,ʮλ,ǧλ,��λ������
	int ge = x%10;
	int shi = x/10%10;
	int qian = x/10/10/10%10;
	int wan = x/10/10/10/10%10;
	
	//�������������ж�,�����������������������
	if((ge == wan) && (shi == qian)) {
		System.out.println(x);
	}
}*/