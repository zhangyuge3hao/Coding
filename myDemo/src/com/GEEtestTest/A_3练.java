package com.GEEtestTest;
/*ʮ����ת��Ϊʮ������*/
/*ʮ������ת��Ϊʮ����*/
import java.util.Scanner;
public class A_3�� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����");
		int n = sc.nextInt();
		String a = to12(n);
		to10(a);
	}
	static char[] b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	public static String to12(int n){
		//��n����12���������±��b�л�ȡ�浽sb��reverse
		StringBuffer sb = new StringBuffer();
		String re = "";
		while(n!=0){
			sb.append(b[n%12]);
			n /= 12;
		}
		re =sb.reverse().toString();
		System.out.println(n+"ת����12���Ƶã�"+re);
		return re;
	}
	public static void to10(String n){
		//10 = ÿһλ�ϵ�������Ҫת����*pow����ǰ���ƣ���ǰ������
		char[] a = n.toCharArray();
		int len = a.length;
		int lenB = b.length;
		int jie = len-1;//��¼��ǰ���ֽ�������һ�����ִ�len-1��ʼ
		int re = 0;
		int checkN = 0;
		for(int i = 0;i<len ;i++,jie--){
			for(int j = 0;j<lenB;j++){
				if(a[i] == b[j]){
					checkN = j;
				}
			}
			re += checkN*(int)Math.pow(12, jie);
		}
		System.out.println(n+"ת����10���Ƶã�"+re);
	}
}

