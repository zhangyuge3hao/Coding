package com.GEEtest;
/**
 * ��Ŀ����������һ���ַ���S1,��������ַ�����ѹ�����������ѹ����ԭ�ⲻ����
 * @author pc
 *
 */
import java.util.Scanner;
public class L_�ַ���ѹ�� {
	public static void main(String []args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("input s1");
			String s1 = sc.next();
			StringBuffer sb = new StringBuffer();//buffer���Լ�int��String��char����ת��ʽ
			char s[] = s1.toCharArray();
			char temp = s[0];//temp��s�ĵ�һ��Ԫ�أ����Ըս�ѭ��һ����ȣ�connt��+1�������ڳ�ʼ��Ϊ0
			int count = 0;
			for(char c:s){
				if(c==temp){
					count++;
				}else{//������Ԫ��c������temp��˵����һ��Ԫ�ؽ����������ϸ�Ԫ�غ�count��ֵ
					sb.append(count);
					sb.append(temp);
					temp=c;//����temp���Ա���һ��c��temp�Ƚϣ��жϵ�ǰc�Ƿ��ظ�
					count=1;//��ѭ�������У�count��1��ʼ
				}
			}
			sb.append(count);
			sb.append(temp);
			
			String result = sb.toString();
			if(result.length()>=s1.length()){//�������ѹ����ԭ�ⲻ����ѹ�����������䳤�ˣ������ԭ��
				System.out.println(s1);
			}else{
				System.out.println(result);
			}
			
		}
	}
}
