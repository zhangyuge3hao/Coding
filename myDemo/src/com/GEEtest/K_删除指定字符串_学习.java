package com.GEEtest;
import java.util.Scanner;
public class K_ɾ��ָ���ַ���_ѧϰ {
/*	public static void main(String []args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("input s1");
			String s1 = sc.next();
			System.out.println("input s2");
			String s2 = sc.next();
			
			 * String s = s1.replace(s2,"");//
			System.out.println(s);
			
		}
	}*/
	public static void main(String[] args) {
        String str = " woai javahaha javaai javao javaw";
        removeString(str);
    }
	/**
	 * ˼·������ʹ��String��trim��������ȥ��String�еĿո񣬲��ı��ַ�����
	 * Ȼ��ʹ��String��indexOf�����ҵ�Ҫɾ�����Ӵ���λ�ã�
	 * ��ʹ��String��subString����������
	 * ��Ҫ���ַ����Ŀ�ʼλ����ǰ���ַ����ͽ���λ���Ժ���ַ�����ƴ��������
	 * ����ٸ�������һ�����ַ������ֵ�λ�ã���������ʹ��whileѭ�����Ч�ʡ�
	 */
    public static void removeString(String str) {
        //trimȥ���ո񲻸ı��ַ���
       // str = str.trim();
        //�ҵ�java���ڵ�λ��
        int index = str.indexOf("java");
        //��¼�ַ�����һ�����ֵ�java�ĸ���
        int count = 0;
        while (index != -1) {//ȥ��һ�κ��ٽ�ѭ�����ӿڿ�ʼ�ң�ֱ��=-1����ʾû��Ҫɾ���ַ�����
            //���ַ����в��ٺ���javaʱ�ͷ���-1
            str = str.substring(0, index) + str.substring(index + 4);
            //�ҳ���һ��java��λ��
            index = str.indexOf("java");
            //ͳ��ɾ����java�ĸ���
            count++;
        }
        System.out.println("ɾ����java����ַ�����" + str);
        System.out.println("ɾ����java������Ϊ��" + count);
    }

}
