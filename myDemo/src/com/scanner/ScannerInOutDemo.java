package com.scanner;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��4�� ����10:25:35
* 	
* 	Ϊ��ʵ�ֳ�������ʱ�����±�����������Scanner�෽��
* 	Scanner���Ƿ�װ����util��utility���������߰��У����÷�����
* 
* 		A�� �������
* 			import java.util.Scanner;
* 		B: ��������¼��Scanner����
* 			Scanner sc = new Scanner(System.in);
* 		C: ʹ��Scanner���󣬽�������
* 			int in = sc.nextInt();
* 
* 	ע��Java��ı�д˳���У�package >��import > class;
* 
*/
/*�����*/
import java.util.Scanner;

public class ScannerInOutDemo {
	public static void main(String [] args){
		/*����Scanner����*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������");
		/*���ն���*/
		int in = sc.nextInt();  //����int����
		System.out.println("������ǣ�"+in);
	}
}
