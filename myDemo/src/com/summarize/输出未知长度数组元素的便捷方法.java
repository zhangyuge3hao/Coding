package com.summarize;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��10��9�� ����4:13:19
* 
* 
*/
public class ���δ֪��������Ԫ�صı�ݷ��� {
	public static void main(String[] args) {
		String[] str = {"a","b","c","d"};
		regular(str);
		convenient(str);
	}
	//���δ֪��������Ԫ�صġ�һ�㡿������
	public static void regular(String[] str){
		int i=0;
		for(i=0;i<str.length;i++){
			System.out.println("--"+str[i]+"--");
		}
		System.out.println("-----------------");
	}
	//���δ֪��������Ԫ�صġ���ݡ�������
	public static void convenient(String[] str){
		for(String st : str){//��J2SE 1.5�ṩ����һ����ʽ��forѭ��,������������֪��str���ȵ����
			System.out.println("--"+st+"--");
		}
	}
}
