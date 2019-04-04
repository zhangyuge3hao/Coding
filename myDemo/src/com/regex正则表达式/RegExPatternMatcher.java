package com.regex������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��7��5�� ����9:23:42
* 
* 	Pattern �ࣺ��Pattern ģʽ��
		pattern ������һ����������ʽ�ı��롿��ʾ��Pattern ��û�й������췽����Ҫ����һ�� Pattern ������������ȵ����乫����̬���뷽����������һ�� Pattern ���󡣸÷�������һ��������ʽ��Ϊ���ĵ�һ��������
		Pattern p = Pattern.compile(s);
							compile ��࣬�༭��	s ��������ʽ		pattern ģʽ
		��Pattern������������ʽ�����һ��ģʽ�� ÿ��������ʽ����compileԤ���룬�ӿ�֮�����е��ٶ�
		 Pattern p = Pattern.compile(regEx);
			
	Matcher �ࣺ
		Matcher �����Ƕԡ������ַ��������С����ͺ�ƥ�䡿���������档
		��Pattern ��һ����Matcher Ҳû�й������췽��������Ҫ���� Pattern ����� matcher ���������һ�� Matcher ����m,��
		ͨ������ Pattern �� character sequence{�ַ�������-�ӿڣ�Stringʵ��������ӿڣ�����ʵ�ֵĶ����ǿ��Եģ�<--����̬��} ִ��ƥ����������档 

		��Matcher����Pattern�ṩ��ģʽȥƥ���ַ���
		 Matcher m = p.matcher(s);
		 
		 ƥ��������ʽ������д������������
		 /----------------------------------/
	һ.	 Pattern p = Pattern.compile(regEx);
		 Matcher m = p.matcher(s);
		 m.matches();	//����һ��Boolean���ͱ���
		   �����Ϊ��Pattern p�����Ŷ�Ӧ������ʽregEx�ѱ���õ�һ��ģʽ��������ģʽȥƥ���ַ���s��Ȼ��ѽ��������Matcher����m��
		
	��.	 Boolean b = "a88a".matches("[a-z]");	//����һ��Boolean���ͱ���
		 /----------------------------------/
	 ��ͬ������һ��ʵ�ֵĹ���ͬΪ��;������ʽȥƥ���ַ���������Booleanֵ
	 
	��ͬ��1.����һ��ǰ������������ʽ���ȷ���������ʱ���������Ч�ʸ�
		2.����һPattern��Matcher�����˺ܶ���������������matches���߱���
		 
		ͨ������ģʽ�� matcher ������ģʽ����ƥ����������ƥ�����󣬿���ʹ����ִ�����ֲ�ͬ��ƥ������� 
		A.matches �������Խ����������������ģʽƥ�䡣 
		B.lookingAt ���Խ��������д�ͷ��ʼ���ģʽƥ�䡣 
		C.find ����ɨ�����������Բ������ģʽƥ�����һ�������С� 

			
	PatternSyntaxException��
		PatternSyntaxException ��һ����ǿ���쳣�࣬����ʾһ��������ʽģʽ�е��﷨����
	1	public String getDescription()		��ȡ�����������
	2	public int getIndex() 				��ȡ�����������
	3	public String getPattern() 			��ȡ�����������ʽģʽ��
	4	public String getMessage() 			���ض����ַ����������﷨�����������������������������ʽģʽ��ģʽ�д��������Ŀ��ӻ�ָʾ��
*/
public class RegExPatternMatcher {
	
	public static void main(String[] args) {
		catCheck("cat cat cfat ccatt cat");
		numMatch("c s112e s2 w2");
		basic();
	}
	public static void basic(){
		p("abc".matches("..."));
		p("a8729a".replaceAll("\\d", "-"));  //����������λ�滻Ϊ-
		p("abc".matches("[a-z]{3}"));
	}
	public static void p(Object o){  //pΪObject
		System.out.println(o);
	}
	
	/*
	 * ƥ��һ���ַ������еġ�cat���Ӵ�	
	 * ������	start: ������������Ӵ��ĳ�ʼ����
	 * 		end���������һ��ƥ���ַ��������ӡ� 1��
	 */
	public static void catCheck(String s){
		//����/��д������ʽ
		String regEx = "\\bcat\\b";
		//ʹ��Pattern����������ʽ
		Pattern p = Pattern.compile(regEx);
		//�ԡ��ַ�������������ʽ������������ƥ�䡿
		Matcher m = p.matcher(s);
		
		int count = 0;
		System.out.println("�ַ��ܳ��ȣ�"+String.valueOf(s).length());
		
		while(m.find()){	//m.find() �÷�������ȫ�����������У�������������һ��������
			count++;
			System.out.println("ƥ�������"+count);
			System.out.println("	��ʼ������"+m.start());
			System.out.println("	����������"+m.end());
		}
	}
	
	/*
	 * ��һ���������ַ������ҵ����ִ�
	 * ������������	group
	 * 		����ͨ������ matcher ����� groupCount �������鿴���ʽ�ж��ٸ����顣groupCount ��������һ�� int ֵ����ʾmatcher����ǰ�ж�������顣
	 * 		����һ��������飨group(0)���������Ǵ����������ʽ�����鲻������ groupCount �ķ���ֵ�С�
	 */
	public static void numMatch(String s){
		/*
		 * ������(\\d+)��ʾһ����������
		 * Ϊ�˰���������ǰ�������ַ����������ǰ��д(\\D*)��ʾ0������������
		 * Ϊ���ҵ��ַ�����������жϣ�������д(.*)��ʾ0�������ַ�����ȷ�����ֻ��Ƿ����֣�
		 */
		String regex = "(\\D*)(\\d+).*";//��3��������
		//String regex = "(\\^*\\D)";//��3��������
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		int count = 0;
		int len = String.valueOf(s).length();
		System.out.println("�ַ��ܳ��ȣ�"+len);
		boolean flag = true;
		System.out.println("���в����飺"+m.groupCount()+" ��");
		m.find();
		for(int num=0;num<=m.groupCount();num++){
			
			System.out.println("m.group("+count+")��"+m.group(count));
			count++;
			flag = false;
		}
/*		while(m.find()){
			System.out.println("m.group("+count+")��"+m.group(count));
			count++;
			flag = false;
		}*/
		if(flag){
			System.out.println("û���ҵ�����");
		}
	}
}
