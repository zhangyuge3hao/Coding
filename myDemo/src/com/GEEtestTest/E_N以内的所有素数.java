package com.GEEtestTest;
import java.util.Scanner;
public class E_N���ڵ��������� {
	public static void main(String[] arags){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뷶Χ����");
		String s =sc.next();
		if(s.matches("\\d+")){
			check(Integer.parseInt(s));
		}else{
			System.out.println("�����뷶Χ����");
		}
	}//��һ����n����2~����n֮���������������nȡ�࣬������������0�����n��������
	public static void check(int n){
		int count = 0;
		for(int i = 2;i<=n ;i++){
			boolean flag = true;
			int limit = (int)Math.sqrt(i);
			for(int j = 2;j<=limit;j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("��������"+i);
				count++;
			}
		}
		System.out.println(n+"�й���������"+count);
	}
}
