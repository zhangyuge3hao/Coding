package com.summarize;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��7��3�� ����9:37:25
* 
* 
*/
public class ��Ļ����ĳ����ж� {
	//��ȡԭ������λ������
	public static int getLength(String theString) {
	//public int getLength(int theNumber) {
		int len = theString.length();//�ֽ���int��ת��string���󳤶�
		//int len = String.valueOf(theString).length();//�ֽ���int��ת��string���󳤶�
		System.out.println("�ַ�"+theString+"����Ϊ��"+len);
		return len;
	}

	//�ж�һ��������ÿһλ���Ƿ�ȫΪ����
	public static boolean checkInt(String theString,int len){
		if(theString.matches("[0-9]*")){//[0-9]{0,999}
			System.out.println("������ȷ��ȫ��������");
			return false;
		}else{
			//Pattern r = Pattern.compile("\\^*\\D");
			//Matcher m = r.matcher(theString);
			String s = theString.replaceAll("[0-9]+(\\.[0-9]{0,})?", "");
			System.out.println("�������,���ڷǷ��ַ���"+s);
			//System.out.println(s+"   "+m.matches());
			return true;
		}
	}
	
	/**
	 *  \^*\D	��ȡ�����е����֡�һ��
	 *  
	 * 	[0-9]+(\\.[0-9]{0,})?  ��ȡ�����еķ����֡�һ��
	 * 
	 * 	([1-9]+[0-9]*|0)(\\.[\\d]+)? ��ȡ�����еķ����֡�����
	 * 
	 *	----------����жϽ��------------
	 * 	String pattern = "\^*\D";
	 *	Pattern r = Pattern.compile(pattern);
	 *	Matcher m = r.matcher(str);
	 *	System.out.println(m.matches());
	 *
	 *	----------���������ֵ------------
	 *	String s = theString.replaceAll("[0-9]+(\\.[0-9]{0,})?", "");
	 *	System.out.println("���ڷǷ��ַ���"+s);
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag){
			System.out.println("������һ������");
			String s = sc.next();
			flag=checkInt(s,getLength(s));
		}
	}
}
