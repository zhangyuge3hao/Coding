package com.GEE1917;

import java.util.ArrayList;
import java.util.Scanner;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��20�� ����5:37:28
* 
* ��ĳ���ַ��������Ȳ�����100)���������š������źʹ�Сд��ĸ�������볣��������ʽ��һ�����κ�һ�������Ŷ����ڵ����������ұ��Ҿ��������������ƥ�䡣
* дһ�������ҵ��޷�ƥ��������ź������ţ����ԭ�����ַ�����������һ�б������ƥ�����ţ�����ƥ����������á�$"��ע������ƥ���������á�������ע��
* ��40��د
�����ʽ����������������ݣ�ÿ������һ�У�����һ���ַ�����ֻ�����������Ŵ�Сд��ĸ���ַ������Ȳ���100��
ע�⣺cin.get1ine(str,100)���ֻ������99���ַ���
�����ʽ����ÿ��������ݣ�������У���һ�а���ԭʼ�����ַ����ڶ����ɡ�$���͡������Ϳո���ɣ��±ꡰ$���͡�������ʾ��֮��Ӧ�������ź������Ų���ƥ�䡤
�����룺
)(rttyy())sss)(
�������
)(rttyy())sss)(
?            ?$

*/

public class Test3_notAbsolutelyRight {
	static ArrayList<Integer> errIndleft = new ArrayList<Integer>();
	static ArrayList<Integer> errIndRight = new ArrayList<Integer>();
	static ArrayList<Integer> usedRight = new ArrayList<Integer>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("input a formula,split it with space");
		String s = sc.nextLine();
		if(s.matches("[a-zA-Z\\(\\)]+")&&s.length()<=100){
			System.out.println("OK");//)(a())a(
			char[] arr = s.toCharArray();
			
			for(char a : arr){
				System.out.print(a);
			}
			System.out.println();
			checkFormat(arr);
			printOut(arr);
		}else{
			System.out.println("Input illeglal");
		}
	}
	public static void printOut(char[] arr){
		int len = arr.length;
		char[] out = new char[len];
		for(int i = 0;i<len;i++){
			out[i] = '.';
		}
		System.out.println("�����(���±��У�");
		for(int i :errIndleft){
			System.out.print(i+" ");
			out[i] = '$'; 
		}
		System.out.println();
		System.out.println("�����)���±��У�");
		for(int i :errIndRight){
			System.out.print(i+" ");
			out[i] = '?'; 
		}
		System.out.println();
		for(char a : out){
			System.out.print(a);
		}
	}
	public static void checkFormat(char[] arr){
		int len = arr.length;
		int left = 0;//��¼���ֵ�(�ĸ���������(+1������)-1,�����ж�)�Ƿ�Ϸ�
		for(int i = 0 ;i<len ;i++){
			if(arr[i] == ')'){
				if(left <= 0){
					System.out.println((i+1)+"����Ԫ��)ǰ���Ѿ�û��(,����");
					errIndRight.add(i);
				}else{
					left--;
					
					System.out.println((i+1)+"����Ԫ��)ǰ�����п���(,��ȷ��left--��(��ʹ��");
				}
			}else if(arr[i] == '('){
				left++;
				if(findRight(arr,i)){
					System.out.println((i+1)+"����Ԫ��(��������)��δ��ʹ��,��ȷ");
				}else{
					System.out.println((i+1)+"����Ԫ��(����û��)����)�ѱ�ʹ��,����");
					errIndleft.add(i);
				}
			}
		}
	}
	public static boolean findRight(char[] arr, int index){//���ҵ�ǰ�±���Ƿ���)����δ��ʹ��
		boolean flag = false;
		int len = arr.length;
		for(int i = index+1;i<len;i++){
			if(arr[i]==')'&&ifUsedRight(arr,i)){//�����������ж�)�Ƿ�δ��ʹ��
				flag = true;
				usedRight.add(i);
				break;
			}
		}
		return flag;
	}
	public static boolean ifUsedRight(char[] arr, int index){//���ҵ�ǰ�±�)�Ƿ�δ��ʹ��
		boolean flag = true;
	
		for(int i : usedRight){
			System.out.println("usedRight��"+(i)+"Ԫ��)�ѱ�ʹ��,��ѯindex��"+index);
			if(index == i){
				flag = false;//������±���usedRight�д��ڣ���ʾ�Ѿ���ʹ��,����false
				break;
			}
		}
		return flag;
	}
}
