package com.GEEtestTest;
/*	
Լɪ���������£�
1��һȺ��Χ��һ�����ɻ�״���磺N��
2����ĳ����ſ�ʼ�������磺K��
3������ĳ�������磺M����ʱ�򣬴��˳��У���һ�������±���
4��һֱѭ����ֱ�������˳��У�Լɪ�򻷽���
*/
import java.util.Scanner;
public class K_Լɪ�� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������n����ʼ��������k����������m�˳����ÿո�ֿ�");
		String s = sc.nextLine();
		if(s.matches("\\d+\\ \\d+\\ \\d+")){
			String[] input = s.split("\\ ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			int m = Integer.parseInt(input[2]);
			if(k<n&&m<n){
				yuesefu(n,k,m);
			}else{
				System.out.println("�������");
			}
		}else{
			System.out.println("�������!");
		}
	}
	public static void yuesefu(int n,int k,int m){
		/**
		 * �����д�-1��ʾ�Ѿ��˳���Ϸ��ʧȥ�ʸ����ʸ����Ҳ��ܽ�����Ϸ
		 * ����ȡ��ѭ����for�е�����˳�����=����-1��ʱ����Ϸ����
		 * i++��������ѭ���е�i=n-1ʱ��ǿ��ת��-1
		 * ��ұ�ž��������±��+1
		 */
		System.out.println("��������"+n+"--��ʼ�������ˣ�"+k+"��������m�˳���"+m);
		int[] play = new int[n];
		int out = 0;//�˳�����
		int num = 0;//��һ����ұ�����(��Ϊ�Ե�һ������˵����һ����������0)����num=m-1����ǰ����˳�
		for(int i = k-1;out < n;i++){
			if(play[i]!=-1){//�ж��ʸ�
				if(num == m-1){
					play[i] = -1;
					num = 0;
					out++;
					System.out.println((i+1)+"�˳�");
				}else{
					num++;
				}
			}
			if(i == n-1){
				i=-1;//for�����˺��滹�и�i++���ص�0���ӵ�һ���˿�ʼ
			}
		}
		System.out.println("�˳�������"+out);
	}
}
