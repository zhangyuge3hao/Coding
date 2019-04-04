package com.flowcontrol;

import java.util.Scanner;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��5�� ����9:29:22
* 
* 	ѡ�����switch�Ľṹ��
* 
* 		switch(���ʽ){
* 			case ֵ1:
* 				�����1;
* 				break;
* 			case ֵ2:
* 				�����2;
* 				break;
* 			  ......
* 	 		default:
* 				�����n+1;
* 				break; 
* 		}
* 		
* 		switch�ṹִ��˳��
* 			A. �ȼ���switch�Ե� ���ʽ
* 			B. ��case�Ե� ֵȥƥ����ʽ�����ƥ���о�ִ�и�case�µ�  �����
* 			C. ����ƥ�����ִ��default�µ�  ����壨default��û��ֵ������if-elseif�ṹ������else��
* 
* 		˵����
* 			switch �Աߵ� ���ʽ��ֻ���� byte��short��int��char ���ͣ�������boolean���͵��ж����
* 							��JDK5�Ժ󣬿����� ��ö�٣�
* 							��JDK7�Ժ󣬿����� ���ַ�����
* 			case �Ե�ֵ���Ǻ�  ���ʽ  ƥ�������
* 			break����ִ�е�case��default�µ�breakʱ���˳�switchѡ��ṹ��
* 			default: ������case���޷�ƥ���ʱ��ִ��
* 
* 		case�Ĵ�͸����case��û��break���˳�ѭ����ʱ��
*				    �������ִ�������case��������������жϣ���ֱ������break�˳�
*/
public class SwitchDemoѡ��ṹ {
	public static void main(String[] args) {
		System.out.println("����������");
		//����¼���ֵ1,2,3...7�������Ӧ����һ..������
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch(day){    //���ʽֻ���ã� byte��short��int��char��
						//    �����ã� boolean��long��float��double
			case 1:     //case ����ֱ�Ӹ����ݣ����ظ�ֵ
				System.out.println("Mon");
				break;
			case 2:
				System.out.println("Tus");
				break;
			case 3:
				System.out.println("Wen");
				break;
			case 4:
				System.out.println("Thu");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("Sat");
				break;
			case 7:			//�������ж���������caseд��
				System.out.println("Sun");
				break;
			default:		//default�����ṩ�����쳣
				System.out.println("��������");
				break;
		}
		System.out.println();
		
		/*
		 * case�Ĵ�͸����case��û��break���˳�ѭ����ʱ��
		 * �������ִ�������case��������������жϣ���ֱ������break�˳�
		 */
		System.out.println("case�Ĵ�͸");
		switch(1){
		case 1:				//����case�жϵĴ�͸��һ���ԣ��ɼ����ö��case��Ӧһ�����
		case 2:
		case 3:
			System.out.println("a");
		case 4:
		case 5:
		case 6:
			System.out.println("b");
			break;
		default:
			System.out.println("default");
			break;
		}
		//��ֱ�����ȫ��a b c d
	}
}
