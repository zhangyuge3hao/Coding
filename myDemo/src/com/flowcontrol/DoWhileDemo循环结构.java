package com.flowcontrol;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��8�� ����4:43:16
* 
* 	��ʼ����䣻
* 	do{
* 		ѭ�������;
* 		�����������;
* 	}while(�ж����);
* 	
* 
*/
public class DoWhileDemoѭ���ṹ {
	public static void main(String[] args) {
		int a =1;		//��ʼ����䣻
		do{
			System.out.println("a= "+a);	//ѭ�������;
			a++;		//�����������;
		}while(a<=10);	//�ж����
		
		System.out.println("/*-----ͳ��ˮ�ɻ����ĸ���------*/");
		int initial=100;
		int temp_initial = 0;
		int len = 0;
		int get_num=0;
		int get_all=0;
		do{
			get_all=0;
			temp_initial = initial;
			do{
				len = String.valueOf(temp_initial).length();
				get_num=temp_initial%10;
				temp_initial/=10;
				get_all+=Math.pow(get_num, 3);
			}while(temp_initial>=10);
			get_all+=Math.pow(temp_initial, 3);
			if(get_all==initial){
				System.out.println(initial+" ��ˮ�ɻ���");
			}else{
				//System.out.println(initial+" ����ˮ�ɻ���");
			}
			initial++;
		}while(initial<=1000);
	}
}
