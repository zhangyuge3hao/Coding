package com.regex������ʽ;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��10��9�� ����11:02:47
* 
* ���ַ�����ĳ�����Ž��в�֣��ѽ����������
* "zhangsan   lisi     wangwu" ��ͬ�����Ŀո�
* "woshi.zhagnyuge.com" �ض��ַ�
* "�����֣��⣬��" ����
* "12,34.56 78" ����ָ���
* "akkkkdsaaaadfd%%der" ���ظ����ַ������и������ʽ�ķ�װ�����ú����ʹ�á�
* 
* 	"��"��ʹ��:
* 	��()��Ϊ�飬��һ��()��Ϊ1�飬�������ţ����ʾ����������ʽΪ��0��.
* 	�м��������ž��м����飬ÿ��������"("�ڱ��ʽ�д������Ҵ��򣬱�ʾ�����ı��
* 	����((A)(B(C)))
* 	����4��"("������4��
* 	����"("���ֵ�˳�򣬿�֪��1,2,3,4��ֱ�Ϊ��((A)(B(C)))��\A�� (B(C))��(C)
*/
public class �и���Split�����ʹ�� {
	public static void main(String[] args) {

		String str = "zhang  yu    ge";
		split(str);
		String str1 = "zhang.yu.ge";
		split1(str1);
		String str2 = "�£��㣬��";
		split2(str2);
		String str3 = "zhang yu,ge-1";
		split3(str3);
		String str4 = "aqkkdsaaaadfd%%der";
		split4(str4);
	}
	public static void split(String str){
		String regex = " +";	//һ��������ͬ���ŵ��и�
		String strs[] = str.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
	public static void split1(String str1){
		String regex = "\\.";	//"."�������б�ʾͨ�������Ҫ"\\"����ת�壬��Ҫ˫б��
		String strs[] = str1.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
	public static void split2(String str2){
		String regex = "��";		//"��"���ֺ����Ķ���Ҳ�ɷָ�
		String strs[] = str2.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
	public static void split3(String str3){
		String regex = " |,|-";	//ʹ��"|"��ʾ���ߣ����Էָ�����ͬ��" ,-"
		String strs[] = str3.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
	public static void split4(String str4){
		/*
		 * Ϊ��ʵ�ֹ���ĸ��ã�����Ҫ��()�Թ�����з�װ�������ȷ�װ�ٵ��á�
		 * ����װ�Ĺ�������飬ÿ���鶼���Լ��ı�ţ���ʹ������ı�Ŵ�1��ʼ���㣬�����ñ�Ŷ�����е���
		 * ��Ҫע���ű�������ĺ���
		 */
		String regex = "(.)\\1+";	
		/* �� ��ͬ�ַ� �����и������Ҫ�и���ַ�����ȷ�����ַ�������ȷ����
		 * ��"."ͨ�������ƥ�䲻ͬ���и��ַ�����()��"."���з�װ��ʵ�ָ��ã���Ӧ���и��ַ��Ĳ�ͬ���ִ���
		 * "1"��ʾ�͵��õ�һ����(.)������ֻд"1"��ֻʶ������1���ʼ���"\\"����ת��
		 * ʵ��(.)�ĸ��ú���+�����ʵ�ָ��ô����Ĳ�ȷ����
		 */
		String strs[] = str4.split(regex);
		for(String s : strs){	
			System.out.println("--"+s+"--");
		}
		System.out.println("-----------------");
	}
}
