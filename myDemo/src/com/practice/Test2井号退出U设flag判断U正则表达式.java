package com.practice;

import java.util.Scanner;

/*
 * ���󣺼���¼��һ���·ݣ�������·ݶ�Ӧ�ļ��ڡ�
 * 		һ�����ļ�
 * 		3,4,5	����
 * 		6,7,8	�ļ�
 * 		9,10,11	�＾
 * 		12,1,2	����
 * 
 * ������
 * 		A:����¼��һ���·�,��Scannerʵ��
 * 		B:�жϸ��·��Ǽ���,�����·������Ӧ�ļ���
 * 			if
 * 			switch
 * case��͸
 */
public class Test2�����˳�U��flag�ж�U������ʽ {
	public static void main(String[] args) {
		//�����·�
		int monInt;
		boolean flag = false;			 //���õ�switch��do while��ѭ���ж���䣬�ж��������׶�ʱ��������ͨ�����flag���ж����
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("�������·�(��'#'����)��");
			String month = sc.next();
			int length = month.length();
			
			flag = month.matches("#");
			//System.out.println(flag);
			
			if(month.matches("[0-9]{0,2}")){
				//System.out.println("�Ǵ�2λ����");
				monInt=Integer.parseInt(month);
				switch(monInt){
				case 1:
				case 2: 
				case 3:
					System.out.println("�ǵ�һ����");
					break;
				case 4:
				case 5:
				case 6:
					System.out.println("�ǵڶ�����");
					break;
				case 7:
				case 8:
				case 9:
					System.out.println("�ǵ�������");
					break;
				case 10:
				case 11:
				case 12:
					System.out.println("�ǵ��ļ���");
					break;
					/*
					 * /---------default������������----------/
					 */
				default:  
					System.out.println("��������·�����");
					//break;
				}
			}else if(month.endsWith("#")){
				//System.out.println("#���˳�");
			}else{
				System.out.println("�·��������");
			}
        }while(flag==false);   // ��������ֵ����#�ͼ�������
        System.out.println("��������\"#\"�������Ѿ��˳���");
        
        
      //  sc.close(); // �ر���Դ
		
	}
}
