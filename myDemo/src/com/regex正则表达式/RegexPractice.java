package com.regex������ʽ;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��8�� ����5:44:54
* 
* 
*/
import java.util.Scanner;

public class RegexPractice {
	public static void main(String[] args) {
		//checkYuanYin();//�ж�Ԫ���ַ�
		//checkPhoneNum();//�ж��Ƿ�Ϊ�绰���룬�����ֻ���̻�
		checkEmail();
	}
	
	
//�ж�Ԫ���ַ�
	public static String scan() {
		String temp;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please type some words");
			temp = sc.next();
			return temp;
		} catch (Exception e) {
			return "#";
		}/* finally {
			sc.close();
		}*/
	}
	public static void checkYuanYin() {
		boolean res = true;
		while(res){
			String a = scan().toLowerCase();
			System.out.println("a:"+a);
			System.out.println("----" + a.matches("[aeiou]*"));
			System.out.println("----" + a.matches(".[aeiou]"));
			if(a.equals("#")){
				res=false;
			}
		}		
	}
	
	//���������ֺ͡���ɣ��̻�7-8λ�����������ţ�����Ϊ3��4λ����λ��0�����ź͵绰�á��ָ�
	//�ƶ�����Ϊ11λ��ǰ��λ��13��15��17��18��19
	public static void checkPhoneNum(){
		boolean res = true;
		while(res){
			String a =scan();//"1[358][0-9]{9}|[0-9]{7,8}|0[0-9]{2,3}-[0-9]{7,8}"
			System.out.println(a+" �ĺ����ж�Ϊ��"+a.matches("1[35789]\\d{9}|\\d{7,8}|0\\d{2,3}-\\d{7,8}"));
			if(a=="#"){
				res=false;
			}
		}
	}
	//�ʼ���֤���û�������ĸ�����֡��л��ߡ��»���		@	��ַ�����ֺ���ĸ		С����	��֯����2-4λ��ĸ	�����ִ�Сд
	public static void checkEmail(){
		boolean res = true;
		while(res){
			String a = scan().toLowerCase();//�����ִ�Сд
			System.out.println(a+"�����жϣ�"+a.matches("[\\w-]+@[\\w]+(.[a-z]{2,4}){1,2}"));
			if(a=="#"){
				res=false;
			}
		}
	}
}
