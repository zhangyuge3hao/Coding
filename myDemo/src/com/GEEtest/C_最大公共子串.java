package com.GEEtest;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��17�� ����5:40:05
* 
* 
*/
import java.util.Scanner;

public class C_��󹫹��Ӵ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�������һ���ַ���");
			char[] s1 = sc.next().toCharArray();
			//char[] s1 = "123456".toCharArray();
			System.out.println("�������һ���ַ���");
			//char[] s2 = "12a123456".toCharArray();
			char[] s2 = sc.next().toCharArray();
			check(s1, s2);
		}
	}
/*˼·����ȡ���ַ�����
1����toCharArray()תΪchar�������飺s1��s2
2����s1{����}��ÿһ��Ԫ����s2{�в�}ƥ��
3��ÿ����s1��s2Ԫ����ͬʱ��ʹ��temp1��2��¼��ǰ����������Сѭ�����жϵ�ǰ�������Ԫ���Ƿ���Ȼ��ͬ����ͬ��ͨ��String�ַ�������ۼƽ��
4����Сѭ�����ֶ�ӦΪ�����ʱ���ж��ۼƽ���ĳ����Ƿ�Ϊ���*/
	public static void check(char[] s1, char[] s2) {
		int len1 = s1.length;
		int len2 = s2.length;
		int t1 = 0,t2=0;
		int index = 0;
		int lenM = 0;
		boolean flag = true;
		String ch = "";
		for (int i = 0; i < len1; i++) {//��������s1
			for (int j = 0; j < len2; j++) {//��s2��ÿһ��Ԫ�غ�s1ƥ��
				flag=true;
				if(s1[i]==s2[j]){//����������ͬԪ��ʱ����������ͬʱ�ӵ�ǰ�������������ж��Ƿ��к��Ԫ����ͬ
					ch = "";//ÿ��������ͬԪ�أ����õ�ǰ�������ۼƽ��
					t1 = i;
					t2=j;
					//System.out.println("s1i["+i+"]="+s1[i]+"---s2j["+j+"]"+s2[j]);
					while (flag) {
						if (t1 < len1 && t2 < len2 && s1[t1] == s2[t2]) {//�ж��Ƿ��к��Ԫ����ͬ
							//System.out.println("s1t1["+t1+"]="+s1[t1]+"---s2t2["+t2+"]"+s2[t2]);
							flag = true;
							ch = ch+s1[t1] ;
							t1++;
							t2++;
						} else {
							flag = false;
						}
					}
				}
			}
			if (ch.length() > lenM) {
				lenM = ch.length();
				index = i;
			}
		}
		System.out.println("lenM:" + lenM+"---index:"+index);
		for(int i=index;i<index+lenM;i++){
			System.out.print(s1[i]);
		}
	}
}
