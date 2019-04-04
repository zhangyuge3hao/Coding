package com.GEE1917;
import java.util.ArrayList;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��20�� ����5:55:44
* 
* ��������ͨ�ŵĵ�����N��4<N<30�����ַ���ɣ��ַ��ڵ����г��ֵ�Ƶ�ȣ�Ȩֵ��ΪW1,W2,,,Wn��
* �Ը���Ȩֵ���й����������������������Ĵ�Ȩ·�����ȡ�(30�֣�
�����ʽ����һ�����ݷ��������롢��һ��ΪN��ֵ���ڶ���ΪN���������Կո�������ʾ���ֵĳ���Ƶ�ȡ�
����������
8
7 19 2 6 32 3 21 10
����ʽ�������Ȩ·�����ȣ�
���������
261

*/
import java.util.Scanner;
public class Test2_���� {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N");
		int n = sc.nextInt();
		String notUse = sc.nextLine();
		System.out.println("Input numbers split them with space");
		String number = sc.nextLine();
		String[] numb = number.split("\\ ");
		int len = numb.length;
		System.out.println(number+"number---"+len+"len---n"+n);
		
		if(n>=4&&n<30&&n==len&&number.matches("(\\d+\\ )*\\d+")){
			String[] num = new String[len];
			/**
			 * �ڼ���Ȩֵ��ʱ����Ҫ����Ԫ������ԭʼ���黹�Ǽ������á��������������У���ԭʼ���ݺ����+���,��.�ָ�ڼ������ݺ����-���,��.�ָ
			 */
			for(int i = 0;i<len ;i++){
				num[i] = (numb[i])+".+";
			}
			huofuman(num,len);
			outRout();
		}else{
			System.out.println("Input illegal.");
		}
	}
	static ArrayList<String> rout = new ArrayList<String>();
	static int count = 1;//��¼����routʱ����ǰԪ�صı�־������Ȩֵ����
	public static void outRout(){
		int sum = 0;
		int len = rout.size();
		for(String s : rout){
			String[] temp = s.split("\\.");
			sum += Integer.parseInt(temp[0])*(len-Integer.parseInt(temp[1]));
		}
		System.out.println("��Ȩ·������Ϊ��"+sum);
	}
	public static void huofuman(String[] num,int len){//7 19 2 6 32 3 21 10
		/**
		 * ������
		 * ��ǰ��������С��Ԫ�غϲ�Ϊһ��������num����
		 */
		while(len-1>0){
			num = bubbleSort(num,len);
			
			num = cut(num);//ȡǰ��������С��Ԫ�غϲ�Ϊһ��������num����
			
			System.out.print("��ǰ���ȣ�"+(len-1)+"--");
			for(String i : num){
				System.out.print(i+" ");
			}System.out.println();
			len--;
		}
	}
	public static String[] cut(String[] num){
		String[] aS = num[0].split("\\.");
		int aN = Integer.parseInt(aS[0]);
		if(aS[1].equals("+")){
			rout.add(aS[0]+"."+count);
		}
		String[] bS = num[1].split("\\.");
		int bN = Integer.parseInt(bS[0]);
		if(bS[1].equals("+")){
			rout.add(bS[0]+"."+count);
		}
		count++;//ÿһ��ȡ��num�е�������ӣ����൱��ȷ��������num�����ֵ�Ȩֵ��־���������ֱ�־Ϊ+��ԭʼ���֣����¼��ֵ��Ȩֵ��־��rout�����Լ���·������
		
		int l = num.length-1;
		String[] temp = new String[l];
		temp[0] = String.valueOf(aN + bN)+".-";
		for(int i = 1;i<l;i++){
			temp[i] = num[i+1];
		}
		return temp;
	}
	public static String[] bubbleSort(String[] num,int len){
		String temp ;
		while(len>0){
			for(int i = 0;i<len-1;i++){
				if(ifBig(num[i],num[i+1])){
					temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
				}
			}
			len--;
		}
		return num;
	}
	public static boolean ifBig(String a,String b){
		boolean flag = true;
		String[] aS = a.split("\\.");
		String[] bS = b.split("\\.");
		int aN = Integer.parseInt(aS[0]);
		int bN = Integer.parseInt(bS[0]);
		if(aN>bN){
			return true;
		}else{
			return false;
		}
	}
}
