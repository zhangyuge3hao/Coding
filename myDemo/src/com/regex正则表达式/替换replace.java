package com.regex������ʽ;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��10��10�� ����1:18:43
* 
* 	ʹ��String�Դ���replaceAll����
* 	replace("regex","replacement")
* 	��replacement����ȥ�滻ԭ�ַ���������regex��������ַ���
* 	replacement����Ҳ������������򣬲���ʹ��"$1"����ʽ������"regex"�����е���Ϲ���
* 
*/
public class �滻replace {
	public static void main(String[] args) {
		String str = "13866668888";//�滻�绰�м�ļ�λ
		String str1 = "aqkkdsaaaadfd%%der";//�滻�ظ����֡�ɾ���ظ����ַ���Ҫ���ظ����ַ���������������
		replaceAll(str);
		DeRe(str1);
	}
	public static void replaceAll(String str){
		String s = str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		/*
		 * ��һ��������ķ����У�����һ��������Ҫ����ǰһ�������е���������ʱ��Ӧ����"$"���ź͸�����±������������
		 * ��replaceAll�У�"$1"��ʾ��1"(\\d{3})"��"$2"��ʾ��2"(\\d{4})"
		 */
		System.out.println(s);
	}
	public static void DeRe(String str1){
		System.out.println(str1.replaceAll("(.)\\1+", "-"));//��"-"�滻�ظ�����
		System.out.println(str1.replaceAll("(.)\\1+", "$1"));//ɾ���ظ����ַ���Ҫ���ظ����ַ���������������
	}
}
