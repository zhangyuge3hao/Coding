package com.flowcontrol;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��8�� ����5:23:50
* 
* 	break����ʾ�жϣ����ڽ���������ѭ��
* 		ע�� 	��---��ֻ��---����һ�������£�ѭ��   ��   switch ��
* 			��������ֱ��ʹ�ã��ᱨ��
* 			break cannot be used outside of a loop or a switch
* 	
* 	continue: ��ʾ�жϣ���������ѭ����
* 		ע��	A.  ����continue�·�����䣬ֱ�ӽ����´�ѭ��������������ѭ����
* 				ֻҪ�ж����ͨ����continue����Ӱ������ѭ���ļ���
* 			
* 			B.	ͬ������---��ֻ��---����һ�������£�ѭ��   ��   switch ��
* 				��������ֱ��ʹ�ã��ᱨ��
*/
public class BreakContinue {
	public static void main(String[] args) {
		
		System.out.println("/--------break--------/");
		int a = 0;
		for(a=1;a<=5;a++){
			if(a==3){
				break;
			}
			System.out.println("breakǰִ��a="+a);
		}
		System.out.println("���� ��a�� "+a);
		
		System.out.println("/--------continue--------/");
		for(a=1;a<=5;a++){
			if(a==3){  //����3��������ٴν���ѭ����a=4
				continue;
			}
			System.out.println("continueǰa="+a);//��a=3��ʱ��Ч��continue�·������
		}
		
		System.out.println("/--------break �� continue ��������ϰ--------/");
		for(a=1;a<=10;a++){
			if(a%3==0){  //�ܱ�3������3��6��9
				break;	//1,2��ֱ������ѭ��
				//continue;	//ֻ��û��3��6��9
			}
			System.out.println("continueǰa="+a);//��a=3��ʱ��Ч��continue�·������
		}
	}
}
