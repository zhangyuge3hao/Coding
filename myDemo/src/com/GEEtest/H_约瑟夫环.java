package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��22�� ����4:53:16
* 
* ͨ������ģ�Ԫ������n����ʼλ��m���˳�tocken k������Լɪ�����˳��
* 	˼·��1������n�Ƕ��پͽ����೤�����飬���±��¼Ԫ�ر��
* 		2��ʹ��if(i=n-1)i=-1,��һ��forѭ����α���ȫ��Ԫ�أ��ұܿ�ȡ�����
* 		3����Ԫ��������Ϊ�ж��������˳���Ԫ�ظ�ֵ-1�������ڽ���
* 		4��temp��¼��һ���˱���������ǰԪ���˳�ѭ��ʱ���temp=-1����֤�˳������ѭ��
*/
import java.util.Scanner;
public class H_Լɪ�� {
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		int n=0,m=0,k=0;
		while(true){
			System.out.println("����������n����ʼ����m(��ʼ�˵ı��)���˳�����k����������ֵ����˳���������.����");
			String s=sc.next();
			if(s.matches("\\d+[\\.]\\d+[\\.]\\d+")){
				String input[]=s.split("\\.");
				n=Integer.parseInt(input[0]);
				m=Integer.parseInt(input[1]);
				k=Integer.parseInt(input[2]);
				if(m<=n&&k<=n){
					yuesefu(n,m,k);
				}else{
					System.out.println("Input illegal");
				}
			}else{
				System.out.println("Input illegal");
			}
		}
	}
	public static void yuesefu(int n,int m,int k){
		//��n��m����ѭ��19.5.3
		int temp =0;//��¼�ϸ��˱�����
		int check=0;//��¼�˳�ѭ������
		int ysf[] = new int[n];// �½�������Ĭ����0
		String s = "";
		for (int i = (m-1); check < n; i++) {//��m��Ӧ���±�m-1��ʼ��check���ѱ���������=n ʱ�������˶������ˣ��˳�����д����iʼ����0��n-1֮��ѭ����
			if (ysf[i] != -1) {// ֻ����Ч��ҿɲ���
				if (temp == (k - 1)) {// �ϸ��˱��������˳�����С1������˾�Ҫ�˳�ѭ��
					ysf[i] = -1;
					s = s + "|" + (i + 1);
					check++;
					temp = -1;
				} else {
					ysf[i] = temp;
				}
				temp++;//��ǰ�غϱ���
			}
			if (i == (n - 1)) {// ����󣬱���һ��һ�ֱ���ѭ��
				i = -1;
			}
		}
		String res[]=s.split("\\|");
		System.out.println("���˳��"+s+"---���һ���������ʣ�µ��ǣ�"+res[n]);
	}
}
